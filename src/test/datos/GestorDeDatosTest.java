package datos;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class GestorDeDatosTest {

    @Test
    void testGuardarArchivo() {
        GestorDeDatos gestor = new GestorDeDatos();
        String direccionArchivo = "testArchivo.txt";
        String objeto = "Datos de prueba";

        assertTrue(gestor.GuardarArchivo(objeto, direccionArchivo));

        // Puedes agregar más aserciones para verificar el estado final del archivo
    }

    @Test
    void testLeerArchivoArtista() {
        GestorDeDatos gestor = new GestorDeDatos();
        String direccionArchivoArtista = "testArtista.txt";
        String direccionArchivoCafes = "testCafes.txt";

        assertDoesNotThrow(() -> gestor.leerArchivoArtista(direccionArchivoArtista, direccionArchivoCafes));

        // Agrega más aserciones para verificar el comportamiento esperado
    }

    // Similarmente, puedes crear tests para leerArchivoEvento, leerArchivoAsistente, leerArchivoEntrada, y borrarDatosArchivo.

    @Test
    void testBorrarDatosArchivo() {
        GestorDeDatos gestor = new GestorDeDatos();
        String direccionArchivo = "testArchivo.txt";

        // Escribe datos de prueba en el archivo antes de borrar
        gestor.GuardarArchivo("Datos de prueba", direccionArchivo);

        assertTrue(new File(direccionArchivo).length() > 0); // Verifica que el archivo tenga contenido antes de borrar

        gestor.borrarDatosArchivo(direccionArchivo);

        assertEquals(0, new File(direccionArchivo).length()); // Verifica que el archivo esté vacío después de borrar
    }
}
