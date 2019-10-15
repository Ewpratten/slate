package slate.items;
import slate.bases.ItemBase;


public class LogBook extends ItemBase {

	public LogBook() {
		name = "Log Book";
		weight = 2;
	}

	public LogBook(ItemBase item) {
		super(item);
	}
}
