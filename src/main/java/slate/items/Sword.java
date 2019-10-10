package slate.items;

import slate.bases.ItemBase;


public class Sword extends ItemBase {

	public Sword() {
		// TODO Auto-generated constructor stub
	}

	public Sword(ItemBase item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 5;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "sword";
	}

}
