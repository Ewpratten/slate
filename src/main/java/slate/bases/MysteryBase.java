package slate.bases;

public class MysteryBase {
    int key_id;
    boolean is_locked;

    /**
     * Unlock the mystery with a key
     * 
     * @param id Key ID
     * @return Was the action successful
     */
    public boolean unlock(int id) {
        if (id == key_id) {
            return true;
        }

        return false;
    }
}