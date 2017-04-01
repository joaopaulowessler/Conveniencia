package InternalFrames;

import Actions.ActionFuncionario;
import Classes.ClasseFuncionario;

public class FrameFuncionario extends javax.swing.JInternalFrame {
    
    private ClasseFuncionario funcionario    = new ClasseFuncionario();
    private ActionFuncionario actFuncionario = new ActionFuncionario(this, funcionario);
    
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

        jLabel14 = new javax.swing.JLabel();
        funEndereco = new javax.swing.JTextField();
        funEstado = new javax.swing.JComboBox<>();
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

        setTitle("Funcionários");

        jLabel14.setText("Endereço:");

        funEndereco.setEnabled(false);

        funEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP ", "AM ", "BA ", "CE ", "DF ", "ES ", "GO ", "MA ", "MT ", "MS ", "MG ", "PA ", "PB ", "PR ", "PE ", "PI ", "RJ ", "RN", "RS", "RO", "RR ", "SC ", "SP ", "SE ", "TO" }));
        funEstado.setEnabled(false);

        jLabel16.setText("RG:");

        funRg.setEnabled(false);
        funRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funRgActionPerformed(evt);
            }
        });

        funTelefone.setEnabled(false);

        funSexoFeminino.setText("Feminino");
        funSexoFeminino.setEnabled(false);

        funSexoMasculino.setText("Masculino");
        funSexoMasculino.setEnabled(false);

        jLabel17.setText("Sexo:");

        jLabel18.setText("Telefone:");

        funExcluir.setText("Excluir");
        funExcluir.setEnabled(false);

        funCancelar.setText("Cancelar");
        funCancelar.setEnabled(false);

        funNovo.setText("Novo");

        funCidade.setEnabled(false);

        jLabel12.setText("Cidade:");

        jLabel13.setText("Email:");

        funEmail.setEnabled(false);

        jLabel19.setText("CPF:");

        funCpf.setEnabled(false);

        funNome.setEnabled(false);

        jLabel20.setText("Nome:");

        jLabel21.setText("Código:");

        funCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funCodigoActionPerformed(evt);
            }
        });

        jLabel15.setText("Data Admissão:");

        funDataAdm.setEnabled(false);

        jLabel22.setText("Estado:");

        funSalvar.setText("Salvar");
        funSalvar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(funNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(funSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(funDataAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel17))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(funSexoMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(funSexoFeminino))
                            .addComponent(funTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(funCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(funRg))
                            .addComponent(funNome, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(funCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(funEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(funCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(funEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(funEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(funCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(funNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(funCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(funRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funSexoFeminino)
                    .addComponent(funSexoMasculino)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(funEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(funCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funDataAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funSalvar)
                    .addComponent(funExcluir)
                    .addComponent(funCancelar)
                    .addComponent(funNovo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void funRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funRgActionPerformed

    private void funCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funCodigoActionPerformed

    public void novoFuncionario(){
        
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
        
        funNovo.setEnabled(false);
        funSalvar.setEnabled(true);
        funCancelar.setEnabled(true);        
    }
    
    public void cancelarFuncionario(){
        
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
        
        funNovo.setEnabled(true);
        funSalvar.setEnabled(false);
        funCancelar.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
}
