package net.unesc.vendas.actions;

import net.unesc.vendas.classes.Produto;
import net.unesc.vendas.exception.ExceptionVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.conexao.ProdutoDao;

public class ActionProduto implements ActionListener {

    private final net.unesc.vendas.internalframes.FrameProduto frameProduto;
    
    private ProdutoDao produtoDao = new ProdutoDao();
    
    public ActionProduto(net.unesc.vendas.internalframes.FrameProduto fraPro) {
        this.frameProduto = fraPro;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            
            try {
                gerarLog("Novo");
            } catch (IOException ex) {
            }

            int codigo = produtoDao.getMax();
            frameProduto.setCodigo(codigo + 1);
            frameProduto.novoProduto();
        }

        if (e.getActionCommand().equals("Salvar")) {

            try {
                gerarLog("Salvar");
            } catch (IOException ex) {
            }

            try {
                Produto produto = frameProduto.getProduto();
                Produto pro = ProdutoDao.getProduto(produto.getProCodigo());
                
                if(pro != null)
                    produtoDao.update(produto);
                else 
                    produtoDao.insert(produto);
                                
                frameProduto.cancelarProduto();

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
                Produto produto = frameProduto.getProduto();
                ProdutoDao pro = new ProdutoDao();
                
                if(produto != null)
                    pro.delete(produto);                
                                
                frameProduto.cancelarProduto();

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

            frameProduto.cancelarProduto();
        }
    }

    public void gerarLog(String vmsg) throws IOException {

    }
}
