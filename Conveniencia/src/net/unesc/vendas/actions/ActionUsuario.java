package net.unesc.vendas.actions;

import net.unesc.vendas.classes.Usuario;
import net.unesc.vendas.exception.ExceptionVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.conexao.UsuarioDao;

public class ActionUsuario implements ActionListener {

    private final net.unesc.vendas.internalframes.FrameUsuario frameUsuario;
    
    private UsuarioDao usuarioDao = new UsuarioDao();
    
    public ActionUsuario(net.unesc.vendas.internalframes.FrameUsuario fraPro) {
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

            } catch (ExceptionVendas ex) {
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

            } catch (ExceptionVendas ex) {
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

    }
}
