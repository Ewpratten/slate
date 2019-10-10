package slate.items;

import slate.bases.ItemBase;

public class Key extends ItemBase {

	public Key() {
		// TODO Auto-generated constructor stub
	}

	public Key(ItemBase item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getWeight() {
		return 1;
	}
	@Override
	public String getName() {
		return "key";
	}

}
