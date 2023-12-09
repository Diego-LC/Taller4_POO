package gui;

import controlador.Controlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends VentanaGeneral implements ActionListener {
    private Controlador controlador;
    private JButton botonComprarEntradas;
    private JButton botonMostarArtistas;
    private JButton botonMostrarAsistentes;
    private JButton botonMostrarEventos;
    private JButton botonSalir;

    public VentanaPrincipal(Controlador controlador) {
        super("Ventana Principal");
        super.setSize(500, 500);
        this.controlador = controlador;
        this.generarElementos();
    }


    private void generarElementos() {
        super.generarJLabelEncabezado(null, "Sistema ventas de entradas", 100, 20, 300, 30);
        this.generarBotonComprarEntradas();
        this.generarBotonMostrarArtistas();
        this.generarBotonMostrarAsistentes();
        this.generarBotonMostrarEventos();
        this.generarBotonSalir();
    }

    private void generarBotonComprarEntradas() {
        this.botonComprarEntradas = super.generarBoton("Comprar Entradas", 100, 70, 300, 50);
        this.add(this.botonComprarEntradas);
        this.botonComprarEntradas.addActionListener(this);
    }

    private void generarBotonMostrarArtistas() {
        this.botonMostarArtistas = super.generarBoton("Mostrar Artistas", 100, 130, 300, 50);
        this.add(this.botonMostarArtistas);
        this.botonMostarArtistas.addActionListener(this);
    }

    private void generarBotonMostrarAsistentes() {
        this.botonMostrarAsistentes = super.generarBoton("Mostrar asistentes segun evento", 100, 190, 300, 50);
        this.add(botonMostrarAsistentes);
        this.botonMostrarAsistentes.addActionListener(this);
    }

    private void generarBotonMostrarEventos() {
        this.botonMostrarEventos = super.generarBoton("Mostrar Eventos disponibles", 100, 250, 300, 50);
        this.add(botonMostrarEventos);
        this.botonMostrarEventos.addActionListener(this);
    }

    private void generarBotonSalir() {
        this.botonSalir = super.generarBoton("Salir", 100, 370, 300, 50);
        this.add(botonSalir);
        this.botonSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonComprarEntradas) {
            // Mostrar la lista de cafés asociados
            //VentanaMostrarCafes ventMostrarCafes = new VentanaMostrarCafes(VentanaPrincipal.this, this.controlador);
            //ventMostrarCafes.setVisible(true);
        }

        if (e.getSource() == this.botonMostarArtistas) {
            // Crear una nueva instancia de VentanaAgregarCafe y mostrarla
            //VentanaAgregarCafe ventanaAgregarCafe = new VentanaAgregarCafe(VentanaPrincipal.this, this.controlador);
            //ventanaAgregarCafe.setVisible(true);
            // Opcional: ocultar la ventana principal
            setVisible(false);
        }

        if (e.getSource() == this.botonMostrarAsistentes) {
            // Crear una nueva instancia de VentanaBuscarCafe y mostrarla
            //VentanaBuscarCafe ventanaBuscarCafe = new VentanaBuscarCafe(controlador, VentanaPrincipal.this);
            //ventanaBuscarCafe.setVisible(true);
            // Opcional: ocultar la ventana principal
            setVisible(false);
        }

        if (e.getSource() == this.botonMostrarEventos) {
            // Crear una nueva instancia de VentanaEliminarCafe y mostrarla
            //VentanaEliminarCafe ventanaEliminarCafe = new VentanaEliminarCafe(controlador, VentanaPrincipal.this);
            //ventanaEliminarCafe.setVisible(true);
            // Opcional: ocultar la ventana principal
            setVisible(false);
        }

        if (e.getSource() == this.botonSalir){
            // Cierra la ventana
            System.exit(0);
            controlador.guardarDatos();
        }
    }
}