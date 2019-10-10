package slate.items;

import slate.bases.ItemBase;


public class Pen extends ItemBase {

	public Pen() {
		// TODO Auto-generated constructor stub
	}

	public Pen(ItemBase item) {
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
		return "Pen";
	}

}
