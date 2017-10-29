package net.unesc.vendas.internalframes;

import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.actions.ActionProduto;
import net.unesc.vendas.classes.Produto;
import net.unesc.vendas.conexao.ProdutoDao;
import net.unesc.vendas.exception.ExceptionVendas;

public class FrameProduto extends javax.swing.JInternalFrame {
    
    private ActionProduto actProduto = new ActionProduto(this);

    public FrameProduto() {
        initComponents();
        
        proSalvar.addActionListener(actProduto);
        proExcluir.addActionListener(actProduto);
        proCancelar.addActionListener(actProduto);
        proNovo.addActionListener(actProduto);
    }
    
    public void setCodigo(int codigo){
        proCodigo.setText(String.valueOf(codigo));
    }
    
    public void novoProduto(){

        proDescricao.setText("");
        proUnidade.setText("");
        proPeso.setText("");
        descricaoMedida.setText("");
        
        proCodigo.setEnabled(false);
        proDescricao.setEnabled(true);
        proUnidade.setEnabled(true);
        proPeso.setEnabled(true);
        descricaoMedida.setEnabled(true);        
        
        proNovo.setEnabled(false);
        proSalvar.setEnabled(true);
        proExcluir.setEnabled(false);
        proCancelar.setEnabled(true);
        
        proDescricao.requestFocus();
    }
    
    public void cancelarProduto(){
        
        proCodigo.setText("");
        proDescricao.setText("");
        proUnidade.setText("");
        proPeso.setText("");
        descricaoMedida.setText("");        
        
        proCodigo.setEnabled(true);
        proDescricao.setEnabled(false);
        proUnidade.setEnabled(false);
        proPeso.setEnabled(false);
        descricaoMedida.setEnabled(false);
                
        proNovo.setEnabled(true);
        proSalvar.setEnabled(false);
        proCancelar.setEnabled(false); 
        proExcluir.setEnabled(false);
        
        proCodigo.requestFocus();
    }
    
    public void limpaProduto(){
        
        proDescricao.setText("");
        proUnidade.setText("");
        proPeso.setText("");
        descricaoMedida.setText("");        
        
        proDescricao.setEnabled(false);
        proUnidade.setEnabled(false);
        proPeso.setEnabled(false);
        descricaoMedida.setEnabled(false);
        
        proNovo.setEnabled(true);
        proSalvar.setEnabled(false);
        proCancelar.setEnabled(false);
        proExcluir.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        proCancelar = new javax.swing.JButton();
        proExcluir = new javax.swing.JButton();
        proSalvar = new javax.swing.JButton();
        proNovo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        proDescricao = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        proCodigo = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        proUnidade = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        proPeso = new javax.swing.JTextField();
        descricaoMedida = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Produto");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        proCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proCancelar.setText("Cancelar");
        proCancelar.setEnabled(false);

        proExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proExcluir.setText("Excluir");
        proExcluir.setEnabled(false);

        proSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proSalvar.setText("Salvar");
        proSalvar.setEnabled(false);
        proSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proSalvarActionPerformed(evt);
            }
        });

        proNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        proNovo.setText("Novo");
        proNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(proNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        proDescricao.setEnabled(false);
        proDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                proDescricaoKeyReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setText("Descrição");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setText("Código:");

        proCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                proCodigoFocusLost(evt);
            }
        });
        proCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                proCodigoKeyReleased(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setText("Unidade Medida:");

        proUnidade.setEnabled(false);
        proUnidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                proUnidadeKeyReleased(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setText("Peso Unitário:");

        proPeso.setEnabled(false);
        proPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                proPesoKeyReleased(evt);
            }
        });

        descricaoMedida.setEnabled(false);
        descricaoMedida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descricaoMedidaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel29)
                        .addComponent(jLabel30)
                        .addComponent(jLabel31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(proUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descricaoMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(proPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proDescricao))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(proCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(proDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(proPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void proNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proNovoActionPerformed
        
    }//GEN-LAST:event_proNovoActionPerformed

    private void proCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proCodigoKeyReleased
        
    }//GEN-LAST:event_proCodigoKeyReleased

    private void proDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proDescricaoKeyReleased
        
    }//GEN-LAST:event_proDescricaoKeyReleased

    private void proUnidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proUnidadeKeyReleased
        
    }//GEN-LAST:event_proUnidadeKeyReleased

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed

    }//GEN-LAST:event_formInternalFrameClosed

    private void proCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_proCodigoFocusLost
        String codTxt = proCodigo.getText().trim();
        
        if(codTxt.length() > 0){
            Integer codigoProduto = null;
            
            try{
                codigoProduto = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){                
                return;
            }
            
            Produto pro = ProdutoDao.getProduto(codigoProduto);
            
            if(pro != null){
                novoProduto();
                proExcluir.setEnabled(true);
                setProduto(pro);
            }
            else{
                JOptionPane.showMessageDialog(null,"Produto Não Encontrado!");
                proCodigo.requestFocus();
                limpaProduto();
            }
        }
    }//GEN-LAST:event_proCodigoFocusLost

    private void proSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proSalvarActionPerformed
        
    }//GEN-LAST:event_proSalvarActionPerformed

    private void proPesoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proPesoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_proPesoKeyReleased

    private void descricaoMedidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descricaoMedidaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoMedidaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descricaoMedida;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton proCancelar;
    private javax.swing.JTextField proCodigo;
    private javax.swing.JTextField proDescricao;
    private javax.swing.JButton proExcluir;
    private javax.swing.JButton proNovo;
    private javax.swing.JTextField proPeso;
    private javax.swing.JButton proSalvar;
    private javax.swing.JTextField proUnidade;
    // End of variables declaration//GEN-END:variables

    public Produto getProduto()throws ExceptionVendas{
        Produto pro = new Produto();
        
        if (proCodigo.getText().trim().isEmpty()){
            throw new ExceptionVendas("Código do produto deve ser informado!");       
        }
        
        if (!validaCaracteres(proCodigo.getText())) {
            throw new ExceptionVendas("Código do produto inválido!");
        }
        
        if (proDescricao.getText().trim().isEmpty()){
            proDescricao.requestFocus();
            throw new ExceptionVendas("Descrição do produto deve ser informada!");
        }
        
        if (proUnidade.getText().trim().isEmpty()){
            proUnidade.requestFocus();
            throw new ExceptionVendas("Unidade de Medida deve ser informada!");
        }       
        
        pro.setProCodigo(Integer.parseInt(proCodigo.getText()));
        pro.setProDescricao(proDescricao.getText());
        pro.setProUnidade(Integer.parseInt(proUnidade.getText()));
        pro.setProPeso(Float.parseFloat(proPeso.getText()));
        
        return pro;
    }
    
    public boolean validaCaracteres(String vtxt) {
        String caracteres = "0123456789.";
        
        for (int i = 0; i < vtxt.length(); i++){
            if (!caracteres.contains(vtxt.substring(i,i+1)))
                return false;            
        }            
        return true;
    }
    
    private void setProduto(Produto pro) {
        proCodigo.setText(String.valueOf(pro.getProCodigo()));
        proDescricao.setText(pro.getProDescricao());
        proUnidade.setText(String.valueOf(pro.getProUnidade()));
        proPeso.setText(String.valueOf(pro.getProPeso()));
    }
}
