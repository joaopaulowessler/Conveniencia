package net.unesc.conveniencia.actions;

import net.unesc.conveniencia.classes.Vendas;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.conveniencia.classes.Produto;
import net.unesc.conveniencia.conexao.ProdutoDao;
import net.unesc.conveniencia.conexao.VendasDao;

public class ActionVendas implements ActionListener {

    private final net.unesc.conveniencia.internalframes.FrameVendas frameVendas;
    
    VendasDao vendasDao = new VendasDao();
    
    public ActionVendas(net.unesc.conveniencia.internalframes.FrameVendas fraVen) {
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

            } catch (ExceptionConveniencia ex) {
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

            } catch (ExceptionConveniencia ex) {
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

        Log log = new Log();
        log.escrever(vmsg, "log.txt");
    }
}
