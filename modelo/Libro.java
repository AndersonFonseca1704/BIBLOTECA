package modelo;

public class Libro
{
    protected String nombreLib;
    protected int annooLib;
    protected String autor;
    protected boolean edicionLujo;

    public Libro(String nom, String aut, int annio )
    {
        this.nombreLib = nom;
        this.autor = aut;
        this.annooLib = annio;
    }
    public String toString()
    {
        return ("Nombre: " + nombreLib + "\nAutor: " + autor + "\nAño de edición: " + annooLib + "Edición de lujo: "  + edicionLujo);
    }
}