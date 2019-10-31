package slate;

public class Player {
    private static Player m_instance = null;

    //Pockets
    private Inventory inventory;

    //Current open inventory
    private Inventory focusedInventory;

    //Buffs
    public int invisTurns = 0;
    public int etherealTurns = 0;
    public double timeScale = 1;

    //Is the player currently an empty flask (Yes, this is necessary)
    public boolean isFlask;

    //Create inventory in constructor
    private Player() {
        inventory = new Inventory("Pockets",100);
    }

    //Get player instance
    public static Player getInstance() {
        if (m_instance == null) {
            m_instance = new Player();
        }
        return m_instance;
    }

    //Reset player instance
    public static Player resetInstance() {
        m_instance = new Player();
        return m_instance;
    }

    //Get pockets
    public Inventory getInventory() {
        return inventory;
    }

    //Get currently open inventory
    public Inventory getFocusedInventory() {
        return focusedInventory;
    }

    //Set open inventory
    public void setFocusedInventory(Inventory newInventory) {
        focusedInventory = newInventory;
    }

    //Drain player buffs, runs each move or wait
    public void drainBuff(){
        invisTurns = Math.max(invisTurns-1, 0);
        etherealTurns = Math.max(etherealTurns-1, 0);
    }
}