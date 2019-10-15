package slate.items;

import slate.bases.ItemBase;

public class Muffin extends ItemBase {

	public Muffin() {
		name = "Muffin";
		weight = 3;
	}

	public Muffin(ItemBase item) {
		super(item);
	}
}
