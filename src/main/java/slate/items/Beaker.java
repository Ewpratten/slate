package slate.items;
import slate.bases.ItemBase;


public class Beaker extends ItemBase {

	public Beaker() {
		name = "Beaker";
		weight = 7;
	}

	public Beaker(ItemBase item) {
		super(item);
	}
}
