package slate.bases;

import slate.Player;

public class ItemBase implements Cloneable{

    public boolean is_consumable;
    public boolean is_food;
    protected boolean is_stackable;
    protected int weight;
    protected int key_id = -1; // Set this to something else if the item is a key
    public String name;

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