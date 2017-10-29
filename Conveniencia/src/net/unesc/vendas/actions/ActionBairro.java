package net.unesc.vendas.actions;

import net.unesc.vendas.classes.Bairro;
import net.unesc.vendas.exception.ExceptionVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.conexao.BairroDao;
import net.unesc.vendas.conexao.BairroDao;

public class ActionBairro implements ActionListener {

    private final net.unesc.vendas.internalframes.FrameBairro frameBairro;
    
    private BairroDao bairroDao = new BairroDao();
    
    public ActionBairro(net.unesc.vendas.internalframes.FrameBairro fraEst) {
        this.frameBairro = fraEst;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            
            int codigo = bairroDao.getMax();
            frameBairro.setCodigo(codigo + 1);
            frameBairro.novoBairro();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            try {
                Bairro bairro = frameBairro.getBairro();
                Bairro bai = BairroDao.getBairro(bairro.getBaiCodigo());
                
                if(bai != null)
                    bairroDao.update(bairro);
                else 
                    bairroDao.insert(bairro);
                                
                frameBairro.cancelarBairro();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Excluir")) {
            try {
                Bairro pais = frameBairro.getBairro();
                BairroDao pro = new BairroDao();
                
                if(pais != null)
                    pro.delete(pais);                
                                
                frameBairro.cancelarBairro();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {
            frameBairro.cancelarBairro();
        }
    }
}
