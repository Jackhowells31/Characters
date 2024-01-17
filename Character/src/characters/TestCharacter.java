package characters;

import enemies.Goul;
import enemies.Rat;
import spells.Fireball;

public class TestCharacter {

	public static void main(String[] args) {
		Wizard jeff = new Wizard ("jeff");
		Wizard ralph= new Wizard ("Ralph");
		Barbarian bob = new Barbarian();
		Barbarian frank = new Barbarian();
		Goul ghoul1 = new Goul();
		Rat rat1 = new Rat();
		jeff.castSpell(rat1, new Fireball());
		ralph.castSpell(rat1, new Fireball());
		System.out.println(rat1.getHealth());
	}
	
}