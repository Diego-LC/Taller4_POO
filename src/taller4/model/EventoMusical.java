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

	public ArrayList<Artista> getArtistasAsosciados() {
		return this.artistasAsociados;
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
	public EventoMusical() {
	}

	public void eliminarArtista(Artista artista) {
		if (this.artistasAsociados.contains(artista)) {
			this.artistasAsociados.remove(artista);
		} else {
			System.out.println("Error: El artista no existe en la lista.");
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
	
	@Override
	public String toString() {
		return this.nombreEvento + "," + this.lugar + "," + this.fechaEvento.toString();
	}
}