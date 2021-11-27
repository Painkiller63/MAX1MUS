package lesson8;

public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println(this + "издает звуки");
    }

    @Override
    public String toString() {
        return "питомец " + name;
    }
}
