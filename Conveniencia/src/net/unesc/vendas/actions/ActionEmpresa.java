package net.unesc.vendas.actions;

import net.unesc.vendas.classes.Empresa;
import net.unesc.vendas.exception.ExceptionVendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.conexao.EmpresaDao;

public class ActionEmpresa implements ActionListener {

    private final net.unesc.vendas.internalframes.FrameEmpresa frameEmpresa;
    
    private EmpresaDao empresaDao = new EmpresaDao();
    
    public ActionEmpresa(net.unesc.vendas.internalframes.FrameEmpresa fraMed) {
        this.frameEmpresa = fraMed;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Novo")) {
            
            int codigo = empresaDao.getMax();
            frameEmpresa.setCodigo(codigo + 1);
            frameEmpresa.novoEmpresa();
        }

        if (e.getActionCommand().equals("Salvar")) {
            
            try {
                Empresa empresa = frameEmpresa.getEmpresa();
                Empresa emp = EmpresaDao.getEmpresa(empresa.getEmpCodigo());
                
                if(emp != null)
                    empresaDao.update(empresa);
                else 
                    empresaDao.insert(empresa);
                                
                frameEmpresa.cancelarEmpresa();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Excluir")) {
            try {
                Empresa empresa = frameEmpresa.getEmpresa();
                EmpresaDao emp = new EmpresaDao();
                
                if(empresa != null)
                    emp.delete(empresa);                
                                
                frameEmpresa.cancelarEmpresa();

            } catch (ExceptionVendas ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        if (e.getActionCommand().equals("Cancelar")) {
            frameEmpresa.cancelarEmpresa();
        }
    }
}
