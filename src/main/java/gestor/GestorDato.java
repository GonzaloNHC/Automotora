package gestor;

import modelo.*;

import java.io.*;

public class GestorDato {
    public static void leerArchivoVehiculos(Automotora automotora, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
//Lee cada linea del archivo hasta que la linea sea nula
            while((textoArchivo = br.readLine()) != null){
                String[] data = textoArchivo.split(",");
                automotora.getVehiculosAVenta().add(new Vehiculo(data[0],
                        ColorVehiculo.valueOf(data[1].toUpperCase()), MarcaVehiculo.valueOf(data[2].toUpperCase()),
                        Integer.parseInt(data[3]),Integer.parseInt(data[4]),Double.parseDouble(data[5])));
            }
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
    }

    public static void leerArchivoVendedores(Automotora automotora, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
//Lee cada linea del archivo hasta que la linea sea nula
            while((textoArchivo = br.readLine()) != null){
                String[] data = textoArchivo.split(",");
                automotora.getVendedores().add(new Vendedor(data[0], Integer.parseInt(data[1]),
                        data[2]));
            }
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
    }

    public static void leerArchivoClientes(Automotora automotora, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
//Lee cada linea del archivo hasta que la linea sea nula
            while((textoArchivo = br.readLine()) != null){
                String[] data = textoArchivo.split(",");
                automotora.getClientes().add(new Cliente(data[0], data[1],
                        data[2], data[3], data[4]));
            }
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
    }

    public static boolean registrarDato(Object objeto, String direccionArchivo) {
        boolean lineaVacia=false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia=true;
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
//Si el documento no es nuevo y tiene registrado datos, se debe
            if(!lineaVacia){
                bw.newLine();
            }
            bw.write(objeto.toString());
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar dato, favor contactar con administrador");
            return false;
        }
    }

}