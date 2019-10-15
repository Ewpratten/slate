package slate.items;

import slate.bases.ItemBase;

public class Key extends ItemBase {

	public Key() {
		name = "Key";
		weight = 1;
	}

	public Key(ItemBase item) {
		super(item);
	}
}
