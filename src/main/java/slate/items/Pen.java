package slate.items;

import slate.bases.ItemBase;


public class Pen extends ItemBase {

	public Pen() {
		name = "Pen";
		weight = 3;
	}

	public Pen(ItemBase item) {
		super(item);
	}
}
