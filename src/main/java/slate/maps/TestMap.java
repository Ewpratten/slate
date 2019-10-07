package slate.maps;

import slate.bases.Direction;
import slate.bases.MapBase;
import slate.bases.RoomBase;
import slate.rooms.TestRoom;

public class TestMap extends MapBase {
    private RoomBase current_room;
    private String description;

    /* Rooms */
    RoomBase first_room;
    RoomBase second_room;

    /**
     * Here we define this map, and it's rooms
     */
    public TestMap() {
        description = "You find yourself in a land of 1s and 0s. This is the test world. A place where your fate (and computer) is at the hands of the developers. Proceed at your own risk.";

        // Define the rooms
        first_room = new TestRoom();
        second_room = new TestRoom();

        // Link rooms and build pathways
        first_room.addPathway(second_room, Direction.Left);
        second_room.addPathway(first_room, Direction.Left);
        second_room.addPathway(first_room, Direction.Right);

        // Set the starting room by moving to it
        moveTo(first_room);

    }

    @Override
    public RoomBase getCurrentRoom() {
        return current_room;
    }

    @Override
    public void moveTo(RoomBase room) {
        current_room = room;

    }

    @Override
    public String getDescription() {
        return description;
    }

}