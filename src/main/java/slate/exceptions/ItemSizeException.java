package slate.exceptions;

public class ItemSizeException extends Exception {
    private static final long serialVersionUID = 1L;

    public ItemSizeException() {
        super("Item size error");
    }
}