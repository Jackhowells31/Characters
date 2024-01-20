package weapon;

public class Greatsword implements Weapon {

	private String name = "Greatsword";
	private int damage = 10;

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
