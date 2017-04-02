package Actions;

import Classes.ClasseServicos;
import Frames.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionServicos implements ActionListener{

    private InternalFrames.FrameServico frameServico;
    private ClasseServicos classeServico;
    
    public ActionServicos(InternalFrames.FrameServico fraSer, ClasseServicos claSer){
        this.frameServico  = fraSer;
        this.classeServico = claSer;
    }    
    
    public void actionPerformed(ActionEvent e) { 
        if (e.getActionCommand().equals("Novo")){            
            
            frameServico.novoServico();
        }
        
        if (e.getActionCommand().equals("Salvar")){
                  
            System.out.println(classeServico.getSerCliente());
            System.out.println(classeServico.getSerData());
            System.out.println(classeServico.getSerFuncionario());
            System.out.println(classeServico.getSerProduto());
            System.out.println(classeServico.getSerQuantidade());
        }

        if (e.getActionCommand().equals("Excluir")){
        }
        
        if (e.getActionCommand().equals("Cancelar")){
            
            frameServico.cancelarServico();
        }        
    } 
}
