package slate.bases;

public class ItemBase {
    boolean is_consumable;
    int weight;
    int key_id = -1; // Set this to something else if the item is a key
    String name;

    public ItemBase(){}

    public ItemBase(ItemBase item){
        this.is_consumable = item.is_consumable;
        this.weight = item.weight;
        this.name = new String(item.name);
    }

    
    public int getWeight(){
        return weight;
    }

    public String getName(){
        return name;
    }
}