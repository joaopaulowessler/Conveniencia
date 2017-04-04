package InternalFrames;

import Actions.ActionCliente;
import Classes.ClasseCliente;
import javax.swing.JOptionPane;

public class FrameCliente extends javax.swing.JInternalFrame {
    
    private ClasseCliente cliente    = new ClasseCliente();
    private ActionCliente actCliente = new ActionCliente(this, cliente);
    
    private String caracteres = "0987654321";        
    
    public FrameCliente() {
        initComponents();
        
        cliSalvar.addActionListener(actCliente);
        cliExcluir.addActionListener(actCliente);
        cliCancelar.addActionListener(actCliente);
        cliNovo.addActionListener(actCliente);
    }
    
    public void novoCliente(){
        
        cliCodigo.setText("");
        cliNome.setText("");
        cliCpf.setText("");
        cliSexoMasculino.setSelected(false);
        cliSexoFeminino.setSelected(false);
        cliTelefone.setText("");
        cliRg.setText("");
        cliEmail.setText("");
        cliCidade.setText("");
        cliEndereco.setText("");
        
        cliCodigo.setEnabled(true);
        cliNome.setEnabled(true);
        cliCpf.setEnabled(true);
        cliSexoMasculino.setEnabled(true);
        cliSexoFeminino.setEnabled(true);
        cliTelefone.setEnabled(true);
        cliRg.setEnabled(true);
        cliEmail.setEnabled(true);
        cliCidade.setEnabled(true);
        cliEndereco.setEnabled(true);
        cliEstado.setEnabled(true);
        
        cliNovo.setEnabled(false);
        cliSalvar.setEnabled(true);
        cliCancelar.setEnabled(true);        
    }
    
