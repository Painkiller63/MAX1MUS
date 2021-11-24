package lesson7;

public class HomeworkLesson7 {

    public static void main(String[] args) {
        Dog dogPolkan = new Dog("Polkan", 500, 10);
        dogPolkan.run(300);
        dogPolkan.swim(15);

        HomeCat catBarsik = new HomeCat("Barsik", 200);
        catBarsik.run(200);
        catBarsik.swim(12);

        Tiger tigerAskold = new Tiger("Askold", 2000, 50);
        tigerAskold.run(300);
        tigerAskold.swim(15);

        Dolphin dolphinVrungel = new Dolphin("Vrungel", 10000);
        dolphinVrungel.run(20);
        dolphinVrungel.swim(4500);

        Crocodile crocodileDundy = new Crocodile("Dundy", 150, 1500);
        crocodileDundy.run(450);
        crocodileDundy.swim(500);
    }

    public static class Dog {
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

    public static class HomeCat {
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

    public static class Tiger {
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

    public static class Dolphin {
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

    public static class Crocodile{
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
            else System.out.println("Крокодил" + name + " не может пробежать " + runDistance + " метров");
        }

        public void swim(int swimDistance){
            if (swimDistance <= maxSwimDistance){
                System.out.println("Крокодил " + name + " проплыл " + swimDistance + " метров");
            }
            else System.out.println("Крокодил " + name + " не может проплыть " + swimDistance + " метров");
        }
    }
}
