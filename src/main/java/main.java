import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Automotora automotora = new Automotora();
        automotora.añadirVehiculosPorVender();
        automotora.añadirVendedor(new Vendedor("Juan", 30, "123456785"));
        automotora.añadirCliente(new Cliente("Marcelo", "Av. Alemania 2045", 12345678,
                "marcelo@gmail.com", "111111111"));

        try {
            automotora.venderAuto("Celerio",2018);
        } catch(AutomovilNoEcontradoException e) {
            System.out.println("Automóvil no encotrado");
        }

        automotora.mostrarVentas();
    }
}