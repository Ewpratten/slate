package slate.items;

import slate.Player;
import slate.bases.ItemBase;

public class StickyBaby extends ItemBase {

	public StickyBaby() {
		name = "Sticky Baby";
		weight = 5;
		is_consumable = true;
		verb = "ate";
	}

	@Override
	public void use(Player player) {

		System.out.println("I'm just a monster.");
	}
}
