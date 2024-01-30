package characters;

import floors.Floor;
import potions.HealingPotion;

public interface PlayerCharacter {
	
	String getName();
	int getHealth();
	void setHealth(int health);
	int getArmor();
	int[] getPosition();
	void setPosition(int[] rowCol);
	Floor getFloor();
	
	
	default void useHealthPotion(HealingPotion potion) {
		this.setHealth(this.getHealth() + potion.getAmount());
		System.out.println(this.getName() + " drinks "+ potion.getName() +" restoring " + potion.getAmount() + " "
				+ this.getName() + " now has " + this.getHealth() + " health left!");
	}
	
	default void move(String direction) {
		int[] currentPosition = this.getPosition();
		Floor currentFloor = this.getFloor();
		switch(direction.toLowerCase()){
		case "up": {
			if (currentPosition[0] <= 0) {
				System.out.println(this.getName() + " cannot move up any more!");
				currentFloor.printFloorPosition(this);
				break;
			}
			currentPosition[0] -= 1;
			this.setPosition(currentPosition);
			currentFloor.printFloorPosition(this);
			break;
		}
		case "down": {
			if(currentPosition[0] >= currentFloor.getFloorLayout().length -2) {
				System.out.println(this.getName() + " cannot move down any more!");
				currentFloor.printFloorPosition(this);
				break;
			}
			currentPosition[0] +=1;
			this.setPosition(currentPosition);
			currentFloor.printFloorPosition(this);
			break;
		}
		case "left": {
			if (currentPosition[1] <= 0) {
				System.out.println(this.getName() + " cannot move left any more!");
				currentFloor.printFloorPosition(this);
				break;
			}
			currentPosition[1] -=1;
			this.setPosition(currentPosition);
			currentFloor.printFloorPosition(this);
			break;
		}
		case "right": {
			if(currentPosition[1] >= currentFloor.getFloorLayout()[currentPosition[0]].length -1) {
				System.out.println(this.getName() + " cannot move right any more!");
				currentFloor.printFloorPosition(this);
				break;
			}
			currentPosition[1] +=1;
			this.setPosition(currentPosition);
			currentFloor.printFloorPosition(this);
			break;
		}
		default: {
			System.out.println("Error Moving");
			currentFloor.printFloorPosition(this);
			break;
		}
		}
	}
	
}