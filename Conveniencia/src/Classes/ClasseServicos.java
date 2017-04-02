package Classes;

public class ClasseServicos {
    
    private int    serCliente;     //cliente
    private int    serProduto;     //produto
    private int    serFuncionario; //funcionário
    private float  serQuantidade;  //quantidade
    private String serData;        //data
    
    public void setSerCliente(int serCli){
        this.serCliente = serCli;
    }
    
    public int getSerCliente(){        
        return this.serCliente;
    }
    
    public void setSerProduto(int serProd){
        this.serProduto = serProd;
    }
            
    public int getSerProduto(){
        return this.serProduto;
    }
    
    public void setSerFuncionario(int serFunc){
        this.serFuncionario = serFunc;
    }
            
    public int getSerFuncionario(){
        return this.serFuncionario;
    }
    
    public void setSerQuantidade(float serQtd){
        this.serQuantidade = serQtd;
    }
    
    public float getSerQuantidade(){
        return this.serQuantidade;
    }
    
    public void setSerData(String serData){
        this.serData = serData;
    }
    
    public String getSerData(){
        return this.serData;
    }
}
