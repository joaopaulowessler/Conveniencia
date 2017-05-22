package Actions;

import Classes.Servicos;
import Exception.ExceptionConveniencia;
import Log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ActionServicos implements ActionListener {

    private final InternalFrames.FrameServico frameServico;

    public ActionServicos(InternalFrames.FrameServico fraSer) {
        this.frameServico = fraSer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            try {
                gerarLog("Novo");
            } catch (IOException ex) {
            }

            frameServico.novoServico();
        }

        if (e.getActionCommand().equals("Salvar")) {

            try {
                gerarLog("Salvar");
            } catch (IOException ex) {
            }

            try {

                Servicos servicos = frameServico.getServicos();

                System.out.println(servicos.getSerCliente());
                System.out.println(servicos.getSerProduto());
                System.out.println(servicos.getSerFuncionario());
                System.out.println(servicos.getSerQuantidade());
                System.out.println(servicos.getSerData());

                frameServico.cancelarServico();

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

            frameServico.cancelarServico();
        }
    }

    public void gerarLog(String vmsg) throws IOException {

        Log log = new Log();
        log.escrever(vmsg, "log.txt");
    }
}
