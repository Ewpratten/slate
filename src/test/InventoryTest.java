package slate;

import org.junit.Test;

import slate.Inventory;
import slate.bases.ItemBase;

public class InventoryTest {

    @Test
    public void testItemAddition() {
        Inventory inventory = new Inventory(2);

        boolean success;
        try {
            inventory.addItem("sword", new ItemBase());
            success = true;
        } catch (Exception e) {
            success = false;
        }

        assert success == true;

    }

    @Test
    public void testOverweight() {
        Inventory inventory = new Inventory(2);

        boolean success = false;
        try {
            inventory.addItem("sword", new ItemBase());
            inventory.addItem("knife", new ItemBase());
            inventory.addItem("key", new ItemBase());
        } catch (Exception e) {
            success = true;
        }

        assert success == true;
    }
}
