package characters;

import floors.Basement;
import floors.Floor;

public class Fighter implements PlayerCharacter {
	
	private String name;
	private int health = 10;
	private int damage = 5;
	private int speed;
	private int armor;
	private int [] position = {0,0};
	private Floor currentFloor;
	
	public Fighter (String name) {
		this.currentFloor = new Basement();
		this.name = name;
		this.health = 10;
		this.armor = 10;
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
	public int[] getPosition() {
		return null;
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
