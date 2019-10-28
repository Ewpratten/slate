package slate.items;

import slate.Player;
import slate.bases.ItemBase;

public class Muffin extends ItemBase {

	public Muffin() {
		name = "Muffin";
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
				System.out.println("It's incredibly dry...");
				break;
			case 2:
				System.out.println("I'm eating strangers' food.");
				break;
			case 3:
				System.out.println("Huh. I guess I thought something weird would happen.");
				break;
			case 4:
				System.out.println("It's like 90% wheat bran. Not even any raisins or anything.");
				break;
		}
	}
}
