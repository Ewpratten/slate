package slate.maps;

import slate.Navigator;
import slate.bases.MapBase;
import slate.bases.RoomBase;
import slate.items.Key;
import slate.rooms.BreakRoom;
import slate.rooms.Elevator;
import slate.rooms.Hallway;
import slate.rooms.Laboratory;
import slate.rooms.StartRoom;
import slate.rooms.StorageRoom;
import slate.rooms.Vault;

public class GameMap extends MapBase {

    /* Rooms */
    RoomBase starting_room, start_hall_right, start_hall_left, mini_lab_1, mini_lab_2, mini_lab_storage,
            mini_lab_storage_shared, mini_lab_elevator, large_lab, large_lab_hall, large_lab_storage,
            large_lab_elevator, large_lab_brk_room, end_hall, end_hall_storage, end_hall_elevator, floor2_main_hall,
            floor2_side_hall, floor2_brk_room, floor2_storage, floor2_front_elevator, floor2_rear_elevator,
            final_elevator, final_hall, vault;

    /**
     * Here we define this map, and it's rooms
     */
    public GameMap() {
        nav = new Navigator();
        description = "I find myself in a building.. Maybe I should look around?";

        /* Define rooms */

        // Starting rooms
        starting_room = new StartRoom();
        start_hall_right = (new Hallway()).named("Short hallway");
        start_hall_left = (new Hallway()).named("Long hallway");

        // Mini labs
        mini_lab_1 = (new Laboratory()).named("Small lab A");
        mini_lab_2 = (new Laboratory()).named("Small lab B");
        mini_lab_storage = new StorageRoom();
        mini_lab_storage_shared = (new StorageRoom()).named("Shared storage room");
        mini_lab_elevator = new Elevator();

        // Large lab
        large_lab = (new Laboratory()).named("Large lab");
        large_lab_hall = (new Hallway()).named("Side hallway");
        large_lab_storage = new StorageRoom();
        large_lab_elevator = new Elevator();
        large_lab_brk_room = new BreakRoom();

        // End hall
        end_hall = (new Hallway()).named("Small hallway");
        end_hall_storage = new StorageRoom();
        end_hall_elevator = new Elevator();

        // 2nd floor
        floor2_front_elevator = new Elevator();
        floor2_main_hall = (new Hallway()).named("Long hallway");
        floor2_side_hall = (new Hallway()).named("Dark hallway");
        floor2_brk_room = new BreakRoom();
        floor2_storage = (new StorageRoom()).named("Locked storage room");
        floor2_rear_elevator = (new Elevator()).named("Freight elevator");

        // 3rd floor
        final_elevator = (new Elevator()).named("Freight elevator");
        final_hall = (new Hallway()).named("Vault hallway");
        vault = new Vault();

        /* Linking rooms */
        linkRooms();

        /* Fill rooms with items */
        placeItems();

        /* Config navigator */
        initNavigator();

    }

    /**
     * All code to link rooms to eachother should go here
     */
    private void linkRooms() {
        // Link starting room to it's hallways
        starting_room.addPathway(start_hall_left, start_hall_right);

        // Link the right hallway to the labs, elevator, and storage room
        start_hall_right.addPathway(starting_room, mini_lab_1, mini_lab_2, mini_lab_storage, mini_lab_elevator);
        mini_lab_storage.addPathway(start_hall_right);
        mini_lab_elevator.addPathway(start_hall_right);

        // Link the mini labs to their shared storage room
        mini_lab_1.addPathway(start_hall_right, mini_lab_storage_shared);
        mini_lab_2.addPathway(start_hall_right, mini_lab_storage_shared);

        // Link the minilab shared storage to the mini labs
        mini_lab_storage_shared.addPathway(mini_lab_1, mini_lab_2);

        // Link left hallway
        start_hall_left.addPathway(starting_room, large_lab);

        // Link the large lab
        large_lab.addPathway(start_hall_left, large_lab_hall, large_lab_storage, large_lab_brk_room, end_hall);

        // Link the large lab hall
        large_lab_hall.addPathway(large_lab, large_lab_storage, large_lab_elevator);

        // Link the large lab storage
        large_lab_storage.addPathway(large_lab, large_lab_hall);

        // Link the large lab elevator
        large_lab_elevator.addPathway(large_lab_hall, mini_lab_elevator);

        // Link large lab brk room
        large_lab_brk_room.addPathway(large_lab, end_hall);

        // Link the end hall
        end_hall.addPathway(large_lab_brk_room, end_hall_storage, end_hall_elevator);
        end_hall_storage.addPathway(end_hall);

        // End hall elevator
        end_hall_elevator.addPathway(end_hall, floor2_front_elevator);

        // Link 2nd floor to first
        floor2_front_elevator.addPathway(end_hall_elevator, floor2_main_hall);

        // Link 2nd floor main hall
        floor2_main_hall.addPathway(floor2_front_elevator, floor2_storage, floor2_side_hall);
        floor2_storage.addPathway(floor2_main_hall);

        // Link 2nd floor side hall
        floor2_side_hall.addPathway(floor2_main_hall, floor2_brk_room, floor2_rear_elevator);
        floor2_brk_room.addPathway(floor2_side_hall);

        // Link 3rd floor elevator
        floor2_rear_elevator.addPathway(floor2_side_hall, final_elevator);
        final_elevator.addPathway(floor2_rear_elevator, final_hall);

        // Link 3rd floor hallway
        final_hall.addPathway(final_elevator, vault);

        // Link vault
        vault.addPathway(final_hall);
    }

    /**
     * Place items in rooms
     */
    private void placeItems() {

        // Add keys to rooms
        mini_lab_1.addItem(new Key());
        mini_lab_storage_shared.addItem(new Key());
        large_lab_brk_room.addItem(new Key());
        floor2_storage.addItem(new Key());
        
    }

    /**
     * All navigation code should go here
     */
    private void initNavigator() {
        // Set the starting room
        nav.setDefaultRoom(starting_room);

        // Register rooms
        // This is required to let the navigation system know about each room
        registerRooms(starting_room, start_hall_right, start_hall_left, mini_lab_1, mini_lab_2, mini_lab_storage,
                mini_lab_storage_shared, mini_lab_elevator, large_lab, large_lab_hall, large_lab_storage,
                large_lab_elevator, large_lab_brk_room, end_hall, end_hall_storage, end_hall_elevator, floor2_main_hall,
                floor2_side_hall, floor2_brk_room, floor2_storage, floor2_front_elevator, floor2_rear_elevator);
    }

    @Override
    public String getDescription() {
        return description;
    }

}