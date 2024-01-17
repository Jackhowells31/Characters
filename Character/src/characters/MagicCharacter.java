package characters;

import enemies.EnemyCharacter;
import spells.Spell;

public interface MagicCharacter extends PlayerCharacter {
	void castSpell(EnemyCharacter target,Spell spell);
}