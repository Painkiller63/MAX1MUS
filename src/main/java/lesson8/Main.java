package lesson8;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Gadget");
        Animal dog = new Dog("Buddy");
        Animal parrot = new Parrot("Kesha");
        Animal mouse = new Mouse("Jerry");

        Animal[] animals = {cat, dog, parrot, mouse};
        for (Animal s : animals) {
            s.voice();
        }
    }
}