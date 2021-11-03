public class Homework1Lesson2 {

    public static void main(String[] args) {

        long summa = sum(91, 55);
        System.out.println(summa);

        long rsltminus = minus(234, 24);
        System.out.println(rsltminus);

        long rsltmultiply = multiplication(14, 16);
        System.out.println(rsltmultiply);

        double rsltdivision = division(54, 17);
        System.out.println(rsltdivision);

        double rsltarithmetic = arithmetic(14, 16, 54, 17);
        System.out.println(rsltarithmetic);

    }
        // a, b, c, d - целые числа во всех использыемых методах
        public static long sum(int a, int b){
            return a + b;
        }

        public static long minus(int a, int b){
            return a - b;
        }

        public static long multiplication(int a, int b){
            int result;
            result = a * b;
            return result;
        }

        public static double division(double a, double b){
            return a / b;
        }

        public static double arithmetic(double a, double b, double c, double d){
            return (a + b) * (c - d) / (a + c - b - d);
        }
}


