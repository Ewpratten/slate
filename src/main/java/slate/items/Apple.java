package slate.items;

import slate.bases.ItemBase;

public class Apple extends ItemBase {

	public Apple() {
		name = "Apple";
		weight = 2;
	}

	public Apple(ItemBase item) {
		super(item);
	}

}
