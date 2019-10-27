package slate;


public class Navigator {

    Room default_room;
    Room current_room;

    public void setDefaultRoom(Room room) {
        default_room = room;
        current_room = Room.copyRoom(room);

    }

    public Room getDefaultRoom() {
        return default_room;
    }

    public Room getCurrentRoom() {
        return current_room;
    }

    public void moveTo(Room room) {
        // Mark the room
        room.visited = true;

        // Set the room as the current
        current_room = room;

    }

}