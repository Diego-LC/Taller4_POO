package model;

public class Entrada {
	private String tipoEntrada;
	private String precio;
	private String disponibilidad;
	private EventoMusical eventoMusical;
	private Asistente asistente;
	public EventoMusical eventoMusical;

	public String getTipoEntrada() {
		return this.tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDisponibilidad() {
		return this.disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public EventoMusical getEventoMusical() {
		return this.eventoMusical;
	}

	public void setEventoMusical(EventoMusical eventoMusical) {
		this.eventoMusical = eventoMusical;
	}

	public Asistente getAsistente() {
		return this.asistente;
	}

	public void setAsistente(Asistente asistente) {
		this.asistente = asistente;
	}

	public Entrada() {
		throw new UnsupportedOperationException();
	}
}