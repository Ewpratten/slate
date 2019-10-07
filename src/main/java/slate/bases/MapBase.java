package slate.bases;

public abstract class MapBase {

    public abstract RoomBase getCurrentRoom();

    public abstract void moveTo(RoomBase room);

    public abstract String getDescription();
}