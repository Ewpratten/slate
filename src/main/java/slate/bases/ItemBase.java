package slate.bases;

import slate.Player;

public class ItemBase implements Cloneable{

    //Can be used with use command
    public boolean is_consumable;

    //Weight, affect storage space taken up
    protected int weight;

    public String name;
    public String verb = "used";

    //Clone an item
    public static ItemBase copyItem(ItemBase item){
        try{
             return (ItemBase)item.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }

    //Get weight
    public int getWeight(){
        return weight;
    }

    //Get name
    public String getName(){
        return name;
    }

    //Use method
    public void use(Player player){}
}