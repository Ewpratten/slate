package slate.maps;

import slate.Navigator;
import slate.bases.MapBase;
import slate.bases.RoomBase;
import slate.rooms.Elevator;
import slate.rooms.Hallway;
import slate.rooms.Laboratory;
import slate.rooms.StartRoom;
import slate.rooms.StorageRoom;

public class GameMap extends MapBase {

    /* Rooms */
    RoomBase starting_room, start_hall_right, start_hall_left, mini_lab_1, mini_lab_2, mini_lab_storage,
            mini_lab_storage_shared, mini_lab_elevator;

    /**
     * Here we define this map, and it's rooms
     */
    public GameMap() {
        nav = new Navigator();
        description = "I find myself in a building.. Maybe I should look around?";

        // Define rooms
        starting_room = new StartRoom();
        start_hall_right = new Hallway();
        start_hall_left = new Hallway();
        mini_lab_1 = new Laboratory();
        mini_lab_2 = new Laboratory();
        mini_lab_storage = new StorageRoom();
        mini_lab_storage_shared = new StorageRoom();
        mini_lab_elevator = new Elevator();

        

        // Name each room (if needed)
        start_hall_left.setName("Long hallway");
        start_hall_right.setName("Short hallway");
        mini_lab_1.setName("Small lab A");
        mini_lab_2.setName("Small lab B");
        mini_lab_storage_shared.setName("Shared storage room");

        /* Linking rooms */

        // Link starting room to it's hallways
        starting_room.addPathway(start_hall_left, start_hall_right);

        // Link the right hallway to the labs, elevator, and storage room
        start_hall_right.addPathway(starting_room, mini_lab_1, mini_lab_2, mini_lab_storage, mini_lab_elevator);
        mini_lab_storage.addPathway(start_hall_right);
        mini_lab_elevator.addPathway(starting_room);

        // Link the mini labs to their shared storage room
        mini_lab_1.addPathway(start_hall_right, mini_lab_storage_shared);
        mini_lab_2.addPathway(start_hall_right, mini_lab_storage_shared);

        // Link the minilab shared storage to the mini labs
        mini_lab_storage_shared.addPathway(mini_lab_1, mini_lab_2);

        /* Fill rooms with items */

        // Set the starting room
        nav.setDefaultRoom(starting_room);

        // Register rooms
        registerRooms(start_hall_left, start_hall_right, starting_room, mini_lab_1, mini_lab_2, mini_lab_storage,
                mini_lab_storage_shared, mini_lab_elevator);
    }

    @Override
    public String getDescription() {
        return description;
    }

}