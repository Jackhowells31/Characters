package characters;

import enemies.EnemyCharacter;

public class Barbarian implements PlayerCharacter {
	
	public String name ="Bob";
	public int health = 10;
	public int damage = 7;
	public int speed;
	public int armor;
	
	
	
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
		target.setHealth(target.getHealth()-this.damage);
		System.out.println(this.getName()+" attacks with axe for "+this.getDamage() + " to " + target.getName());
	}
	



}
