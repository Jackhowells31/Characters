package Potions;

public interface HealingPotion{

	String getName();
	int getAmount();

	HealingPotion construct(String name, int amount);
		
	
}
