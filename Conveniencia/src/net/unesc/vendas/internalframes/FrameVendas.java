package net.unesc.vendas.internalframes;

import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.vendas.actions.ActionVendas;
import net.unesc.vendas.classes.Cliente;
import net.unesc.vendas.classes.Funcionario;
import net.unesc.vendas.classes.Produto;
import net.unesc.vendas.classes.Vendas;
import net.unesc.vendas.conexao.ClienteDao;
import net.unesc.vendas.conexao.FuncionarioDao;
import net.unesc.vendas.conexao.ProdutoDao;
import net.unesc.vendas.conexao.VendasDao;
import net.unesc.vendas.exception.ExceptionVendas;

public class FrameVendas extends javax.swing.JInternalFrame {
    
    private ActionVendas actVendas = new ActionVendas(this);
    
    public FrameVendas() {
        initComponents();
        
        venSalvar.addActionListener(actVendas);
        venExcluir.addActionListener(actVendas);
        venCancelar.addActionListener(actVendas);
        venNovo.addActionListener(actVendas);
    }
    
    public void setCodigo(int codigo){
        vendCodigo.setText(String.valueOf(codigo));
    }
    
    public void novoVendas(){
        
        vendData.setText("");
        vendCliente.setText("");
        vendProduto.setText("");
        vendFuncionario.setText("");
        vendQuantidade.setText("");
        vendObservacao.setText("");
        clidescricao.setText("");
        prodescricao.setText("");
        fundescricao.setText("");
        
        vendCodigo.setEnabled(false);
        vendData.setEnabled(true);
        vendCliente.setEnabled(true);
        vendFuncionario.setEnabled(true);
        vendProduto.setEnabled(true);        
        vendQuantidade.setEnabled(true);
        vendObservacao.setEnabled(true);    
                
        venNovo.setEnabled(false);
        venSalvar.setEnabled(true);
        venCancelar.setEnabled(true);
        venExcluir.setEnabled(false);

        vendData.requestFocus();
    }
    
    public void cancelarVendas(){
        
        vendCodigo.setText("");
        vendData.setText("");
        vendCliente.setText("");
        vendProduto.setText("");
        vendFuncionario.setText("");
        vendQuantidade.setText("");        
        vendObservacao.setText("");
        clidescricao.setText("");
        prodescricao.setText("");
        fundescricao.setText("");
        
        vendCodigo.setEnabled(true);
        vendData.setEnabled(false);
        vendCliente.setEnabled(false);
        vendProduto.setEnabled(false);
        vendFuncionario.setEnabled(false);
        vendQuantidade.setEnabled(false);        
        vendObservacao.setEnabled(false);
        
        venNovo.setEnabled(true);
        venSalvar.setEnabled(false);
        venCancelar.setEnabled(false);
        venExcluir.setEnabled(false);
        
        vendCodigo.requestFocus();
    }
    
