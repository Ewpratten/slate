package slate.rooms;

import slate.bases.RoomBase;

public class StartRoom extends RoomBase {

	public StartRoom() {
		this.visited = true;
		this.name = "Entrance";
		this.peek_info = "Looks like the room I started in.";
		this.room_info = "It's a room, with others attached.. I should probably explore.";
	}

}
