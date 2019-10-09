package slate.items;
import slate.bases.ItemBase;
import slate.bases.String;

public class Beaker extends ItemBase {

	public Beaker() {
		// TODO Auto-generated constructor stub
	}

	public Beaker(ItemBase item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 7;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Beaker";
	}

}
