package net.unesc.conveniencia.internalframes;

import java.io.IOException;
import net.unesc.conveniencia.actions.ActionVendas;
import net.unesc.conveniencia.classes.Vendas;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.log.Log;

public class FrameVendas extends javax.swing.JInternalFrame {
    
    private ActionVendas actVendas = new ActionVendas(this);
    
    Log log = new Log();
    
    public FrameVendas() {
        initComponents();
        
        vendSalvar.addActionListener(actVendas);
        vendCancelar.addActionListener(actVendas);
        vendNovo.addActionListener(actVendas);
    }
    
    public void novoVendas(){
        
        vendCliente.setText("");
        vendProduto.setText("");
        vendFuncionario.setText("");
        vendQuantidade.setText("");
        vendData.setText("");
        
        vendCliente.setEnabled(true);
        vendProduto.setEnabled(true);
        vendFuncionario.setEnabled(true);
        vendQuantidade.setEnabled(true);
        vendData.setEnabled(true);
                
        vendNovo.setEnabled(false);
        vendSalvar.setEnabled(true);
        vendCancelar.setEnabled(true);        
    }
    
    public void cancelarVendas(){
        
        vendCliente.setText("");
        vendProduto.setText("");
        vendFuncionario.setText("");
        vendQuantidade.setText("");
        vendData.setText("");
        
        vendCliente.setEnabled(false);
        vendProduto.setEnabled(false);
        vendFuncionario.setEnabled(false);
        vendQuantidade.setEnabled(false);
        vendData.setEnabled(false);
                
        vendNovo.setEnabled(true);
        vendSalvar.setEnabled(false);
        vendCancelar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        vendNovo = new javax.swing.JButton();
        vendCancelar = new javax.swing.JButton();
        vendSalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        vendProduto = new javax.swing.JTextField();
        btbuspro = new javax.swing.JButton();
        prodescricao = new javax.swing.JTextField();
        vendQuantidade = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        iteOk = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        vendData = new javax.swing.JTextField();
        vendFuncionario = new javax.swing.JTextField();
        btbusfun = new javax.swing.JButton();
        fundescricao = new javax.swing.JTextField();
        clidescricao = new javax.swing.JTextField();
        btbuscli = new javax.swing.JButton();
        vendCliente = new javax.swing.JTextField();
        venCodigo = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Vendas");
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

        vendNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/novo.png"))); // NOI18N
        vendNovo.setText("Novo");

        vendCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/cancelar.png"))); // NOI18N
        vendCancelar.setText("Cancelar");
        vendCancelar.setEnabled(false);

        vendSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vendSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/salvar.png"))); // NOI18N
        vendSalvar.setText("Encerrar");
        vendSalvar.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(vendNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(vendSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(vendCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        vendProduto.setEnabled(false);
        vendProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendProdutoKeyReleased(evt);
            }
        });

        btbuspro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/buscar.png"))); // NOI18N

        prodescricao.setEditable(false);

        vendQuantidade.setEnabled(false);
        vendQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendQuantidadeKeyReleased(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setText("Quantidade");

        jLabel35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel35.setText("Produto");

        iteOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/ok.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(vendProduto)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btbuspro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prodescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vendQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iteOk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prodescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vendQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iteOk, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vendProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbuspro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setText("Data:");

        vendData.setEnabled(false);
        vendData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendDataKeyReleased(evt);
            }
        });

        vendFuncionario.setEnabled(false);
        vendFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendFuncionarioKeyReleased(evt);
            }
        });

        btbusfun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/buscar.png"))); // NOI18N

        fundescricao.setEditable(false);

        clidescricao.setEditable(false);

        btbuscli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/buscar.png"))); // NOI18N

        vendCliente.setEnabled(false);
        vendCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendClienteKeyReleased(evt);
            }
        });

        venCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venCodigoActionPerformed(evt);
            }
        });
        venCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                venCodigoKeyReleased(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel37.setText("Código:");

        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setText("Cliente:");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel34.setText("Funcionário:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel34)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(vendCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btbuscli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clidescricao))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(vendFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btbusfun, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fundescricao))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(venCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendData, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(venCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btbuscli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clidescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vendCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(vendFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btbusfun, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fundescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(vendData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vendClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vendClienteKeyReleased
        
    }//GEN-LAST:event_vendClienteKeyReleased

    private void vendProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vendProdutoKeyReleased
        
    }//GEN-LAST:event_vendProdutoKeyReleased

    private void vendFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vendFuncionarioKeyReleased
        
    }//GEN-LAST:event_vendFuncionarioKeyReleased

    private void vendQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vendQuantidadeKeyReleased
        
    }//GEN-LAST:event_vendQuantidadeKeyReleased

    private void vendDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vendDataKeyReleased

    }//GEN-LAST:event_vendDataKeyReleased

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        try {
            log.escrever("Saiu do cadastro de vendas", "log.txt");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_formInternalFrameClosed

    private void venCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_venCodigoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_venCodigoKeyReleased

    private void venCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_venCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscli;
    private javax.swing.JButton btbusfun;
    private javax.swing.JButton btbuspro;
    private javax.swing.JTextField clidescricao;
    private javax.swing.JTextField fundescricao;
    private javax.swing.JButton iteOk;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField prodescricao;
    private javax.swing.JTextField venCodigo;
    private javax.swing.JButton vendCancelar;
    private javax.swing.JTextField vendCliente;
    private javax.swing.JTextField vendData;
    private javax.swing.JTextField vendFuncionario;
    private javax.swing.JButton vendNovo;
    private javax.swing.JTextField vendProduto;
    private javax.swing.JTextField vendQuantidade;
    private javax.swing.JButton vendSalvar;
    // End of variables declaration//GEN-END:variables

    public Vendas getVendas() throws ExceptionConveniencia{
        Vendas vend = new Vendas();
        
        if (vendCliente.getText().trim().isEmpty()){
            throw new ExceptionConveniencia("Cliente deve ser informado!");
        }
        
        if (!validaCaracteres(vendCliente.getText())) {
            throw new ExceptionConveniencia("Código do cliente inválido!");
        }
        
        if (vendProduto.getText().trim().isEmpty()){
            throw new ExceptionConveniencia("Produto deve ser informado!");
        }
        
        if (!validaCaracteres(vendProduto.getText())) {
            throw new ExceptionConveniencia("Código do produto inválido!");
        }
        
        if (vendFuncionario.getText().trim().isEmpty()){
            throw new ExceptionConveniencia("Funcionário deve ser informado!");
        }
        
        if (!validaCaracteres(vendFuncionario.getText())) {
            throw new ExceptionConveniencia("Código do Funcionário inválido!");
        }
        
        if (!validaCaracteres(vendQuantidade.getText())) {
            throw new ExceptionConveniencia("Quantidade inválida!");
        }
        
        vend.setVenCliente(Integer.parseInt(vendCliente.getText()));
        vend.setVenProduto(Integer.parseInt(vendProduto.getText()));
        vend.setVenFuncionario(Integer.parseInt(vendFuncionario.getText()));
        vend.setVenQuantidade(Float.parseFloat(vendQuantidade.getText()));
        vend.setVenData(vendData.getText());
        
        return vend;
    }   
    
    public boolean validaCaracteres(String vtxt) {
        String caracteres = "0123456789,";
        
        for (int i = 0; i < vtxt.length(); i++){
            if (!caracteres.contains(vtxt.substring(i,i+1)))
                return false;            
        }            
        return true;
    }
}
