package slate;

import slate.bases.RoomBase;

import java.util.ArrayList;

public class Guard {
    int turnsSinceLastMove;
    RoomBase currentRoom;

    public Guard(RoomBase currentRoom){
        this.currentRoom = currentRoom;
    }

    public void patrol(){
        if(Math.random()>(2/3.0) || turnsSinceLastMove>3){
            turnsSinceLastMove = 0;
            currentRoom.getGuards().remove(this);
            ArrayList<RoomBase> paths = currentRoom.getAttached_rooms();
            currentRoom = paths.get((int)(Math.random()*paths.size()));
            currentRoom.getGuards().add(this);
            return;
        }

        turnsSinceLastMove++;
    }
}
