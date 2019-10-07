package slate.bases;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class RoomBase {
    ArrayList<ItemBase> items = new ArrayList<ItemBase>();
    protected HashMap<Direction, RoomBase> attached_rooms = new HashMap<Direction, RoomBase>();

    public abstract String getName();

    public abstract String getPeakInfo();

    public abstract String getRoomInfo();

    /**
     * Add a pathway attached to this room
     * 
     * @param room New room
     * @param direction Room location
     */
    public void addPathway(RoomBase room, Direction direction) {
        // This will override pre-existing rooms
        attached_rooms.put(direction, room);
    }

    /**
     * Check if this room has an attached room at a specific direction
     * @param direction Direction to check
     * @return Is a room attached
     */
    public boolean hasRoomAtDirection(Direction direction) {
        for (Direction key : attached_rooms.keySet()) {
            if (key == direction) {
                return true;
            }
        }
        
        return false;
    }

}