package slate.rooms;

import slate.bases.RoomBase;

public class Hallway extends RoomBase {

	public Hallway() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Hallway";
	}
	@Override
	public String getRoomInfo() {
		// TODO Auto-generated method stub
		return "You are in a long narrow hallway"; //should we mention something about the doors/rooms in each hallway?
	}

}
