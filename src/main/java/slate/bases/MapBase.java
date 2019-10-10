package slate.bases;

import slate.Navigator;

public abstract class MapBase {
    public Navigator nav;
    protected String description;

    public abstract String getDescription();
}