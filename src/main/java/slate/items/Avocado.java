package slate.items;

import slate.bases.ItemBase;


public class Avocado extends ItemBase {

	public Avocado() {
		// TODO Auto-generated constructor stub
	}

	public Avocado(ItemBase item) {
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
		return "Avocado";
	}
}
