package floors;

import characters.PlayerCharacter;

public interface Floor {

	int[][] getFloorLayout();

	default void printFloorPosition(PlayerCharacter player) {
		int row = player.getPosition()[0];
		int col = player.getPosition()[1];
		System.out.println("----------------------------------------------------");
		System.out.println("            " + player.getName().toUpperCase());
		System.out.println("----------------------------------------------------");
		for(int i = 0; i < this.getFloorLayout().length -1; i++ ) {
			System.out.print("  ||");
			for(int j=0; j < this.getFloorLayout()[i].length -1; j++) {
				if (row==i && col ==j) {
				System.out.print(" X ||");
				}else if(this.getFloorLayout()[i][j]==3) {
					System.out.print(" M ||");
				}
				else {
					System.out.print(" - ||");
				}
			}
			System.out.println("");
		}
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
	}

}
