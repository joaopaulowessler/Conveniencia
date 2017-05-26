package net.unesc.conveniencia.actions;

import net.unesc.conveniencia.classes.Vendas;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ActionListarVendas implements ActionListener {

    private final net.unesc.conveniencia.internalframes.FrameListarVendas framListVendas;

    public ActionListarVendas(net.unesc.conveniencia.internalframes.FrameListarVendas framVend) {
        this.framListVendas = framVend;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            Vendas vendas = framListVendas.getVendas();

            System.out.println(vendas.getVenCliente());
            System.out.println(vendas.getVenProduto());
            System.out.println(vendas.getVenFuncionario());
            System.out.println(vendas.getVenQuantidade());
            System.out.println(vendas.getVenData());

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
