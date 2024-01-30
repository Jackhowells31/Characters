package characters;

import Potions.HealingPotion;
import Potions.MediumHealthPotion;
import Potions.SmallHealthPotion;
import Trinkets.SmallHealthRing;
import enemies.Skeleton;
import weapon.Dagger;

public class TestCharacter {

	public static void main(String[] args) {

//		Barbarian jeff = new Barbarian("Xander");
		Wizard tom = new Wizard("Will");
		HealingPotion small = new SmallHealthPotion("Small health potion", 4);
		HealingPotion medium = new MediumHealthPotion("Medium health potion", 8);
		Rogue dan = new Rogue("Dan");
		Skeleton frank = new Skeleton("Frank");
		Skeleton doug = new Skeleton("Doug");

//		jeff.meleeAttack(frank, new Greatsword());
//		tom.castSpell(doug, new MagicMissile());
//			can't figure out why it return null for target name

		dan.equipSmallHealthRing(dan, new SmallHealthRing());

		dan.meleeAttack(doug, new Dagger());

		frank.attack2(dan);
		// can't figure out why they return null for target name

		System.out.println(dan.getHealth());
		// testing getHealth

		dan.useHealthPotion(medium);
		tom.useHealthPotion(small);
		// why is it outputting 11
		// fixed used this.getDamage Not Object.getDamage
	}

//	public static void main(String[] args) {
//		Wizard jeff = new Wizard ("jeff");
//		jeff.getHealth();
//		Wizard ralph= new Wizard ("Ralph");
//		Goul ghoul1 = new Goul();
//		Rat rat1 = new Rat();
//		jeff.castSpell(rat1, new Fireball());
//		ralph.castSpell(ghoul1, new Fireball());
//		System.out.println("This rats helth is "+rat1.getHealth());
//		System.out.println("This ghouls health is "+ghoul1.getHealth());
//	}

}