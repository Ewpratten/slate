package slate.items;

import slate.bases.ItemBase;
import slate.bases.String;

public class Apple extends ItemBase {

	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public Apple(ItemBase item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getWeight() {
		return 2;
	}
	@Override
	public String getName() {
		return "apple";
	}

}
