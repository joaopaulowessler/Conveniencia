package Classes;

public class Vendas {
    
    private int    venCliente;     //cliente
    private int    venProduto;     //produto
    private int    venFuncionario; //funcionário
    private float  venQuantidade;  //quantidade
    private String venData;        //data
    
    public void setVenCliente(int venCli){
        this.venCliente = venCli;
    }
    
    public int getVenCliente(){        
        return this.venCliente;
    }
    
    public void setVenProduto(int venProd){
        this.venProduto = venProd;
    }
            
    public int getVenProduto(){
        return this.venProduto;
    }
    
    public void setVenFuncionario(int venFunc){
        this.venFuncionario = venFunc;
    }
            
    public int getVenFuncionario(){
        return this.venFuncionario;
    }
    
    public void setVenQuantidade(float venQtd){
        this.venQuantidade = venQtd;
    }
    
    public float getVenQuantidade(){
        return this.venQuantidade;
    }
    
    public void setVenData(String venData){
        this.venData = venData;
    }
    
    public String getVenData(){
        return this.venData;
    }
}
