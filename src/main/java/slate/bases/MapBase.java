package slate.bases;

import slate.App;
import slate.Navigator;
import slate.Room;

import java.util.ArrayList;

public abstract class MapBase {

    //Game
    public App game;

    //Navigator
    public Navigator nav;

    //Description
    protected String description;

    //Rooms in Map
    protected ArrayList<Room> rooms = new ArrayList<Room>();

    //Get description
    public String getDescription() {
        return description;
    };

    //Get all rooms
    public ArrayList<Room> getAllRooms() {
        return rooms;
    };

    //Register rooms
    protected void registerRooms(Room... r_rooms) {
        for (Room room : r_rooms) {
            this.rooms.add(room);
        }
    }
}