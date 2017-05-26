package net.unesc.conveniencia.actions;

import net.unesc.conveniencia.classes.Cliente;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ActionCliente implements ActionListener {

    private final net.unesc.conveniencia.internalframes.FrameCliente frameCliente;

    public ActionCliente(net.unesc.conveniencia.internalframes.FrameCliente fraCli) {
        this.frameCliente = fraCli;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {

            try {
                gerarLog("Novo");
            } catch (IOException ex) {
            }

            frameCliente.novoCliente();
        }

        if (e.getActionCommand().equals("Salvar")) {

            try {
                gerarLog("Salvar");
            } catch (IOException ex) {
            }

            try {
                Cliente cliente = frameCliente.getCliente();

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

                frameCliente.cancelarCliente();

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

            frameCliente.cancelarCliente();
        }
    }

    public void gerarLog(String vmsg) throws IOException {

        Log log = new Log();
        log.escrever(vmsg, "log.txt");
    }
}
