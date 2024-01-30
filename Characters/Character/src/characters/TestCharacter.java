package characters;

import java.util.Scanner;

import enemies.Skeleton;
import potions.HealingPotion;
import potions.MediumHealthPotion;
import potions.SmallHealthPotion;

public class TestCharacter {
	
	final static String ESC = "\033[";

	public static void main(String[] args) {

		Barbarian jeff = new Barbarian("Jeff");
		Barbarian gorthok = new Barbarian("Gorthok, Destroyer of Spoons");
		Wizard tom = new Wizard("Will");
		HealingPotion small = new SmallHealthPotion("Small health potion", 4);
		HealingPotion medium = new MediumHealthPotion("Medium health potion", 8);
		Rogue dan = new Rogue("Dan");
		Skeleton frank = new Skeleton("Frank");
		Skeleton doug = new Skeleton("Doug");
		Scanner input = new Scanner(System.in);
		System.out.println("Choose a character! Type g for " + gorthok.getName() + " or j for " + jeff.getName());
		String choice = input.nextLine();
		PlayerCharacter selectedCharacter = choice.equals("j") ? jeff : gorthok;
		System.out.println("Choose a direction to move " + selectedCharacter.getName());
		selectedCharacter.getFloor().printFloorPosition(selectedCharacter);
		boolean running = true;
		while (running) {
			String inputText = input.nextLine();
			for (int i = 0; i < 50; ++i) System.out.println();
			switch (inputText) {
			case "up": {
				selectedCharacter.move(inputText);
				break;
			}
			case "down": {
				selectedCharacter.move(inputText);
				break;
			}
			case "left": {
				selectedCharacter.move(inputText);
				break;
			}
			case "right": {
				selectedCharacter.move(inputText);
				break;
			}
			case "stop":{
				running = false;				
			}
			case "change":{
				System.out.println("Change to which character? j for Jeff or g for Gorthok");
				String charChoice = input.nextLine();
				selectedCharacter = charChoice.equals("j") ? jeff : gorthok;
				selectedCharacter.getFloor().printFloorPosition(selectedCharacter);
			}
				default: {
					System.out.println("Please enter Left, Right, Up, Down, Change, or Stop. You entered: " + inputText);
					selectedCharacter.getFloor().printFloorPosition(selectedCharacter);
				}
			}
		}
		input.close();

//		jeff.meleeAttack(frank, new Greatsword());
//		tom.castSpell(doug, new MagicMissile());
//			can't figure out why it return null for target name

//		dan.equipSmallHealthRing(dan, new SmallHealthRing());

//		dan.meleeAttack(doug, new Dagger());

//		frank.attack2(dan);
		// can't figure out why they return null for target name

//		System.out.println(dan.getHealth());
		// testing getHealth

//		dan.useHealthPotion(medium);
//		tom.useHealthPotion(small);
		// why is it outputting 11
		// fixed used this.getDamage Not Object.getDamage
	}
}