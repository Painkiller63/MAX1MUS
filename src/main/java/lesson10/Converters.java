package lesson10;

public enum Converters {
    CELCIUSTOFARENHEIT(1), FARENHEITTOCELCIUS(2), CELCIUSTOKELVIN(3), KELVINTOCELCIUS(4);

    private final int index;

    Converters(int index) {
        this.index = index;
    }

    static class Convertation {

        CelciusToFarenheit ctf = new CelciusToFarenheit();
        FarenheitToCelcius ftc = new FarenheitToCelcius();
        CelciusToKelvin ctk = new CelciusToKelvin();
        KelvinToCelcius ktc = new KelvinToCelcius();

    public void converter (int index) {
        for (Converters converter : values()) {
            if (converter.index == index) {
                switch (converter){
                case CELCIUSTOFARENHEIT -> System.out.println("Температура равна " + ctf.convert() + " Фаренгейт");
                case FARENHEITTOCELCIUS -> System.out.println("Температура равна " + ftc.convert() + " Цельсий");
                case CELCIUSTOKELVIN -> System.out.println("Температура равна " + ctk.convert() + " Кельвин");
                case KELVINTOCELCIUS -> System.out.println("Температура равна " + ktc.convert() + " Цельсий");
            }
        }
    }

/*    static class Convertation {

        CelciusToFarenheit ctf = new CelciusToFarenheit();
        FarenheitToCelcius ftc = new FarenheitToCelcius();
        CelciusToKelvin ctk = new CelciusToKelvin();
        KelvinToCelcius ktc = new KelvinToCelcius();

        public void type(String index) {
            switch (index) {
                case CELCIUSTOFARENHEIT -> System.out.println("Температура равна " + ctf.convert() + " Фаренгейт");
                case FARENHEITTOCELCIUS -> System.out.println("Температура равна " + ftc.convert() + " Цельсий");
                case CELCIUSTOKELVIN -> System.out.println("Температура равна " + ctk.convert() + " Кельвин");
                case KELVINTOCELCIUS -> System.out.println("Температура равна " + ktc.convert() + " Цельсий");
                default -> throw new IllegalStateException("Unexpected value: " + index);
           }
*/       }
   }
}