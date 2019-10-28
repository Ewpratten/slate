package slate.maps;

import slate.App;
import slate.Navigator;
import slate.Room;
import slate.bases.MapBase;

import java.util.ArrayList;

public class TestMap extends MapBase {

    /**
     * Here we define this map, and it's rooms
     */
    public TestMap(App game) {
        this.game = game;
        rooms = new ArrayList<Room>();
        nav = new Navigator();

        // Set up starting rooms

        /* Rooms */
        Room first_room = new Room(game,"TEST ROOM DUIFAHJHIUGEGUGFHD", "BLEEDDDBLEEDDDDEDEELBE", "NaN");
        Room second_room = new Room(game,"VOIDSPACE", "WELCOME To", "ooJIDknjnjdNDJ$*(*8");

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
    public ArrayList<Room> getAllRooms(){
        return rooms;
    }
}