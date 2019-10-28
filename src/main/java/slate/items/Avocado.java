package slate.items;

import slate.Player;
import slate.bases.ItemBase;


public class Avocado extends ItemBase {

	public Avocado() {
		name = "Avocado";
		weight = 3;
		is_consumable = true;
		is_food = true;
		verb = "ate";
	}

	@Override
	public void use(Player player){

		//Print a Cynical Remark
		switch ((int)((Math.random()*4)+1)){
			case 1:
				System.out.println("It's a bit too ripe...");
				break;
			case 2:
				System.out.println("I'm eating strangers' food.");
				break;
			case 3:
				System.out.println("Huh. I guess I thought something weird would happen.");
				break;
			case 4:
				System.out.println("I wish I had something to wash that down with.");
				break;
		}
	}
}
