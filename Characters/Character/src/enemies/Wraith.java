package enemies;

import characters.PlayerCharacter;

public class Wraith implements EnemyCharacter{
	
	private int health = 30;
	private int damage =7;
	private String name;
	
	
	public String getName() {
		return this.name;
	}
	public String setName() {
		return this.name;
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
	
	public void claw(PlayerCharacter target) {
		
	}
	
	public void attack1(PlayerCharacter target) {
		target.setHealth(target.getHealth()-damage);
		System.out.println(" Wraith Slashes with his claw for " +this.damage+" damage to "+target.getName() );
	}
	
	public void attack2(PlayerCharacter target) {
		target.setHealth(target.getHealth()-damage+3);
		System.out.println(" Wraith bites for " +(+this.damage+3)+" damage to "+target.getName() );
		
	}
	

}