package slate;


import slate.bases.RoomBase;

public class Navigator {

    RoomBase default_room;
    RoomBase current_room;

    public void setDefaultRoom(RoomBase room) {
        default_room = room;
        current_room = new RoomBase(room);

    }

    public RoomBase getCurrentRoom() {
        return current_room;
    }

    public void moveTo(RoomBase room) {
        // Mark the room
        room.visited = true;

        // Set the room as the current
        current_room = room;

    }

}