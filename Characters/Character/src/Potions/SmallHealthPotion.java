package Potions;

public class SmallHealthPotion implements HealingPotion {

	private String name = "Small health potion";
	private int amount = 4;

	public SmallHealthPotion(String name, int amount) {
		this.name=name;
		this.amount=amount;
	}
	
	public SmallHealthPotion construct(String name, int amount) {
		return new SmallHealthPotion(name, amount);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return this.amount;
	}

}
