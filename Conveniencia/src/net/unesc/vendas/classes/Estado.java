package net.unesc.vendas.classes;

public class Estado {
    
    private int    estCodigo; //Codigo
    private String estNome;   //Nome    
    private String estSigla;  //Sigla 
    
    public Estado(){

        this.estCodigo    = 0;
        this.estNome      = "";
        this.estSigla     = "";
    }

    public int getEstCodigo() {
        return estCodigo;
    }

    public void setEstCodigo(int estCodigo) {
        this.estCodigo = estCodigo;
    }

    public String getEstNome() {
        return estNome;
    }

    public void setEstNome(String estNome) {
        this.estNome = estNome;
    }

    public String getEstSigla() {
        return estSigla;
    }

    public void setEstSigla(String estSigla) {
        this.estSigla = estSigla;
    }

    public void cancelarEstado(){

        this.estCodigo  = 0;
        this.estNome    = "";
        this.estSigla   = "";
    }
}
