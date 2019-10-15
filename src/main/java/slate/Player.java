package slate;

import slate.exceptions.ItemSizeException;
import slate.items.TestItem;

public class Player {
    private static Player m_instance = null;
    private Inventory inventory;
    private Inventory focused_inventory;

    private Player() {
        inventory = new Inventory("Pockets",20);
        TestItem item = new TestItem();
        try {
            inventory.addItem(item.getName(), item);
        } catch (ItemSizeException e) {
            e.printStackTrace();
        }
    }

    public static Player getInstance() {
        if (m_instance == null) {
            m_instance = new Player();

        }

        return m_instance;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Inventory getFocused_inventory() {
        return focused_inventory;
    }

    public void setFocused_inventory(Inventory new_inventory) {
        focused_inventory = new_inventory;
    }
}