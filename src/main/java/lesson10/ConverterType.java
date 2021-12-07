package lesson10;

public enum ConverterType {
    CELCIUS_TO_FARENHEIT(1),
    FARENHEIT_TO_CELCIUS(2),
    CELCIUS_TO_KELVIN(3),
    KELVIN_TO_CELCIUS(4);

    final int index;

    ConverterType(int index) {
        this.index = index;
    }

    public int getConvertTypeCode() {
        return index;
    }

    public static ConverterType getConvertType(int index) {
        for (ConverterType converterType : values()) {
            if (converterType.getConvertTypeCode() == index) {
                return converterType;
            }
        }
        throw new IllegalArgumentException("No enum found with url: [" + index + "]");
    }
}