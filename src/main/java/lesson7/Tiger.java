package lesson7;

public class Tiger {

    String name;
    int maxRunDistance;
    int maxSwimDistance;

    public Tiger(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int runDistance){
        if (runDistance <= maxRunDistance){
            System.out.println("Тигр " + name + " пробежал " + runDistance + " метров.");
        }
        else System.out.println("Тигр " + name + " не может пробежать " + runDistance + " метров.");
    }

    public void swim(int swimDistance){
        if (swimDistance <= maxSwimDistance){
            System.out.println("Тигр " + name + " проплыл " + swimDistance + " метров");
        }
        else System.out.println("Тигр " + name + " не может проплыть " + swimDistance + " метров.");
    }
}
