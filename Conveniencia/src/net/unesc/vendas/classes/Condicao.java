package net.unesc.vendas.classes;

public class Condicao {
    
    private int    conCodigo; //Codigo
    private String conNome;   //Nome    
    
    public Condicao(){
        
        this.conCodigo    = 0; 
        this.conNome      = "";        
    }

    public int getConCodigo() {
        return conCodigo;
    }

    public void setConCodigo(int conCodigo) {
        this.conCodigo = conCodigo;
    }

    public String getConNome() {
        return conNome;
    }

    public void setConNome(String conNome) {
        this.conNome = conNome;
    }

    public void cancelarCondicao(){
        
        this.conCodigo  = 0; 
        this.conNome    = "";        
    }
}
