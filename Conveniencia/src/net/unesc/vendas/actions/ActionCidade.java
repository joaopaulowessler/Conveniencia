package net.unesc.vendas.actions;

import net.unesc.vendas.classes.Cidade;
import net.unesc.vendas.exception.ExceptionVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.conexao.CidadeDao;
import net.unesc.vendas.conexao.CidadeDao;

public class ActionCidade implements ActionListener {

    private final net.unesc.vendas.internalframes.FrameCidade frameCidade;
    
    private CidadeDao cidadeDao = new CidadeDao();
    
    public ActionCidade(net.unesc.vendas.internalframes.FrameCidade fraEst) {
        this.frameCidade = fraEst;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            
            int codigo = cidadeDao.getMax();
            frameCidade.setCodigo(codigo + 1);
            frameCidade.novoCidade();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            try {
                Cidade cidade = frameCidade.getCidade();
                Cidade cid = CidadeDao.getCidade(cidade.getCidCodigo());
                
                if(cid != null)
                    cidadeDao.update(cidade);
                else 
                    cidadeDao.insert(cidade);
                                
                frameCidade.cancelarCidade();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Excluir")) {
            try {
                Cidade pais = frameCidade.getCidade();
                CidadeDao pro = new CidadeDao();
                
                if(pais != null)
                    pro.delete(pais);                
                                
                frameCidade.cancelarCidade();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {
            frameCidade.cancelarCidade();
        }
    }
}
