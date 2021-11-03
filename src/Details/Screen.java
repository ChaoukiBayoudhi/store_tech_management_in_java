package Details;

import Enumerations.ScreenType;

public class Screen {
    private float size;
    private ScreenType type;
    private Provider provider;

    public Screen() {
    }

    public Screen(float size, ScreenType type, Provider provider) {
        this.size = size;
        this.type = type;
        this.provider = provider;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public ScreenType getType() {
        return type;
    }

    public void setType(ScreenType type) {
        this.type = type;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
