package Actions;

import Classes.ClasseCliente;
import Frames.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionCliente implements ActionListener {

    private Menu menu;
    private ClasseCliente cla;

    public ActionCliente(Menu menu, ClasseCliente c) {
        this.menu = menu;
        this.cla = c;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Novo")) {
            
            menu.novoCliente();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            System.out.println(cla.getCliCodigo());
            System.out.println(cla.getCliCidade());
            System.out.println(cla.getCliCpf());
            System.out.println(cla.getCliEndereco());
            System.out.println(cla.getCliEstado());
            System.out.println(cla.getCliNome());
            System.out.println(cla.getCliPlaca());
            System.out.println(cla.getCliRg());
            System.out.println(cla.getCliSexo());
            System.out.println(cla.getCliTelefone());
            System.out.println(cla.getcCliEmail());
        }

        if (e.getActionCommand().equals("Excluir")) {
        }

        if (e.getActionCommand().equals("Cancelar")) {
           menu.cancelarCliente();
        }
    }
}
