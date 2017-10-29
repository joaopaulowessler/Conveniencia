package net.unesc.vendas.classes;

public class Cidade {
    
    private int    cidCodigo;  //Codigo
    private String cidNome;    //Nome    
    private int    cidCodibge; //cod ibge 
    
    public Cidade(){

        this.cidCodigo  = 0;
        this.cidNome    = "";
        this.cidCodibge = 0;
    }    

    public int getCidCodigo() {
        return cidCodigo;
    }

    public void setCidCodigo(int cidCodigo) {
        this.cidCodigo = cidCodigo;
    }

    public String getCidNome() {
        return cidNome;
    }

    public void setCidNome(String cidNome) {
        this.cidNome = cidNome;
    }

    public int getCidCodibge() {
        return cidCodibge;
    }

    public void setCidCodibge(int cidCodibge) {
        this.cidCodibge = cidCodibge;
    }

    public void cancelarCidade(){

        this.cidCodigo  = 0;
        this.cidNome    = "";
        this.cidCodibge = 0;
    }
}
