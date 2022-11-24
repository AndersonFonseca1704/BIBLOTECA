package modelo;

import java.util.ArrayList;

public class Biblioteca 
{
    private ArrayList libros;
    private ArrayList colecciones;

    public Biblioteca()
    {
        libros = new ArrayList<>();
        colecciones =new ArrayList<>();
    }
    public void addLibro(Libro lib)
    {
        libros.add(lib);
    }
    public void addAColeccion(Libro lib)
    {
        colecciones.add(lib);
    }
}