package slate.bases;

import slate.Navigator;
import slate.Room;

import java.util.ArrayList;

public abstract class MapBase {
    public Navigator nav;
    protected String description;
    protected ArrayList<Room> rooms = new ArrayList<Room>();

    public String getDescription() {
        return description;
    };

    public ArrayList<Room> getAllRooms() {
        return rooms;
    };

    protected void registerRooms(Room... r_rooms) {
        for (Room room : r_rooms) {
            this.rooms.add(room);
        }
    }
}