package slate.maps;

import slate.Inventory;
import slate.Navigator;
import slate.bases.MapBase;
import slate.Room;
import slate.items.*;

public class GameMap extends MapBase {

    /* Rooms */
    private Room entrance, hallA1, hallB1, labA1, labA2,
            sharedLabStorage, labB, hallB2, chemStorage,
            teleporter, brkRoomB, hallB3, janitorCloset, employeeElevator, hallC1,
            hallC2, brkRoomC, lockedStorage, maintenanceElevator, maintenanceHall, vault;

    /**
     * Here we define this map, and it's rooms
     */
    public GameMap() {
        nav = new Navigator();
        description = "I step into the building... I overheard that the vault has an access path in maintenance somewhere... Maybe I should look around?";

        /* Define rooms */

        // Starting rooms
        entrance = new Room("Entrance","This is the room I started in.", "Looks like where I started...");
        hallA1 = new Room("Hall A1","This hallway is remarkably well-lit. The A wing seems to hold some auxiliary labs, maybe there's some useful things here.", "I see brightly-lit pristine, white walls...");
        hallB1 = new Room("Hall B1","I wonder where all these rooms lead... the B wing serves as a place for the main research lab.", "I see a long, looming hall...");

        // A Wing
        labA1 = new Room("Lab A1","This lab is the picture of cleanliness. Maybe I can find some useful chemicals in here.", "A small chemical laboratory...");
        labA2 = new Room("Lab A2","As I step into the lab, I am instantly repulsed by a rancid, rotting smell.\nThere's a table in the center of the room, spattered with blood. I might be sick...", "The window is very foggy...");
        sharedLabStorage = new Room("Shared Storage Room","As I step into this gargantuan storage room, I feel so insignificant... there's got to be something useful here.", "A large storage room...");

        // B Wing
        labB = new Room("Lab B", "This large laboratory is jam-packed with all sorts of interesting specimens.", "An absolutely immense laboratory...");
        hallB2 = new Room("Hall B2", "This hallway is rather tight and dimly-lit.", "I can't see inside very well...");
        chemStorage = new Room("Chemical Storage", "This closet contains shelves of chemicals... maybe I can find some useful ones.", "I see rows of dimly-lit shelves...");
        teleporter = new Room("Completely Euclidean Elevator", "I can feel every nerve ending in my body.", "Nothing weird here whatsoever...");
        brkRoomB = new Room("Break Room", "This is a risky place to be, but... I am a little hungry.", "A break room, fridge and all!");
        hallB3 = new Room("Hall B3", "As I enter the hall, I almost slip on a sizeable puddle of what I can only hope is water.", "There's an elevator through here...");
        janitorCloset = new Room("Janitorial Closet", "This closet seems to hold various supplies that a janitor would use.", "A simple closet...");
        employeeElevator = new Room("Employee Elevator", "This elevator allows employees access to the basement. Luckily, I have clearance for that area.", "This elevator will  take me to the basement...");

        // Basement
        hallC1 = new Room("Hall C1", "This dimly-lit hallway brings back memories of my childhood.", "Smells like a used towel...");
        hallC2 = new Room("Hall C2", "I would hate to have to work down here... just unpleasant.", "I can make out a \"wet floor\" sign...");
        brkRoomC = new Room("Break Room", "This room offers some relief from the grossness of the rest of this dank place.", "It actually looks clean in there...");
        lockedStorage = new Room("Storage Locker", "This locker is filled with rusty shelves and cases... bound to find something good.", "I can't see much through the door's slits...", 1);
        maintenanceElevator = new Room("Maintenance Elevator", "I am unsure whether to trust this rickety elevator, but I guess I don't have a choice.", "A crude elevator with a rusty gate...");

        // Maintenance Shaft
        maintenanceHall = new Room("Maintenance Hall", "This hall is an incredibly tight fit...", "I really don't want to climb in there...");
        vault = new Room("Vault", "I actually made it! Now all I've got to do is take the artifact and get out of here!", "The artifact is right in there!", 2);

        /* Linking rooms */
        linkRooms();

        /* Fill rooms with items */
        placeItems();

        /* Spawn Guards */
        spawnGuards();

        /* Config navigator */
        initNavigator();

    }

