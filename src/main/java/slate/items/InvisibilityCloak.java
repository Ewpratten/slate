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
		player.invisTurns += 3;
	}
}
