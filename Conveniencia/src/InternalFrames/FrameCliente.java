package InternalFrames;

import Actions.ActionCliente;
import Classes.ClasseCliente;

public class FrameCliente extends javax.swing.JInternalFrame {
    
    private ClasseCliente cliente    = new ClasseCliente();
    private ActionCliente actCliente = new ActionCliente(this, cliente);
    
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
        cliPlaca.setText("");
        cliRg.setText("");
        cliEmail.setText("");
        cliCidade.setText("");
        cliEndereco.setText("");
        
        cliNome.setEnabled(true);
        cliCpf.setEnabled(true);
        cliSexoMasculino.setEnabled(true);
        cliSexoFeminino.setEnabled(true);
        cliTelefone.setEnabled(true);
        cliPlaca.setEnabled(true);
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
        cliPlaca.setText("");
        cliRg.setText("");
        cliEmail.setText("");
        cliCidade.setText("");
        cliEndereco.setText("");
        
        cliNome.setEnabled(false);
        cliCpf.setEnabled(false);
        cliSexoMasculino.setEnabled(false);
        cliSexoFeminino.setEnabled(false);
        cliTelefone.setEnabled(false);
        cliPlaca.setEnabled(false);
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
        cliPlaca = new javax.swing.JTextField();
        cliSexoMasculino = new javax.swing.JRadioButton();
        cliSexoFeminino = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        cliEstado = new javax.swing.JComboBox<>();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel10.setText("Endereço:");

        jLabel11.setText("Estado:");

        cliCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliCodigoActionPerformed(evt);
            }
        });

        cliNome.setEnabled(false);

        cliCpf.setEnabled(false);

        cliRg.setEnabled(false);
        cliRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliRgActionPerformed(evt);
            }
        });

        cliEmail.setEnabled(false);

        cliTelefone.setEnabled(false);

        cliCidade.setEnabled(false);

        cliEndereco.setEnabled(false);

        cliPlaca.setEnabled(false);

        cliSexoMasculino.setText("Masculino");
        cliSexoMasculino.setEnabled(false);

        cliSexoFeminino.setText("Feminino");
        cliSexoFeminino.setEnabled(false);

        jLabel1.setText("Código:");

        cliEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP ", "AM ", "BA ", "CE ", "DF ", "ES ", "GO ", "MA ", "MT ", "MS ", "MG ", "PA ", "PB ", "PR ", "PE ", "PI ", "RJ ", "RN", "RS", "RO", "RR ", "SC ", "SP ", "SE ", "TO" }));
        cliEstado.setAutoscrolls(true);
        cliEstado.setEnabled(false);
        cliEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliEstadoActionPerformed(evt);
            }
        });

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

        jLabel8.setText("Placa:");

        jLabel9.setText("Cidade:");

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
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(jLabel8))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addComponent(jLabel4)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cliRg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cliPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(cliEmail)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(cliCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cliEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(94, 94, 94))
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
                    .addComponent(cliTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cliPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cliCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliCodigoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cliCodigoActionPerformed

    private void cliRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliRgActionPerformed

    private void cliEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliEstadoActionPerformed

    private void cliCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField cliPlaca;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
