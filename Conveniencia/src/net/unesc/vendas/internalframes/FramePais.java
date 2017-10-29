package net.unesc.vendas.internalframes;

import javax.swing.JOptionPane;
import net.unesc.vendas.actions.ActionPais;
import net.unesc.vendas.classes.Pais;
import net.unesc.vendas.classes.Pais;
import net.unesc.vendas.conexao.PaisDao;
import net.unesc.vendas.exception.ExceptionVendas;

public class FramePais extends javax.swing.JInternalFrame {
    
    private ActionPais actPais = new ActionPais(this);
    
    public FramePais() {
        initComponents();
        
        salvar.addActionListener(actPais);
        excluir.addActionListener(actPais);
        cancelar.addActionListener(actPais);
        novo.addActionListener(actPais);
    }    
    
    public void novoPais(){        
        nome.setText("");                
        codigo.setEnabled(false);
        nome.setEnabled(true);                
        novo.setEnabled(false);
        salvar.setEnabled(true);
        excluir.setEnabled(false);
        cancelar.setEnabled(true);        
        nome.requestFocus();
    }
    
    public void cancelarPais(){        
        codigo.setText("");
        nome.setText("");        
        codigo.setEnabled(true);
        nome.setEnabled(false);                
        novo.setEnabled(true);
        salvar.setEnabled(false);
        cancelar.setEnabled(false); 
        excluir.setEnabled(false);        
        codigo.requestFocus();
    }
    
    public void limpaPais(){        
        nome.setText("");        
        nome.setEnabled(false);        
        novo.setEnabled(true);
        salvar.setEnabled(false);
        cancelar.setEnabled(false);
        excluir.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel8 = new javax.swing.JPanel();
        nome6 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        codigo1 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        cancelar1 = new javax.swing.JButton();
        excluir1 = new javax.swing.JButton();
        salvar1 = new javax.swing.JButton();
        novo1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cancelar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        novo = new javax.swing.JButton();

        setClosable(true);
        setTitle("País");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nome.setEnabled(false);
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeKeyReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setText("Nome:");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setText("Código:");

        codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoFocusLost(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigoKeyReleased(evt);
            }
        });

        jInternalFrame1.setTitle("País");

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nome6.setEnabled(false);
        nome6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nome6KeyReleased(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setText("Nome:");

        jLabel33.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel33.setText("Código:");

        codigo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigo1FocusLost(evt);
            }
        });
        codigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigo1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome6, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(nome6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cancelar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelar1.setText("Cancelar");
        cancelar1.setEnabled(false);

        excluir1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        excluir1.setText("Excluir");
        excluir1.setEnabled(false);

        salvar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salvar1.setText("Salvar");
        salvar1.setEnabled(false);
        salvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar1ActionPerformed(evt);
            }
        });

        novo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        novo1.setText("Novo");
        novo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(novo1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setEnabled(false);

        excluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        excluir.setText("Excluir");
        excluir.setEnabled(false);

        salvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salvar.setText("Salvar");
        salvar.setEnabled(false);
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        novo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyReleased

    }//GEN-LAST:event_nomeKeyReleased

    private void codigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoFocusLost
        String codTxt = codigo.getText().trim();

        if(codTxt.length() > 0){
            Integer codigo = null;

            try{
                codigo = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){
                return;
            }

            Pais pai = PaisDao.getPais(codigo);

            if(pai != null){
                novoPais();
                excluir.setEnabled(true);
                setPais(pai);
            }
            else{
                JOptionPane.showMessageDialog(null,"País Não Encontrado!");
                this.codigo.requestFocus();
                limpaPais();
            }
        }
    }//GEN-LAST:event_codigoFocusLost

    private void codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyReleased

    }//GEN-LAST:event_codigoKeyReleased

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed

    }//GEN-LAST:event_salvarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed

    }//GEN-LAST:event_novoActionPerformed

    private void nome6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nome6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nome6KeyReleased

    private void codigo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigo1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo1FocusLost

    private void codigo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo1KeyReleased

    private void salvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvar1ActionPerformed

    private void novo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novo1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cancelar1;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField codigo1;
    private javax.swing.JButton excluir;
    private javax.swing.JButton excluir1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nome6;
    private javax.swing.JButton novo;
    private javax.swing.JButton novo1;
    private javax.swing.JButton salvar;
    private javax.swing.JButton salvar1;
    // End of variables declaration//GEN-END:variables

    public void setCodigo(int codigo){
        this.codigo.setText(String.valueOf(codigo));
    }
    
    private void setPais(Pais pai) {
        codigo.setText(String.valueOf(pai.getPaiCodigo()));
        nome.setText(pai.getPaiNome());        
    }
    
    public Pais getPais()throws ExceptionVendas{
        Pais pai = new Pais();
        
        if (codigo.getText().trim().isEmpty()){
            throw new ExceptionVendas("Código do País deve ser informado!");       
        }
        
        if (!validaCaracteres(codigo.getText())) {
            throw new ExceptionVendas("Código do País inválido!");
        }
        
        if (nome.getText().trim().isEmpty()){
            nome.requestFocus();
            throw new ExceptionVendas("Nome do País deve ser informado!");
        }
        
        pai.setPaiCodigo(Integer.parseInt(codigo.getText()));
        pai.setPaiNome(nome.getText());        
        
        return pai;
    }
    
    public boolean validaCaracteres(String vtxt) {
        String caracteres = "0123456789.";
        
        for (int i = 0; i < vtxt.length(); i++){
            if (!caracteres.contains(vtxt.substring(i,i+1)))
                return false;            
        }            
        return true;
    }
}
