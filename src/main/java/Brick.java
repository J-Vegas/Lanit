public class Brick extends Item {
    private static String name = "Brick";

    public Brick() {
        super(name);
    }

    public Brick(String... properties) {
        super(name, properties);
    }

    public Brick(double weightItem, String... properties) {
        super(name, weightItem, properties);
    }
}
