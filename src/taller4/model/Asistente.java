package model;

import java.util.ArrayList;

public class Asistente {
	private String informacionContacto;
	private String preferenciasMusicales;
	private ArrayList<Entrada> entradas;

	public Asistente(String informacionContacto, String preferenciasMusicales) {
		this.informacionContacto = informacionContacto;
		this.preferenciasMusicales = preferenciasMusicales;
		this.entradas = new ArrayList<>();
	}

	public void comprarEntrada(Entrada entrada) {
		if (entrada != null) {
			this.entradas.add(entrada);
		} else {
			System.out.println("Error: La entrada no puede ser nula.");
		}
	}

	public void cancelarEntrada(Entrada entrada) {
		if (this.entradas.contains(entrada)) {
			this.entradas.remove(entrada);
		} else {
			System.out.println("Error: La entrada no existe en la lista.");
		}
	}

	public void mostrarDetalles() {
		if (this.informacionContacto != null && this.preferenciasMusicales != null) {
			System.out.println("Información de Contacto: " + this.informacionContacto);
			System.out.println("Preferencias Musicales: " + this.preferenciasMusicales);
			System.out.println("Entradas: ");
			for (Entrada entrada : this.entradas) {
				System.out.println(entrada.getTipoEntrada());
			}
		} else {
			System.out.println("Error: El asistente no tiene detalles para mostrar.");
		}
	}

	public void registrarAsistente(String informacionContacto, String preferenciasMusicales) {
		if (informacionContacto != null && preferenciasMusicales != null) {
			this.informacionContacto = informacionContacto;
			this.preferenciasMusicales = preferenciasMusicales;
		} else {
			System.out.println("Error: La información de contacto y las preferencias musicales no pueden ser nulas.");
		}
	}

	public String getInformacionContacto() {
		return informacionContacto;
	}
}
