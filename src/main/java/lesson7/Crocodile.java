package lesson7;

public class Crocodile {

    String name;
    int maxRunDistance;
    int maxSwimDistance;

    public Crocodile(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int runDistance){
        if (runDistance <= maxRunDistance){
            System.out.println("Крокодил " + name + " пробежал " + runDistance + " метров");
        }
        else System.out.println("Крокодил " + name + " не может пробежать " + runDistance + " метров");
    }

    public void swim(int swimDistance){
        if (swimDistance <= maxSwimDistance){
            System.out.println("Крокодил " + name + " проплыл " + swimDistance + " метров");
        }
        else System.out.println("Крокодил " + name + " не может проплыть " + swimDistance + " метров");
    }
}
