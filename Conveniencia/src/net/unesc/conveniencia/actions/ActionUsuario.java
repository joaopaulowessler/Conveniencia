package net.unesc.conveniencia.actions;

import net.unesc.conveniencia.classes.Usuario;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.conveniencia.conexao.UsuarioDao;

public class ActionUsuario implements ActionListener {

    private final net.unesc.conveniencia.internalframes.FrameUsuario frameUsuario;
    
    private UsuarioDao usuarioDao = new UsuarioDao();
    
    public ActionUsuario(net.unesc.conveniencia.internalframes.FrameUsuario fraPro) {
        this.frameUsuario = fraPro;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            
            try {
                gerarLog("Novo");
            } catch (IOException ex) {
            }

            int codigo = usuarioDao.getMax();
            frameUsuario.setCodigo(codigo + 1);
            frameUsuario.novoUsuario();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            try {
                gerarLog("Salvar");
            } catch (IOException ex) {
            }

            try {
                Usuario usuario = frameUsuario.getUsuario();
                Usuario pro = UsuarioDao.getUsuario(usuario.getUsuCodigo());
                
                if(pro != null)
                    usuarioDao.update(usuario);
                else 
                    usuarioDao.insert(usuario);
                                
                frameUsuario.cancelarUsuario();

            } catch (ExceptionConveniencia ex) {
                try {
                    gerarLog("Exception: " + ex.getMessage());
                } catch (IOException exi) {
                }

                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Excluir")) {
            try {
                gerarLog("Exclusão");
            } catch (IOException ex) {
            }
            
            try {
                Usuario usuario = frameUsuario.getUsuario();
                UsuarioDao pro = new UsuarioDao();
                
                if(usuario != null)
                    pro.delete(usuario);                
                                
                frameUsuario.cancelarUsuario();

            } catch (ExceptionConveniencia ex) {
                try {
                    gerarLog("Exception: " + ex.getMessage());
                } catch (IOException exi) {
                }

                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {
            try {
                gerarLog("Cancelamento");
            } catch (IOException ex) {
            }

            frameUsuario.cancelarUsuario();
        }
    }

    public void gerarLog(String vmsg) throws IOException {

        Log log = new Log();
        log.escrever(vmsg, "log.txt");
    }
}
