package spells;

public class MagicMissile implements Spell {

	private String name = "Magic Missile";
	private int tier = 1;
	private int damage = 24;

	public int getDamage() {
		return damage;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
