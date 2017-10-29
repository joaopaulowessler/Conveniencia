/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.unesc.vendas.internalframes;

import javax.swing.JOptionPane;
import net.unesc.vendas.actions.ActionUnidade;
import net.unesc.vendas.classes.Empresa;
import net.unesc.vendas.classes.Endereco;
import net.unesc.vendas.classes.Unidade;
import net.unesc.vendas.conexao.EmpresaDao;
import net.unesc.vendas.conexao.EnderecoDao;
import net.unesc.vendas.conexao.UnidadeDao;
import net.unesc.vendas.exception.ExceptionVendas;

/**
 *
 * @author joao_
 */
public class FrameUnidade extends javax.swing.JInternalFrame {

    private ActionUnidade actUnidade = new ActionUnidade(this);
    
    public FrameUnidade() {
        initComponents();
        
        salvar.addActionListener(actUnidade);
        excluir.addActionListener(actUnidade);
        cancelar.addActionListener(actUnidade);
        novo.addActionListener(actUnidade);
    }    
    
    public void novoUnidade(){        
        descricao.setText("");
        
        codempresa.setText("");
        nomeempresa.setText("");
        
        codendereco.setText("");
        nomeendereco.setText("");
        
        codigo.setEnabled(false);
        
        descricao.setEnabled(true);
        
        codendereco.setEnabled(true);        
        codempresa.setEnabled(true);        
        
        novo.setEnabled(false);
        salvar.setEnabled(true);
        excluir.setEnabled(false);
        cancelar.setEnabled(true);        
        descricao.requestFocus();
    }
    
    public void cancelarUnidade(){        
        codigo.setText("");
        descricao.setText("");
        
        codempresa.setText("");
        nomeempresa.setText("");
        
        codendereco.setText("");
        nomeendereco.setText("");
        
        codigo.setEnabled(true);
        descricao.setEnabled(false);
        
        codendereco.setEnabled(false);        
        codempresa.setEnabled(false);        
        
        novo.setEnabled(true);
        salvar.setEnabled(false);
        cancelar.setEnabled(false); 
        excluir.setEnabled(false);        
        
        codigo.requestFocus();
    }
    
