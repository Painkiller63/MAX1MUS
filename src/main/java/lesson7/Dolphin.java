package lesson7;

public class Dolphin {

    String name;
    int maxSwimDistance;

    public Dolphin(String name, int maxSwimDistance) {
        this.name = name;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int runDistance){
        System.out.println("Дельфин " + name + " не умеет бегать.");
    }

    public void swim(int swimDistance){
        if (swimDistance <= maxSwimDistance){
            System.out.println("Дельфин " + name + " проплыл " + swimDistance + " метров");
        }
        else System.out.println("Дельфин " + name + " не может проплыть " + swimDistance + " метров");
    }
}
