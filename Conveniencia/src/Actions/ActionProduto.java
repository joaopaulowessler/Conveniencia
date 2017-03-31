package Actions;

import Classes.ClasseProduto;
import Frames.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionProduto implements ActionListener{

    private Menu menu;
    private ClasseProduto prod;
    
    public ActionProduto(Menu menu, ClasseProduto p){
        this.menu = menu;
        this.prod = p;
    }    
    
    public void actionPerformed(ActionEvent e) { 
        if (e.getActionCommand().equals("Novo")){            
            
            menu.novoProduto();
        }
        
        if (e.getActionCommand().equals("Salvar")){
            
            System.out.println(prod.getProdCodigo());
            System.out.println(prod.getProdDataCadastro());
            System.out.println(prod.getProdDesc());
            System.out.println(prod.getProdFronecedor());
            System.out.println(prod.getProdPreco());
            System.out.println(prod.getProdUM());
        }

        if (e.getActionCommand().equals("Excluir")){
        }
        
        if (e.getActionCommand().equals("Cancelar")){
            
            menu.cancelarProduto();
        }        
    } 
}
