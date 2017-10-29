package net.unesc.vendas.internalframes;

import javax.swing.JOptionPane;
import net.unesc.vendas.actions.ActionCondicao;
import net.unesc.vendas.classes.Condicao;
import net.unesc.vendas.conexao.CondicaoDao;
import net.unesc.vendas.exception.ExceptionVendas;

public class FrameCondicao extends javax.swing.JInternalFrame {

    private ActionCondicao actCondicao = new ActionCondicao(this);
    
    public FrameCondicao() {
        initComponents();
        
        salvar.addActionListener(actCondicao);
        excluir.addActionListener(actCondicao);
        cancelar.addActionListener(actCondicao);
        novo.addActionListener(actCondicao);
    }    
    
    public void novoCondicao(){        
        nome.setText("");                
        codigo.setEnabled(false);
        nome.setEnabled(true);                
        novo.setEnabled(false);
        salvar.setEnabled(true);
        excluir.setEnabled(false);
        cancelar.setEnabled(true);        
        nome.requestFocus();
    }
    
    public void cancelarCondicao(){        
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
    
    public void limpaCondicao(){        
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

        jPanel1 = new javax.swing.JPanel();
        cancelar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        novo = new javax.swing.JButton();
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
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        cancelar2 = new javax.swing.JButton();
        excluir2 = new javax.swing.JButton();
        salvar2 = new javax.swing.JButton();
        novo2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        nome1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        codigo2 = new javax.swing.JTextField();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jPanel10 = new javax.swing.JPanel();
        nome7 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        codigo3 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        cancelar3 = new javax.swing.JButton();
        excluir3 = new javax.swing.JButton();
        salvar3 = new javax.swing.JButton();
        novo3 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Condição de Pagamento");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(17, Short.MAX_VALUE)
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

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cancelar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelar2.setText("Cancelar");
        cancelar2.setEnabled(false);

        excluir2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        excluir2.setText("Excluir");
        excluir2.setEnabled(false);

        salvar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salvar2.setText("Salvar");
        salvar2.setEnabled(false);
        salvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar2ActionPerformed(evt);
            }
        });

        novo2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        novo2.setText("Novo");
        novo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(novo2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluir2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nome1.setEnabled(false);
        nome1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nome1KeyReleased(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel34.setText("Nome:");

        jLabel35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel35.setText("Código:");

        codigo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigo2FocusLost(evt);
            }
        });
        codigo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigo2KeyReleased(evt);
            }
        });

        jInternalFrame3.setTitle("País");

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nome7.setEnabled(false);
        nome7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nome7KeyReleased(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setText("Nome:");

        jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel37.setText("Código:");

        codigo3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigo3FocusLost(evt);
            }
        });
        codigo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codigo3KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome7, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(codigo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(nome7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cancelar3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelar3.setText("Cancelar");
        cancelar3.setEnabled(false);

        excluir3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        excluir3.setText("Excluir");
        excluir3.setEnabled(false);

        salvar3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salvar3.setText("Salvar");
        salvar3.setEnabled(false);
        salvar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar3ActionPerformed(evt);
            }
        });

        novo3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        novo3.setText("Novo");
        novo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(novo3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluir3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluir3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novo3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(nome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed

    }//GEN-LAST:event_salvarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed

    }//GEN-LAST:event_novoActionPerformed

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

            Condicao con = CondicaoDao.getCondicao(codigo);

            if(con != null){
                novoCondicao();
                excluir.setEnabled(true);
                setCondicao(con);
            }
            else{
                JOptionPane.showMessageDialog(null,"Condição de Pagamento Não Encontrado!");
                this.codigo.requestFocus();
                limpaCondicao();
            }
        }
    }//GEN-LAST:event_codigoFocusLost

    private void codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyReleased

    }//GEN-LAST:event_codigoKeyReleased

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

    private void salvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvar2ActionPerformed

    private void novo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novo2ActionPerformed

    private void nome1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nome1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nome1KeyReleased

    private void codigo2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigo2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo2FocusLost

    private void codigo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo2KeyReleased

    private void nome7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nome7KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nome7KeyReleased

    private void codigo3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigo3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo3FocusLost

    private void codigo3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigo3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo3KeyReleased

    private void salvar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvar3ActionPerformed

    private void novo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novo3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cancelar1;
    private javax.swing.JButton cancelar2;
    private javax.swing.JButton cancelar3;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField codigo1;
    private javax.swing.JTextField codigo2;
    private javax.swing.JTextField codigo3;
    private javax.swing.JButton excluir;
    private javax.swing.JButton excluir1;
    private javax.swing.JButton excluir2;
    private javax.swing.JButton excluir3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nome1;
    private javax.swing.JTextField nome6;
    private javax.swing.JTextField nome7;
    private javax.swing.JButton novo;
    private javax.swing.JButton novo1;
    private javax.swing.JButton novo2;
    private javax.swing.JButton novo3;
    private javax.swing.JButton salvar;
    private javax.swing.JButton salvar1;
    private javax.swing.JButton salvar2;
    private javax.swing.JButton salvar3;
    // End of variables declaration//GEN-END:variables
    
    public void setCodigo(int codigo){
        this.codigo.setText(String.valueOf(codigo));
    }
    
    private void setCondicao(Condicao con) {
        codigo.setText(String.valueOf(con.getConCodigo()));
        nome.setText(con.getConNome());        
    }
    
    public Condicao getCondicao()throws ExceptionVendas{
        Condicao con = new Condicao();
        
        if (codigo.getText().trim().isEmpty()){
            throw new ExceptionVendas("Código da Condição de Pagamento deve ser informado!");       
        }
        
        if (!validaCaracteres(codigo.getText())) {
            throw new ExceptionVendas("Código da Condição de Pagamento inválido!");
        }
        
        if (nome.getText().trim().isEmpty()){
            nome.requestFocus();
            throw new ExceptionVendas("Nome da Condição de Pagamento deve ser informado!");
        }
        
        con.setConCodigo(Integer.parseInt(codigo.getText()));
        con.setConNome(nome.getText());        
        
        return con;
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
