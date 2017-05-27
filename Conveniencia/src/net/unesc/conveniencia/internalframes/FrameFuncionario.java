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
        jLabel14 = new javax.swing.JLabel();
        funEndereco = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        funRg = new javax.swing.JTextField();
        funTelefone = new javax.swing.JTextField();
        funSexoFeminino = new javax.swing.JRadioButton();
        funSexoMasculino = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        funExcluir = new javax.swing.JButton();
        funCancelar = new javax.swing.JButton();
        funNovo = new javax.swing.JButton();
        funCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        funEmail = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        funCpf = new javax.swing.JTextField();
        funNome = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        funCodigo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        funDataAdm = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        funSalvar = new javax.swing.JButton();
        funEstado = new javax.swing.JComboBox<>();

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

        jLabel14.setText("Endereço:");

        funEndereco.setEnabled(false);
        funEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funEnderecoKeyReleased(evt);
            }
        });

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

        funTelefone.setEnabled(false);
        funTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funTelefoneKeyReleased(evt);
            }
        });

        buttonGroup1.add(funSexoFeminino);
        funSexoFeminino.setText("Feminino");
        funSexoFeminino.setEnabled(false);
        funSexoFeminino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                funSexoFemininoMouseClicked(evt);
            }
        });

        buttonGroup1.add(funSexoMasculino);
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

        jLabel17.setText("Sexo:");

        jLabel18.setText("Telefone:");

        funExcluir.setText("Excluir");
        funExcluir.setEnabled(false);

        funCancelar.setText("Cancelar");
        funCancelar.setEnabled(false);

        funNovo.setText("Novo");

        funCidade.setEnabled(false);
        funCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funCidadeKeyReleased(evt);
            }
        });

        jLabel12.setText("Cidade:");

        jLabel13.setText("Email:");

        funEmail.setEnabled(false);
        funEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funEmailKeyReleased(evt);
            }
        });

        jLabel19.setText("CPF:");

        funCpf.setEnabled(false);
        funCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funCpfKeyReleased(evt);
            }
        });

        funNome.setEnabled(false);
        funNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                funNomeKeyReleased(evt);
            }
        });

        jLabel20.setText("Nome:");

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

        jLabel22.setText("Estado:");

        funSalvar.setText("Salvar");
        funSalvar.setEnabled(false);

        funEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP ", "AM ", "BA ", "CE ", "DF ", "ES ", "GO ", "MA ", "MT ", "MS ", "MG ", "PA ", "PB ", "PR ", "PE ", "PI ", "RJ ", "RN", "RS", "RO", "RR ", "SC ", "SP ", "SE ", "TO" }));
        funEstado.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel21)
                        .addGap(10, 10, 10)
                        .addComponent(funCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel20)
                        .addGap(10, 10, 10)
                        .addComponent(funNome, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel19)
                        .addGap(10, 10, 10)
                        .addComponent(funCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel16)
                        .addGap(10, 10, 10)
                        .addComponent(funRg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel17)
                        .addGap(11, 11, 11)
                        .addComponent(funSexoMasculino)
                        .addGap(2, 2, 2)
                        .addComponent(funSexoFeminino))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel18)
                        .addGap(11, 11, 11)
                        .addComponent(funTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel13)
                        .addGap(11, 11, 11)
                        .addComponent(funEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel12)
                        .addGap(11, 11, 11)
                        .addComponent(funCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(funEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel14)
                        .addGap(11, 11, 11)
                        .addComponent(funEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(funNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(funSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(funExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(funCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(10, 10, 10)
                                .addComponent(funDataAdm, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel21))
                    .addComponent(funCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel20))
                    .addComponent(funNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(funCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(funRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel16))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel17))
                    .addComponent(funSexoMasculino)
                    .addComponent(funSexoFeminino))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel18))
                    .addComponent(funTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13))
                    .addComponent(funEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(funCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(funEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14))
                    .addComponent(funEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15))
                    .addComponent(funDataAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funNovo)
                    .addComponent(funSalvar)
                    .addComponent(funExcluir)
                    .addComponent(funCancelar))
                .addGap(12, 12, 12))
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
