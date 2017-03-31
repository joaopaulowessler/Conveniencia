package Actions;

import Frames.Login;
import Frames.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionLogin implements ActionListener{

    private Login log;
    
    public ActionLogin(Login log){
        this.log = log;
    }    
    
    public void actionPerformed(ActionEvent e) {        
        if (e.getActionCommand().equals("Entrar")){            
            /*if (!log.getUsuario().equals("admin")){
                JOptionPane.showMessageDialog(null,"Usuário não cadastrado.");
                return;
            }
            
            if (!log.getSenha().equals("admin")){
                JOptionPane.showMessageDialog(null,"Senha inválida.");
                return;
            }*/                
            
            Menu menu = new Menu();
            menu.setVisible(true);
            log.hide();
        }
        
        if (e.getActionCommand().equals("Cancelar")){            
            System.exit(0);
        }        
    } 
}
