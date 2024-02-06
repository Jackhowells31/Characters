package armor;

public class FlimsyLeather implements Armor {
	
	private String name = " Flimsy Leather Armor ";
	private int armor = 8;
	private int speed = 0;
	
	
	public int getArmor() {
		return armor;
	}
	public int setArmor() {
		return armor;
	}
	
	public int getSpeed() {
		return speed;
	}
	public int setSpeed() {
		return speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
