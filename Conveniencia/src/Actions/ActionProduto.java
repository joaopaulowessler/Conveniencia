package Actions;

import Classes.ClasseProduto;
import Frames.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionProduto implements ActionListener{

    private InternalFrames.FrameProduto frameProduto;
    private ClasseProduto               classeProduto;
    
    public ActionProduto(InternalFrames.FrameProduto fraPro, ClasseProduto claPro){
        this.frameProduto  = fraPro;
        this.classeProduto = claPro;
    }    
    
    public void actionPerformed(ActionEvent e) { 
        if (e.getActionCommand().equals("Novo")){            
            
            frameProduto.novoProduto();
        }
        
        if (e.getActionCommand().equals("Salvar")){
            
            System.out.println(classeProduto.getProCodigo());
            System.out.println(classeProduto.getProDataCadastro());
            System.out.println(classeProduto.getProDesc());
            System.out.println(classeProduto.getProFronecedor());
            System.out.println(classeProduto.getProPreco());
            System.out.println(classeProduto.getProUnidade());
        }

        if (e.getActionCommand().equals("Excluir")){
        }
        
        if (e.getActionCommand().equals("Cancelar")){
            
            frameProduto.cancelarProduto();
        }        
    } 
}
