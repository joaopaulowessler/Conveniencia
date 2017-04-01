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
                  
            System.out.println(classeServico.getServCliente());
            System.out.println(classeServico.getServData());
            System.out.println(classeServico.getServFuncionario());
            System.out.println(classeServico.getServProduto());
            System.out.println(classeServico.getServQuantidade());
        }

        if (e.getActionCommand().equals("Excluir")){
        }
        
        if (e.getActionCommand().equals("Cancelar")){
            
            frameServico.cancelarServico();
        }        
    } 
}
