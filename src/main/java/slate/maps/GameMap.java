package slate.maps;

import slate.App;
import slate.Inventory;
import slate.Navigator;
import slate.Room;
import slate.bases.MapBase;
import slate.items.*;

public class GameMap extends MapBase {

    /* Rooms */
    private Room entrance, hallA, hallB1, labA1, labA2,
            sharedLabStorage, labB, hallB2, chemStorage,
            teleporter, brkRoomB, hallB3, janitorCloset, employeeElevator, hallC1,
            hallC2, brkRoomC, lockedStorage, maintenanceElevator, maintenanceHall, vault;

    /**
     * Here we define this map, and it's rooms
     */
    public GameMap(App game) {
        this.game = game;
        nav = new Navigator();
        description = "I step into the building... I overheard that the vault has an access path in maintenance somewhere... Maybe I should look around?";

        /* Define rooms */

        // Starting rooms
        entrance = new Room(game,"Entrance","This is the room I started in.", "Looks like where I started...");
        hallA = new Room(game,"Hall A","This hallway is remarkably well-lit. The A wing seems to hold some auxiliary labs, maybe there's some useful things here.", "I see brightly-lit pristine, white walls...");
        hallB1 = new Room(game,"Hall B1","I wonder where all these rooms lead... the B wing serves as a place for the main research lab.", "I see a long, looming hall...");

        // A Wing
        labA1 = new Room(game,"Lab A1","This lab is the picture of cleanliness. Maybe I can find some useful chemicals in here.", "A small chemical laboratory...");
        labA2 = new Room(game,"Lab A2","As I step into the lab, I am instantly repulsed by a rancid, rotting smell.\nThere's a table in the center of the room, spattered with blood. I might be sick...", "The window is very foggy...",1);
        sharedLabStorage = new Room(game,"Shared Storage Room","As I step into this gargantuan storage room, I feel so insignificant... there's got to be something useful here.", "A large storage room...");

        // B Wing
        labB = new Room(game,"Lab B", "This large laboratory is jam-packed with all sorts of interesting specimens.", "An absolutely immense laboratory...");
        hallB2 = new Room(game,"Hall B2", "This hallway is rather tight and dimly-lit.", "I can't see inside very well...");
        chemStorage = new Room(game,"Chemical Storage", "This closet contains shelves of chemicals... maybe I can find some useful ones.", "I see rows of dimly-lit shelves...");
        teleporter = new Room(game,"Completely Euclidean Elevator", "I can feel every nerve ending in my body.", "Nothing weird here whatsoever...");
        brkRoomB = new Room(game,"Break Room", "This is a risky place to be, but... I am a little hungry.", "A break room, fridge and all!");
        hallB3 = new Room(game,"Hall B3", "As I enter the hall, I almost slip on a sizeable puddle of what I can only hope is water.", "There's an elevator through here...");
        janitorCloset = new Room(game,"Janitorial Closet", "This closet seems to hold various supplies that a janitor would use.", "A simple closet...");
        employeeElevator = new Room(game,"Employee Elevator", "This elevator allows employees access to the basement. Luckily, I have clearance for that area.", "This elevator will  take me to the basement...");

        // Basement
        hallC1 = new Room(game,"Hall C1", "This dimly-lit hallway brings back memories of my childhood.", "Smells like a used towel...");
        hallC2 = new Room(game,"Hall C2", "I would hate to have to work down here... just unpleasant.", "I can make out a \"wet floor\" sign...");
        brkRoomC = new Room(game,"Break Room", "This room offers some relief from the grossness of the rest of this dank place.", "It actually looks clean in there...");
        lockedStorage = new Room(game,"Storage Locker", "This locker is filled with rusty shelves and cases... bound to find something good.", "I can't see much through the door's slits...", 1);
        maintenanceElevator = new Room(game,"Maintenance Elevator", "I am unsure whether to trust this rickety elevator, but I guess I don't have a choice.", "A crude elevator with a rusty gate...");

        // Maintenance Shaft
        maintenanceHall = new Room(game,"Maintenance Hall", "This hall is an incredibly tight fit...", "I really don't want to climb in there...");
        vault = new Room(game,"Vault", "I actually made it! Now all I've got to do is take the artifact and get out of here!", "The artifact is right in there!", 2);

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
        entrance.addPathway(hallB1, hallA);

        // Link the right hallway to the labs, elevator, and storage room
        hallA.addPathway(entrance, labA1, labA2);

        // Link the mini labs to their shared storage room
        labA1.addPathway(hallA, sharedLabStorage);
        labA2.addPathway(hallA, sharedLabStorage);

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
        teleporter.addPathway(hallA);

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

        //Entrance
        entrance.addItem(new Chemical(), 10);

        //Lab A1
        labA1.addItem(new Key());
        labA1.addItem(new Flask(), 12);
        labA1.addItem(new LogBook(LogBook.ROOM_LABA1));
        labA1.addItem(new Pen());

        labA1.addInventory(new Inventory("Cabinet", 25));
        labA1.getInventories().get(0).addItem(new Chemical(), 3);
        labA1.getInventories().get(0).addItem(new Flask());

        //Lab A2
        labA2.addItem(new Chemical());
        labA2.addItem(new Poison());

        labA2.addInventory(new Inventory("Filing Cabinet", 25));
        labA2.getInventories().get(0).addItem(new LogBook(LogBook.ROOM_LABA2));

        labA2.addInventory(new Inventory("Cage", 25, 5));
        labA2.getInventories().get(1).addItem(new Key(), 5);

        //Lab B
        labB.addItem(new LogBook(LogBook.ROOM_LABB));
        labB.addItem(new Pen());

        labB.addInventory(new Inventory("Glass Cabinet", 50));
        labB.getInventories().get(0).addItem(new Flask(), 10);
        labB.getInventories().get(0).addItem(new Chemical(), 2);

        labB.addInventory(new Inventory("Drawer", 20, 1));
        labB.getInventories().get(1).addItem(new Key(), 2);
        labB.getInventories().get(1).addItem(new Pen(), 3);
        labB.getInventories().get(1).addItem(new Poison());

        sharedLabStorage.addItem(new Key());

        lockedStorage.addItem(new Key());

        // Vault
        vault.addItem(new Artifact());

        //Break Rooms
        brkRoomB.addItem(new Key());

        brkRoomB.addInventory(new Inventory("Fridge", 50));
        brkRoomB.getInventories().get(0).addItem(new Apple(), 3);
        brkRoomB.getInventories().get(0).addItem(new Avocado());
        brkRoomB.getInventories().get(0).addItem(new Muffin(), 5);

        brkRoomB.addInventory(new Inventory("Drawer", 20, 1));
        brkRoomB.getInventories().get(1).addItem(new Radio());

        brkRoomC.addItem(new LogBook(LogBook.ROOM_BREAKROOMC));
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
        registerRooms(entrance, hallA, hallB1, labA1, labA2,
                sharedLabStorage, labB, hallB2, chemStorage,
                brkRoomB, hallB3, janitorCloset, employeeElevator, hallC1,
                hallC2, brkRoomC, lockedStorage, maintenanceElevator, vault);
    }

    @Override
    public String getDescription() {
        return description;
    }

}