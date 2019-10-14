package slate.items;

import slate.bases.ItemBase;


public class Avocado extends ItemBase {

	public Avocado() {
		name = "Avocado";
		weight = 3;
	}

	public Avocado(ItemBase item) {
		super(item);
	}
}
