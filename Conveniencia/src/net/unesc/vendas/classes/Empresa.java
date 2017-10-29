package net.unesc.vendas.classes;

public class Empresa {
    
    private int    empCodigo; //Codigo
    private String empNome;   //Nome    
    
    public Empresa(){
        
        this.empCodigo    = 0; 
        this.empNome      = "";        
    }

    public int getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(int empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getEmpNome() {
        return empNome;
    }

    public void setEmpNome(String empNome) {
        this.empNome = empNome;
    }

    public void cancelarEmpresa(){
        
        this.empCodigo  = 0; 
        this.empNome    = "";        
    }
}
