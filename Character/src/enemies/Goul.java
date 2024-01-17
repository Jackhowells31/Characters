package enemies;

import characters.PlayerCharacter;

public class Goul implements EnemyCharacter{
	
	public int health = 10;
	public int damage =6;
	public String name = "Frank";
	
	
	@Override
	public String getName() {
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
		System.out.println("Ghoul claws for " +this.damage+" damage to "+target.getName() );
	}
	
	public void attack2(PlayerCharacter target) {
		target.setHealth(target.getHealth()-damage+3);
		System.out.println("Ghoul headbutts for " +this.damage+3+" damage to "+target.getName() );
		
	}
	

}