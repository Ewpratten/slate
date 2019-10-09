package slate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import slate.bases.ItemBase;
import slate.exceptions.ItemNotFoundException;

public class Inventory {

    /**
     * Collection of duplicate items
     */
    private class ItemCollection {
        ItemBase item;
        int count;
    }

    /**
     * A pair of an item name, and the number of them stored
     */
    public class Stack {
        String name;
        int count;

        public Stack(String name, int count) {
            this.name = name;
            this.count = count;
        }
    }

    HashMap<String, ItemCollection> storage = new HashMap<String, ItemCollection>();
    int max_size;

    /**
     * Construct an inventory of a specific size
     * 
     * @param size Maximum size
     */
    public Inventory(int size) {
        this.max_size = size;
    }

    /**
     * Get the amount of storage used
     * 
     * @return storage usage
     */
    public int getUsage() {
        int total_usage = 0;

        // Iterate through each ItemCollection
        for (ItemCollection x : storage.values()) {

            // Add the item count to te usage
            total_usage += x.count;

        }

        return total_usage;
    }

    /**
     * Get a list of all items by name and the number of them stored
     * 
     * @return List of items by name (pair of String, and int)
     */
    public Stack[] getAllNames() {
        // List to contain pairs
        ArrayList<Stack> output = new ArrayList<Stack>();

        // Build list of Stacks
        for (Entry<String, ItemCollection> x : storage.entrySet()) {

            // Build new stack from the key and count
            output.add(new Stack(x.getKey(), x.getValue().count));
        }

        return output.toArray(new Stack[output.size()]);
    }

    /**
     * Get a specific item object by name and "pop" it from the storage
     * 
     * @param name Name of item
     * @return Item object
     * @throws ItemNotFoundException
     */
    public ItemBase getItem(String name) throws ItemNotFoundException {
        // Ensure the item exists
        if (!storage.containsKey(name)) {
            throw new ItemNotFoundException();
        }

        // Check if the item is a duplicate
        if (storage.get(name).count > 1) {

            // Subtract item count
            storage.get(name).count--;

            // Return a copy of the object
            return new ItemBase(storage.get(name).item);

        } else {

            // Store the item as a copy
            ItemBase item = new ItemBase(storage.get(name).item);

            // Delete the item from the hashmap
            storage.remove(name);

            // Return the item
            return item;
        }
    }

    /**
     * Add an item to storage. If duplicate, it will be tracked ia a counter @param
     * name Item name (should be generated by ItemBase.getName()) @param item Item
     * object to store @throws
     */
    public void addItem(String name, ItemBase item) {

    }

}