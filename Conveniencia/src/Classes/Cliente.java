package Classes;

public class Cliente {
    
    private int    cliCodigo;   //código
    private String cliNome;     //nome
    private String cliCpf;      //cpf
    private String cliRg;       //rg
    private String cliSexo;     //sexo
    private String cliTelefone; //telefone
    private String cliEmail;    //email
    private String cliCidade;   //cidade
    private String cliEstado;   //estado
    private String cliEndereco; //endereço
    
    public Cliente(){
        this.cliCodigo   = 0;
        this.cliNome     = "";
        this.cliCpf      = "";
        this.cliRg       = "";
        this.cliSexo     = "";
        this.cliTelefone = "";
        this.cliEmail    = "";
        this.cliCidade   = "";
        this.cliEstado   = "";
        this.cliEndereco = "";
    }
    
    public void setCliCodigo(int cliCodigo){
        this.cliCodigo = cliCodigo;
    }
    
    public int getCliCodigo(){        
        return this.cliCodigo;
    }
    
    public void setCliNome(String cliNome){
        this.cliNome = cliNome;
    }
            
    public String getCliNome(){
        return this.cliNome;
    }
    
    public void setCliCpf(String cliCpf){
        this.cliCpf = cliCpf;
    }
            
    public String getCliCpf(){
        return this.cliCpf;
    }
    
    public void setCliRg(String cliRg){
        this.cliRg = cliRg;
    }
    
    public String getCliRg(){
        return this.cliRg;
    }
    
    public void setCliSexo(String cliSexo){
        this.cliSexo = cliSexo;
    }
    
    public String getCliSexo(){
        return this.cliSexo;
    }
    
    public void setCliTelefone(String cliTelefone){
        this.cliTelefone = cliTelefone;
    }
    
    public String getCliTelefone(){
        return this.cliTelefone;
    }
    
    public void setCliEmail(String cliEmail){
        this.cliEmail = cliEmail;
    }
    
    public String getcCliEmail(){
        return this.cliEmail;
    }
    
    public void setCliCidade(String cliCidade){
        this.cliCidade = cliCidade;
    }
    
    public String getCliCidade(){
        return this.cliCidade;
    }
    
    public void setCliEstado(String cliEstado){
        this.cliEstado = cliEstado;
    }
    
    public String getCliEstado(){
        return this.cliEstado;
    }
    
    public void setCliEndereco(String cliEndereco){
        this.cliEndereco = cliEndereco;
    }
            
    public String getCliEndereco(){
        return this.cliEndereco;
    }
    
    public void cancelarCliente(){
        this.cliCodigo   = 0;
        this.cliNome     = "";
        this.cliCpf      = "";
        this.cliRg       = "";
        this.cliSexo     = "";
        this.cliTelefone = "";
        this.cliEmail    = "";
        this.cliCidade   = "";
        this.cliEstado   = "";
        this.cliEndereco = "";
    }
}
