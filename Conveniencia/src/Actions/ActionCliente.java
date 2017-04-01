package Actions;

import Classes.ClasseCliente;
import Frames.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionCliente implements ActionListener {

    private InternalFrames.FrameCliente frameCliente;
    private ClasseCliente classeCliente;

    public ActionCliente(InternalFrames.FrameCliente fraCli, ClasseCliente claCli) {
        this.frameCliente  = fraCli;
        this.classeCliente = claCli;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Novo")) {
            
            frameCliente.novoCliente();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            System.out.println(classeCliente.getCliCodigo());
            System.out.println(classeCliente.getCliCidade());
            System.out.println(classeCliente.getCliCpf());
            System.out.println(classeCliente.getCliEndereco());
            System.out.println(classeCliente.getCliEstado());
            System.out.println(classeCliente.getCliNome());
            System.out.println(classeCliente.getCliRg());
            System.out.println(classeCliente.getCliSexo());
            System.out.println(classeCliente.getCliTelefone());
            System.out.println(classeCliente.getcCliEmail());
        }

        if (e.getActionCommand().equals("Excluir")) {
        }

        if (e.getActionCommand().equals("Cancelar")) {
            frameCliente.cancelarCliente();
            classeCliente.cancelarCliente();
        }
    }
}
