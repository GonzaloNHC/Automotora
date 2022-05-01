public enum ColorVehiculo {
    BLANCO("Blanco"),
    NEGRO("Negro"),
    GRIS("Gris"),
    CELESTE("Celeste"),
    ROJO("Rojo"),
    AZUL("Azul");

    private String colorVehiculo;

    ColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public String getColorVehiculo() {
        return this.colorVehiculo;
    }
}