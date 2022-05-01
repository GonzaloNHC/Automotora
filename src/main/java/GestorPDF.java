import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;
import java.util.Date;

public class GestorPDF {
    public void generarBoleta(Venta venta) throws IOException {
        PDDocument documento = new PDDocument();
        PDPage pagina = new PDPage(PDRectangle.A6);
        documento.addPage(pagina);
        String[] lineasPdf = this.obtenerLíneasPdf(venta);
        this.rellenarPDF(documento, pagina, lineasPdf);
        documento.save(this.generarNombrePdf(venta.getFecha()));
        documento.close();
    }

    public void rellenarPDF(PDDocument documento, PDPage pagina, String[] lineasVenta) {
        try (PDPageContentStream contenidoPagina = new PDPageContentStream(documento, pagina)) {
            for (int linea = 0; linea < lineasVenta.length; linea++) {
                contenidoPagina.beginText();
                contenidoPagina.newLineAtOffset(10, pagina.getMediaBox().getHeight() - (10 * linea));
                contenidoPagina.setFont(PDType1Font.HELVETICA_BOLD, 8f);
                contenidoPagina.showText(lineasVenta[linea]);
                contenidoPagina.endText();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] obtenerLíneasPdf(Venta venta) {
        String[] lineasPdf = new String[8];
        lineasPdf[0] = "Boleta electrónica - venta Automovil";
        lineasPdf[1] = "Automotora Temuco";
        lineasPdf[2] = "Fecha: " + venta.getFecha().toString();
        lineasPdf[3] = venta.getCliente().toString().replaceAll("\n", " ");

        lineasPdf[4] = "---------------------------------------------------------------------";
        lineasPdf[5] = "Vehiculo comprado";
        lineasPdf[6] = venta.getVehiculo().toString().replaceAll("\n", " ");
        lineasPdf[7] = "Vendedor: " + venta.getVendedor().getNombre();
        return lineasPdf;
    }

    private String generarNombrePdf(Date fecha) {
        System.out.println(fecha.toString());
        String fechaArchivo = fecha.toString();
        fechaArchivo = fechaArchivo.replace(" ", "").replace(":", "");
        String nombreArchivo = "target/" + "boleta" + fechaArchivo + ".pdf";
        return nombreArchivo;
    }
}