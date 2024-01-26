package Potions;
public class SmallHealthPotion implements HealingPotions {
	
	private String name = "Small health potion";
	private int damage = 4;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return damage;
	}
}
