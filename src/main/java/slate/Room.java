package slate;

import slate.bases.ItemBase;

import java.util.ArrayList;

public class Room implements Cloneable{

    //Game
    App game;

    //Loose Items in a room
    ArrayList<ItemBase> items = new ArrayList<ItemBase>();

    //Containers in a room
    ArrayList<Inventory> inventories = new ArrayList<Inventory>();

    //Attached rooms
    protected ArrayList<Room> attached_rooms = new ArrayList<Room>();

    //Guards in room
    public ArrayList<Guard> guards = new ArrayList<Guard>();

    //Guards that were moved from this room
    public ArrayList<Guard> movedGuards = new ArrayList<Guard>();

    //Has this room been visited?
    public boolean visited;

    //Name, brief description, and dialogue to display when entered
    protected String name, peekInfo, roomInfo;

    //"Floor" inventory
    protected Inventory root_inventory = new Inventory("Room", 100);

    //Number of locks on the doors
    public int locks;

    //Remove a lock
    public void unlock(){
        locks--;
    }

    //Get room name
    public String getName() {
        return name;
    }

    //Get quick info about room
    public String getPeekInfo() {
        return peekInfo;
    }

    //Get room dialogue
    public String getRoomInfo() {
        return roomInfo;
    }

    /**
     * Unlocked Room
     * @param game Links room to a game instance
     * @param name Room name
     * @param desc Room description
     * @param peek Room peek snippet
     */
    public Room(App game, String name, String desc, String peek) {
        this.game = game;
        this.name = name;
        this.roomInfo = desc;
        this.peekInfo = peek;
        this.locks = 0;
    }

    /**
     * Locked Room
     * @param game Links room to a game instance
     * @param name Room name
     * @param desc Room description
     * @param peek Room peek snippet
     * @param locks Number of locks
     */
    public Room(App game, String name, String desc, String peek, int locks) {
        this.game = game;
        this.name = name;
        this.roomInfo = desc;
        this.peekInfo = peek;
        this.locks = locks;
    }

    /**
     * Copy a room
     * @param room Room to clone
     */
    public static Room copyRoom(Room room) {
        try{
            return (Room) room.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }

    //Add paths to other rooms
    public void addPathway(Room... rooms) {
        for (Room room : rooms) {
            addPathway(room);

        }
    }

    /**
     * Add a pathway attached to this room
     * @param room New room
     */
    public void addPathway(Room room) {
        // This will override pre-existing rooms
        attached_rooms.add(room);
    }

    /**
     * Add an item to the room
     * @param item Item to add
     */
    public void addItem(ItemBase item) {
        root_inventory.addItem(item);
    }

    /**
     * Add multiple items to the room
     * @param item Item to add
     * @param num number to add
     */
    public void addItem(ItemBase item, int num) {
        root_inventory.addItem(item, num);
    }

    /**
     * Spawn guards into a room
     * @param num Number to add
     */
    public void addGuards(int num) {
        for(int i = 0; i<num; i++) {
            this.guards.add(new Guard(this, game.player));
        }
    }

    /**
     * Get a list of names of all items in the room
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

    //Compare Rooms
    public boolean equals(Room room) {
        return room.getName() == getName() && room.getRoomInfo() == getRoomInfo() && room.getPeekInfo() == getPeekInfo()
                && attached_rooms.equals(room.attached_rooms) && items.equals(room.items) && visited == room.visited;
    }

    //Get Guards
    public ArrayList<Guard> getGuards(){
        return guards;
    }

    //Get Moved Guards
    public ArrayList<Guard> getMovedGuards(){
        return movedGuards;
    }

    public Inventory getRoot_inventory() {
        return root_inventory;
    }

    /**
     * Get a list of inventories in the room
     * @return List of all inventories
     */
    public ArrayList<Inventory> getInventories() {
        return inventories;
    }

    /**
     * Add an inventory to the room
     * @param inventory Item to add
     */
    public void addInventory(Inventory inventory) {
        inventories.add(inventory);
    }

    //Get number of locks on a room
    public int getLocks() {
        return locks;
    }
}