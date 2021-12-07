package lesson10;

public class CelsiusToFahrenheit implements Converter {

    @Override
    public float convert(float t) {
        return (float) (((9.0 / 5.0) * t) + 32);
    }
}