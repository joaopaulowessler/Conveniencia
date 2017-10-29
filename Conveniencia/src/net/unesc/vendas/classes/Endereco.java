package net.unesc.vendas.classes;

public class Endereco {
    
    private int    endCodigo;    //código
    private String endDescricao; //descricao
    private int    endCep;       //cep
    private int    endPais;      //pais
    private int    endEstado;    //estado
    private int    endCidade;    //cidade
    private int    endBairro;    //bairro    
    
    public Endereco(){
        this.endCodigo    = 0;
        this.endDescricao = "";        
        this.endCep    = 0;
        this.endPais   = 0;
        this.endEstado = 0;
        this.endCidade = 0;
        this.endBairro = 0;
    }   

    public int getEndCodigo() {
        return endCodigo;
    }

    public void setEndCodigo(int endCodigo) {
        this.endCodigo = endCodigo;
    }

    public String getEndDescricao() {
        return endDescricao;
    }

    public void setEndDescricao(String endDescricao) {
        this.endDescricao = endDescricao;
    }

    public int getEndCep() {
        return endCep;
    }

    public void setEndCep(int endCep) {
        this.endCep = endCep;
    }

    public int getEndPais() {
        return endPais;
    }

    public void setEndPais(int endPais) {
        this.endPais = endPais;
    }

    public int getEndEstado() {
        return endEstado;
    }

    public void setEndEstado(int endEstado) {
        this.endEstado = endEstado;
    }

    public int getEndCidade() {
        return endCidade;
    }

    public void setEndCidade(int endCidade) {
        this.endCidade = endCidade;
    }

    public int getEndBairro() {
        return endBairro;
    }

    public void setEndBairro(int endBairro) {
        this.endBairro = endBairro;
    }
    
    public void cancelarEndereco(){
        this.endCodigo    = 0;
        this.endDescricao = "";        
        this.endCep       = 0;
        this.endPais      = 0;
        this.endEstado    = 0;
        this.endCidade    = 0;
        this.endBairro    = 0;
    }
}
