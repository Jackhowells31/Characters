package characters;

import enemies.EnemyCharacter;
import spells.Spell;

public class Wizard implements MagicCharacter {
	
	private String name;
	private int health;
	private int armor;
	private int damage;
	private int speed;
	private int spells;
	
	
	
	
	public Wizard(String name){
		this.name = name;
		this.health = 8;
		this.armor = 4;
		this.damage = 2;
		this.speed = 6;
		this.spells = 10;
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


	public int getArmor() {
		return armor;
	}


	public void setArmor(int armor) {
		this.armor = armor;
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


	public int getSpells() {
		return spells;
	}


	public void setSpells(int spells) {
		this.spells = spells;
	}


	public void castSpell(EnemyCharacter target, Spell spell) {
		target.setHealth(target.getHealth()-spell.getDamage());
		System.out.println(this.getName() + " casts "+ spell.getName() +" for " + spell.getDamage()+ " damage on " + target.getName()+".");
		
	}

}