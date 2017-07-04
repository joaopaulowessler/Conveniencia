package net.unesc.conveniencia.internalframes;

import java.io.IOException;
import net.unesc.conveniencia.actions.ActionCliente;
import net.unesc.conveniencia.classes.Cliente;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import javax.swing.JOptionPane;
import net.unesc.conveniencia.classes.Produto;
import net.unesc.conveniencia.conexao.ClienteDao;
import net.unesc.conveniencia.conexao.ProdutoDao;
import net.unesc.conveniencia.log.Log;

public class FrameCliente extends javax.swing.JInternalFrame {
    
    private final ActionCliente actCliente = new ActionCliente(this); 
    
    Log log = new Log();
    
    public FrameCliente() {
        initComponents();
        
        cliSalvar.addActionListener(actCliente);
        cliExcluir.addActionListener(actCliente);
        cliCancelar.addActionListener(actCliente);
        cliNovo.addActionListener(actCliente);
    }
    
    public void novoCliente(){
        
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
        cliExcluir.setEnabled(false);
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
        
        cliCodigo.setEnabled(true);
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
        cliExcluir.setEnabled(false);
        
        cliCodigo.requestFocus();
    }
    
    public void limpaCliente(){
        
        cliNome.setText("");
        cliCpf.setText("");
        cliRg.setText("");
        cliSexoFeminino.setSelected(false);
        cliSexoMasculino.setSelected(false);
        cliTelefone.setText("");
        cliEmail.setText("");
        cliCidade.setText("");
        cliEstado.setSelectedItem("");
        cliEndereco.setText("");        
        
        cliNome.setEnabled(false);
        cliCpf.setEnabled(false);
        cliRg.setEnabled(false);
        cliSexoFeminino.setEnabled(false);
        cliSexoMasculino.setEnabled(false);
        cliTelefone.setEnabled(false);
        cliEmail.setEnabled(false);
        cliCidade.setEnabled(false);
        cliEstado.setEnabled(false);
        cliEndereco.setEnabled(false);
        
        cliNovo.setEnabled(true);
        cliSalvar.setEnabled(false);
        cliCancelar.setEnabled(false);
        cliExcluir.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cliNovo = new javax.swing.JButton();
        cliSalvar = new javax.swing.JButton();
        cliExcluir = new javax.swing.JButton();
        cliCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cliEndereco = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cliCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cliEstado = new javax.swing.JComboBox<>();
        cliEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cliSexoMasculino = new javax.swing.JRadioButton();
        cliSexoFeminino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        cliTelefone = new javax.swing.JTextField();
        cliCpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cliRg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cliNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cliCodigo = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Clientes");
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

        cliNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cliNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/novo.png"))); // NOI18N
        cliNovo.setText("Novo");
        cliNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliNovoActionPerformed(evt);
            }
        });

        cliSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cliSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/salvar.png"))); // NOI18N
        cliSalvar.setText("Salvar");
        cliSalvar.setEnabled(false);

        cliExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cliExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/excluir.png"))); // NOI18N
        cliExcluir.setText("Excluir");
        cliExcluir.setEnabled(false);

        cliCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cliCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/cancelar.png"))); // NOI18N
        cliCancelar.setText("Cancelar");
        cliCancelar.setEnabled(false);
        cliCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cliNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cliSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cliExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cliCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cliSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cliExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cliCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cliEndereco.setEnabled(false);
        cliEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliEnderecoKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Endereço:");

        cliCidade.setEnabled(false);
        cliCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliCidadeKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Cidade:");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Estado:");

        cliEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP ", "AM ", "BA ", "CE ", "DF ", "ES ", "GO ", "MA ", "MT ", "MS ", "MG ", "PA ", "PB ", "PR ", "PE ", "PI ", "RJ ", "RN", "RS", "RO", "RR ", "SC ", "SP ", "SE ", "TO" }));
        cliEstado.setEnabled(false);

        cliEmail.setEnabled(false);
        cliEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliEmailKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Sexo:");

        buttonGroup1.add(cliSexoMasculino);
        cliSexoMasculino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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
        cliSexoFeminino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Telefone:");

        cliTelefone.setEnabled(false);
        cliTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliTelefoneKeyReleased(evt);
            }
        });

        cliCpf.setEnabled(false);
        cliCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliCpfKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("CPF:");

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

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("RG:");

        cliNome.setEnabled(false);
        cliNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cliNomeKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Código:");

        cliCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cliCodigoFocusLost(evt);
            }
        });
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cliNome)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cliCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cliRg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cliCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cliEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cliEndereco)
                    .addComponent(cliEmail)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cliSexoMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliSexoFeminino)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cliTelefone))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cliCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cliCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cliNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cliRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cliSexoMasculino)
                        .addComponent(cliSexoFeminino))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cliTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(cliEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        
    }//GEN-LAST:event_cliNomeKeyReleased

    private void cliCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliCodigoKeyReleased
        
    }//GEN-LAST:event_cliCodigoKeyReleased

    private void cliCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliCpfKeyReleased
        
    }//GEN-LAST:event_cliCpfKeyReleased

    private void cliRgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliRgKeyReleased
        
    }//GEN-LAST:event_cliRgKeyReleased

    private void cliTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliTelefoneKeyReleased
        
    }//GEN-LAST:event_cliTelefoneKeyReleased

    private void cliEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliEmailKeyReleased
        
    }//GEN-LAST:event_cliEmailKeyReleased

    private void cliCidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliCidadeKeyReleased
        
    }//GEN-LAST:event_cliCidadeKeyReleased

    private void cliEnderecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliEnderecoKeyReleased
        
    }//GEN-LAST:event_cliEnderecoKeyReleased

    private void cliSexoMasculinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliSexoMasculinoKeyPressed

    }//GEN-LAST:event_cliSexoMasculinoKeyPressed

    private void cliSexoFemininoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cliSexoFemininoKeyPressed

    }//GEN-LAST:event_cliSexoFemininoKeyPressed

    private void cliSexoMasculinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cliSexoMasculinoItemStateChanged

    }//GEN-LAST:event_cliSexoMasculinoItemStateChanged

    private void cliSexoFemininoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cliSexoFemininoItemStateChanged

    }//GEN-LAST:event_cliSexoFemininoItemStateChanged

    private void cliSexoMasculinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliSexoMasculinoMouseClicked
        
    }//GEN-LAST:event_cliSexoMasculinoMouseClicked

    private void cliSexoFemininoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliSexoFemininoMouseClicked
        
    }//GEN-LAST:event_cliSexoFemininoMouseClicked

    private void cliNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliNovoActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        try {
            log.escrever("Saiu do cadastro de cliente", "log.txt");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_formInternalFrameClosed

    private void cliCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cliCodigoFocusLost
        String codTxt = cliCodigo.getText().trim();
        
        if(codTxt.length() > 0){
            Integer codigoCliente = null;
            
            try{
                codigoCliente = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){                
                return;
            }
            
            Cliente cli = ClienteDao.getCliente(codigoCliente);
            
            if(cli != null){
                novoCliente();
                cliExcluir.setEnabled(true);
                setCliente(cli);
            }
            else{
                JOptionPane.showMessageDialog(null,"Cliente Não Encontrado!");
                cliCodigo.requestFocus();
                limpaCliente();
            }
        }
    }//GEN-LAST:event_cliCodigoFocusLost

    public void setCodigo(int codigo){
        cliCodigo.setText(String.valueOf(codigo));
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cliCancelar;
    private javax.swing.JTextField cliCidade;
    private javax.swing.JTextField cliCodigo;
    private javax.swing.JTextField cliCpf;
    private javax.swing.JTextField cliEmail;
    private javax.swing.JTextField cliEndereco;
    private javax.swing.JComboBox<String> cliEstado;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
     public Cliente getCliente() throws ExceptionConveniencia {
        Cliente cli = new Cliente();

        if (cliCodigo.getText().trim().isEmpty()) {
            throw new ExceptionConveniencia("Código do cliente deve ser informado!");
        }
        
        if (!validaCaracteres(cliCodigo.getText())) {
            throw new ExceptionConveniencia("Código do cliente inválido!");
        }
        
        if (cliNome.getText().trim().isEmpty()) {
            throw new ExceptionConveniencia("Nome do cliente deve ser informado!");
        }
        
        
        cli.setCliCodigo(Integer.parseInt(cliCodigo.getText()));
        cli.setCliNome(cliNome.getText());
        cli.setCliCpf(cliCpf.getText());
        cli.setCliTelefone(cliTelefone.getText());
        cli.setCliRg(cliRg.getText());
        cli.setCliEmail(cliEmail.getText());
        cli.setCliCidade(cliCidade.getText());
        cli.setCliEndereco(cliEndereco.getText());
        cli.setCliEstado((String) cliEstado.getSelectedItem());

        if (cliSexoFeminino.isSelected()) {
            cli.setCliSexo("F");
        } else {
            cli.setCliSexo("M");
        }

        return cli;
    }
     
    public boolean validaCaracteres(String vtxt) {
        String caracteres = "0123456789,";
        
        for (int i = 0; i < vtxt.length(); i++){
            if (!caracteres.contains(vtxt.substring(i,i+1)))
                return false;            
        }            
        return true;
    }
    
    private void setCliente(Cliente cli) {
        cliCodigo.setText(String.valueOf(cli.getCliCodigo()));
        cliNome.setText(cli.getCliNome());
        cliCpf.setText(cli.getCliCpf());
        cliRg.setText(cli.getCliRg());
        cliTelefone.setText(cli.getCliTelefone());
        cliEmail.setText(cli.getCliEmail());
        cliCidade.setText(cli.getCliCidade());
        cliEstado.setSelectedItem(cli.getCliEstado());
        cliEndereco.setText(cli.getCliEndereco());
        
        if (cli.getCliSexo().trim().equals("M")){
            cliSexoMasculino.setSelected(true);
        }
        
        if (cli.getCliSexo().trim().equals("F"))
            cliSexoFeminino.setSelected(true);
    }
}
