package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Biblioteca;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private Biblioteca biblioteca;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Biblioteca pBiblio)
    {
        this.venPrin = pVenPrin;
        this.biblioteca= pBiblio;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor
        if(comando.equals("AgregarColeccion"))
        {
            venPrin.crearDialogoAgregarColeccion();
            this.venPrin.miColeccion.agregarOyenteBoton(this);
        }
        if(comando.equals("agregarLibro"))
        {
            venPrin.crearDialogoAgregarLibro();
            this.venPrin.miLibro.agregarOyenteBoton(this);
        }
        if(comando.equals("agregar1"))
        {

        }
        if(comando.equals("agregar2"))
        {
            
        }
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}