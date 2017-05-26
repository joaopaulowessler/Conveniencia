package net.unesc.conveniencia.actions;

import net.unesc.conveniencia.classes.Cliente;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ActionListarCliente implements ActionListener {

    private final net.unesc.conveniencia.internalframes.FrameListarCliente frameListCliente;

    public ActionListarCliente(net.unesc.conveniencia.internalframes.FrameListarCliente fraCli) {
        this.frameListCliente = fraCli;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            Cliente cliente = frameListCliente.getCliente();

            System.out.println(cliente.getCliCodigo());
            System.out.println(cliente.getCliNome());
            System.out.println(cliente.getCliCpf());
            System.out.println(cliente.getCliRg());
            System.out.println(cliente.getCliSexo());
            System.out.println(cliente.getCliTelefone());
            System.out.println(cliente.getcCliEmail());
            System.out.println(cliente.getCliCidade());
            System.out.println(cliente.getCliEstado());
            System.out.println(cliente.getCliEndereco());

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
