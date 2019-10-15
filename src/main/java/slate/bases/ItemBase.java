package slate.bases;

public class ItemBase {

    protected boolean is_consumable;
    protected boolean is_stackable;
    protected int weight;
    protected int key_id = -1; // Set this to something else if the item is a key
    protected String name;

    public ItemBase(){}

    public ItemBase(ItemBase item){
        this.is_consumable = item.is_consumable;
        this.is_stackable = item.is_stackable;
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