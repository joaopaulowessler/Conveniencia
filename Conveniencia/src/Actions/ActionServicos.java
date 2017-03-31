package Actions;

import Classes.ClasseServicos;
import Frames.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionServicos implements ActionListener{

    private Menu menu;
    private ClasseServicos serv;
    
    public ActionServicos(Menu menu, ClasseServicos s){
        this.menu = menu;
        this.serv = s;
    }    
    
    public void actionPerformed(ActionEvent e) { 
        if (e.getActionCommand().equals("Novo")){            
            
            menu.novoServico();
        }
        
        if (e.getActionCommand().equals("Salvar")){
                  
            System.out.println(serv.getServCliente());
            System.out.println(serv.getServData());
            System.out.println(serv.getServFuncionario());
            System.out.println(serv.getServProduto());
            System.out.println(serv.getServQuantidade());
        }

        if (e.getActionCommand().equals("Excluir")){
        }
        
        if (e.getActionCommand().equals("Cancelar")){
            
            menu.cancelarServico();
        }        
    } 
}