    public void cancelarCliente(){
        
        cliCodigo.setText("");
        cliNome.setText("");
        cliCpf.setText("");
        cliSexoMasculino.setSelected(false);
        cliSexoFeminino.setSelected(false);
        cliTelefone.setText("");
        cliRg.setText("");
        cliEmail.setText("");
        cliCidade.setText("");
        cliEndereco.setText("");
        
        cliCodigo.setEnabled(false);
        cliNome.setEnabled(false);
        cliCpf.setEnabled(false);
        cliSexoMasculino.setEnabled(false);
        cliSexoFeminino.setEnabled(false);
        cliTelefone.setEnabled(false);
        cliRg.setEnabled(false);
        cliEmail.setEnabled(false);
        cliCidade.setEnabled(false);
        cliEndereco.setEnabled(false);
        cliEstado.setEnabled(false);
        
        cliNovo.setEnabled(true);
        cliSalvar.setEnabled(false);
        cliCancelar.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cliCodigo = new javax.swing.JTextField();
        cliNome = new javax.swing.JTextField();
        cliCpf = new javax.swing.JTextField();
        cliRg = new javax.swing.JTextField();
        cliEmail = new javax.swing.JTextField();
        cliTelefone = new javax.swing.JTextField();
        cliCidade = new javax.swing.JTextField();
        cliEndereco = new javax.swing.JTextField();
        cliSexoMasculino = new javax.swing.JRadioButton();
        cliSexoFeminino = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cliNovo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cliSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cliExcluir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cliCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cliEstado = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Clientes");

        jLabel10.setText("Endereço:");

        jLabel11.setText("Estado:");

        cliCodigo.setEnabled(false);
        cliCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliCodigoActionPerformed(evt);
            }
        });
        cliCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliCodigoKeyReleased(evt);
            }
        });

        cliNome.setEnabled(false);
        cliNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliNomeKeyReleased(evt);
            }
        });

        cliCpf.setEnabled(false);
        cliCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliCpfKeyReleased(evt);
            }
        });

        cliRg.setEnabled(false);
        cliRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliRgActionPerformed(evt);
            }
        });
        cliRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliRgKeyReleased(evt);
            }
        });

        cliEmail.setEnabled(false);
        cliEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliEmailKeyReleased(evt);
            }
        });

        cliTelefone.setEnabled(false);
        cliTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliTelefoneKeyReleased(evt);
            }
        });

        cliCidade.setEnabled(false);
        cliCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliCidadeKeyReleased(evt);
            }
        });

        cliEndereco.setEnabled(false);
        cliEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliEnderecoKeyReleased(evt);
            }
        });

        buttonGroup1.add(cliSexoMasculino);
        cliSexoMasculino.setText("Masculino");
        cliSexoMasculino.setEnabled(false);
        cliSexoMasculino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cliSexoMasculinoItemStateChanged(evt);
            }
        });
        cliSexoMasculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cliSexoMasculinoMouseClicked(evt);
            }
        });
        cliSexoMasculino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cliSexoMasculinoKeyPressed(evt);
            }
        });

        buttonGroup1.add(cliSexoFeminino);
        cliSexoFeminino.setText("Feminino");
        cliSexoFeminino.setEnabled(false);
        cliSexoFeminino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cliSexoFemininoItemStateChanged(evt);
            }
        });
        cliSexoFeminino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cliSexoFemininoMouseClicked(evt);
            }
        });
        cliSexoFeminino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cliSexoFemininoKeyPressed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        cliNovo.setText("Novo");

        jLabel3.setText("CPF:");

        cliSalvar.setText("Salvar");
        cliSalvar.setEnabled(false);

        jLabel4.setText("RG:");

        cliExcluir.setText("Excluir");
        cliExcluir.setEnabled(false);

        jLabel5.setText("Sexo:");

        cliCancelar.setText("Cancelar");
        cliCancelar.setEnabled(false);
        cliCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliCancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefone:");

        jLabel7.setText("Email:");

        jLabel9.setText("Cidade:");

        cliEstado.setEnabled(false);
        cliEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliEstadoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cliNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cliExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cliCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cliNome)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cliCpf)
                                        .addComponent(cliTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cliRg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cliEmail)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cliCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cliEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cliSexoMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cliSexoFeminino)))))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cliCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cliCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cliRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cliSexoMasculino)
                    .addComponent(cliSexoFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cliTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cliCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cliEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliNovo)
                    .addComponent(cliSalvar)
                    .addComponent(cliExcluir)
                    .addComponent(cliCancelar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cliCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliCodigoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cliCodigoActionPerformed

    private void cliRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliRgActionPerformed

    private void cliCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliCancelarActionPerformed

    private void cliNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliNomeKeyReleased
        cliente.setCliNome(cliNome.getText());
    }//GEN-LAST:event_cliNomeKeyReleased

    private void cliCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliCodigoKeyReleased
        
        if (validaInteiro(cliCodigo.getText()))
            cliente.setCliCodigo(Integer.parseInt(cliCodigo.getText()));             
        else
            cliCodigo.setText(cliCodigo.getText().substring(0,cliCodigo.getText().length()-1));            
            
    }//GEN-LAST:event_cliCodigoKeyReleased

    private void cliCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliCpfKeyReleased
        cliente.setCliCpf(cliCpf.getText());
    }//GEN-LAST:event_cliCpfKeyReleased

    private void cliRgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliRgKeyReleased
        cliente.setCliRg(cliRg.getText());
    }//GEN-LAST:event_cliRgKeyReleased

    private void cliTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliTelefoneKeyReleased
        cliente.setCliTelefone(cliTelefone.getText());
    }//GEN-LAST:event_cliTelefoneKeyReleased

    private void cliEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliEmailKeyReleased
        cliente.setCliEmail(cliEmail.getText());
    }//GEN-LAST:event_cliEmailKeyReleased

    private void cliCidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliCidadeKeyReleased
        cliente.setCliCidade(cliCidade.getText());
    }//GEN-LAST:event_cliCidadeKeyReleased

    private void cliEnderecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliEnderecoKeyReleased
        cliente.setCliEndereco(cliEndereco.getText());
    }//GEN-LAST:event_cliEnderecoKeyReleased

    private void cliSexoMasculinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliSexoMasculinoKeyPressed
        
    }//GEN-LAST:event_cliSexoMasculinoKeyPressed

    private void cliSexoFemininoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliSexoFemininoKeyPressed
        
    }//GEN-LAST:event_cliSexoFemininoKeyPressed

    private void cliEstadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliEstadoKeyReleased
        cliente.setCliEstado(cliEstado.getText());
    }//GEN-LAST:event_cliEstadoKeyReleased

    private void cliSexoMasculinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cliSexoMasculinoItemStateChanged
        
    }//GEN-LAST:event_cliSexoMasculinoItemStateChanged

    private void cliSexoFemininoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cliSexoFemininoItemStateChanged
        
    }//GEN-LAST:event_cliSexoFemininoItemStateChanged

    private void cliSexoMasculinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliSexoMasculinoMouseClicked
        cliente.setCliSexo("M");
    }//GEN-LAST:event_cliSexoMasculinoMouseClicked

    private void cliSexoFemininoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliSexoFemininoMouseClicked
       cliente.setCliSexo("F");
    }//GEN-LAST:event_cliSexoFemininoMouseClicked
    
    private boolean validaInteiro(String vtxt){        
        if(caracteres.contains(vtxt.substring(vtxt.length()-1,vtxt.length())))
            return true;
        else
            return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cliCancelar;
    private javax.swing.JTextField cliCidade;
    private javax.swing.JTextField cliCodigo;
    private javax.swing.JTextField cliCpf;
    private javax.swing.JTextField cliEmail;
    private javax.swing.JTextField cliEndereco;
    private javax.swing.JTextField cliEstado;
    private javax.swing.JButton cliExcluir;
    private javax.swing.JTextField cliNome;
    private javax.swing.JButton cliNovo;
    private javax.swing.JTextField cliRg;
    private javax.swing.JButton cliSalvar;
    private javax.swing.JRadioButton cliSexoFeminino;
    private javax.swing.JRadioButton cliSexoMasculino;
    private javax.swing.JTextField cliTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
