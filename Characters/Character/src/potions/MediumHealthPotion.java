package potions;

public class MediumHealthPotion implements HealingPotion {

	private String name = "Medium health potion";
	private int amount = 8;

	public MediumHealthPotion(String name, int amount) {
		this.name=name;
		this.amount=amount;
	}
	
	public MediumHealthPotion construct(String name, int amount) {
		return new MediumHealthPotion(name, amount);
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
