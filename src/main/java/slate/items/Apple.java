package slate.items;

import slate.Player;
import slate.bases.ItemBase;

public class Apple extends ItemBase {

	public Apple() {
		name = "Apple";
		weight = 2;
		is_consumable = true;
		verb = "ate";
	}

	@Override
	public void use(Player player) {

		//Print a Cynical Remark
		switch ((int)((Math.random()*4)+1)){
			case 1:
				System.out.println("Too bad all the doctors have already left.");
				break;
			case 2:
				System.out.println("I'm eating strangers' food.");
				break;
			case 3:
				System.out.println("Huh. I guess I thought something weird would happen.");
				break;
			case 4:
				System.out.println("I try to eat around the bruises...");
		}
	}
}
