package slate;

import slate.bases.ItemBase;

import java.util.ArrayList;

public class Room implements Cloneable{
    ArrayList<ItemBase> items = new ArrayList<ItemBase>();
    ArrayList<Inventory> inventories = new ArrayList<Inventory>();
    protected ArrayList<Room> attached_rooms = new ArrayList<Room>();
    public ArrayList<Guard> guards = new ArrayList<Guard>();
    public ArrayList<Guard> movedGuards = new ArrayList<Guard>();
    public boolean visited;

    protected String name, peekInfo, roomInfo;

    protected Inventory root_inventory = new Inventory("Room", 100);

    public int locks;

    public void unlock(){
        locks--;
    }

    public String getName() {
        return name;
    }

    public String getPeekInfo() {
        return peekInfo;
    }

    public String getRoomInfo() {
        return roomInfo;
    }

    /**
     * Constructors, optionally locked
     */
    public Room(String name, String desc, String peek) {
        this.name = name;
        this.roomInfo = desc;
        this.peekInfo = peek;
        this.locks = 0;
    }

    public Room(String name, String desc, String peek, int locks) {
        this.name = name;
        this.roomInfo = desc;
        this.peekInfo = peek;
        this.locks = locks;
    }

    /**
     * Copy a room
     * 
     * @param room
     */
    public static Room copyRoom(Room room) {
        try{
            return (Room) room.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }

    public void addPathway(Room... rooms) {
        for (Room room : rooms) {
            addPathway(room);

        }
    }

    /**
     * Add a pathway attached to this room
     * 
     * @param room New room
     */
    public void addPathway(Room room) {
        // This will override pre-existing rooms
        attached_rooms.add(room);
    }

    /**
     * Add an item to the room
     * 
     * @param item Item to add
     */
    public void addItem(ItemBase item) {
        root_inventory.addItem(item);
    }

    /**
     * Spawn a guard into a room
     *
     * @param num Number to add
     */
    public void addGuards(int num) {
        for(int i = 0; i<num; i++) {
            this.guards.add(new Guard(this));
        }
    }

    /**
     * Get a list of names of all items in the room
     * 
     * @return List of all item names
     */
    public String[] getItemNames() {
        ArrayList<String> output = new ArrayList<String>();

        for (ItemBase item : items) {
            output.add(item.name);
        }

        return output.toArray(new String[output.size()]);
    }

    /*
     * Get attached rooms
     */
    public ArrayList<Room> getAttached_rooms() {
        return attached_rooms;
    }

    public boolean equals(Room room) {
        return room.getName() == getName() && room.getRoomInfo() == getRoomInfo() && room.getPeekInfo() == getPeekInfo()
                && attached_rooms.equals(room.attached_rooms) && items.equals(room.items) && visited == room.visited;
    }

    /*
     * Get guards
     */
    public ArrayList<Guard> getGuards(){
        return guards;
    }

    /*
     Get Moved Guards
     */
    public ArrayList<Guard> getMovedGuards(){
        return movedGuards;
    }

    public Inventory getRoot_inventory() {
        return root_inventory;
    }

    /**
     * Get a list of inventories in the room
     *
     * @return List of all inventories
     */
    public ArrayList<Inventory> getInventories() {
        return inventories;
    }

    /**
     * Add an inventory to the room
     *
     * @param inventory Item to add
     */
    public void addInventory(Inventory inventory) {
        inventories.add(inventory);
    }

    
    /**
     * Set the room name, and get the room. This can be used as an optional, chainable, constructor.
     * 
     * @param name Room name
     * @return Current room
     */
    public Room named(String name) {
        this.name = name;
        return this;
    }

    /**
     * Set the room name, and get the room. This can be used as an optional, chainable, constructor.
     *
     * @param num locks needed
     * @return Current room
     */
    public Room withLocks(int num) {
        this.locks = num;
        return this;
    }

    public int getLocks() {
        return locks;
    }
}