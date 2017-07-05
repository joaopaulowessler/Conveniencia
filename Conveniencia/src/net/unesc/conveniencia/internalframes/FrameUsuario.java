package net.unesc.conveniencia.internalframes;

import javax.swing.JOptionPane;
import net.unesc.conveniencia.actions.ActionUsuario;
import net.unesc.conveniencia.actions.ActionUsuario;
import net.unesc.conveniencia.classes.Usuario;
import net.unesc.conveniencia.classes.Usuario;
import net.unesc.conveniencia.conexao.UsuarioDao;
import net.unesc.conveniencia.exception.ExceptionConveniencia;
import net.unesc.conveniencia.log.Log;

public class FrameUsuario extends javax.swing.JInternalFrame {
    
    private ActionUsuario actUsuario = new ActionUsuario(this);
    
    Log log = new Log();
    
    public FrameUsuario() {
        initComponents();
        
        usuSalvar.addActionListener(actUsuario);
        usuExcluir.addActionListener(actUsuario);
        usuCancelar.addActionListener(actUsuario);
        usuNovo.addActionListener(actUsuario);
    }
    
    public void setCodigo(int codigo){
        usuCodigo.setText(String.valueOf(codigo));
    }
    
    public void novoUsuario(){
        
        usuNome.setText("");
        usuUsuario.setText("");
        usuSenha.setText("");
        
        usuCodigo.setEnabled(false);
        usuNome.setEnabled(true);
        usuUsuario.setEnabled(true);
        usuSenha.setEnabled(true);               
        
        usuNovo.setEnabled(false);
        usuSalvar.setEnabled(true);
        usuExcluir.setEnabled(false);
        usuCancelar.setEnabled(true);
        
        usuNome.requestFocus();
    }
    
    public void cancelarUsuario(){
        
        usuCodigo.setText("");
        usuNome.setText("");
        usuUsuario.setText("");
        usuSenha.setText("");
        
        usuCodigo.setEnabled(true);
        usuNome.setEnabled(false);
        usuUsuario.setEnabled(false);
        usuSenha.setEnabled(false);
                
        usuNovo.setEnabled(true);
        usuSalvar.setEnabled(false);
        usuCancelar.setEnabled(false); 
        usuExcluir.setEnabled(false);
        
        usuCodigo.requestFocus();
    }
    
    public void limpaUsuario(){
        
        usuNome.setText("");
        usuUsuario.setText("");
        usuSenha.setText("");       
        
        usuNome.setEnabled(false);
        usuUsuario.setEnabled(false);
        usuSenha.setEnabled(false);
        
        usuNovo.setEnabled(true);
        usuSalvar.setEnabled(false);
        usuCancelar.setEnabled(false);
        usuExcluir.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        usuNome = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        usuCodigo = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        usuUsuario = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        usuSenha = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        usuCancelar = new javax.swing.JButton();
        usuExcluir = new javax.swing.JButton();
        usuSalvar = new javax.swing.JButton();
        usuNovo = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Usuários");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        usuNome.setEnabled(false);
        usuNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuNomeKeyReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setText("Nome:");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setText("Código:");

        usuCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuCodigoFocusLost(evt);
            }
        });
        usuCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuCodigoKeyReleased(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setText("Usuário:");

        usuUsuario.setEnabled(false);
        usuUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuUsuarioKeyReleased(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setText("Senha:");

        usuSenha.setEnabled(false);
        usuSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuSenhaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuNome, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(usuUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usuSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(usuCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(usuNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(usuUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        usuCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usuCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/cancelar.png"))); // NOI18N
        usuCancelar.setText("Cancelar");
        usuCancelar.setEnabled(false);

        usuExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usuExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/excluir.png"))); // NOI18N
        usuExcluir.setText("Excluir");
        usuExcluir.setEnabled(false);

        usuSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/salvar.png"))); // NOI18N
        usuSalvar.setText("Salvar");
        usuSalvar.setEnabled(false);
        usuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuSalvarActionPerformed(evt);
            }
        });

        usuNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        usuNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/net/unesc/conveniencia/icones/novo.png"))); // NOI18N
        usuNovo.setText("Novo");
        usuNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(usuNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuNomeKeyReleased

    }//GEN-LAST:event_usuNomeKeyReleased

    private void usuCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuCodigoFocusLost
        String codTxt = usuCodigo.getText().trim();

        if(codTxt.length() > 0){
            Integer codigo = null;

            try{
                codigo = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){
                return;
            }

            Usuario usu = UsuarioDao.getUsuario(codigo);

            if(usu != null){
                novoUsuario();
                usuExcluir.setEnabled(true);
                setUsuario(usu);
            }
            else{
                JOptionPane.showMessageDialog(null,"Usuário Não Encontrado!");
                usuCodigo.requestFocus();
                limpaUsuario();
            }
        }
    }//GEN-LAST:event_usuCodigoFocusLost

    private void usuCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuCodigoKeyReleased

    }//GEN-LAST:event_usuCodigoKeyReleased

    private void usuUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuUsuarioKeyReleased

    }//GEN-LAST:event_usuUsuarioKeyReleased

    private void usuSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuSenhaKeyReleased

    }//GEN-LAST:event_usuSenhaKeyReleased

    private void usuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuSalvarActionPerformed

    }//GEN-LAST:event_usuSalvarActionPerformed

    private void usuNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuNovoActionPerformed

    }//GEN-LAST:event_usuNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton usuCancelar;
    private javax.swing.JTextField usuCodigo;
    private javax.swing.JButton usuExcluir;
    private javax.swing.JTextField usuNome;
    private javax.swing.JButton usuNovo;
    private javax.swing.JButton usuSalvar;
    private javax.swing.JTextField usuSenha;
    private javax.swing.JTextField usuUsuario;
    // End of variables declaration//GEN-END:variables
    
    public Usuario getUsuario()throws ExceptionConveniencia{
        Usuario usu = new Usuario();
        
        if (usuCodigo.getText().trim().isEmpty()){
            throw new ExceptionConveniencia("Código do Usuário deve ser informado!");       
        }
        
        if (!validaCaracteres(usuCodigo.getText())) {
            throw new ExceptionConveniencia("Código do Usuário inválido!");
        }
        
        if (usuNome.getText().trim().isEmpty()){
            usuNome.requestFocus();
            throw new ExceptionConveniencia("Nome do Usuário deve ser informado!");
        }
        
        if (usuUsuario.getText().trim().isEmpty()){
            usuUsuario.requestFocus();
            throw new ExceptionConveniencia("Usuário deve ser informado!");
        }
        
        if (usuSenha.getText().trim().isEmpty()){
            usuSenha.requestFocus();
            throw new ExceptionConveniencia("Senha deve ser informada!");
        }
        
        usu.setUsuCodigo(Integer.parseInt(usuCodigo.getText()));
        usu.setUsuNome(usuNome.getText());
        usu.setUsuUsuario(usuUsuario.getText());
        usu.setUsuSenha(usuSenha.getText());
        
        return usu;
    }
    
    public boolean validaCaracteres(String vtxt) {
        String caracteres = "0123456789.";
        
        for (int i = 0; i < vtxt.length(); i++){
            if (!caracteres.contains(vtxt.substring(i,i+1)))
                return false;            
        }            
        return true;
    }
    
    private void setUsuario(Usuario usu) {
        usuCodigo.setText(String.valueOf(usu.getUsuCodigo()));
        usuNome.setText(usu.getUsuNome());
        usuUsuario.setText(usu.getUsuUsuario());
        usuSenha.setText(usu.getUsuSenha());        
    }
}
