package slate.bases;

public class ItemBase {
    boolean is_consumable;
    int weight;
    String name;

    public ItemBase(){}

    public ItemBase(ItemBase item){
        this.is_consumable = item.is_consumable;
        this.weight = item.weight;
        this.name = item.name;
    }

    
    public int getWeight(){
        return weight;
    }

    public String getName(){
        return name;
    }
}