package net.unesc.conveniencia.internalframes;

import java.io.IOException;
import javax.swing.JOptionPane;
import net.unesc.conveniencia.actions.ActionFuncionario;
import net.unesc.conveniencia.classes.Funcionario;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.log.Log;

public class FrameFuncionario extends javax.swing.JInternalFrame {

    private final ActionFuncionario actFuncionario = new ActionFuncionario(this);
    
    Log log = new Log();
    
    public FrameFuncionario() {
        initComponents();

        funSalvar.addActionListener(actFuncionario);
        funExcluir.addActionListener(actFuncionario);
        funCancelar.addActionListener(actFuncionario);
        funNovo.addActionListener(actFuncionario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        funNovo = new javax.swing.JButton();
        funSalvar = new javax.swing.JButton();
        funExcluir = new javax.swing.JButton();
        funCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        funEndereco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        funCidade = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        funEstado = new javax.swing.JComboBox<>();
        funEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        funTelefone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        funDataAdm = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        funSexoMasculino = new javax.swing.JRadioButton();
        funSexoFeminino = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        funCpf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        funRg = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        funNome = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        funCodigo = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Funcionários");
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

        funNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        funNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/novo.png"))); // NOI18N
        funNovo.setText("Novo");

        funSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        funSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/salvar.png"))); // NOI18N
        funSalvar.setText("Salvar");
        funSalvar.setEnabled(false);

        funExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        funExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/excluir.png"))); // NOI18N
        funExcluir.setText("Excluir");
        funExcluir.setEnabled(false);

        funCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        funCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/cancelar.png"))); // NOI18N
        funCancelar.setText("Cancelar");
        funCancelar.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(funNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(funSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(funExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(funCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(funSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(funExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(funCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Endereço:");

        funEndereco.setEnabled(false);
        funEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funEnderecoKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Cidade:");

        funCidade.setEnabled(false);
        funCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funCidadeKeyReleased(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setText("Estado:");

        funEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP ", "AM ", "BA ", "CE ", "DF ", "ES ", "GO ", "MA ", "MT ", "MS ", "MG ", "PA ", "PB ", "PR ", "PE ", "PI ", "RJ ", "RN", "RS", "RO", "RR ", "SC ", "SP ", "SE ", "TO" }));
        funEstado.setEnabled(false);

        funEmail.setEnabled(false);
        funEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funEmailKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Email:");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Telefone:");

        funTelefone.setEnabled(false);
        funTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funTelefoneKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Data Admissão:");

        funDataAdm.setEnabled(false);
        funDataAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funDataAdmActionPerformed(evt);
            }
        });
        funDataAdm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funDataAdmKeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Sexo:");

        buttonGroup1.add(funSexoMasculino);
        funSexoMasculino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        funSexoMasculino.setText("Masculino");
        funSexoMasculino.setEnabled(false);
        funSexoMasculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                funSexoMasculinoMouseClicked(evt);
            }
        });
        funSexoMasculino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funSexoMasculinoKeyReleased(evt);
            }
        });

        buttonGroup1.add(funSexoFeminino);
        funSexoFeminino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        funSexoFeminino.setText("Feminino");
        funSexoFeminino.setEnabled(false);
        funSexoFeminino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                funSexoFemininoMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("CPF:");

        funCpf.setEnabled(false);
        funCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funCpfKeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("RG:");

