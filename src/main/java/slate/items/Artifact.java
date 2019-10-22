package slate.items;

import slate.bases.ItemBase;


public class Artifact extends ItemBase {

	public Artifact() {
		name = "Artifact";
		weight = 3;
	}

	public Artifact(ItemBase item) {
		super(item);
	}
}
