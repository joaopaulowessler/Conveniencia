package Actions;

import Classes.ClasseFuncionario;
import Frames.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionFuncionario implements ActionListener {

    private Menu menu;
    private ClasseFuncionario fun;

    public ActionFuncionario(Menu menu, ClasseFuncionario f) {
        this.menu = menu;
        this.fun = f;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Novo")) {
            
            menu.novoFuncionario();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            System.out.println(fun.getFunCidade());
            System.out.println(fun.getFunCodigo());
            System.out.println(fun.getFunCpf());
            System.out.println(fun.getFunDataAdm());
            System.out.println(fun.getFunEndereco());
            System.out.println(fun.getFunEstado());
            System.out.println(fun.getFunNome());
            System.out.println(fun.getFunRg());
            System.out.println(fun.getFunSexo());
            System.out.println(fun.getFunTelefone());
            System.out.println(fun.getcFunEmail());
        }

        if (e.getActionCommand().equals("Excluir")) {
        }

        if (e.getActionCommand().equals("Cancelar")) {
            menu.cancelarFuncionario();
        }
    }
}
