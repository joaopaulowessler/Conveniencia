package Classes;

public class ClasseProduto {
    
    private int    prodCodigo;      //codigo
    private String prodDescricao;   //descrição
    private int    prodUM;          //unidade de medida
    private String prodForne;       //fornecedor
    private int    prodPreco;       //preço
    private int    prodDataCad;     //data de cadastramento/cadastro
    
    public void setProdCodigo(int prodCodigo){
        this.prodCodigo = prodCodigo;
    }
    
    public int getProdCodigo(){        
        return this.prodCodigo;
    }
    
    public void setProdDesc(String prodDescricao){
        this.prodDescricao = prodDescricao;
    }
            
    public String getProdDesc(){
        return this.prodDescricao;
    }
    
    public void setProdUM(int prodUM){
        this.prodUM = prodUM;
    }
    
    public int getProdUM(){
        return this.prodUM;
    }
    
    public void setProdFornecedor(String prodForne){
        this.prodForne = prodForne;
    }
            
    public String getProdFronecedor(){
        return this.prodForne;
    }
    
    public void setProdPreco(int prodPreco){
        this.prodPreco = prodPreco;
    }
    
    public int getProdPreco(){
        return this.prodPreco;
    }
    
    public void setProdDataCadatro(int prodDataCad){
        this.prodDataCad = prodDataCad;
    }
    
    public int getProdDataCadastro(){
        return this.prodDataCad;
    }
}
