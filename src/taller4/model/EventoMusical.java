package model;

import java.util.ArrayList;
import java.util.Date;

import model.Artista;
import model.Entrada;

public class EventoMusical {
	private String nombreEvento;
	private String lugar;
	private Date fechaEvento;
	private ArrayList<Artista> artistasAsociados = new ArrayList<Artista>();
	public ArrayList<Entrada> entradas = new ArrayList<Entrada>();

	public String getNombreEvento() {
		return this.nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Date getFechaEvento() {
		return this.fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object attribute) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Artista> getArtistasAsosciados() {
		throw new UnsupportedOperationException();
	}

	public void setArtista(Artista artista) {

		if (artista != null) {
			this.artistasAsociados.add(artista);
		} else {
			System.out.println("Error: El artista no puede ser nulo.");
		}
	}

	public EventoMusical(String nombreEvento, Date fecha, String lugar) {
		this.nombreEvento = nombreEvento;
		this.fechaEvento = fecha;
		this.lugar = lugar;
		this.artistasAsociados = new ArrayList<>();
	}
	public void eliminarArtista(Artista artista) {
		if (this.artistasAsociados.contains(artista)) {
			this.artistasAsociados.remove(artista);
		} else {
			System.out.println("Error: El artista no existe en la lista.");
		}
	}

	public void mostrarDetalles() {
		if (this.nombreEvento != null && this.fechaEvento != null && this.lugar != null) {
			System.out.println("Nombre del Evento: " + this.nombreEvento);
			System.out.println("Fecha: " + this.fechaEvento);
			System.out.println("Lugar: " + this.lugar);
			System.out.println("Artistas: ");
			for (Artista artista : this.artistasAsociados) {
				System.out.println(artista.getNombreArtistico());
			}
		} else {
			System.out.println("Error: El evento musical no tiene detalles para mostrar.");
		}
	}
	public void crearEvento(String nombreEvento, Date fecha, String lugar) {
		if (nombreEvento != null && fecha != null && lugar != null) {
			this.nombreEvento = nombreEvento;
			this.fechaEvento = fecha;
			this.lugar = lugar;
		} else {
			System.out.println("Error: El nombre del evento, la fecha y el lugar no pueden ser nulos.");
		}
	}
}