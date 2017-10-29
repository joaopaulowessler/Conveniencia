package net.unesc.vendas.classes;

public class Produto {
    
    private int    proCodigo;    //codigo
    private String proDescricao; //descrição
    private int    proUnidade;   //unidade de medida    
    private float  proPeso;      //preço    
    
    public Produto(){
        
        this.proCodigo    = 0; 
        this.proDescricao = "";
        this.proUnidade   = 0;        
        this.proPeso      = 0;
    }

    public int getProCodigo() {
        return proCodigo;
    }

    public void setProCodigo(int proCodigo) {
        this.proCodigo = proCodigo;
    }

    public String getProDescricao() {
        return proDescricao;
    }

    public void setProDescricao(String proDescricao) {
        this.proDescricao = proDescricao;
    }

    public int getProUnidade() {
        return proUnidade;
    }

    public void setProUnidade(int proUnidade) {
        this.proUnidade = proUnidade;
    }

    public float getProPeso() {
        return proPeso;
    }

    public void setProPeso(float proPeso) {
        this.proPeso = proPeso;
    }
    
    public void cancelarProduto(){
        
        this.proCodigo    = 0; 
        this.proDescricao = "";
        this.proUnidade   = 0;        
        this.proPeso      = 0;
    }
}
