package Actions;

import Classes.ClasseProduto;
import Frames.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionProduto implements ActionListener{

    private InternalFrames.FrameProduto frameProduto;
    private ClasseProduto       classeProduto;
    
    public ActionProduto(InternalFrames.FrameProduto fraPro, ClasseProduto claPro){
        this.frameProduto  = fraPro;
        this.classeProduto = claPro;
    }    
    
    public void actionPerformed(ActionEvent e) { 
        if (e.getActionCommand().equals("Novo")){            
            
            frameProduto.novoProduto();
        }
        
        if (e.getActionCommand().equals("Salvar")){
            
            System.out.println(classeProduto.getProdCodigo());
            System.out.println(classeProduto.getProdDataCadastro());
            System.out.println(classeProduto.getProdDesc());
            System.out.println(classeProduto.getProdFronecedor());
            System.out.println(classeProduto.getProdPreco());
            System.out.println(classeProduto.getProdUM());
        }

        if (e.getActionCommand().equals("Excluir")){
        }
        
        if (e.getActionCommand().equals("Cancelar")){
            
            frameProduto.cancelarProduto();
        }        
    } 
}
