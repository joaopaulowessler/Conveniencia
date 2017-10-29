package net.unesc.vendas.actions;

import net.unesc.vendas.exception.ExceptionVendas;
import net.unesc.vendas.frames.FrameLogin;
import net.unesc.vendas.frames.FrameMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.unesc.vendas.classes.Usuario;
import net.unesc.vendas.conexao.UsuarioDao;
import net.unesc.vendas.internalframes.FrameUsuario;

public class ActionLogin implements ActionListener {

    private final net.unesc.vendas.frames.FrameLogin frameLogin;
    
    private UsuarioDao usuarioDao = new UsuarioDao();

    public ActionLogin(FrameLogin login) {
        this.frameLogin = login;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Entrar")) {
            
            /*try {
                Usuario usuario = frameLogin.getUsuario();
                
                Usuario usu = UsuarioDao.getUsuario(usuario.getUsuUsuario(),usuario.getUsuSenha());
                
                if(usu == null){
                    JOptionPane.showMessageDialog(null,"Usuário não Cadastrado!");
                    return;
                }
                
            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }*/
            
            frameLogin.hide();
            
            FrameMenu men = new FrameMenu();
            men.setVisible(true);
        }

        if (e.getActionCommand().equals("Cancelar")) {
            System.exit(0);
        }
    }
}
