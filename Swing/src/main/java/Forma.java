import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Forma extends JFrame{
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public Forma(){
        inicializarForma();
//        campoTexto.addActionListener(e -> {
//            replicarTexto();
//        });
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
    }

    public void replicarTexto(){
        this.replicadorLabel.setText(this.campoTexto.getText());
    }
    private void inicializarForma(){
        setContentPane(panelPrincipal);//Visualizar el texto
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar la aplicación
        setSize(600, 400);//Tamaño de pixeles
        setLocationRelativeTo(null);// Centramos la ventana
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();//Colocar modo oscuro
        Forma forma = new Forma();
        forma.setVisible(true);//Visualizar el formulario
    }
}
