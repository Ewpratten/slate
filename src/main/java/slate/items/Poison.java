package slate.items;
import slate.bases.ItemBase;


public class Poison extends ItemBase {

	public Poison() {
		// TODO Auto-generated constructor stub
	}

	public Poison(ItemBase item) {
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
		return "Poison";
	}

}
