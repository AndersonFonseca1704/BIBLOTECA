package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
 
    private JButton btAgregarLibro;
    private JButton btAgregarColeccion;
    private JButton btSalir;

    

    
    public PanelOperaciones()
    {
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        btAgregarLibro = new JButton("Agregar Libro");
        btAgregarLibro.setBounds(105,20,170,20);
        btAgregarLibro.setActionCommand("agregarLibro");
        this.add(btAgregarLibro);

        btAgregarColeccion = new JButton("Agregar a coleccion");
        btAgregarColeccion.setBounds(100,50,180,20);
        btAgregarColeccion.setActionCommand("AgregarColeccion");
        this.add(btAgregarColeccion);

        btSalir = new JButton("Salir");
        btSalir.setBounds(105,80,170,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAgregarLibro.addActionListener(pAL);
        btAgregarColeccion.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }


}