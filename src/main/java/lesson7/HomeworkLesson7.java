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
}
