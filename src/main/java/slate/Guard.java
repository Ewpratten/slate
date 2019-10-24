package slate;

import java.util.ArrayList;

public class Guard {
    int turnsSinceLastMove;
    Room currentRoom;

    public Guard(Room currentRoom){
        this.currentRoom = currentRoom;
    }

    public void patrol(){
        if(turnsSinceLastMove>0&&(Math.random()>(2/3.0) || turnsSinceLastMove>3)){
            turnsSinceLastMove = 0;
            currentRoom.getMovedGuards().add(this);
            ArrayList<Room> paths = currentRoom.getAttached_rooms();
            currentRoom = paths.get((int)(Math.random()*paths.size()));
            currentRoom.getGuards().add(this);
            return;
        }

        turnsSinceLastMove++;
    }
}
