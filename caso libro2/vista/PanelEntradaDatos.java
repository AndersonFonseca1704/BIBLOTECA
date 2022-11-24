package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    
    private JLabel lbLibros;
    private JLabel lbColeccion;
    public JComboBox cbLibros;
    public JComboBox cbColeccion;


    
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta empleados
        lbLibros = new JLabel("Libros: ", JLabel.RIGHT);
        lbLibros.setBounds(0,90,100,20);
        this.add(lbLibros);

        lbColeccion = new JLabel("Colecciones: ", JLabel.RIGHT);
        lbColeccion.setBounds(0,140,100,20);
        this.add(lbColeccion);

        //Crear y agregar combo lista Empleados
        cbLibros = new JComboBox();
        cbLibros.setBounds(100,90,260,20);
        this.add(cbLibros);

        cbColeccion = new JComboBox();
        cbColeccion.setBounds(100,140,260,20);
        this.add(cbColeccion);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso
    public String getLibro()
    {
        return (String) cbLibros.getSelectedItem();  
    }

    public int getIndexLibro()
    {
        return cbLibros.getSelectedIndex();
    }

    public String getColección()
    {
        return (String) cbColeccion.getSelectedItem(); 
    }

    public int getIndexColeccion()
    {
        return cbColeccion.getSelectedIndex();
    }

    public void setEmpleado(String lib)
    {
        cbLibros.addItem(lib);
    }
}