    /**
     * All code to link rooms to eachother should go here
     */
    private void linkRooms() {
        // Link starting room to it's hallways
        entrance.addPathway(hallB1, hallA1);

        // Link the right hallway to the labs, elevator, and storage room
        hallA1.addPathway(entrance, labA1, labA2);

        // Link the mini labs to their shared storage room
        labA1.addPathway(hallA1, sharedLabStorage);
        labA2.addPathway(hallA1, sharedLabStorage);

        // Link the minilab shared storage to the mini labs
        sharedLabStorage.addPathway(labA1, labA2);

        // Link left hallway
        hallB1.addPathway(entrance, labB);

        // Link the large lab
        labB.addPathway(hallB1, hallB2, chemStorage, brkRoomB, hallB3);

        // Link the large lab hall
        hallB2.addPathway(labB, chemStorage, teleporter);

        // Link the large lab storage
        chemStorage.addPathway(labB, hallB2);

        // Link the large lab elevator
        teleporter.addPathway(hallA1);

        // Link large lab brk room
        brkRoomB.addPathway(labB, hallB3);

        // Link the end hall
        hallB3.addPathway(brkRoomB, janitorCloset, employeeElevator);
        janitorCloset.addPathway(hallB3);

        // End hall elevator
        employeeElevator.addPathway(hallB3, hallC1);

        // Link 2nd floor main hall
        hallC1.addPathway(employeeElevator, lockedStorage, hallC2);
        lockedStorage.addPathway(hallC1);

        // Link 2nd floor side hall
        hallC2.addPathway(hallC1, brkRoomC, maintenanceElevator);
        brkRoomC.addPathway(hallC2);

        // Link 3rd floor elevator
        maintenanceElevator.addPathway(hallC2, maintenanceHall);

        // Link 3rd floor hallway
        maintenanceHall.addPathway(maintenanceElevator, vault);

        // Link vault
        vault.addPathway(maintenanceHall);
    }

    /**
     * Place items in rooms
     */
    private void placeItems() {

        // Add keys to rooms
        labA1.addItem(new Key());
        sharedLabStorage.addItem(new Key());
        brkRoomB.addItem(new Key());
        lockedStorage.addItem(new Key());

        // Put the artifact in the vault
        vault.addItem(new Artifact());

        //Food
        brkRoomB.addInventory(new Inventory("Fridge", 50));
        brkRoomB.getInventories().get(0).addItem(new Apple(), 3);
        brkRoomB.getInventories().get(0).addItem(new Avocado());
        brkRoomB.getInventories().get(0).addItem(new Muffin(), 5);
        brkRoomC.addInventory(new Inventory("Fridge", 50));
        brkRoomC.getInventories().get(0).addItem(new Apple(), 12);

    }

    /**
     * Spawn guards into map
     */
    private void spawnGuards() {

        //Spawn Guards
        labB.addGuards(2);
        brkRoomB.addGuards(1);
        brkRoomC.addGuards(1);
    }

    /**
     * All navigation code should go here
     */
    private void initNavigator() {
        // Set the starting room
        nav.setDefaultRoom(entrance);
        entrance.visited = true;

        // Register rooms
        // This is required to let the navigation system know about each room
        registerRooms(entrance, hallA1, hallB1, labA1, labA2,
                sharedLabStorage, labB, hallB2, chemStorage,
                brkRoomB, hallB3, janitorCloset, employeeElevator, hallC1,
                hallC2, brkRoomC, lockedStorage, maintenanceElevator, vault);
    }

    @Override
    public String getDescription() {
        return description;
    }

}