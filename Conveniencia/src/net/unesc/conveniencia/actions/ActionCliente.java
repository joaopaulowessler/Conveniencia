package net.unesc.conveniencia.actions;

import net.unesc.conveniencia.classes.Cliente;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.conveniencia.conexao.ClienteDao;

public class ActionCliente implements ActionListener {

    private final net.unesc.conveniencia.internalframes.FrameCliente frameCliente;
    
    private ClienteDao clienteDao = new ClienteDao();
    
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
            
            int codigo = clienteDao.getMax();
            frameCliente.setCodigo(codigo + 1);
            frameCliente.novoCliente();
        }

        if (e.getActionCommand().equals("Salvar")) {

            try {
                gerarLog("Salvar");
            } catch (IOException ex) {
            }

            try {
                Cliente cliente = frameCliente.getCliente();
                Cliente cli = clienteDao.getCliente(cliente.getCliCodigo());
                
                if(cli != null)
                    clienteDao.update(cliente);
                else 
                    clienteDao.insert(cliente);
                                
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
            
            try {
                Cliente cliente = frameCliente.getCliente();
                ClienteDao cli = new ClienteDao();
                
                if(cliente != null)
                    clienteDao.delete(cliente);                
                                
                frameCliente.cancelarCliente();

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

            frameCliente.cancelarCliente();
        }
    }

    public void gerarLog(String vmsg) throws IOException {

        Log log = new Log();
        log.escrever(vmsg, "log.txt");
    }
}
