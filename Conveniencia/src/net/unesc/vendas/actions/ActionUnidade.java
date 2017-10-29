package net.unesc.vendas.actions;

import net.unesc.vendas.classes.Unidade;
import net.unesc.vendas.exception.ExceptionVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.conexao.UnidadeDao;

public class ActionUnidade implements ActionListener {

    private final net.unesc.vendas.internalframes.FrameUnidade frameUnidade;
    
    private UnidadeDao unidadeDao = new UnidadeDao();
    
    public ActionUnidade(net.unesc.vendas.internalframes.FrameUnidade fraMed) {
        this.frameUnidade = fraMed;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            
            int codigo = unidadeDao.getMax();
            frameUnidade.setCodigo(codigo + 1);
            frameUnidade.novoUnidade();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            try {
                Unidade unidade = frameUnidade.getUnidade();
                Unidade uni = UnidadeDao.getUnidade(unidade.getUniCodigo());
                
                if(uni != null)
                    unidadeDao.update(unidade);
                else 
                    unidadeDao.insert(unidade);
                                
                frameUnidade.cancelarUnidade();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Excluir")) {
            try {
                Unidade unidade = frameUnidade.getUnidade();
                UnidadeDao uni = new UnidadeDao();
                
                if(unidade != null)
                    uni.delete(unidade);                
                                
                frameUnidade.cancelarUnidade();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {
            frameUnidade.cancelarUnidade();
        }
    }
}
