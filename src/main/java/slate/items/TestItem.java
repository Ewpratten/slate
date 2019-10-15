package slate.items;

import slate.bases.ItemBase;

public class TestItem extends ItemBase {

	public TestItem() {
		name = "Test Item";
		weight = 1;
	}

	public TestItem(ItemBase item) {
		super(item);
	}
}
