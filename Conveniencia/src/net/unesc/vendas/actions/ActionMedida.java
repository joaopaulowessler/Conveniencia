package net.unesc.vendas.actions;

import net.unesc.vendas.classes.Medida;
import net.unesc.vendas.exception.ExceptionVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.conexao.MedidaDao;
import net.unesc.vendas.conexao.MedidaDao;

public class ActionMedida implements ActionListener {

    private final net.unesc.vendas.internalframes.FrameMedida frameMedida;
    
    private MedidaDao condicaoDao = new MedidaDao();
    
    public ActionMedida(net.unesc.vendas.internalframes.FrameMedida fraMed) {
        this.frameMedida = fraMed;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            
            int codigo = condicaoDao.getMax();
            frameMedida.setCodigo(codigo + 1);
            frameMedida.novoMedida();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            try {
                Medida condicao = frameMedida.getMedida();
                Medida con = MedidaDao.getMedida(condicao.getMedCodigo());
                
                if(con != null)
                    condicaoDao.update(condicao);
                else 
                    condicaoDao.insert(condicao);
                                
                frameMedida.cancelarMedida();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Excluir")) {
            try {
                Medida condicao = frameMedida.getMedida();
                MedidaDao con = new MedidaDao();
                
                if(condicao != null)
                    con.delete(condicao);                
                                
                frameMedida.cancelarMedida();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {
            frameMedida.cancelarMedida();
        }
    }
}
