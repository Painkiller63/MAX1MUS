package lesson10;

public class KelvinToCelsius implements Converter {
    @Override
    public float convert(float t) {
        return (t - 273.15f);
    }
}