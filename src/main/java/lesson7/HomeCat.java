package lesson7;

public class HomeCat {

    String name;
    int maxRunDistance;

    public HomeCat(String name, int maxRunDistance){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
    }

    public void run(int runDistance){
        if (runDistance <= maxRunDistance){
            System.out.println("Домашний кот " + name + " пробежал " + runDistance + " метров.");
        }
        else System.out.println("Домашний кот " + name + " не может пробежать " + runDistance + " метров.");
    }

    public void swim(int swimDistance){
        System.out.println("Домашний кот " + name + " не умеет плавать.");
    }
}
