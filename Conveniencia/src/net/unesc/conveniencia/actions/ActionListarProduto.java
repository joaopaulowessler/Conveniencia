package net.unesc.conveniencia.actions;

import net.unesc.conveniencia.classes.Produto;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ActionListarProduto implements ActionListener {

    private final net.unesc.conveniencia.internalframes.FrameListarProduto framListProd;

    public ActionListarProduto(net.unesc.conveniencia.internalframes.FrameListarProduto framProd) {
        this.framListProd = framProd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            Produto produto = framListProd.getProduto();

            System.out.println(produto.getProCodigo());
            System.out.println(produto.getProDesc());

        } catch (ExceptionConveniencia ex) {

            try {
                gerarLog("Exception: " + ex.getMessage());
            } catch (IOException exi) {
            }

            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void gerarLog(String vmsg) throws IOException {

        Log log = new Log();
        log.escrever(vmsg, "log.txt");
    }
}
