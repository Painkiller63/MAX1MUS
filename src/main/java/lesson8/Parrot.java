package lesson8;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(this + " говорит: \"Кеша.\"");
    }
}
