package model;

import java.util.ArrayList;

public class Artista {
	private String nombreArtistico;
	private String generoMusical;
	private ArrayList<EventoMusical> eventosMusicales;

	public Artista() {

	}

	public String getNombreArtistico() {
		return this.nombreArtistico;
	}

	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}

	public String getGeneroMusical() {
		return this.generoMusical;
	}

	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}

	public ArrayList<EventoMusical> getEventosMusicales() {
		return this.eventosMusicales;
	}


	public void agregarEvento(EventoMusical evento) {
		this.eventosMusicales.add(evento);
	}

	public void eliminarEvento(EventoMusical evento) {
		if (this.eventosMusicales.contains(evento)) {
			this.eventosMusicales.remove(evento);
		} else {
			System.out.println("Error: El evento no existe en la lista.");
		}
	}

	public void mostrarEventos() {
		if (this.eventosMusicales.size() > 0) {
			for (EventoMusical evento : this.eventosMusicales) {
				System.out.println(evento.toString());
			}
		} else {
			System.out.println("Error: No hay eventos para mostrar.");
		}
	}

	public void registrarArtista(String nombreArtistico, String generoMusical) {
		if (nombreArtistico != null && generoMusical != null) {
			this.nombreArtistico = nombreArtistico;
			this.generoMusical = generoMusical;
		} else {
			System.out.println("Error: El nombre artístico y el género musical no pueden ser nulos.");
		}
	}

	@Override
	public String toString() {
		return this.nombreArtistico + "," + this.generoMusical;
	}

}