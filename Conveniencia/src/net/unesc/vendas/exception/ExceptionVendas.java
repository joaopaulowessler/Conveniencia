package net.unesc.vendas.exception;

public class ExceptionVendas extends Exception {

    public ExceptionVendas() {
        super("Mensagem padrão de exception!");
    }

    public ExceptionVendas(String msg) {
        super(msg);
    }
}
