package slate.maps;

import slate.Navigator;
import slate.bases.MapBase;
import slate.bases.RoomBase;
import slate.rooms.TestRoom;

public class TestMap extends MapBase {

    /* Rooms */
    RoomBase first_room;
    RoomBase second_room;

    /**
     * Here we define this map, and it's rooms
     */
    public TestMap() {
        nav = new Navigator();
        description = "You find yourself in a land of 1s and 0s. This is the test world. A place where your fate (and computer) is at the hands of the developers. Proceed at your own risk.";

        // Set up starting room
        first_room = new TestRoom();
        second_room = new TestRoom();
        first_room.addPathway(second_room);

        // Set up second room
        second_room = new TestRoom();
        second_room.addPathway(first_room);

        // Set the starting room by moving to it
        nav.setDefaultRoom(first_room);

    }

    @Override
    public String getDescription() {
        return description;
    }

}