package characters;

//import enemies.Goul;
//import enemies.Rat;
import enemies.Skeleton;
import spells.MagicMissile;
//import spells.Fireball;
import weapon.Greatsword;

public class TestCharacter {

	public static void main(String[] args) {

		Barbarian jeff = new Barbarian();
		Wizard tom = new Wizard(null);
		Skeleton frank = new Skeleton("Frank");
		Skeleton doug = new Skeleton("Doug");
		jeff.meleeAttack(frank, new Greatsword());
		tom.castSpell(doug, new MagicMissile());
		
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