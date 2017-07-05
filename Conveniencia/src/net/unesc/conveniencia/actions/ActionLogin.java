package net.unesc.conveniencia.actions;

import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.frames.FrameLogin;
import net.unesc.conveniencia.frames.FrameMenu;
import net.unesc.conveniencia.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.unesc.conveniencia.classes.Usuario;
import net.unesc.conveniencia.conexao.UsuarioDao;
import net.unesc.conveniencia.internalframes.FrameUsuario;

public class ActionLogin implements ActionListener {

    private final net.unesc.conveniencia.frames.FrameLogin frameLogin;
    
    private UsuarioDao usuarioDao = new UsuarioDao();

    public ActionLogin(FrameLogin login) {
        this.frameLogin = login;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Entrar")) {
            
            try {
                Usuario usuario = frameLogin.getUsuario();
                
                Usuario usu = UsuarioDao.getUsuario(usuario.getUsuUsuario(),usuario.getUsuSenha());
                
                if(usu == null){
                    JOptionPane.showMessageDialog(null,"Usuário não Cadastrado!");
                    return;
                }
                
                try {
                    
                    gravarUsuario(usuario.getUsuUsuario());
                    gerarLog("Logou");                    
                    
                    FrameMenu menu = new FrameMenu();
                    menu.setVisible(true);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                
            } catch (ExceptionConveniencia ex) {
                try {
                    gerarLog("Exception: " + ex.getMessage());
                } catch (IOException exi) {
                } catch (ExceptionConveniencia ex1) {
                    Logger.getLogger(ActionLogin.class.getName()).log(Level.SEVERE, null, ex1);
                }

                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
            frameLogin.hide();
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
