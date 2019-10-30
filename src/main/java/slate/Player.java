package slate;

public class Player {
    private static Player m_instance = null;
    private Inventory inventory;
    private Inventory focusedInventory;

    public int invisTurns = 0;
    public int etherealTurns = 0;
    public double timeScale = 1;
    public boolean isFlask;

    private Player() {
        inventory = new Inventory("Pockets",100);
    }

    public static Player getInstance() {
        if (m_instance == null) {
            m_instance = new Player();

        }

        return m_instance;
    }

    public static Player resetInstance() {
        m_instance = new Player();
        return m_instance;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Inventory getFocusedInventory() {
        return focusedInventory;
    }

    public void setFocusedInventory(Inventory newInventory) {
        focusedInventory = newInventory;
    }

    public void drainBuff(){
        invisTurns = Math.max(invisTurns-1, 0);
        etherealTurns = Math.max(etherealTurns-1, 0);
    }
}