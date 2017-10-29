package net.unesc.vendas.actions;

import net.unesc.vendas.classes.Endereco;
import net.unesc.vendas.exception.ExceptionVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.conexao.EnderecoDao;
import net.unesc.vendas.conexao.EnderecoDao;

public class ActionEndereco implements ActionListener {

    private final net.unesc.vendas.internalframes.FrameEndereco frameEndereco;
    
    private EnderecoDao enderecoDao = new EnderecoDao();
    
    public ActionEndereco(net.unesc.vendas.internalframes.FrameEndereco fraEnd) {
        this.frameEndereco = fraEnd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            
            int codigo = enderecoDao.getMax();
            frameEndereco.setCodigo(codigo + 1);
            frameEndereco.novoEndereco();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            try {
                Endereco endereco = frameEndereco.getEndereco();
                Endereco end = EnderecoDao.getEndereco(endereco.getEndCodigo());
                
                if(end != null)
                    enderecoDao.update(endereco);
                else 
                    enderecoDao.insert(endereco);
                                
                frameEndereco.cancelarEndereco();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Excluir")) {
            try {
                Endereco endereco = frameEndereco.getEndereco();
                EnderecoDao end = new EnderecoDao();
                
                if(endereco != null)
                    end.delete(endereco);                
                                
                frameEndereco.cancelarEndereco();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {
            frameEndereco.cancelarEndereco();
        }
    }
}
