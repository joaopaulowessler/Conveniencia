package net.unesc.vendas.actions;

import net.unesc.vendas.classes.Vendas;
import net.unesc.vendas.exception.ExceptionVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.classes.Produto;
import net.unesc.vendas.conexao.ProdutoDao;
import net.unesc.vendas.conexao.VendasDao;

public class ActionVendas implements ActionListener {

    private final net.unesc.vendas.internalframes.FrameVendas frameVendas;
    
    VendasDao vendasDao = new VendasDao();
    
    public ActionVendas(net.unesc.vendas.internalframes.FrameVendas fraVen) {
        this.frameVendas = fraVen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            try {
                gerarLog("Novo");
            } catch (IOException ex) {
            }
            
            int codigo = vendasDao.getMax();
            frameVendas.setCodigo(codigo + 1);
            frameVendas.novoVendas();
        }

        if (e.getActionCommand().equals("Salvar")) {

            try {
                gerarLog("Salvar");
            } catch (IOException ex) {
            }

            try {
                Vendas venda = frameVendas.getVendas();
                Vendas ven = vendasDao.getVendas(venda.getVenCodigo());
                
                if(ven != null)
                    vendasDao.update(venda);
                else 
                    vendasDao.insert(venda);
                                
                frameVendas.cancelarVendas();

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
                Vendas venda = frameVendas.getVendas();
                VendasDao ven = new VendasDao();
                
                if(venda != null)
                    ven.delete(venda);                
                                
                frameVendas.cancelarVendas();

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

            frameVendas.cancelarVendas();
        }
    }

    public void gerarLog(String vmsg) throws IOException {

    }
}