        funRg.setEnabled(false);
        funRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funRgActionPerformed(evt);
            }
        });
        funRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funRgKeyReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("Nome:");

        funNome.setEnabled(false);
        funNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funNomeKeyReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Código:");

        funCodigo.setEnabled(false);
        funCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funCodigoActionPerformed(evt);
            }
        });
        funCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funCodigoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(funEmail)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(funTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(funDataAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(funNome)
                            .addComponent(funEndereco)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(funSexoMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(funSexoFeminino))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(funCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(funRg, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(funCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(funEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(funCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(funNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(funCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(funRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(funSexoMasculino)
                    .addComponent(funSexoFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(funTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(funDataAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(funEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(funCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(funEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(funEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void funRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funRgActionPerformed

    private void funCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funCodigoActionPerformed

    private void funCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_funCodigoKeyReleased
        /*
        if (validaInteiro(funCodigo.getText())) {
            funcionario.setFunCodigo(Integer.parseInt(funCodigo.getText()));
        } else {
            funCodigo.setText(funCodigo.getText().substring(0, funCodigo.getText().length() - 1));
        }*/
    }//GEN-LAST:event_funCodigoKeyReleased

    private void funNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_funNomeKeyReleased

    }//GEN-LAST:event_funNomeKeyReleased

    private void funCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_funCpfKeyReleased

    }//GEN-LAST:event_funCpfKeyReleased

    private void funRgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_funRgKeyReleased

    }//GEN-LAST:event_funRgKeyReleased

    private void funSexoMasculinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_funSexoMasculinoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_funSexoMasculinoKeyReleased

    private void funSexoMasculinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funSexoMasculinoMouseClicked

    }//GEN-LAST:event_funSexoMasculinoMouseClicked

    private void funSexoFemininoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funSexoFemininoMouseClicked

    }//GEN-LAST:event_funSexoFemininoMouseClicked

    private void funTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_funTelefoneKeyReleased

    }//GEN-LAST:event_funTelefoneKeyReleased

    private void funEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_funEmailKeyReleased

    }//GEN-LAST:event_funEmailKeyReleased

    private void funCidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_funCidadeKeyReleased

    }//GEN-LAST:event_funCidadeKeyReleased

    private void funEnderecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_funEnderecoKeyReleased

    }//GEN-LAST:event_funEnderecoKeyReleased

    private void funDataAdmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_funDataAdmKeyReleased

    }//GEN-LAST:event_funDataAdmKeyReleased

    private void funDataAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funDataAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funDataAdmActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        try {
            log.escrever("Saiu do cadastro de funcionário", "log.txt");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_formInternalFrameClosed

    public void novoFuncionario() {

        funCodigo.setText("");
        funNome.setText("");
        funCpf.setText("");
        funSexoMasculino.setSelected(false);
        funSexoFeminino.setSelected(false);
        funTelefone.setText("");
        funRg.setText("");
        funEmail.setText("");
        funCidade.setText("");
        funEndereco.setText("");
        funDataAdm.setText("");

        funCodigo.setEnabled(true);
        funNome.setEnabled(true);
        funCpf.setEnabled(true);
        funSexoMasculino.setEnabled(true);
        funSexoFeminino.setEnabled(true);
        funTelefone.setEnabled(true);
        funRg.setEnabled(true);
        funEmail.setEnabled(true);
        funCidade.setEnabled(true);
        funEndereco.setEnabled(true);
        funDataAdm.setEnabled(true);
        funEstado.setEnabled(true);

        funNovo.setEnabled(false);
        funSalvar.setEnabled(true);
        funCancelar.setEnabled(true);
    }

    public void cancelarFuncionario() {

        funCodigo.setText("");
        funNome.setText("");
        funCpf.setText("");
        funSexoMasculino.setSelected(false);
        funSexoFeminino.setSelected(false);
        funTelefone.setText("");
        funRg.setText("");
        funEmail.setText("");
        funCidade.setText("");
        funEndereco.setText("");
        funDataAdm.setText("");

        funCodigo.setEnabled(false);
        funNome.setEnabled(false);
        funCpf.setEnabled(false);
        funSexoMasculino.setEnabled(false);
        funSexoFeminino.setEnabled(false);
        funTelefone.setEnabled(false);
        funRg.setEnabled(false);
        funEmail.setEnabled(false);
        funCidade.setEnabled(false);
        funEndereco.setEnabled(false);
        funDataAdm.setEnabled(false);
        funEstado.setEnabled(false);
        funNovo.setEnabled(true);
        funSalvar.setEnabled(false);
        funCancelar.setEnabled(false);
    }
    /*
    private boolean validaInteiro(String vtxt){        
        if(caracteres.contains(vtxt.substring(vtxt.length()-1,vtxt.length())))
            return true;
        else
            return false;
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton funCancelar;
    private javax.swing.JTextField funCidade;
    private javax.swing.JTextField funCodigo;
    private javax.swing.JTextField funCpf;
    private javax.swing.JTextField funDataAdm;
    private javax.swing.JTextField funEmail;
    private javax.swing.JTextField funEndereco;
    private javax.swing.JComboBox<String> funEstado;
    private javax.swing.JButton funExcluir;
    private javax.swing.JTextField funNome;
    private javax.swing.JButton funNovo;
    private javax.swing.JTextField funRg;
    private javax.swing.JButton funSalvar;
    private javax.swing.JRadioButton funSexoFeminino;
    private javax.swing.JRadioButton funSexoMasculino;
    private javax.swing.JTextField funTelefone;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
     public Funcionario getFuncionario() throws ExceptionConveniencia {
        Funcionario fun = new Funcionario();

        if (funCodigo.getText().trim().isEmpty()) {
            throw new ExceptionConveniencia("Código do funcionário deve ser informado!");
        }
        
        if (!validaCaracteres(funCodigo.getText())) {
            throw new ExceptionConveniencia("Código do funcionário inválido!");
        }

        if (funNome.getText().trim().isEmpty()) {
            throw new ExceptionConveniencia("Nome do funcionário deve ser informado!");
        }

        fun.setFunCodigo(Integer.parseInt(funCodigo.getText()));
        fun.setFunNome(funNome.getText());
        fun.setFunCpf(funCpf.getText());
        fun.setFunTelefone(funTelefone.getText());
        fun.setFunRg(funRg.getText());
        fun.setFunEmail(funEmail.getText());
        fun.setFunCidade(funCidade.getText());
        fun.setFunEndereco(funEndereco.getText());
        fun.setFunEstado((String) funEstado.getSelectedItem());
        fun.setFunDataAdm(funDataAdm.getText());

        if (funSexoMasculino.isSelected()) {
            fun.setFunSexo("M");
        } else {
            fun.setFunSexo("F");
        }

        return fun;
    }

    public boolean validaCaracteres(String vtxt) {
        String caracteres = "0123456789,";

        for (int i = 0; i < vtxt.length(); i++) {
            if (!caracteres.contains(vtxt.substring(i, i + 1))) {
                return false;
            }
        }
        return true;
    }
}
