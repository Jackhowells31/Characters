package characters;

import Potions.SmallHealthPotion;
//import enemies.Goul;
//import enemies.Rat;
import enemies.Skeleton;
import spells.MagicMissile;
import weapon.Dagger;
//import spells.Fireball;
import weapon.Greatsword;

public class TestCharacter {

	public static void main(String[] args) {

		Barbarian jeff = new Barbarian("Xander");
		Wizard tom = new Wizard("Will");
		Rogue dan = new Rogue("Dan");
		Skeleton frank = new Skeleton("Frank");
		Skeleton doug = new Skeleton("Doug");
		jeff.meleeAttack(frank, new Greatsword());
		tom.castSpell(doug, new MagicMissile());
		dan.meleeAttack(doug, new Dagger());
		frank.attack2(dan);
		dan.usePotionSmall(dan, new SmallHealthPotion());
		
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