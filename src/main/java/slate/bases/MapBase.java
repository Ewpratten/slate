package slate.bases;

import slate.Navigator;

import java.util.ArrayList;

public abstract class MapBase {
    public Navigator nav;
    protected String description;
    protected ArrayList<RoomBase> rooms = new ArrayList<RoomBase>();

    public String getDescription() {
        return description;
    };

    public ArrayList<RoomBase> getAllRooms() {
        return rooms;
    };

    protected void registerRooms(RoomBase... r_rooms) {
        for (RoomBase room : r_rooms) {
            this.rooms.add(room);
        }
    }
}