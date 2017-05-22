package Actions;

import Exception.ExceptionConveniencia;
import Classes.Login;
import Frames.FrameLogin;
import Frames.FrameMenu;
import Log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ActionLogin implements ActionListener {

    private final FrameLogin login;

    public ActionLogin(FrameLogin login) {
        this.login = login;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Entrar")) {

            try {
                
                Login claLogin = login.getLogin();
                
                try {
                    
                    gravarUsuario(claLogin.getLogin());
                    gerarLog("Logou");                    
                    
                    FrameMenu menu = new FrameMenu();
                    menu.setVisible(true);
                    login.hide();

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            } catch (ExceptionConveniencia ex) {

                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {
            System.exit(0);
        }
    }

    public void gerarLog(String vmsg) throws ExceptionConveniencia, IOException {

        Log log = new Log();
        log.escrever(vmsg, "log.txt");
    }
    
    public void gravarUsuario(String vmsg) throws ExceptionConveniencia, IOException {

        Log log = new Log();
        log.gravarUsuario(vmsg, "usuario.txt");
    }
}