    public void limpaUnidade(){        
        descricao.setText("");
        
        codempresa.setText("");
        nomeempresa.setText("");
        
        codendereco.setText("");
        nomeendereco.setText("");
        
        descricao.setEnabled(false);
        
        codempresa.setEnabled(false);        
        codendereco.setEnabled(false);        
        
        novo.setEnabled(true);
        salvar.setEnabled(false);
        cancelar.setEnabled(false);
        excluir.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        descricao = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel8 = new javax.swing.JPanel();
        nome6 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        codigo1 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        cancelar1 = new javax.swing.JButton();
        excluir1 = new javax.swing.JButton();
        salvar1 = new javax.swing.JButton();
        novo1 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        codempresa = new javax.swing.JTextField();
        nomeempresa = new javax.swing.JTextField();
        codendereco = new javax.swing.JTextField();
        nomeendereco = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cancelar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        novo = new javax.swing.JButton();

        setClosable(true);
        setTitle("Unidade");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        descricao.setEnabled(false);
        descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descricaoKeyReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setText("Descrição:");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setText("Código:");

        codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoFocusLost(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigoKeyReleased(evt);
            }
        });

        jInternalFrame1.setTitle("País");

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nome6.setEnabled(false);
        nome6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nome6KeyReleased(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setText("Nome:");

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setText("Código:");

        codigo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigo1FocusLost(evt);
            }
        });
        codigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigo1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome6, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(nome6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cancelar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelar1.setText("Cancelar");
        cancelar1.setEnabled(false);

        excluir1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        excluir1.setText("Excluir");
        excluir1.setEnabled(false);

        salvar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salvar1.setText("Salvar");
        salvar1.setEnabled(false);
        salvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar1ActionPerformed(evt);
            }
        });

        novo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        novo1.setText("Novo");
        novo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(novo1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel35.setText("Empresa:");

        codempresa.setEnabled(false);
        codempresa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codempresaFocusLost(evt);
            }
        });
        codempresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codempresaKeyReleased(evt);
            }
        });

        nomeempresa.setEnabled(false);
        nomeempresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeempresaKeyReleased(evt);
            }
        });

        codendereco.setEnabled(false);
        codendereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codenderecoFocusLost(evt);
            }
        });
        codendereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codenderecoKeyReleased(evt);
            }
        });

        nomeendereco.setEnabled(false);
        nomeendereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeenderecoKeyReleased(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel37.setText("Endereço:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 85, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 84, Short.MAX_VALUE)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setEnabled(false);

        excluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        excluir.setText("Excluir");
        excluir.setEnabled(false);

        salvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salvar.setText("Salvar");
        salvar.setEnabled(false);
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        novo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descricaoKeyReleased

    }//GEN-LAST:event_descricaoKeyReleased

    private void codigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoFocusLost
        String codTxt = codigo.getText().trim();

        if(codTxt.length() > 0){
            Integer codigo = null;

            try{
                codigo = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){
                return;
            }

            Unidade uni = UnidadeDao.getUnidade(codigo);

            if(uni != null){
                novoUnidade();
                excluir.setEnabled(true);
                setUnidade(uni);
            }
            else{
                JOptionPane.showMessageDialog(null,"Unidade não encontrada!");
                this.codigo.requestFocus();
                limpaUnidade();
            }
        }
    }//GEN-LAST:event_codigoFocusLost

    private void codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyReleased

    }//GEN-LAST:event_codigoKeyReleased

    private void nome6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nome6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nome6KeyReleased

    private void codigo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigo1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo1FocusLost

    private void codigo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo1KeyReleased

    private void salvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvar1ActionPerformed

    private void novo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novo1ActionPerformed

    private void codempresaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codempresaFocusLost
        String codTxt = codempresa.getText().trim();

        if(codTxt.length() > 0){
            Integer codigoEmpresa = null;

            try{
                codigoEmpresa = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){
                return;
            }

            Empresa emp = EmpresaDao.getEmpresa(codigoEmpresa);

            if(emp != null)
                nomeempresa.setText(emp.getEmpNome());
            else{
                nomeempresa.setText("");
                JOptionPane.showMessageDialog(null,"Empresa não encontrado.");
                codempresa.requestFocus();
                return;
            }
        }
    }//GEN-LAST:event_codempresaFocusLost

    private void codempresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codempresaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codempresaKeyReleased

    private void nomeempresaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeempresaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeempresaKeyReleased

    private void codenderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codenderecoFocusLost
        String codTxt = codendereco.getText().trim();

        if(codTxt.length() > 0){
            Integer codigoEndereco = null;

            try{
                codigoEndereco = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){
                return;
            }

            Endereco end = EnderecoDao.getEndereco(codigoEndereco);

            if(end != null)
                nomeendereco.setText(end.getEndDescricao());
            else{
                nomeendereco.setText("");
                JOptionPane.showMessageDialog(null,"Endereço não encontrado.");
                codendereco.requestFocus();
                return;
            }
        }
    }//GEN-LAST:event_codenderecoFocusLost

    private void codenderecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codenderecoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codenderecoKeyReleased

    private void nomeenderecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeenderecoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeenderecoKeyReleased

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed

    }//GEN-LAST:event_salvarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed

    }//GEN-LAST:event_novoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cancelar1;
    private javax.swing.JTextField codempresa;
    private javax.swing.JTextField codendereco;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField codigo1;
    private javax.swing.JTextField descricao;
    private javax.swing.JButton excluir;
    private javax.swing.JButton excluir1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField nome6;
    private javax.swing.JTextField nomeempresa;
    private javax.swing.JTextField nomeendereco;
    private javax.swing.JButton novo;
    private javax.swing.JButton novo1;
    private javax.swing.JButton salvar;
    private javax.swing.JButton salvar1;
    // End of variables declaration//GEN-END:variables
    
    public void setCodigo(int codigo){
        this.codigo.setText(String.valueOf(codigo));
    }
    
    private void setUnidade(Unidade uni) {
        codigo.setText(String.valueOf(uni.getUniCodigo()));
        descricao.setText(uni.getUniNome());        
        codempresa.setText(String.valueOf(uni.getEmpCodigo()));
        codendereco.setText(String.valueOf(uni.getEndCodigo()));
        
        Empresa emp = EmpresaDao.getEmpresa(uni.getEmpCodigo());            
        if(emp != null)
            nomeempresa.setText(emp.getEmpNome());
        else
            nomeempresa.setText("");
        
        Endereco end = EnderecoDao.getEndereco(uni.getEndCodigo());            
        if(end != null)
            nomeendereco.setText(end.getEndDescricao());
        else
            nomeendereco.setText("");        
    }
    
    public Unidade getUnidade()throws ExceptionVendas{
        Unidade uni = new Unidade();
        
        if (codigo.getText().trim().isEmpty()){
            throw new ExceptionVendas("Código da Unidade deve ser informado!");       
        }
        
        if (!validaCaracteres(codigo.getText())) {
            throw new ExceptionVendas("Código do Endereco inválido!");
        }
        
        if (descricao.getText().trim().isEmpty()){
            descricao.requestFocus();
            throw new ExceptionVendas("Nome da Unidade deve ser informado!");
        }
        
        if (codempresa.getText().trim().isEmpty()){
            throw new ExceptionVendas("Código da Empresa deve ser informado!");       
        }
        
        if (!validaCaracteres(codempresa.getText())) {
            throw new ExceptionVendas("Código da Empresa inválido!");
        }
        
        if (codendereco.getText().trim().isEmpty()){
            throw new ExceptionVendas("Código do Endereço deve ser informado!");       
        }
        
        if (!validaCaracteres(codendereco.getText())) {
            throw new ExceptionVendas("Código do Endereço inválido!");
        }
        
        uni.setUniCodigo(Integer.parseInt(codigo.getText()));
        uni.setUniNome(descricao.getText());        
        uni.setEmpCodigo(Integer.parseInt(codempresa.getText()));
        uni.setEndCodigo(Integer.parseInt(codendereco.getText()));      
        
        Empresa emp = EmpresaDao.getEmpresa(uni.getEmpCodigo());            
        if(emp == null)
            throw new ExceptionVendas("Empresa não encontrada!");        
        
        Endereco end = EnderecoDao.getEndereco(uni.getEndCodigo());            
        if(end == null)
            throw new ExceptionVendas("Endereço não encontrado!");        
        
        return uni;
    }
    
    public boolean validaCaracteres(String vtxt) {
        String caracteres = "0123456789.";
        
        for (int i = 0; i < vtxt.length(); i++){
            if (!caracteres.contains(vtxt.substring(i,i+1)))
                return false;            
        }            
        return true;
    }
}
