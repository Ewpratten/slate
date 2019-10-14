package slate.rooms;

import slate.Inventory;
import slate.bases.RoomBase;
import slate.exceptions.ItemSizeException;
import slate.items.TestItem;

public class TestRoom extends RoomBase {

    public TestRoom() {
        this.name = "Test room";
        this.room_info = "This room may change dimensions randomly";
        this.peek_info = "Looks odd...";

        //Root Inventory

        //Ground Item
        TestItem item = new TestItem();
        try {
            root_inventory.addItem(item.getName(), item);
        } catch (ItemSizeException e) {
            e.printStackTrace();
        }

        //Test Box
        Inventory testBox = new Inventory("Test Box", 2);
        item = new TestItem();
        try {
            testBox.addItem(item.getName(), item);
        } catch (ItemSizeException e) {
            e.printStackTrace();
        }
        addInventory(testBox);
    }

}