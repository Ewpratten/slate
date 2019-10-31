package slate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import slate.bases.ItemBase;
import slate.exceptions.ItemNotFoundException;
import slate.exceptions.ItemSizeException;

/**
 * A class for managing items
 */
public class Inventory {

    //Number of lock on inventory, must be 0 to be accessible
    int locks;

    /**
     * Collection of duplicate items. This is used to allow duplicate items to exist
     * in the item hashmap
     */
    public class ItemCollection {
        ItemBase item;
        int count;

        /**
         * Create an ItemCollection
         * 
         * @param item  Item
         * @param count Number of items in the collection
         */
        protected ItemCollection(ItemBase item, int count) {
            this.item = item;
            this.count = count;
        }

        /**
         * Get the stored ItemBase object
         * 
         * @return ItemBase
         */
        public ItemBase getItem() {
            return item;
        }
    }

    /**
     * A pair of an item name, and the number of them stored
     */
    public class Stack {
        public String name;
        public int count;

        /**
         * Create a stack
         * 
         * @param name  Name of item
         * @param count Number of items in the stack
         */
        public Stack(String name, int count) {
            this.name = name;
            this.count = count;
        }
    }

    HashMap<String, ItemCollection> storage = new HashMap<String, ItemCollection>();
    int max_size;
    String name;

    /**
     * Construct an inventory of a specific size, no locks
     *
     * @param name Inventory name
     * @param size Capacity
     */
    public Inventory(String name, int size) {
        this.name = name;
        this.max_size = size;
        this.locks = 0;
    }

    /**
     * Locked inventory
     *
     * @param name  Inventory name
     * @param size  Maximum size
     * @param locks Number of locks required to open the inventory
     *
     */
    public Inventory(String name, int size, int locks) {
        this.name = name;
        this.max_size = size;
        this.locks = locks;
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
    public ItemBase removeItem(String name) throws ItemNotFoundException {
        // Ensure the item exists
        if (!storage.containsKey(name)) {
            throw new ItemNotFoundException();
        }

        // Check if the item is a duplicate
        if (storage.get(name).count > 1) {

            // Subtract item count
            storage.get(name).count--;

            // Return a copy of the object
            return ItemBase.copyItem(storage.get(name).item);

        } else {

            // Store the item as a copy
            ItemBase item = ItemBase.copyItem(storage.get(name).item);

            // Delete the item from the hashmap
            storage.remove(name);

            // Return the item
            return item;
        }
    }

    /**
     * Remove N occurences of an item
     * 
     * @param name Item name
     * @param num
     * @throws ItemNotFoundException
     */
    public ItemBase removeItems(String name, int num) throws ItemNotFoundException {
        // Create a holder for the item to return
        ItemBase output = null;

        // Iterate N times to delete N items
        for (int i = 0; i < num; i++) {

            // If the output has not been set, we will grab an Item object to be returned
            if (output == null) {
                output = removeItem(name);
            } else {
                removeItem(name);
            }
        }

        return output;
    }

    /**
     * Adds an item, this is what to call outside of this class to add an item to
     * storage
     *
     * @param item Item to add to inventory
     */
    public void addItem(ItemBase item) {

        // Try to add an item
        try {
            putItem(item.getName(), item);
        } catch (ItemSizeException e) {
            System.out.println(e);
        }

    }

    /**
     * Add multiple items to the inventory
     * 
     * @param item Item to add to inventory
     * @param num  Number of times that item should be added
     */
    public void addItem(ItemBase item, int num) {

        // Iterate N times to add N items
        for (int i = 0; i < num; i++) {

            // Try to add the item
            try {
                putItem(item.getName(), item);
            } catch (ItemSizeException e) {
                System.out.println(e);
            }
        }
    }

    /**
     * Add an item to storage. If duplicate, it will be tracked ia a counter
     * 
     * @param name Item name (should be generated by ItemBase.getName())
     * @param item Item object to store
     * @throws ItemSizeException
     */
    public void putItem(String name, ItemBase item) throws ItemSizeException {
        // Check if item can fit
        if (getUsage() + item.getWeight() > max_size) {
            throw new ItemSizeException();
        }

        // Handle duplicate items
        if (storage.containsKey(name)) {

            // Increment item count
            storage.get(name).count++;
        } else {

            // Handle new item
            storage.put(name, new ItemCollection(ItemBase.copyItem(item), 1));

        }
    }

    /**
     * Get the inventory name
     * 
     * @return Inventory name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the storage HashMap
     * 
     * @return Storage
     */
    public HashMap<String, ItemCollection> getStorage() {
        return storage;
    }

    /**
     * Get the number of locks on the inventory
     * 
     * @return Number of locks
     */
    public int getLocks() {
        return locks;
    }

    /**
     * Unlock the inventory, (remove one lock)
     */
    public void unlock() {
        locks--;
    }
}