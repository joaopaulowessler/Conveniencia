package Exception;

public class ExceptionConveniencia extends Exception {

    public ExceptionConveniencia() {
        super("Mensagem padrão de exception!");
    }

    public ExceptionConveniencia(String msg) {
        super(msg);
    }
}
