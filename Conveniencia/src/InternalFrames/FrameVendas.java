package InternalFrames;

import Actions.ActionVendas;
import Classes.Vendas;
import Exception.ExceptionConveniencia;

public class FrameVendas extends javax.swing.JInternalFrame {

    private final ActionVendas actVendas = new ActionVendas(this);

    public FrameVendas() {
        initComponents();

        serSalvar.addActionListener(actVendas);
        serExcluir.addActionListener(actVendas);
        serCancelar.addActionListener(actVendas);
        serNovo.addActionListener(actVendas);
    }

    public void novoVendas() {

        serCliente.setText("");
        serProduto.setText("");
        serFuncionario.setText("");
        serQuantidade.setText("");
        serData.setText("");

        serCliente.setEnabled(true);
        serProduto.setEnabled(true);
        serFuncionario.setEnabled(true);
        serQuantidade.setEnabled(true);
        serData.setEnabled(true);

        serNovo.setEnabled(false);
        serSalvar.setEnabled(true);
        serCancelar.setEnabled(true);
    }

    public void cancelarVendas() {

        serCliente.setText("");
        serProduto.setText("");
        serFuncionario.setText("");
        serQuantidade.setText("");
        serData.setText("");

        serCliente.setEnabled(false);
        serProduto.setEnabled(false);
        serFuncionario.setEnabled(false);
        serQuantidade.setEnabled(false);
        serData.setEnabled(false);

        serNovo.setEnabled(true);
        serSalvar.setEnabled(false);
        serCancelar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serProduto = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        serSalvar = new javax.swing.JButton();
        serExcluir = new javax.swing.JButton();
        serCancelar = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        serNovo = new javax.swing.JButton();
        serData = new javax.swing.JTextField();
        serCliente = new javax.swing.JTextField();
        serQuantidade = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        serFuncionario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Serviços");

        serProduto.setEnabled(false);
        serProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serProdutoActionPerformed(evt);
            }
        });
        serProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serProdutoKeyReleased(evt);
            }
        });

        jLabel35.setText("Produto");

        serSalvar.setText("Salvar");
        serSalvar.setEnabled(false);

        serExcluir.setText("Excluir");
        serExcluir.setEnabled(false);

        serCancelar.setText("Cancelar");
        serCancelar.setEnabled(false);

        jLabel25.setText("Data:");

        serNovo.setText("Novo");

        serData.setEnabled(false);
        serData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serDataKeyReleased(evt);
            }
        });

        serCliente.setEnabled(false);
        serCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serClienteActionPerformed(evt);
            }
        });
        serCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serClienteKeyReleased(evt);
            }
        });

        serQuantidade.setEnabled(false);
        serQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serQuantidadeKeyReleased(evt);
            }
        });

        jLabel36.setText("Cliente:");

        jLabel33.setText("Quantidade:");

        jLabel34.setText("Funcionário:");

        serFuncionario.setEnabled(false);
        serFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serFuncionarioKeyReleased(evt);
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
                            .addComponent(serFuncionario)
                            .addComponent(serProduto)
                            .addComponent(serCliente)
                            .addComponent(serQuantidade)
                            .addComponent(serData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(serNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(serCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(serProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(serFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serExcluir)
                    .addComponent(serCancelar)
                    .addComponent(serNovo)
                    .addComponent(serSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serClienteKeyReleased

    }//GEN-LAST:event_serClienteKeyReleased

    private void serProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serProdutoKeyReleased

    }//GEN-LAST:event_serProdutoKeyReleased

    private void serFuncionarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serFuncionarioKeyReleased

    }//GEN-LAST:event_serFuncionarioKeyReleased

    private void serQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serQuantidadeKeyReleased

    }//GEN-LAST:event_serQuantidadeKeyReleased

    private void serDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serDataKeyReleased

    }//GEN-LAST:event_serDataKeyReleased

    private void serProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serProdutoActionPerformed

    }//GEN-LAST:event_serProdutoActionPerformed

    private void serClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serClienteActionPerformed

    }//GEN-LAST:event_serClienteActionPerformed
    /*
    private boolean validaInteiro(String vtxt) {
        if (caracInt.contains(vtxt.substring(vtxt.length() - 1, vtxt.length()))) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validaFloat(String vtxt) {
        if (caracFloat.contains(vtxt.substring(vtxt.length() - 1, vtxt.length()))) {
            return true;
        } else {
            return false;
        }
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JButton serCancelar;
    private javax.swing.JTextField serCliente;
    private javax.swing.JTextField serData;
    private javax.swing.JButton serExcluir;
    private javax.swing.JTextField serFuncionario;
    private javax.swing.JButton serNovo;
    private javax.swing.JTextField serProduto;
    private javax.swing.JTextField serQuantidade;
    private javax.swing.JButton serSalvar;
    // End of variables declaration//GEN-END:variables

    public Vendas getVendass() throws ExceptionConveniencia {
        Vendas ser = new Vendas();

        if (serCliente.getText().trim().isEmpty()) {
            throw new ExceptionConveniencia("Cliente deve ser informado!");
        }

        if (serProduto.getText().trim().isEmpty()) {
            throw new ExceptionConveniencia("Produto deve ser informado!");
        }

        if (serFuncionario.getText().trim().isEmpty()) {
            throw new ExceptionConveniencia("Funcionário deve ser informado!");
        }

        ser.setVenCliente(Integer.parseInt(serCliente.getText()));
        ser.setVenProduto(Integer.parseInt(serProduto.getText()));
        ser.setVenFuncionario(Integer.parseInt(serFuncionario.getText()));
        ser.setVenQuantidade(Float.parseFloat(serQuantidade.getText()));
        ser.setVenData(serData.getText());

        return ser;
    }
}
