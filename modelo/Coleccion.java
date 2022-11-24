package modelo;

import java.util.ArrayList;

public class Coleccion extends Libro
{
    private String nomColeccion;
    private int numLib;
    
    public Coleccion(String nom, String aut, int annio, String nomC, int numL)
    {
        super(nom, aut, annio);
        this.nomColeccion = nomC;
        this.numLib = numL;
    }
}