import Builder.*;

public class Director {
    private IBuilder builder;

    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public String construct() {
        return builder.getMeal();
    }
}
