package enemies;

import characters.PlayerCharacter;

public class Rat implements EnemyCharacter{

	public int health=2;
	public int damage=1;
	public String name = "Ted";
	
	
	public String getName() {
		return this.name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if (health > 0 ) {
		this.health = health;
		} else {
			System.out.println(this.getName() + "is dead!");
		}
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void attack1(PlayerCharacter target) {
		
		target.setHealth(target.getHealth()-damage);
		System.out.println("Rat deals "+damage+ "damage to "+target.getName() );
	}
	
	public void attack2(PlayerCharacter target) {
		target.setHealth(target.getHealth()-(damage+2));
		System.out.println("Rat deals "+(damage+2)+ " damage to "+target.getName() );
		
	}
	
	
}