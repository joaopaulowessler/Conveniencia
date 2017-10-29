package net.unesc.vendas.classes;

public class Bairro {
    
    private int    baiCodigo;  //Codigo
    private String baiNome;    //Nome
    
    public Bairro(){

        this.baiCodigo  = 0;
        this.baiNome    = "";        
    }
    
    public int getBaiCodigo() {
        return baiCodigo;
    }

    public void setBaiCodigo(int baiCodigo) {
        this.baiCodigo = baiCodigo;
    }

    public String getBaiNome() {
        return baiNome;
    }

    public void setBaiNome(String baiNome) {
        this.baiNome = baiNome;
    }
    
    public void cancelarBairro(){

        this.baiCodigo  = 0;
        this.baiNome    = "";
    }
}
