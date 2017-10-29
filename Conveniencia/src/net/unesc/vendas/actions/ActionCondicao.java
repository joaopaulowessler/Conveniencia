package net.unesc.vendas.actions;

import net.unesc.vendas.classes.Condicao;
import net.unesc.vendas.exception.ExceptionVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.conexao.CondicaoDao;
import net.unesc.vendas.conexao.CondicaoDao;

public class ActionCondicao implements ActionListener {

    private final net.unesc.vendas.internalframes.FrameCondicao frameCondicao;
    
    private CondicaoDao condicaoDao = new CondicaoDao();
    
    public ActionCondicao(net.unesc.vendas.internalframes.FrameCondicao fraPai) {
        this.frameCondicao = fraPai;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            
            int codigo = condicaoDao.getMax();
            frameCondicao.setCodigo(codigo + 1);
            frameCondicao.novoCondicao();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            try {
                Condicao condicao = frameCondicao.getCondicao();
                Condicao con = CondicaoDao.getCondicao(condicao.getConCodigo());
                
                if(con != null)
                    condicaoDao.update(condicao);
                else 
                    condicaoDao.insert(condicao);
                                
                frameCondicao.cancelarCondicao();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Excluir")) {
            try {
                Condicao condicao = frameCondicao.getCondicao();
                CondicaoDao con = new CondicaoDao();
                
                if(condicao != null)
                    con.delete(condicao);                
                                
                frameCondicao.cancelarCondicao();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {
            frameCondicao.cancelarCondicao();
        }
    }
}
