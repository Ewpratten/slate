package slate.items;

import slate.bases.ItemBase;

public class Muffin extends ItemBase {

	public Muffin() {
		// TODO Auto-generated constructor stub
	}

	public Muffin(ItemBase item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 3;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Muffin";
	}

}
