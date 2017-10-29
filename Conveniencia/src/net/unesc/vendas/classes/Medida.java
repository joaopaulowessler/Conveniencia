package net.unesc.vendas.classes;

public class Medida {
    
    private int    medCodigo; //Codigo
    private String medNome;   //Nome    
    
    public Medida(){
        
        this.medCodigo    = 0; 
        this.medNome      = "";        
    }

    public int getMedCodigo() {
        return medCodigo;
    }

    public void setMedCodigo(int medCodigo) {
        this.medCodigo = medCodigo;
    }

    public String getMedNome() {
        return medNome;
    }

    public void setMedNome(String medNome) {
        this.medNome = medNome;
    }    
    
    public void cancelarMedida(){
        
        this.medCodigo  = 0; 
        this.medNome    = "";        
    }
}
