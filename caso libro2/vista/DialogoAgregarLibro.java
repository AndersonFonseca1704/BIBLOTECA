package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class DialogoAgregarLibro extends JDialog
{
    
    private JLabel lbAutor;
    private JLabel lbNombreLib;
    private JTextField tfNombreLib;
    private JTextField tfAutor;
    private JButton btAgregar;

   
    public DialogoAgregarLibro()
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

        btAgregar = new JButton("Vender");
        btAgregar.setBounds(70,140,260,25);
        btAgregar.setActionCommand("agregar2");
        this.add(btAgregar);

        
        this.setTitle("Vender Carro");
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