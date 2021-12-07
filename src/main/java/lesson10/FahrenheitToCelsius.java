package lesson10;

public class FahrenheitToCelsius implements Converter {

    @Override
    public float convert(float t) {
        return (float) ((t - 32) * (5.0 / 9.0));
    }
}