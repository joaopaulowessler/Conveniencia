package InternalFrames;

import Actions.ActionVendas;
import Classes.Vendas;
import Exception.ExceptionConveniencia;

public class FrameVendas extends javax.swing.JInternalFrame {
    
    private ActionVendas actVendas = new ActionVendas(this);
    
    public FrameVendas() {
        initComponents();
        
        vendSalvar.addActionListener(actVendas);
        vendExcluir.addActionListener(actVendas);
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

        vendProduto = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        vendSalvar = new javax.swing.JButton();
        vendExcluir = new javax.swing.JButton();
        vendCancelar = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        vendNovo = new javax.swing.JButton();
        vendData = new javax.swing.JTextField();
        vendCliente = new javax.swing.JTextField();
        vendQuantidade = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        vendFuncionario = new javax.swing.JTextField();

        setTitle("Vendas");

        vendProduto.setEnabled(false);
        vendProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendProdutoKeyReleased(evt);
            }
        });

        jLabel35.setText("Produto");

        vendSalvar.setText("Salvar");
        vendSalvar.setEnabled(false);

        vendExcluir.setText("Excluir");
        vendExcluir.setEnabled(false);

        vendCancelar.setText("Cancelar");
        vendCancelar.setEnabled(false);

        jLabel25.setText("Data:");

        vendNovo.setText("Novo");

        vendData.setEnabled(false);
        vendData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendDataKeyReleased(evt);
            }
        });

        vendCliente.setEnabled(false);
        vendCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendClienteKeyReleased(evt);
            }
        });

        vendQuantidade.setEnabled(false);
        vendQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendQuantidadeKeyReleased(evt);
            }
        });

        jLabel36.setText("Cliente:");

        jLabel33.setText("Quantidade:");

        jLabel34.setText("Funcionário:");

        vendFuncionario.setEnabled(false);
        vendFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vendFuncionarioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel33)
                            .addComponent(jLabel25)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vendFuncionario)
                            .addComponent(vendProduto)
                            .addComponent(vendCliente)
                            .addComponent(vendQuantidade)
                            .addComponent(vendData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vendNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vendSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(vendCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(vendProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(vendFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendExcluir)
                    .addComponent(vendCancelar)
                    .addComponent(vendNovo)
                    .addComponent(vendSalvar))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JButton vendCancelar;
    private javax.swing.JTextField vendCliente;
    private javax.swing.JTextField vendData;
    private javax.swing.JButton vendExcluir;
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
