package slate.bases;

import slate.Player;

public class ItemBase implements Cloneable{

    public boolean is_consumable;
    protected int weight;
    public String name;
    public String verb = "used";

    public ItemBase(){}

    public static ItemBase copyItem(ItemBase item){
        try{
             return (ItemBase)item.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }

    
    public int getWeight(){
        return weight;
    }

    public String getName(){
        return name;
    }

    public void use(Player player){}
}