package net.unesc.conveniencia.actions;

import net.unesc.conveniencia.classes.Funcionario;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.log.Log;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.conveniencia.conexao.FuncionarioDao;

public class ActionFuncionario implements ActionListener {

    private final net.unesc.conveniencia.internalframes.FrameFuncionario frameFuncionario;
   
    FuncionarioDao funcionarioDao = new FuncionarioDao();
    
    public ActionFuncionario(net.unesc.conveniencia.internalframes.FrameFuncionario fraFun) {
        
        this.frameFuncionario = fraFun;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            try {
                gerarLog("Novo");
            } catch (IOException ex) {
            }

            int codigo = funcionarioDao.getMax();
            frameFuncionario.setCodigo(codigo + 1);
            frameFuncionario.novoFuncionario();
        }

        if (e.getActionCommand().equals("Salvar")) {

            try {
                gerarLog("Salvar");
            } catch (IOException ex) {
            }
            
            try {
                Funcionario funcionario = frameFuncionario.getFuncionario();
                Funcionario fun         = FuncionarioDao.getFuncionario(funcionario.getFunCodigo());
                
                if(fun != null)
                    funcionarioDao.update(funcionario);
                else 
                    funcionarioDao.insert(funcionario);
                                
                frameFuncionario.cancelarFuncionario();

            } catch (ExceptionConveniencia ex) {
                try {
                    gerarLog("Exception: " + ex.getMessage());
                } catch (IOException exi) {
                }

                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Excluir")) {
            try {
                gerarLog("Exclusão");
            } catch (IOException ex) {
            }
            
            try {
                Funcionario funcionario = frameFuncionario.getFuncionario();
                FuncionarioDao fun = new FuncionarioDao();
                
                if(funcionario != null)
                    fun.delete(funcionario);                
                                
                frameFuncionario.cancelarFuncionario();

            } catch (ExceptionConveniencia ex) {
                try {
                    gerarLog("Exception: " + ex.getMessage());
                } catch (IOException exi) {
                }

                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {

            try {
                gerarLog("Cancelamento");
            } catch (IOException ex) {
            }

            frameFuncionario.cancelarFuncionario();
        }
    }

    public void gerarLog(String vmsg) throws IOException {

        Log log = new Log();
        log.escrever(vmsg, "log.txt");
    }
}
