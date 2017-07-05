package net.unesc.conveniencia.classes;

public class Usuario {
    
    private int    usuCodigo;    //Codigo
    private String usuNome;      //Nome
    private String usuUsuario;   //Usuario
    private String usuSenha;     //Senha
    
    public Usuario(){
        
        this.usuCodigo    = 0; 
        this.usuNome      = "";
        this.usuUsuario   = "";
        this.usuSenha     = "";
    }
    
    public void setUsuCodigo(int usuCodigo){
        this.usuCodigo = usuCodigo;
    }
    
    public int getUsuCodigo(){        
        return this.usuCodigo;
    }
    
    public void setUsuNome(String usuNome){
        this.usuNome = usuNome;
    }
            
    public String getUsuNome(){
        return this.usuNome;
    }
    
    public void setUsuUsuario(String usuUsuario){
        this.usuUsuario = usuUsuario;
    }
    
    public String getUsuUsuario(){
        return this.usuUsuario;
    }
    
    public void setUsuSenha(String usuSenha){
        this.usuSenha = usuSenha;
    }
            
    public String getUsuSenha(){
        return this.usuSenha;
    }
    
    public void cancelarUsuario(){
        
        this.usuCodigo  = 0; 
        this.usuNome    = "";
        this.usuUsuario = "";
        this.usuSenha   = "";
    }
}
