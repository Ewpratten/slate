package slate.maps;

import slate.Guard;
import slate.Navigator;
import slate.bases.MapBase;
import slate.bases.RoomBase;
import slate.rooms.TestRoom;

import java.util.ArrayList;

public class TestMap extends MapBase {

    /**
     * Here we define this map, and it's rooms
     */
    public TestMap() {
        rooms = new ArrayList<RoomBase>();
        nav = new Navigator();
        description = "You find yourself in a land of 1s and 0s. This is the test world. A place where your fate (and computer) is at the hands of the developers. Proceed at your own risk.";

        // Set up starting rooms

        /* Rooms */
        RoomBase first_room = new TestRoom();
        RoomBase second_room = new TestRoom();

        //Put a guard here for now
        second_room.guards.add(new Guard(second_room));
        first_room.addPathway(second_room);
        rooms.add(first_room);
        rooms.add(second_room);

        // Set up second room
        second_room.addPathway(first_room);

        // Set the starting room by moving to it
        nav.setDefaultRoom(first_room);

    }

    @Override
    public String getDescription() {
        return description;
    }

    /*
    * Gets a list of every room on the map.
    */
    public ArrayList<RoomBase> getAllRooms(){
        return rooms;
    }
}