package net.unesc.conveniencia.exception;

public class ExceptionConveniencia extends Exception {

    public ExceptionConveniencia() {
        super("Mensagem padrão de exception!");
    }

    public ExceptionConveniencia(String msg) {
        super(msg);
    }
}
