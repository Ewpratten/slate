package slate;

import java.util.ArrayList;

public class Guard {

    //Keep track of how long guard is stationary
    int turnsSinceLastMove;

    //Room guard is in, and player to get time scale from
    Room currentRoom;
    Player player;

    //Define room and player in constructor
    public Guard(Room currentRoom, Player player){
        this.currentRoom = currentRoom;
        this.player = player;
    }

    /**
     * Patrol
     * Every time the player moves or waits, the guard has a chance to move.
     * Guards will not move if they just moved.
     * Guards must move if they exceed their maximum wait limit (3 by default, but is influenced by timescale).
     * @return 1 if move is made, 0 otherwise.
     */
    public int patrol(){
        if(turnsSinceLastMove>0&&(Math.random()>(2/(3.0*player.timeScale)) || turnsSinceLastMove>(3*player.timeScale))){

            //Reset Counter
            turnsSinceLastMove = 0;

            //Remove from this room
            currentRoom.getMovedGuards().add(this);

            //Get paths to surrounding room
            ArrayList<Room> paths = currentRoom.getAttached_rooms();

            //Move to random room
            currentRoom = paths.get((int)(Math.random()*paths.size()));
            currentRoom.getGuards().add(this);

            return 1;
        }

        //Increase count
        turnsSinceLastMove++;
        return 0;
    }
}
