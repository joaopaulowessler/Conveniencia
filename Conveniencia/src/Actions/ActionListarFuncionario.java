package Actions;

import Classes.Funcionario;
import Exception.ExceptionConveniencia;
import Log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ActionListarFuncionario implements ActionListener {

    private final InternalFrames.FrameListarFuncionário framListFunci;

    public ActionListarFuncionario(InternalFrames.FrameListarFuncionário fraFun) {
        this.framListFunci = fraFun;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            Funcionario funcinario = framListFunci.getFuncionario();

            System.out.println(funcinario.getFunCodigo());
            System.out.println(funcinario.getFunNome());
            System.out.println(funcinario.getFunCpf());
            System.out.println(funcinario.getFunRg());

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
