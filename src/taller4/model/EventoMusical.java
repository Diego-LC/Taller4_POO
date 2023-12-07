package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import model.Artista;
import model.Entrada;

public class EventoMusical {
	private String nombreEvento;
	private String lugar;
	private Date fechaEvento;
	private ArrayList<Artista> artistasAsosciados;
	private Vector<Artista> artistasAsociados = new Vector<Artista>();
	public Vector<Entrada> entradas = new Vector<Entrada>();

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
		throw new UnsupportedOperationException();
	}

	public EventoMusical() {
		throw new UnsupportedOperationException();
	}

	public void eliminarArtista(Object artista) {
		throw new UnsupportedOperationException();
	}

	public String mostrarDetalles() {
		throw new UnsupportedOperationException();
	}

	public void crearEvento() {
		throw new UnsupportedOperationException();
	}
}