    public void limpaProduto(){
        
        vendData.setText("");
        vendCliente.setText("");
        vendProduto.setText("");
        vendFuncionario.setText("");
        vendQuantidade.setText("");        
        vendObservacao.setText("");
        clidescricao.setText("");
        prodescricao.setText("");
        fundescricao.setText("");
        
        vendData.setEnabled(false);
        vendCliente.setEnabled(false);
        vendProduto.setEnabled(false);
        vendFuncionario.setEnabled(false);
        vendQuantidade.setEnabled(false);
        vendObservacao.setEnabled(false);
        
        venNovo.setEnabled(true);
        venSalvar.setEnabled(false);
        venCancelar.setEnabled(false);
        venExcluir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        vendData = new javax.swing.JTextField();
        vendFuncionario = new javax.swing.JTextField();
        btbusfun = new javax.swing.JButton();
        clidescricao = new javax.swing.JTextField();
        btbuscli = new javax.swing.JButton();
        vendCliente = new javax.swing.JTextField();
        vendCodigo = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        vendProduto = new javax.swing.JTextField();
        btbuspro = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        vendQuantidade = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        vendObservacao = new javax.swing.JTextField();
        fundescricao = new javax.swing.JTextField();
        prodescricao = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        venNovo = new javax.swing.JButton();
        venCancelar = new javax.swing.JButton();
        venSalvar = new javax.swing.JButton();
        venExcluir = new javax.swing.JButton();

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

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        vendFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vendFuncionarioFocusLost(evt);
            }
        });
        vendFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendFuncionarioKeyReleased(evt);
            }
        });

        btbusfun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/buscar.png"))); // NOI18N

        clidescricao.setEditable(false);
        clidescricao.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        btbuscli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/buscar.png"))); // NOI18N

        vendCliente.setEnabled(false);
        vendCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vendClienteFocusLost(evt);
            }
        });
        vendCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendClienteKeyReleased(evt);
            }
        });

        vendCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vendCodigoFocusLost(evt);
            }
        });
        vendCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendCodigoActionPerformed(evt);
            }
        });
        vendCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendCodigoKeyReleased(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel37.setText("Código:");

        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setText("Cliente:");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel34.setText("Funcionário:");

        jLabel35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel35.setText("Produto:");

        vendProduto.setEnabled(false);
        vendProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vendProdutoFocusLost(evt);
            }
        });
        vendProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendProdutoKeyReleased(evt);
            }
        });

        btbuspro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/buscar.png"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setText("Quantidade:");

        vendQuantidade.setEnabled(false);
        vendQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendQuantidadeKeyReleased(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel38.setText("Observação:");

        vendObservacao.setEnabled(false);
        vendObservacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendObservacaoKeyReleased(evt);
            }
        });

        fundescricao.setEditable(false);
        fundescricao.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        prodescricao.setEditable(false);
        prodescricao.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel33)
                    .addComponent(jLabel25)
                    .addComponent(jLabel34)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(vendCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btbuscli, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clidescricao))
                    .addComponent(vendObservacao)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btbuspro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(vendFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btbusfun, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(vendProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendData, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fundescricao)
                            .addComponent(prodescricao))))
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(vendProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbuspro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vendQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(vendObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        venNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        venNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/novo.png"))); // NOI18N
        venNovo.setText("Novo");

        venCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        venCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/cancelar.png"))); // NOI18N
        venCancelar.setText("Cancelar");
        venCancelar.setEnabled(false);

        venSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        venSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/salvar.png"))); // NOI18N
        venSalvar.setText("Salvar");
        venSalvar.setEnabled(false);

        venExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        venExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/excluir.png"))); // NOI18N
        venExcluir.setText("Excluir");
        venExcluir.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(venNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(venSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(venExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(venCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(venSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(venExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(venCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(venNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    }//GEN-LAST:event_formInternalFrameClosed

    private void vendCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vendCodigoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_vendCodigoKeyReleased

    private void vendCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendCodigoActionPerformed
        
    }//GEN-LAST:event_vendCodigoActionPerformed

    private void vendCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vendCodigoFocusLost
        String codTxt = vendCodigo.getText().trim();
        
        if(codTxt.length() > 0){
            Integer codigoVenda = null;
            
            try{
                codigoVenda = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){                
                return;
            }
            
            Vendas ven = VendasDao.getVendas(codigoVenda);
            
            if(ven != null){
                novoVendas();
                venExcluir.setEnabled(true);
                setVendas(ven);
            }
            else{
                JOptionPane.showMessageDialog(null,"Venda Não Encontrada!");
                vendCodigo.requestFocus();
                limpaProduto();
            }
        }
    }//GEN-LAST:event_vendCodigoFocusLost

    private void vendObservacaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vendObservacaoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_vendObservacaoKeyReleased

    private void vendClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vendClienteFocusLost
        String codTxt = vendCliente.getText().trim();
        
        if(codTxt.length() > 0){
            Integer codigoCliente = null;
            
            try{
                codigoCliente = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){                
                return;
            }
            
            Cliente cli = ClienteDao.getCliente(codigoCliente);
            
            if(cli != null)
                clidescricao.setText(cli.getCliNome());
            else{
                clidescricao.setText("");
                JOptionPane.showMessageDialog(null,"Cliente não encontrado.");
                vendCliente.requestFocus();
                return;
            }
        }
    }//GEN-LAST:event_vendClienteFocusLost

    private void vendFuncionarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vendFuncionarioFocusLost
        String codTxt = vendFuncionario.getText().trim();
        
        if(codTxt.length() > 0){
            Integer codigoFuncionario = null;
            
            try{
                codigoFuncionario = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){                
                return;
            }
            
            Funcionario fun = FuncionarioDao.getFuncionario(codigoFuncionario);
            
            if(fun != null)
                fundescricao.setText(fun.getFunNome());
            else{
                fundescricao.setText("");
                JOptionPane.showMessageDialog(null,"Funcionário não encontrado.");
                vendFuncionario.requestFocus();
                return;
            }
        }
    }//GEN-LAST:event_vendFuncionarioFocusLost

    private void vendProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vendProdutoFocusLost
        String codTxt = vendProduto.getText().trim();
        
        if(codTxt.length() > 0){
            Integer codigoProduto = null;
            
            try{
                codigoProduto = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){                
                return;
            }
            
            Produto pro = ProdutoDao.getProduto(codigoProduto);
            
            if(pro != null)
                prodescricao.setText(pro.getProDescricao());
            else{
                prodescricao.setText("");
                JOptionPane.showMessageDialog(null,"Produto não encontrado.");
                vendProduto.requestFocus();
                return;
            }
        }
    }//GEN-LAST:event_vendProdutoFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscli;
    private javax.swing.JButton btbusfun;
    private javax.swing.JButton btbuspro;
    private javax.swing.JTextField clidescricao;
    private javax.swing.JTextField fundescricao;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField prodescricao;
    private javax.swing.JButton venCancelar;
    private javax.swing.JButton venExcluir;
    private javax.swing.JButton venNovo;
    private javax.swing.JButton venSalvar;
    private javax.swing.JTextField vendCliente;
    private javax.swing.JTextField vendCodigo;
    private javax.swing.JTextField vendData;
    private javax.swing.JTextField vendFuncionario;
    private javax.swing.JTextField vendObservacao;
    private javax.swing.JTextField vendProduto;
    private javax.swing.JTextField vendQuantidade;
    // End of variables declaration//GEN-END:variables

    public Vendas getVendas() throws ExceptionVendas{
        Vendas vend = new Vendas();
        
        if (vendCliente.getText().trim().isEmpty()){
            vendCliente.requestFocus();
            throw new ExceptionVendas("Cliente deve ser informado!");
        }
        
        if (!validaCaracteres(vendCliente.getText())) {
            vendCliente.requestFocus();
            throw new ExceptionVendas("Código do cliente inválido!");
        }
        
        if (vendFuncionario.getText().trim().isEmpty()){
            vendProduto.requestFocus();
            throw new ExceptionVendas("Funcionário deve ser informado!");
        }
        
        if (!validaCaracteres(vendFuncionario.getText())) {
            vendFuncionario.requestFocus();
            throw new ExceptionVendas("Código do Funcionário inválido!");
        }
        
        if (vendProduto.getText().trim().isEmpty()){
            vendProduto.requestFocus();
            throw new ExceptionVendas("Produto deve ser informado!");
        }
        
        if (!validaCaracteres(vendProduto.getText())) {
            vendProduto.requestFocus();
            throw new ExceptionVendas("Código do produto inválido!");
        }
        
        if (vendQuantidade.getText().trim().isEmpty()){
            vendQuantidade.requestFocus();
            throw new ExceptionVendas("Quantidade deve ser informada!");
        }
        
        if (!validaCaracteres(vendQuantidade.getText())) {
            vendQuantidade.requestFocus();
            throw new ExceptionVendas("Quantidade inválida!");
        }
        
        Cliente cli = ClienteDao.getCliente(Integer.parseInt(vendCliente.getText()));            
        if(cli == null){
            vendCliente.requestFocus();
            throw new ExceptionVendas("Cliente não encontrado!");
        }            
            
        Funcionario fun = FuncionarioDao.getFuncionario(Integer.parseInt(vendFuncionario.getText()));            
        if(fun == null){
            vendFuncionario.requestFocus();
            throw new ExceptionVendas("Funcionário não encontrado!");
        }
            
        Produto pro = ProdutoDao.getProduto(Integer.parseInt(vendProduto.getText()));
        if(pro == null){
            vendProduto.requestFocus();
            throw new ExceptionVendas("Produto não encontrado!");
        }        
       
        vend.setVenCodigo(Integer.parseInt(vendCodigo.getText()));
        vend.setVenData(vendData.getText());
        vend.setVenCliente(Integer.parseInt(vendCliente.getText()));
        vend.setVenFuncionario(Integer.parseInt(vendFuncionario.getText()));
        vend.setVenProduto(Integer.parseInt(vendProduto.getText()));        
        vend.setVenQuantidade(Float.parseFloat(vendQuantidade.getText()));
        vend.setVenObserva(vendObservacao.getText());
        return vend;
    }   
    
    public boolean validaCaracteres(String vtxt) {
        String caracteres = "0123456789,.";
        
        for (int i = 0; i < vtxt.length(); i++){
            if (!caracteres.contains(vtxt.substring(i,i+1)))
                return false;            
        }            
        return true;
    }
    
    private void setVendas(Vendas ven) {
        vendCodigo.setText(String.valueOf(ven.getVenCodigo()));
        vendData.setText(ven.getVenData());
        vendCliente.setText(String.valueOf(ven.getVenCliente()));
        vendFuncionario.setText(String.valueOf(ven.getVenFuncionario()));
        vendProduto.setText(String.valueOf(ven.getVenProduto()));
        vendQuantidade.setText(String.valueOf(ven.getVenQuantidade()));
        vendObservacao.setText(ven.getVenObserva());
        
        Cliente cli = ClienteDao.getCliente(ven.getVenCliente());            
        if(cli != null)
            clidescricao.setText(cli.getCliNome());
        else
            clidescricao.setText("");
            
        Funcionario fun = FuncionarioDao.getFuncionario(ven.getVenFuncionario());            
        if(fun != null)
            fundescricao.setText(fun.getFunNome());
        else
            fundescricao.setText("");
            
        Produto pro = ProdutoDao.getProduto(ven.getVenProduto());
            
        if(pro != null)
            prodescricao.setText(pro.getProDescricao());
        else
            prodescricao.setText("");
    }
}
