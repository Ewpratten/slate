package slate;

public class Player {
    private static Player m_instance = null;
    private Inventory inventory;

    private Player() {
        inventory = new Inventory(4);
    }

    public Player getInstance() {
        if (m_instance == null) {
            m_instance = new Player();

        }

        return m_instance;
    }

    public Inventory getInventory() {
        return inventory;
    }
}