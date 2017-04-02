package Classes;

public class ClasseProduto {
    
    private int    proCodigo;    //codigo
    private String proDescricao; //descrição
    private String proUnidade;   //unidade de medida
    private String proForne;     //fornecedor
    private float  proPreco;     //preço
    private String proDataCad;   //data de cadastramento/cadastro
    
    public ClasseProduto(){
        
        this.proCodigo    = 0; 
        this.proDescricao = "";
        this.proUnidade   = "";
        this.proForne     = "";
        this.proPreco     = 0; 
        this.proDataCad   = "";
    }
    
    public void setProCodigo(int prodCodigo){
        this.proCodigo = prodCodigo;
    }
    
    public int getProCodigo(){        
        return this.proCodigo;
    }
    
    public void setProDesc(String prodDescricao){
        this.proDescricao = prodDescricao;
    }
            
    public String getProDesc(){
        return this.proDescricao;
    }
    
    public void setProUnidade(String prodUM){
        this.proUnidade = prodUM;
    }
    
    public String getProUnidade(){
        return this.proUnidade;
    }
    
    public void setProFornecedor(String prodForne){
        this.proForne = prodForne;
    }
            
    public String getProFronecedor(){
        return this.proForne;
    }
    
    public void setProPreco(float prodPreco){
        this.proPreco = prodPreco;
    }
    
    public float getProPreco(){
        return this.proPreco;
    }
    
    public void setProDataCadatro(String prodDataCad){
        this.proDataCad = prodDataCad;
    }
    
    public String getProDataCadastro(){
        return this.proDataCad;
    }
    
    public void cancelarProduto(){
        
        this.proCodigo    = 0; 
        this.proDescricao = "";
        this.proUnidade   = "";
        this.proForne     = "";
        this.proPreco     = 0; 
        this.proDataCad   = "";
    }
}
