package slate.items;

import slate.bases.ItemBase;


public class Sword extends ItemBase {

	public Sword() {
		name = "Sword";
		weight = 5;
	}

	public Sword(ItemBase item) {
		super(item);
	}
}
