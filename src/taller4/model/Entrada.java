package model;

public class Entrada {
	private String tipoEntrada;
	private String precio;
	private boolean disponibilidad;
	private EventoMusical evento;
	private Asistente asistente;

	public Entrada(String tipoEntrada, String precio, boolean disponibilidad, EventoMusical evento, Asistente asistente) {
		this.tipoEntrada = tipoEntrada;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
		this.evento = evento;
		this.asistente = asistente;
	}

	public void comprar() {
		if (this.disponibilidad) {
			this.disponibilidad = false;
			System.out.println("Entrada comprada con éxito.");
		} else {
			System.out.println("Error: La entrada no está disponible.");
		}
	}

	public void cancelar() {
		if (!this.disponibilidad) {
			this.disponibilidad = true;
			System.out.println("Entrada cancelada con éxito.");
		} else {
			System.out.println("Error: La entrada ya está disponible.");
		}
	}

	public void mostrarDetalles() {
		if (this.tipoEntrada != null && this.evento != null && this.asistente != null) {
			System.out.println("Tipo de Entrada: " + this.tipoEntrada);
			System.out.println("Precio: " + this.precio);
			System.out.println("Disponibilidad: " + (this.disponibilidad ? "Disponible" : "No Disponible"));
			System.out.println("Evento: " + this.evento.getNombreEvento());
			System.out.println("Asistente: " + this.asistente.getInformacionContacto());
		} else {
			System.out.println("Error: La entrada no tiene detalles para mostrar.");
		}
	}

	public String getTipoEntrada() {
		return this.tipoEntrada;
	}
}
