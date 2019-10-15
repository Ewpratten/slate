package slate.items;
import slate.bases.ItemBase;


public class Poison extends ItemBase {

	public Poison() {
		name = "Poison";
		weight = 5;
	}

	public Poison(ItemBase item) {
		super(item);
	}
}
