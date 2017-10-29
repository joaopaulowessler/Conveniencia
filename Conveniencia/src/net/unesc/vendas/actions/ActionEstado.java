package net.unesc.vendas.actions;

import net.unesc.vendas.classes.Estado;
import net.unesc.vendas.exception.ExceptionVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.conexao.EstadoDao;
import net.unesc.vendas.conexao.EstadoDao;

public class ActionEstado implements ActionListener {

    private final net.unesc.vendas.internalframes.FrameEstado frameEstado;
    
    private EstadoDao estadoDao = new EstadoDao();
    
    public ActionEstado(net.unesc.vendas.internalframes.FrameEstado fraEst) {
        this.frameEstado = fraEst;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            
            int codigo = estadoDao.getMax();
            frameEstado.setCodigo(codigo + 1);
            frameEstado.novoEstado();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            try {
                Estado estado = frameEstado.getEstado();
                Estado est = EstadoDao.getEstado(estado.getEstCodigo());
                
                if(est != null)
                    estadoDao.update(estado);
                else 
                    estadoDao.insert(estado);
                                
                frameEstado.cancelarEstado();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Excluir")) {
            try {
                Estado pais = frameEstado.getEstado();
                EstadoDao pro = new EstadoDao();
                
                if(pais != null)
                    pro.delete(pais);                
                                
                frameEstado.cancelarEstado();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {
            frameEstado.cancelarEstado();
        }
    }
}
