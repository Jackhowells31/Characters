package characters;

import Potions.SmallHealthPotion;
import enemies.EnemyCharacter;
import weapon.Dagger;

public class Rogue implements PlayerCharacter {

	private String name = "Billy";
	private int health = 7;
	private int damage = 10;
	private int speed;
	private int armor;

	public Rogue(String name) {

		this.name = name;
		this.health = 8;
		this.armor = 6;
		this.damage = 8;
		this.speed = 12;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void meleeAttack(EnemyCharacter target, Dagger Dagger) {
		target.setHealth(target.getHealth() - this.damage);
		System.out.println(this.getName() + " stabs " + target.getName() + " in the back with Dagger for "
				+ this.getDamage() + " damage");
	}

	public void usePotionSmall(PlayerCharacter target, SmallHealthPotion SmallHealthPotion) {
		target.setHealth(target.getHealth() + this.damage);
		System.out.println(this.getName() + " drinks potion restoring " + SmallHealthPotion.getDamage() + " "
				+ target.getName() + " now has " + target.getHealth() + " health left!");
	}

}
