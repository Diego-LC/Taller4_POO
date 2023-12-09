package model;

public class Asistente {
	private String nombre;
	private String numeroTelefono;
	private String direccion;
	private String preferenciasMusicales;
	private Entrada entradas;

	public Asistente(String nombre, String numeroTelefono, String direccion, String preferenciasMusicales) {
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
		this.direccion = direccion;
		this.preferenciasMusicales = preferenciasMusicales;
	}

	public void comprarEntrada(Entrada entrada) {
		if (entrada != null) {
			this.entradas = entrada;
		} else {
			System.out.println("Error: La entrada no puede ser nula.");
		}
	}

	public void cancelarEntrada(Entrada entrada) {
		if (this.entradas == entrada) {
			this.entradas = null;
		} else {
			System.out.println("Error: La entrada no existe en la lista.");
		}
	}


	@Override
	public String toString() {
		return this.nombre + "," + this.numeroTelefono + "," + this.direccion + "," + this.preferenciasMusicales;
	}
}
