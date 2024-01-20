package characters;

import enemies.EnemyCharacter;

public interface MeleeCharacter extends PlayerCharacter {

	void meleeAttack (EnemyCharacter target);
	
}
