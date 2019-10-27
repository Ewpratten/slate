package slate.items;
import slate.App;
import slate.Player;
import slate.bases.ItemBase;

import java.io.IOException;


public class LogBook extends ItemBase {

	public static final int ROOM_LABA2 = 0;
	String[] contents;

	public LogBook(int room) {
		name = "Log Book";
		weight = 2;
		is_consumable =  true;

		switch (room){
			case ROOM_LABA2:
				getContent("laba2.logbook");
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
			System.out.println(s);
		}
	}
}
