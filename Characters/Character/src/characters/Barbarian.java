package characters;

import enemies.EnemyCharacter;
import weapon.Greatsword;

public class Barbarian implements PlayerCharacter {

	private String name;
	private int health = 10;
	private int damage = 7;
	private int speed;
	private int armor;

	public Barbarian(String name) {

		this.name = name;
		this.health = 14;
		this.armor = 4;
		this.damage = 12;
		this.speed = 10;
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

	public void axeAttack(EnemyCharacter target) {
		target.setHealth(target.getHealth() - this.damage);
		System.out.println(this.getName() + " attacks with axe for " + this.getDamage() + " to " + target.getName());
	}

	public void meleeAttack(EnemyCharacter target, Greatsword greatsword) {
		target.setHealth(target.getHealth() - this.damage);
		System.out.println(
				this.getName() + " attacks with Greatsword for " + this.getDamage() + " to " + target.getName());
	}

}
