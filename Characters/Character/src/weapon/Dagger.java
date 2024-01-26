package weapon;

public class Dagger implements Weapon {
	
	private String name="Dagger";
	private int damage = 4;
	
	public int getDamage() {
		
		return damage;
	}
	public int setDamage() {
		
		return damage;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
