package slate.items;
import slate.bases.ItemBase;


public class LogBook extends ItemBase {

	public LogBook() {
		// TODO Auto-generated constructor stub
	}

	public LogBook(ItemBase item) {
		super(item);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 2;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Log book";
	}

}
