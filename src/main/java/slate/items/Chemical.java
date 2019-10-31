package slate.items;

import slate.App;
import slate.Player;
import slate.bases.ItemBase;


public class Chemical extends ItemBase {

	public Chemical() {
		name = "Chemical";
		weight = 7;
		is_consumable = true;
	}

	@Override
	public void use(Player player){
		switch ((int)(Math.random()*10)+1){
			case 1:

				//Become Ethereal
				System.out.println("I can't see my hands, and I lose grip on the flask...");
				player.invisTurns += 5;
				player.etherealTurns += 5;
				player.getInventory().addItem(new Flask());
				break;
			case 2:

				//Water
				System.out.println("I think this is just water...");
				player.getInventory().addItem(new Flask());
				break;
			case 3:

				//Death
				System.out.println("oH GOd iT BuRNS! WhY did I Think tHis WoULd bE a Good IdEa?");
				App.chemDeath = true;
				break;
			case 4:

				//Slow time
				System.out.println("Everything seems to slow down around me...");
				player.timeScale*=2;
				player.getInventory().addItem(new Flask());
				break;
			case 5:

				//Speed up time
				System.out.println("Everything seems to speed up around me...");
				player.timeScale/=2;
				player.getInventory().addItem(new Flask());
				break;
			case 6:

				//Turn player into flask and give consumable self item
				if(!player.isFlask) {
					player.isFlask = true;
					System.out.println("I seem to have become an empty flask...");
					player.getInventory().addItem(new PlayerItem());
					break;
				}

				//Nothing
				System.out.println("Nothing happens...");
				break;
			case 7:

				//Urine
				System.out.println("Ew. I think is urine. I kind of hope it is. Why did I want to drink this?");
				break;
			case 8:

				//Lead Nitrate is Yummy
				System.out.println("It tastes horrible, I look a the flask. It's marked \"Pb(NO3)2(aq)\"...");
				break;
			case 9:

				//Gross
				System.out.println("Tastes like cigarette butts...");
				break;
			case 10:

				//Itchy
				System.out.println("I feel itchy...");
				break;
		}
	}
}
