package armor;

public class RustyPlate implements Armor {
	
	private String name = " Rusty Plate ";
	private int armor = 10;
	private int speed = -2;
	
	
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
