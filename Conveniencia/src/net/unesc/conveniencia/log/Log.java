package net.unesc.conveniencia.log; 
        
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Log {
    
    public void escrever(String mensagem, String logFile) throws IOException {
        String usu;
        
        usu = lerUsuario("usuario.txt");
                
        FileWriter fileWriter = new FileWriter(logFile, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String data = (new java.util.Date()).toString();
        String msg = usu + " - " + data + " : " + mensagem;
        bufferedWriter.write(msg);
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
    
    public void gravarUsuario(String mensagem, String logFile) throws IOException {
        
        FileWriter fileWriter = new FileWriter(logFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String data = (new java.util.Date()).toString();
        bufferedWriter.write(mensagem);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
    
    public String lerUsuario(String logFile) throws IOException {
        String usuario = "";
        FileInputStream leitorArquivos = new FileInputStream(logFile);
        
        int lido = leitorArquivos.read();
        while (lido != -1) {
            
            usuario = usuario + (char)lido;
            lido = leitorArquivos.read();
        }
        leitorArquivos.close();
        
        return usuario;
    }
}
