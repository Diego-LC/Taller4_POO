package datos;

import model.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class GestorDeDatos {

	public boolean GuardarArchivo(Object objeto, String direccionArchivo) {
		boolean lineaVacia=false;
		try {
			File file = new File(direccionArchivo);
			if (!file.exists()) {
				file.createNewFile();
				lineaVacia=true;
			}
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			//Si el documento no es nuevo y ya tiene registrados datos, se debe crear un salto de línea
			if(!lineaVacia && file.length() > 0){
				bw.newLine();
			}
			bw.write(objeto.toString());
			System.out.println("Guardado: " + objeto.toString());
			bw.close();
			return true;
		} catch (Exception e) {
			System.out.println("Error al ingresar dato, favor contactar con administrador: " + e.getMessage());
			return false;
		}
	}

	public void leerArchivoArtista( String direccionArchivoArtista, String direccionArchivoEventos, String direccionArchivoRelacionEvento_Artista) {
		String textoArchivo = "";
		try {
			File archivo = new File(direccionArchivoArtista);
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			//Lee cada línea del archivo hasta que la línea sea nula
			while((textoArchivo = br.readLine()) != null){
				String[] data = textoArchivo.split(",");
				Artista artista = new Artista();
				artista.setNombreArtistico(data[0]);
				artista.setGeneroMusical(data[1]);
				//Se debe leer el archivo de relacion evento_artista para asociar los eventos al artista
				leerArchivoRelacionEvento_Artista(artista, direccionArchivoRelacionEvento_Artista);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("erro al leer el archivo " + direccionArchivoEventos+ " : " + e.getMessage());
		}
		return ;
	}

	private void leerArchivoRelacionEvento_Artista(Artista artista, String direccionArchivoE_A) {
		String textoArchivo = "";
		try {
			File archivo = new File(direccionArchivoE_A);
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			//Lee cada línea del archivo hasta que la línea sea nula
			while((textoArchivo = br.readLine()) != null){
				String[] data = textoArchivo.split(",");
				if(data[1].equals(artista.getNombreArtistico())){
					//Se debe leer el archivo de eventos para asociar los eventos al artista
					leerArchivoEvento(artista, data[0]);
				}
			}
			br.close();
		} catch (Exception e) {
			System.out.println("erro al leer el archivo " + direccionArchivoE_A+ " : " + e.getMessage());
		}
		return ;
	}

	private void leerArchivoEvento(Artista artista, String direccionArchivoEvento) {
		String textoArchivo = "";

		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			File archivo = new File(direccionArchivoEvento);
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			//Lee cada línea del archivo hasta que la línea sea nula
			while((textoArchivo = br.readLine()) != null){
				String[] data = textoArchivo.split(",");
				EventoMusical evento = new EventoMusical();
				evento.setNombreEvento(data[0]);
				evento.setLugar(data[2]);
				Date fechaEvento = dateFormat.parse(data[1]);
				evento.setFechaEvento(fechaEvento);
				evento.setLugar(data[2]);
				// Assuming that the Artista class has a method called addEvento(EventoMusical evento)
				artista.agregarEvento(evento);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("erro al leer el archivo " + direccionArchivoEvento+ " : " + e.getMessage());
		}
		return ;
	}

	public void leerArchivoAsistente(String direccionArchivoAsistente, String direccionArchivoCafes) {
		String textoArchivo = "";
		try {
			File archivo = new File(direccionArchivoAsistente);
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			//Lee cada línea del archivo hasta que la línea sea nula
			while((textoArchivo = br.readLine()) != null){
			}
			br.close();
		} catch (Exception e) {
			System.out.println("erro al leer el archivo " + direccionArchivoCafes+ " : " + e.getMessage());
		}
		return ;
	}

	public void leerArchivoEntrada(String direccionArchivoEntrada, String direccionArchivoCafes) {
		String textoArchivo = "";
		try {
			File archivo = new File(direccionArchivoEntrada);
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			//Lee cada línea del archivo hasta que la línea sea nula
			while((textoArchivo = br.readLine()) != null){
			}
			br.close();
		} catch (Exception e) {
			System.out.println("erro al leer el archivo " + direccionArchivoCafes+ " : " + e.getMessage());
		}
		return ;
	}

	public void borrarDatosArchivo(String direccionArchivo){
		try {
			File file = new File(direccionArchivo);
			if(!file.exists()){
				file.createNewFile();
			}
			FileWriter writer = new FileWriter(file);
			BufferedWriter buff = new BufferedWriter(writer);
			buff.close();
		}catch (Exception e) {
			System.out.println("Error al borrar datos del archivo: " + e.getMessage());
		}
	}
}