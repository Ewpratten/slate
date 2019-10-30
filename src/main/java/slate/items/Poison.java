package slate.items;
import slate.App;
import slate.Player;
import slate.bases.ItemBase;


public class Poison extends ItemBase {

	public Poison() {
		name = "Poison";
		weight = 5;
		is_consumable = true;
		verb = "drink";
	}

	@Override
	public void use(Player player){
		System.out.println("Why did I do that?");
		App.chemDeath = true;
	}

}
