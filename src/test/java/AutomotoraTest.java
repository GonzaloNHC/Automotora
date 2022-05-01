import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AutomotoraTest {

    @Test
    public void añadirVendedorTest() {
        String[] rutIngresados = new String[]{"123456785", "hola", "201040388", "111111118"};
        Vendedor casoCorrecto = new Vendedor("Andrés", 45, "111111111");
        Automotora automotora = new Automotora();
        int count = 1;

        for (int i = 0; i < rutIngresados.length; i++) {
            int indiceRandom = (int) (Math.random() * 4);
            Vendedor v = new Vendedor("Juan", 37, rutIngresados[indiceRandom]);
            if (automotora.añadirVendedor(v)) {
                count++;
            }
        }

        for (Vendedor vendedor : automotora.getVendedores()) {
            assertTrue(digitoVerificador.validarRut(vendedor.getRut()));
        }

        automotora.añadirVendedor(casoCorrecto);

        List<Vendedor> listaVendedores = automotora.getVendedores();
        assertTrue(listaVendedores.contains(casoCorrecto));

        assertEquals(listaVendedores.size(), count);
    }

    @Test
    public void venderAutoTest() throws AutomovilNoEcontradoException {
        String[] marcasAutos = new String[] {"Chevrolet", "Suzuki", "Toyota", "Hyundai", "Ford"};
        int [] año = new int[] {2020, 2010, 2020, 1987, 2008};
        String vehiculosNoVendidos = "Suzuki Hyundai Ford";
        List<Vehiculo> vehiculosAVenta = new ArrayList<>();
        vehiculosAVenta.add(new Vehiculo("Celerio", ColorVehiculo.GRIS, MarcaVehiculo.SUZUKI,
                2018, 5000000, 40000.4));
        vehiculosAVenta.add(new Vehiculo("Hilux", ColorVehiculo.ROJO, MarcaVehiculo.TOYOTA,
                2020, 12000000, 1000));
        vehiculosAVenta.add(new Vehiculo("Qashqai", ColorVehiculo.BLANCO, MarcaVehiculo.NISSAN,
                2018, 10590000, 20000.23));
        vehiculosAVenta.add(new Vehiculo("Cruze", ColorVehiculo.CELESTE, MarcaVehiculo.CHEVROLET,
                2010, 4500000, 105000.144));
        vehiculosAVenta.add(new Vehiculo("Sail", ColorVehiculo.GRIS, MarcaVehiculo.CHEVROLET,
                2020, 6000000, 0));
        Automotora automotora = new Automotora();

        for(int i = 0; i < marcasAutos.length; i++) {
            automotora.venderAuto(marcasAutos[i], año[i]);
        }

        automotora.venderAuto(marcasAutos[0], año[0]);
        automotora.venderAuto(marcasAutos[2], año[2]);

        for (Vehiculo auto: vehiculosAVenta) {
            assertTrue(auto.getNombre().contentEquals(vehiculosNoVendidos));

        }
    }
}