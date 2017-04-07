package InternalFrames;

import Actions.ActionProduto;
import Classes.ClasseProduto;

public class FrameProduto extends javax.swing.JInternalFrame {
    
    private ClasseProduto produto    = new ClasseProduto();
    private ActionProduto actProduto = new ActionProduto(this,produto);
    private String caracInt          = "0123456789";
    private String caracFloat        = "0123456789.";
    
    public FrameProduto() {
        initComponents();
        
        proSalvar.addActionListener(actProduto);
        proExcluir.addActionListener(actProduto);
        proCancelar.addActionListener(actProduto);
        proNovo.addActionListener(actProduto);
    }
    
    public void novoProduto(){
        
        proCodigo.setText("");
        proDescricao.setText("");
        proUnidade.setText("");
        proFornecedor.setText("");
        proPreco.setText("");
        proDataCadastro.setText("");
        
        proCodigo.setEnabled(true);
        proDescricao.setEnabled(true);
        proUnidade.setEnabled(true);
        proFornecedor.setEnabled(true);
        proPreco.setEnabled(true);
        proDataCadastro.setEnabled(true);                
        proNovo.setEnabled(false);
        proSalvar.setEnabled(true);
        proCancelar.setEnabled(true);        
    }
    
    public void cancelarProduto(){
        
        proCodigo.setText("");
        proDescricao.setText("");
        proUnidade.setText("");
        proFornecedor.setText("");
        proPreco.setText("");
        proDataCadastro.setText("");
        
        proCodigo.setEnabled(false);
        proDescricao.setEnabled(false);
        proUnidade.setEnabled(false);
        proFornecedor.setEnabled(false);
        proPreco.setEnabled(false);
        proDataCadastro.setEnabled(false);
                
        proNovo.setEnabled(true);
        proSalvar.setEnabled(false);
        proCancelar.setEnabled(false); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        proDataCadastro = new javax.swing.JTextField();
        proPreco = new javax.swing.JTextField();
        proSalvar = new javax.swing.JButton();
        proFornecedor = new javax.swing.JTextField();
        proExcluir = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        proCancelar = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        proNovo = new javax.swing.JButton();
        proUnidade = new javax.swing.JTextField();
        proDescricao = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        proCodigo = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Produto");

        proDataCadastro.setEnabled(false);
        proDataCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                proDataCadastroKeyReleased(evt);
            }
        });

        proPreco.setEnabled(false);
        proPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                proPrecoKeyReleased(evt);
            }
        });

        proSalvar.setText("Salvar");
        proSalvar.setEnabled(false);

        proFornecedor.setEnabled(false);
        proFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                proFornecedorKeyReleased(evt);
            }
        });

        proExcluir.setText("Excluir");
        proExcluir.setEnabled(false);

        jLabel28.setText("Fornecedor:");

        proCancelar.setText("Cancelar");
        proCancelar.setEnabled(false);

        jLabel29.setText("Unidade Medida:");

        proNovo.setText("Novo");
        proNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proNovoActionPerformed(evt);
            }
        });

        proUnidade.setEnabled(false);
        proUnidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                proUnidadeKeyReleased(evt);
            }
        });

        proDescricao.setEnabled(false);
        proDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                proDescricaoKeyReleased(evt);
            }
        });

        jLabel30.setText("Descrição");

        jLabel31.setText("Código:");

        proCodigo.setEnabled(false);
        proCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                proCodigoKeyReleased(evt);
            }
        });

        jLabel32.setText("Data Cadastro:");

        jLabel24.setText("Preço:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(proNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel28)
                            .addComponent(jLabel24)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(proCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(proDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(proUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proSalvar)
                    .addComponent(proExcluir)
                    .addComponent(proCancelar)
                    .addComponent(proNovo))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proNovoActionPerformed

    private void proCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proCodigoKeyReleased
        if (validaInteiro(proCodigo.getText()))
            produto.setProCodigo(Integer.parseInt(proCodigo.getText()));
        else
            proCodigo.setText(proCodigo.getText().substring(0,proCodigo.getText().length()-1));      
    }//GEN-LAST:event_proCodigoKeyReleased

    private void proDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proDescricaoKeyReleased
        produto.setProDesc(proDescricao.getText());
    }//GEN-LAST:event_proDescricaoKeyReleased

    private void proUnidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proUnidadeKeyReleased
        produto.setProUnidade(proUnidade.getText());
    }//GEN-LAST:event_proUnidadeKeyReleased

    private void proFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proFornecedorKeyReleased
        produto.setProFornecedor(proFornecedor.getText());
    }//GEN-LAST:event_proFornecedorKeyReleased

    private void proPrecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proPrecoKeyReleased
        if (validaFloat(proPreco.getText()))
            produto.setProPreco(Integer.parseInt(proPreco.getText()));
        else
            proPreco.setText(proPreco.getText().substring(0,proPreco.getText().length()-1));
    }//GEN-LAST:event_proPrecoKeyReleased

    private void proDataCadastroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proDataCadastroKeyReleased
        produto.setProDataCadatro(proDataCadastro.getText());
    }//GEN-LAST:event_proDataCadastroKeyReleased
    private boolean validaInteiro(String vtxt){        
        if(caracInt.contains(vtxt.substring(vtxt.length()-1,vtxt.length())))
            return true;
        else
            return false;
    }
    
    private boolean validaFloat(String vtxt){        
        if(caracFloat.contains(vtxt.substring(vtxt.length()-1,vtxt.length())))
            return true;
        else
            return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JButton proCancelar;
    private javax.swing.JTextField proCodigo;
    private javax.swing.JTextField proDataCadastro;
    private javax.swing.JTextField proDescricao;
    private javax.swing.JButton proExcluir;
    private javax.swing.JTextField proFornecedor;
    private javax.swing.JButton proNovo;
    private javax.swing.JTextField proPreco;
    private javax.swing.JButton proSalvar;
    private javax.swing.JTextField proUnidade;
    // End of variables declaration//GEN-END:variables
}
