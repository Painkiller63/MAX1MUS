package lesson8;

public class Mouse extends Animal {
    public Mouse(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(this + " пищит: \"пи-пи-пи.\"");
    }
}
