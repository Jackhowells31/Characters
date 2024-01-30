package characters;

import Potions.HealingPotion;

public interface PlayerCharacter {
	
	String getName();
	int getHealth();
	void setHealth(int health);
	int getArmor();
	
	
	default void useHealthPotion(HealingPotion potion) {
		this.setHealth(this.getHealth() + potion.getAmount());
		System.out.println(this.getName() + " drinks "+ potion.getName() +" restoring " + potion.getAmount() + " "
				+ this.getName() + " now has " + this.getHealth() + " health left!");
	}
	
}