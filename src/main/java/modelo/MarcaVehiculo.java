package modelo;

public enum MarcaVehiculo {
    CHEVROLET("Chevrolet"),
    HYUNDAI("Hyundai"),
    NISSAN("Nissan"),
    SUZUKI("Suzuki"),
    TOYOTA("Toyota");

    private String marcaVehiculo;

    MarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getMarcaVehiculo() {
        return this.marcaVehiculo;
    }
}