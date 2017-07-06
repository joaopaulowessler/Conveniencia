package net.unesc.conveniencia.internalframes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.unesc.conveniencia.classes.Produto;
import net.unesc.conveniencia.conexao.ProdutoDao;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.log.Log;

public class FrameListarProduto extends javax.swing.JInternalFrame {

    Log log = new Log();
    
    List<Produto> lista = new ArrayList<Produto>();
    
    ProdutoDao produtoDao = new ProdutoDao();
    DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
    
    public FrameListarProduto() {
        initComponents();
        
        this.lista = produtoDao.getAll();
        
        for (int i = 0; i < lista.size(); i ++){
            jTcliente.setValueAt(lista.get(i).getProCodigo(), i, 0);
            jTcliente.setValueAt(lista.get(i).getProDesc(), i, 1);
            jTcliente.setValueAt(lista.get(i).getProUnidade(), i, 2);
            jTcliente.setValueAt(lista.get(i).getProFornecedor(), i, 3);
            jTcliente.setValueAt(lista.get(i).getProPreco(), i, 4);
            jTcliente.setValueAt(lista.get(i).getProDataCadastro(), i, 5);
        }
        
        jTcliente.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTcliente = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Lista de Produtos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jTcliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Unidade Medida", "Fornecedor", "Preço", "Data Cadastro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTcliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1327, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        try {
            log.escrever("Saiu da consulta de produtos", "log.txt");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTcliente;
    // End of variables declaration//GEN-END:variables
}
