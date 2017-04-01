package Actions;

import Classes.ClasseFuncionario;
import Frames.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionFuncionario implements ActionListener {

    private ClasseFuncionario       classeFuncionario;
    private Frames.FrameFuncionario frameFuncionario;
    
    public ActionFuncionario(Frames.FrameFuncionario fraFun, ClasseFuncionario claFun) {
        
        this.frameFuncionario = fraFun;
        this.classeFuncionario = claFun;        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Novo")) {
            
            frameFuncionario.novoFuncionario();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            System.out.println(classeFuncionario.getFunCidade());
            System.out.println(classeFuncionario.getFunCodigo());
            System.out.println(classeFuncionario.getFunCpf());
            System.out.println(classeFuncionario.getFunDataAdm());
            System.out.println(classeFuncionario.getFunEndereco());
            System.out.println(classeFuncionario.getFunEstado());
            System.out.println(classeFuncionario.getFunNome());
            System.out.println(classeFuncionario.getFunRg());
            System.out.println(classeFuncionario.getFunSexo());
            System.out.println(classeFuncionario.getFunTelefone());
            System.out.println(classeFuncionario.getcFunEmail());
        }

        if (e.getActionCommand().equals("Excluir")) {
        }

        if (e.getActionCommand().equals("Cancelar")) {
            frameFuncionario.cancelarFuncionario();
        }
    }
}
