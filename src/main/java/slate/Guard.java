package slate;

import java.util.ArrayList;

public class Guard {
    int turnsSinceLastMove;
    Room currentRoom;
    Player player;

    public Guard(Room currentRoom, Player player){
        this.currentRoom = currentRoom;
        this.player = player;
    }

    public int patrol(){
        if(turnsSinceLastMove>0&&(Math.random()>(2/(3.0*player.timeScale)) || turnsSinceLastMove>3*player.timeScale)){
            turnsSinceLastMove = 0;
            currentRoom.getMovedGuards().add(this);
            ArrayList<Room> paths = currentRoom.getAttached_rooms();
            currentRoom = paths.get((int)(Math.random()*paths.size()));
            currentRoom.getGuards().add(this);

            return 1;
        }

        turnsSinceLastMove++;
        return 0;
    }
}
