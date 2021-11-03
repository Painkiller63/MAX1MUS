public class Homework2Lesson2 {

    public static void main(String[] args) {
        System.out.println(lawOfJouleLenz(25, 10, 15));
    }

    /** Закон Джоуля-Ленца
     * Количество теплоты, выделяемое проводником, равно
     * произведению квадрата силы тока, сопротивления проводника
     * и времени прохождения тока по проводнику. Где,
     * @param i - сила тока, Aмпер
     * @param r - сопротивление, Ом
     * @param dt - время прохождения тока по проводнику, секунды
     * @return q - количество теплоты, Джоули.
     */
    public static int lawOfJouleLenz(double i, int r, int dt){

        double q = Math.pow(i, 2) * r * dt;
        return (int) q;

    }
}
