package lesson11;

public enum AutoType {

    CARS, TRUCKS;

    public static AutoType getAutoType(Automobile auto) {
        for (AutoType autoType : values()) {
            if ((auto instanceof Cars)) {
                return CARS;
            } else {
                if ((auto instanceof Trucks)) {
                    return TRUCKS;
                }
            }
        } throw new IllegalStateException("Unexpected value: " + auto);
    }
}
