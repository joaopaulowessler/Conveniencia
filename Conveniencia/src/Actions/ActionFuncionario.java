package Actions;

import Classes.Funcionario;
import Exception.ExceptionConveniencia;
import Log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ActionFuncionario implements ActionListener {

    private final InternalFrames.FrameFuncionario frameFuncionario;

    public ActionFuncionario(InternalFrames.FrameFuncionario fraFun) {

        this.frameFuncionario = fraFun;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            try {
                gerarLog("Novo");
            } catch (IOException ex) {
            }

            frameFuncionario.novoFuncionario();
        }

        if (e.getActionCommand().equals("Salvar")) {

            try {
                gerarLog("Salvar");
            } catch (IOException ex) {
            }

            try {
                Funcionario funcionario = frameFuncionario.getFuncionario();

                System.out.println(funcionario.getFunCodigo());
                System.out.println(funcionario.getFunNome());
                System.out.println(funcionario.getFunCpf());
                System.out.println(funcionario.getFunRg());
                System.out.println(funcionario.getFunSexo());
                System.out.println(funcionario.getFunTelefone());
                System.out.println(funcionario.getcFunEmail());
                System.out.println(funcionario.getFunCidade());
                System.out.println(funcionario.getFunEstado());
                System.out.println(funcionario.getFunEndereco());
                System.out.println(funcionario.getFunDataAdm());

                frameFuncionario.cancelarFuncionario();
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

            frameFuncionario.cancelarFuncionario();
        }
    }

    public void gerarLog(String vmsg) throws IOException {

        Log log = new Log();
        log.escrever(vmsg, "log.txt");
    }
}
