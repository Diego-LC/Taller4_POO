package model;

public class Entrada {
	private String tipoEntrada;
	private String precio;
	private String disponibilidad;
	private EventoMusical evento;
	private Asistente asistente;

	public Entrada(String tipoEntrada, String precio, String disponibilidad, EventoMusical evento, Asistente asistente) {
		this.tipoEntrada = tipoEntrada;
		this.precio = precio;
		this.disponibilidad = disponibilidad;
		this.evento = evento;
		this.asistente = asistente;
	}

	public void comprar() {
		if (this.disponibilidad == "Disponible") {
			this.disponibilidad = "No disponible";
			System.out.println("Entrada comprada con éxito.");
		} else {
			System.out.println("Error: La entrada no está disponible.");
		}
	}

	public void cancelar() {
		if (this.disponibilidad == "No disponible") {
			this.disponibilidad = "Disponible";
			System.out.println("Entrada cancelada con éxito.");
		} else {
			System.out.println("Error: La entrada ya está disponible.");
		}
	}

	public void mostrarDetalles() {
		if (this.tipoEntrada != null && this.evento != null && this.asistente != null) {
			System.out.println("Tipo de Entrada: " + this.tipoEntrada);
			System.out.println("Precio: " + this.precio);
			System.out.println("Disponibilidad: " + this.disponibilidad);
			System.out.println("Evento: " + this.evento.getNombreEvento());
		} else {
			System.out.println("Error: La entrada no tiene detalles para mostrar.");
		}
	}

	public String getTipoEntrada() {
		return this.tipoEntrada;
	}

	@Override
	public String toString() {
		return this.tipoEntrada + "," + this.precio + "," + this.disponibilidad + "," + this.asistente.toString();
	}
}
