package net.unesc.vendas.classes;

public class Pais {
    
    private int    paiCodigo; //Codigo
    private String paiNome;   //Nome    
    
    public Pais(){
        
        this.paiCodigo    = 0; 
        this.paiNome      = "";        
    }

    public int getPaiCodigo() {
        return paiCodigo;
    }

    public void setPaiCodigo(int paiCodigo) {
        this.paiCodigo = paiCodigo;
    }

    public String getPaiNome() {
        return paiNome;
    }

    public void setPaiNome(String paiNome) {
        this.paiNome = paiNome;
    }
        
    public void cancelarPais(){
        
        this.paiCodigo  = 0; 
        this.paiNome    = "";        
    }
}
