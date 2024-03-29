package enemies;

import characters.PlayerCharacter;

public class Skeleton implements EnemyCharacter {

	private int health = 9;
	private int damage = 12;
	private String name;

	public Skeleton(String name) {
		this.health = 15;
		this.damage = 8;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {

	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public void attack1(PlayerCharacter target) {
		target.setHealth(target.getHealth() - damage);
		System.out.println("Skeleton shoots for " + this.damage + " damage to " + target.getName());

	}

	public void attack2(PlayerCharacter target) {
		target.setHealth((target.getHealth() + (target.getArmor())) - (damage + 3));
		System.out.println("Skeleton stabs for " + (this.damage + 3)+ " damage to " + target.getName() + ". "
				+ target.getName() + " has " + target.getHealth() + " health left");

	}

}
