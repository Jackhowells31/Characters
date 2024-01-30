package characters;

import enemies.EnemyCharacter;
import floors.Floor;
import potions.SmallHealthPotion;
import trinkets.SmallHealthRing;
import weapon.Dagger;

public class Rogue implements PlayerCharacter {

	private String name = "Billy";
	private int health;
	private int damage;
	private int speed;
	private int armor;
	private int[] position;
	private Floor currentFloor;

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
		target.setHealth(target.getHealth() + SmallHealthPotion.getAmount());
		System.out.println(this.getName() + " drinks "+ SmallHealthPotion.getName() +" restoring " + SmallHealthPotion.getAmount() + " "
				+ target.getName() + " now has " + this.getHealth() + " health left!");
	}
	public void equipSmallHealthRing(PlayerCharacter target, SmallHealthRing SmallHealthRing) {
		target.setHealth(getHealth() + SmallHealthRing.getDamage());
		System.out.println(target.getName()+ " equipped "+ SmallHealthRing.getName()+ " his health is now " + this.getHealth());
	}
	
	public int[] getPosition() {
		return this.position;
	}
	
	public void setPosition(int[] position) {
		this.position = position;
	}
	
	public Floor getFloor() {
		return this.currentFloor;
	}
	
	public void setFloor(Floor currentFloor) {
		this.currentFloor=currentFloor;
	}

}
