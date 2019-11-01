package slate.items;
import slate.App;
import slate.Player;
import slate.bases.ItemBase;

import java.io.IOException;


public class LogBook extends ItemBase {

	public static final int ROOM_LABA2 = 0;
	public static final int ROOM_LABA1 = 1;
	public static final int ROOM_LABB = 2;
	public static final int ROOM_BREAKROOMC = 3;
	String[] contents;

	public LogBook(int room) {
		weight = 2;
		is_consumable =  true;
		verb = "read";

		switch (room){
			case ROOM_LABA2:
				getContent("laba2.logbook");
				name = "Log Book 541";
				break;
			case ROOM_LABA1:
				getContent("laba1.logbook");
				name = "Complaint Form";
				break;
			case ROOM_LABB:
				getContent("labb.logbook");
				name = "Log Book 684";
				break;
			case ROOM_BREAKROOMC:
				getContent("breakroomc.logbook");
				name = "Guard's Journal";
				break;
		}
	}

	void getContent(String filename){
		byte[] data;

		try {

			//Place all bytes into array
			data = App.class.getResourceAsStream("/story/"+filename).readAllBytes();

			//Create an array of lines from byte array
			contents = new String(data, "UTF-8").split("\\r?\\n");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void use(Player player){
		for(String s: contents){

			//Read book
			System.out.println(s);
		}
	}
}
