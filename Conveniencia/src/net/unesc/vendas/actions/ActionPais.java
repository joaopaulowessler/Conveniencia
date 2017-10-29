package net.unesc.vendas.actions;

import net.unesc.vendas.classes.Pais;
import net.unesc.vendas.exception.ExceptionVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.conexao.PaisDao;
import net.unesc.vendas.conexao.PaisDao;

public class ActionPais implements ActionListener {

    private final net.unesc.vendas.internalframes.FramePais framePais;
    
    private PaisDao paisDao = new PaisDao();
    
    public ActionPais(net.unesc.vendas.internalframes.FramePais fraPai) {
        this.framePais = fraPai;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            
            int codigo = paisDao.getMax();
            framePais.setCodigo(codigo + 1);
            framePais.novoPais();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            try {
                Pais pais = framePais.getPais();
                Pais pai = PaisDao.getPais(pais.getPaiCodigo());
                
                if(pai != null)
                    paisDao.update(pais);
                else 
                    paisDao.insert(pais);
                                
                framePais.cancelarPais();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Excluir")) {
            try {
                Pais pais = framePais.getPais();
                PaisDao pro = new PaisDao();
                
                if(pais != null)
                    pro.delete(pais);                
                                
                framePais.cancelarPais();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {
            framePais.cancelarPais();
        }
    }
}
