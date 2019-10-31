package slate.items;
import slate.Player;
import slate.bases.ItemBase;

public class PlayerItem extends ItemBase {

    public PlayerItem() {
        name = "Me";
        weight = 0;
        is_consumable = true;
        verb = "ate";
    }

    @Override
    public void use(Player player) {

        //Eat yourself
        System.out.println("I seriously just ate myself...");
    }

}