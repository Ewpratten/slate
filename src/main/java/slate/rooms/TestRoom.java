package slate.rooms;

import slate.Inventory;
import slate.bases.RoomBase;
import slate.exceptions.ItemSizeException;
import slate.items.Key;
import slate.items.TestItem;

public class TestRoom extends RoomBase {

    public TestRoom() {

        name = "Test room";
        room_info = "This room may change dimensions randomly";
        peek_info = "Looks odd...";

        //Root Inventory

        //Ground Item
        TestItem item = new TestItem();
        Key key = new Key();
        try {
            root_inventory.addItem(item.getName(), item);
            root_inventory.addItem(key.getName(), key);
            root_inventory.addItem(key.getName(), key);
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

        //Locked Box
        Inventory lockedBox = new Inventory("Locked Box", 2,2);
        item = new TestItem();
        try {
            lockedBox.addItem(item.getName(), item);
        } catch (ItemSizeException e){
            e.printStackTrace();
        }
        addInventory(lockedBox);
    }

}