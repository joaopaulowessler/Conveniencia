package Classes;

public class ClasseServicos {
    
    private String servCli;     //cliente
    private String servProd;    //produto
    private String servFunc;    //funcionário
    private int    servQntd;    //quantidade
    private String servData;    //data
    
    public void setServCliente(String servCli){
        this.servCli = servCli;
    }
    
    public String getServCliente(){        
        return this.servCli;
    }
    
    public void setServProduto(String servProd){
        this.servProd = servProd;
    }
            
    public String getServProduto(){
        return this.servProd;
    }
    
    public void setServFuncionario(String servFunc){
        this.servFunc = servFunc;
    }
            
    public String getServFuncionario(){
        return this.servFunc;
    }
    
    public void setServQuantidade(int servQntd){
        this.servQntd = servQntd;
    }
    
    public int getServQuantidade(){
        return this.servQntd;
    }
    
    public void setServData(String servData){
        this.servData = servData;
    }
    
    public String getServData(){
        return this.servData;
    }
}
