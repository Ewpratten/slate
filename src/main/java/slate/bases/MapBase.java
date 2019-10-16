package slate.bases;

import slate.Navigator;

import java.util.ArrayList;

public abstract class MapBase {
    public Navigator nav;
    protected String description;
    protected ArrayList<RoomBase> rooms;

    public abstract String getDescription();
    public abstract ArrayList<RoomBase> getAllRooms();
}