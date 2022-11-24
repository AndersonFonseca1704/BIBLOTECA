package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class DialogoAgregarAColeccion extends JDialog
{
  
    private JLabel lbAutor;
    private JLabel lbNombreLib;
    private JTextField tfNombreLib;
    private JTextField tfAutor;
    private JLabel lbNombreCol;
    private JTextField tfNombreCol;
    private JButton btAgregar;

   
    public DialogoAgregarAColeccion()
    {
        this.setLayout(null);

        lbNombreLib = new JLabel("Nombre del libro: ");
        lbNombreLib.setBounds(10,30,140,25);
        this.add(lbNombreLib);

        tfNombreLib = new JTextField();
        tfNombreLib.setBounds(180,30,150,25);
        this.add(tfNombreLib);

        lbAutor = new JLabel("Autor: ");
        lbAutor.setBounds(10,70,140,20);
        this.add(lbAutor);

        tfAutor = new JTextField();
        tfAutor.setBounds(180,70,150, 25);
        this.add(tfAutor);

        lbNombreCol = new JLabel("Nombre de colección: ");
        lbNombreCol.setBounds(10,100,160,20);
        this.add(lbNombreCol);

        tfNombreCol = new JTextField();
        tfNombreCol.setBounds(180,100,150, 25);
        this.add(tfNombreCol);

        btAgregar = new JButton("Agregar");
        btAgregar.setBounds(70,140,260,25);
        btAgregar.setActionCommand("agregar1");
        this.add(btAgregar);

        //Caracteristicas de la ventana
        this.setTitle("Vender");
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public String getPrecioCarro()
    {
        return tfAutor.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregar.addActionListener(pAL);
    }

    public void cerrarDialogoVenderCarro()
    {
        this.dispose();
    }
    public void mostrarResultado(String msj)
    {
        tfNombreLib.setText(msj);
    }
}