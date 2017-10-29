package net.unesc.vendas.classes;

public class Unidade {
    
    private int    uniCodigo;  //Codigo
    private String uniNome;    //Nome
    private int    endCodigo;  //Endereço
    private int    empCodigo; //Empresa    
    
    public Unidade(){
        
        this.uniCodigo    = 0; 
        this.uniNome      = "";
        this.empCodigo   = 0;
        this.endCodigo    = 0;
    }

    public int getUniCodigo() {
        return uniCodigo;
    }

    public void setUniCodigo(int uniCodigo) {
        this.uniCodigo = uniCodigo;
    }

    public String getUniNome() {
        return uniNome;
    }

    public void setUniNome(String uniNome) {
        this.uniNome = uniNome;
    }

    public int getEndCodigo() {
        return endCodigo;
    }

    public void setEndCodigo(int endCodigo) {
        this.endCodigo = endCodigo;
    }

    public int getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(int empEmpresa) {
        this.empCodigo = empEmpresa;
    }
    
    public void cancelarUnidade(){
        
        this.uniCodigo    = 0; 
        this.uniNome      = "";
        this.empCodigo   = 0;
        this.endCodigo    = 0;        
    }
}
