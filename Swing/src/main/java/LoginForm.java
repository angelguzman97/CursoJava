import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public LoginForm(){
        inicializarForma();
        //Boton
        enviarBoton.addActionListener(e -> validar());
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);//Visualizar aplicacion
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);//Centrar ventana
    }

    private void validar(){
        var usuario = this.usuarioTexto.getText();
        var password = new String(this.passwordTexto.getPassword());

        if ("root".equals(usuario) && "admin".equals(password)){
            mostrarMensaje("Datos correctos. Bienvenido!");
        }else if("root".equals(usuario)){
            mostrarMensaje("Password incorrecto");
        }else if("admin".equals(password)){
            mostrarMensaje("Usuario incorrecto");
        }else {
            mostrarMensaje("Datos incorrectos");
        }
    }
    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);//Mandar el mensaje
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
