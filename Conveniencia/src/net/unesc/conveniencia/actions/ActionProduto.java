package net.unesc.conveniencia.actions;

import net.unesc.conveniencia.classes.Produto;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ActionProduto implements ActionListener {

    private final net.unesc.conveniencia.internalframes.FrameProduto frameProduto;

    public ActionProduto(net.unesc.conveniencia.internalframes.FrameProduto fraPro) {
        this.frameProduto = fraPro;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            try {
                gerarLog("Novo");
            } catch (IOException ex) {
            }

            frameProduto.novoProduto();
        }

        if (e.getActionCommand().equals("Salvar")) {

            try {
                gerarLog("Salvar");
            } catch (IOException ex) {
            }

            try {
                Produto produto = frameProduto.getProduto();

                System.out.println(produto.getProCodigo());
                System.out.println(produto.getProDesc());
                System.out.println(produto.getProUnidade());
                System.out.println(produto.getProFronecedor());
                System.out.println(produto.getProPreco());
                System.out.println(produto.getProDataCadastro());

                frameProduto.cancelarProduto();

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

        Log log = new Log();
        log.escrever(vmsg, "log.txt");
    }
}
