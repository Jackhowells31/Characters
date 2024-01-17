package characters;

import enemies.EnemyCharacter;

public interface RangedCharacter extends PlayerCharacter{
	
	void rangedAttack (EnemyCharacter target);

}