package Classes;

public class Login {
    
    private String login; //login
    private String senha; //senha

    public Login() {
        
        this.login = "";
        this.senha = "";
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }   
}
