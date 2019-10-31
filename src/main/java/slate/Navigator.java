package slate;


public class Navigator {

    //Default room and current room
    Room default_room;
    Room current_room;

    //Set default room
    public void setDefaultRoom(Room room) {

        //Set default room as specified room, and set the current room to a clone of the default room
        default_room = room;
        current_room = Room.copyRoom(room);

    }

    //Get default room
    public Room getDefaultRoom() {
        return default_room;
    }

    //Get current room
    public Room getCurrentRoom() {
        return current_room;
    }

    //Move to specified room
    public void moveTo(Room room) {

        //Mark the room as visited
        room.visited = true;

        //Set the room as the current room
        current_room = room;
    }

}