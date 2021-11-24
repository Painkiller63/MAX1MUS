package lesson7;

public class Dog {

    String name;
    int maxRunDistance;
    int maxSwimDistance;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int runDistance){
        if (runDistance <= maxRunDistance){
            System.out.println("Собака " + name + " пробежала " + runDistance + " метров.");
        }
        else System.out.println(name + " не может пробежать " + runDistance + " метров.");
    }

    public void swim(int swimDistance){
        if (swimDistance <= maxSwimDistance){
            System.out.println("Собака " + name + " проплыла " + swimDistance + " метров.");
        }
        else System.out.println("Собака " + name + " не может проплыть " + swimDistance + " метров.");
    }
}
