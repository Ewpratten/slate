package slate.items;

import slate.Player;
import slate.bases.ItemBase;


public class InvisibilityCloak extends ItemBase {

	public InvisibilityCloak() {
		name = "Invisibility Cloak";
		weight = 15;
		is_consumable = true;
	}

	@Override
	public void use(Player player){

		//Make player invisible for 3 turns
		player.invisTurns += 3;
	}
}
