package enemies;

import characters.PlayerCharacter;

public interface EnemyCharacter {
	
	int getHealth();
	int getDamage();
	String getName();
	
	void setHealth(int health);
	void attack1(PlayerCharacter target);
	void attack2(PlayerCharacter target);
	
}