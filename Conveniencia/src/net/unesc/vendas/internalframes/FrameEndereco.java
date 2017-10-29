package net.unesc.vendas.internalframes;

import javax.swing.JOptionPane;
import net.unesc.vendas.actions.ActionEndereco;
import net.unesc.vendas.classes.Bairro;
import net.unesc.vendas.classes.Cidade;
import net.unesc.vendas.classes.Endereco;
import net.unesc.vendas.classes.Estado;
import net.unesc.vendas.classes.Pais;
import net.unesc.vendas.conexao.BairroDao;
import net.unesc.vendas.conexao.CidadeDao;
import net.unesc.vendas.conexao.EnderecoDao;
import net.unesc.vendas.conexao.EstadoDao;
import net.unesc.vendas.conexao.PaisDao;
import net.unesc.vendas.exception.ExceptionVendas;

public class FrameEndereco extends javax.swing.JInternalFrame {

    private ActionEndereco actEndereco = new ActionEndereco(this);
    
    public FrameEndereco() {
        initComponents();
        
        salvar.addActionListener(actEndereco);
        excluir.addActionListener(actEndereco);
        cancelar.addActionListener(actEndereco);
        novo.addActionListener(actEndereco);
    }    
    
    public void novoEndereco(){        
        descricao.setText("");
        cep.setText("");
        
        codpais.setText("");
        nomepais.setText("");
        
        codestado.setText("");
        nomeestado.setText("");
        
        codcidade.setText("");
        nomecidade.setText("");
        
        codbairro.setText("");
        nomebairro.setText("");
        
        codigo.setEnabled(false);
        
        descricao.setEnabled(true);
        cep.setEnabled(true);
        
        codpais.setEnabled(true);        
        codestado.setEnabled(true);        
        codcidade.setEnabled(true);        
        codbairro.setEnabled(true);
        
        novo.setEnabled(false);
        salvar.setEnabled(true);
        excluir.setEnabled(false);
        cancelar.setEnabled(true);        
        descricao.requestFocus();
    }
    
    public void cancelarEndereco(){        
        codigo.setText("");
        descricao.setText("");
        cep.setText("");
        
        codpais.setText("");
        nomepais.setText("");
        
        codestado.setText("");
        nomeestado.setText("");
        
        codcidade.setText("");
        nomecidade.setText("");
        
        codbairro.setText("");
        nomebairro.setText("");
        
        codigo.setEnabled(true);
        
        descricao.setEnabled(false);
        cep.setEnabled(false);
        
        codpais.setEnabled(false);        
        codestado.setEnabled(false);        
        codcidade.setEnabled(false);        
        codbairro.setEnabled(false);
        
        novo.setEnabled(true);
        salvar.setEnabled(false);
        cancelar.setEnabled(false); 
        excluir.setEnabled(false);        
        
        codigo.requestFocus();
    }
    
    public void limpaEndereco(){        
        descricao.setText("");
        cep.setText("");
        
        codpais.setText("");
        nomepais.setText("");
        
        codestado.setText("");
        nomeestado.setText("");
        
        codcidade.setText("");
        nomecidade.setText("");
        
        codbairro.setText("");
        nomebairro.setText("");
        
        descricao.setEnabled(false);
        cep.setEnabled(false);
        
        codpais.setEnabled(false);        
        codestado.setEnabled(false);        
        codcidade.setEnabled(false);        
        codbairro.setEnabled(false);
        
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
        descricao = new javax.swing.JTextField();
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
        cep = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        codpais = new javax.swing.JTextField();
        nomepais = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        codestado = new javax.swing.JTextField();
        nomeestado = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        codcidade = new javax.swing.JTextField();
        nomecidade = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        codbairro = new javax.swing.JTextField();
        nomebairro = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Endereço");

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
                .addContainerGap(18, Short.MAX_VALUE))
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

        descricao.setEnabled(false);
        descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descricaoKeyReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setText("Descrição:");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        cep.setEnabled(false);
        cep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cepKeyReleased(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel34.setText("CEP:");

        jLabel35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel35.setText("País:");

        codpais.setEnabled(false);
        codpais.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codpaisFocusLost(evt);
            }
        });
        codpais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codpaisKeyReleased(evt);
            }
        });

        nomepais.setEnabled(false);
        nomepais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomepaisKeyReleased(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel36.setText("Cidade:");

        codestado.setEnabled(false);
        codestado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codestadoFocusLost(evt);
            }
        });
        codestado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codestadoKeyReleased(evt);
            }
        });

        nomeestado.setEnabled(false);
        nomeestado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeestadoKeyReleased(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel37.setText("Estado:");

        codcidade.setEnabled(false);
        codcidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codcidadeFocusLost(evt);
            }
        });
        codcidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codcidadeKeyReleased(evt);
            }
        });

        nomecidade.setEnabled(false);
        nomecidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomecidadeKeyReleased(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel38.setText("Bairro:");

        codbairro.setEnabled(false);
        codbairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codbairroFocusLost(evt);
            }
        });
        codbairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codbairroKeyReleased(evt);
            }
        });

        nomebairro.setEnabled(false);
        nomebairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomebairroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(codpais, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nomepais))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(descricao, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel36))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codestado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomecidade)
                                    .addComponent(nomeestado)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomebairro)))
                        .addGap(32, 32, 32))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nomepais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomecidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomebairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 128, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 128, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed

    }//GEN-LAST:event_salvarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed

    }//GEN-LAST:event_novoActionPerformed

    private void descricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descricaoKeyReleased

    }//GEN-LAST:event_descricaoKeyReleased

    private void codigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoFocusLost
        String codTxt = codigo.getText().trim();

        if(codTxt.length() > 0){
            Integer codigo = null;

            try{
                codigo = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){
                return;
            }

            Endereco est = EnderecoDao.getEndereco(codigo);

            if(est != null){
                novoEndereco();
                excluir.setEnabled(true);
                setEndereco(est);
            }
            else{
                JOptionPane.showMessageDialog(null,"Endereço Não Encontrado!");
                this.codigo.requestFocus();
                limpaEndereco();
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

    private void cepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cepKeyReleased

    private void codpaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codpaisKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codpaisKeyReleased

    private void nomepaisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomepaisKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nomepaisKeyReleased

    private void codestadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codestadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codestadoKeyReleased

    private void nomeestadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeestadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeestadoKeyReleased

    private void codcidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codcidadeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codcidadeKeyReleased

    private void nomecidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomecidadeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nomecidadeKeyReleased

    private void codbairroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codbairroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_codbairroKeyReleased

    private void nomebairroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomebairroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nomebairroKeyReleased

    private void codpaisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codpaisFocusLost
        String codTxt = codpais.getText().trim();
        
        if(codTxt.length() > 0){
            Integer codigoPais = null;
            
            try{
                codigoPais = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){                
                return;
            }
            
            Pais pai = PaisDao.getPais(codigoPais);
            
            if(pai != null)
                nomepais.setText(pai.getPaiNome());
            else{
                nomepais.setText("");
                JOptionPane.showMessageDialog(null,"Pais não encontrado.");
                codpais.requestFocus();
                return;
            }
        }
    }//GEN-LAST:event_codpaisFocusLost

    private void codestadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codestadoFocusLost
        String codTxt = codestado.getText().trim();
        
        if(codTxt.length() > 0){
            Integer codigoEstado = null;
            
            try{
                codigoEstado = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){                
                return;
            }
            
            Estado est = EstadoDao.getEstado(codigoEstado);
            
            if(est != null)
                nomeestado.setText(est.getEstNome());
            else{
                nomeestado.setText("");
                JOptionPane.showMessageDialog(null,"Estado não encontrado.");
                codestado.requestFocus();
                return;
            }
        }
    }//GEN-LAST:event_codestadoFocusLost

    private void codcidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codcidadeFocusLost
        String codTxt = codcidade.getText().trim();
        
        if(codTxt.length() > 0){
            Integer codigoCidade = null;
            
            try{
                codigoCidade = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){                
                return;
            }
            
            Cidade cid = CidadeDao.getCidade(codigoCidade);
            
            if(cid != null)
                nomecidade.setText(cid.getCidNome());
            else{
                nomecidade.setText("");
                JOptionPane.showMessageDialog(null,"Cidade não encontrada.");
                codcidade.requestFocus();
                return;
            }
        }
    }//GEN-LAST:event_codcidadeFocusLost

    private void codbairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codbairroFocusLost
        String codTxt = codbairro.getText().trim();
        
        if(codTxt.length() > 0){
            Integer codigoBairro = null;
            
            try{
                codigoBairro = Integer.parseInt(codTxt);
            }catch(NumberFormatException e){                
                return;
            }
            
            Bairro bai = BairroDao.getBairro(codigoBairro);
            
            if(bai != null)
                nomebairro.setText(bai.getBaiNome());
            else{
                nomebairro.setText("");
                JOptionPane.showMessageDialog(null,"Bairro não encontrada.");
                codbairro.requestFocus();
                return;
            }
        }
    }//GEN-LAST:event_codbairroFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cancelar1;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField codbairro;
    private javax.swing.JTextField codcidade;
    private javax.swing.JTextField codestado;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField codigo1;
    private javax.swing.JTextField codpais;
    private javax.swing.JTextField descricao;
    private javax.swing.JButton excluir;
    private javax.swing.JButton excluir1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField nome6;
    private javax.swing.JTextField nomebairro;
    private javax.swing.JTextField nomecidade;
    private javax.swing.JTextField nomeestado;
    private javax.swing.JTextField nomepais;
    private javax.swing.JButton novo;
    private javax.swing.JButton novo1;
    private javax.swing.JButton salvar;
    private javax.swing.JButton salvar1;
    // End of variables declaration//GEN-END:variables
    
    public void setCodigo(int codigo){
        this.codigo.setText(String.valueOf(codigo));
    }
    
    private void setEndereco(Endereco end) {
        codigo.setText(String.valueOf(end.getEndCodigo()));
        descricao.setText(end.getEndDescricao());        
        cep.setText(String.valueOf(end.getEndCep()));
        codpais.setText(String.valueOf(end.getEndPais()));
        codestado.setText(String.valueOf(end.getEndEstado()));
        codcidade.setText(String.valueOf(end.getEndCidade()));
        codbairro.setText(String.valueOf(end.getEndBairro()));
        
        Pais pai = PaisDao.getPais(end.getEndPais());            
        if(pai != null)
            nomepais.setText(pai.getPaiNome());
        else
            nomepais.setText("");
        
        Estado est = EstadoDao.getEstado(end.getEndEstado());            
        if(est != null)
            nomeestado.setText(est.getEstNome());
        else
            nomeestado.setText("");
        
        Cidade cid = CidadeDao.getCidade(end.getEndCidade());            
        if(cid != null)
            nomecidade.setText(cid.getCidNome());
        else
            nomecidade.setText("");
        
        
        Bairro bai = BairroDao.getBairro(end.getEndBairro());            
        if(bai != null)
            nomebairro.setText(bai.getBaiNome());
        else
            nomebairro.setText("");
    }
    
    public Endereco getEndereco()throws ExceptionVendas{
        Endereco end = new Endereco();
        
        if (codigo.getText().trim().isEmpty()){
            throw new ExceptionVendas("Código do Endereco deve ser informado!");       
        }
        
        if (!validaCaracteres(codigo.getText())) {
            throw new ExceptionVendas("Código do Endereco inválido!");
        }
        
        if (descricao.getText().trim().isEmpty()){
            descricao.requestFocus();
            throw new ExceptionVendas("Nome do Endereco deve ser informado!");
        }
        
        if (!cep.getText().trim().isEmpty() &&
            !validaCaracteres(cep.getText())){
            throw new ExceptionVendas("CEP inválido!");
        }
        
        if (codpais.getText().trim().isEmpty()){
            throw new ExceptionVendas("Código do País deve ser informado!");       
        }
        
        if (!validaCaracteres(codpais.getText())) {
            throw new ExceptionVendas("Código do País inválido!");
        }
        
        if (codestado.getText().trim().isEmpty()){
            throw new ExceptionVendas("Código do Estado deve ser informado!");       
        }
        
        if (!validaCaracteres(codestado.getText())) {
            throw new ExceptionVendas("Código do Estado inválido!");
        }
        
        if (codcidade.getText().trim().isEmpty()){
            throw new ExceptionVendas("Código da Cidade deve ser informado!");       
        }
        
        if (!validaCaracteres(codcidade.getText())) {
            throw new ExceptionVendas("Código da Cidade inválido!");
        }
        
        if (codbairro.getText().trim().isEmpty()){
            throw new ExceptionVendas("Código do Bairro deve ser informado!");       
        }
        
        if (!validaCaracteres(codbairro.getText())) {
            throw new ExceptionVendas("Código do Bairro inválido!");
        }
        
        end.setEndCodigo(Integer.parseInt(codigo.getText()));
        end.setEndDescricao(descricao.getText());        
        end.setEndCep(Integer.parseInt(cep.getText()));
        end.setEndPais(Integer.parseInt(codpais.getText()));
        end.setEndEstado(Integer.parseInt(codestado.getText()));
        end.setEndCidade(Integer.parseInt(codcidade.getText()));
        end.setEndBairro(Integer.parseInt(codbairro.getText()));        
        
        Pais pai = PaisDao.getPais(end.getEndPais());            
        if(pai == null)
            throw new ExceptionVendas("País não encontrado!");        
        
        Estado est = EstadoDao.getEstado(end.getEndEstado());            
        if(est == null)
            throw new ExceptionVendas("Estado não encontrado!");        
        
        Cidade cid = CidadeDao.getCidade(end.getEndCidade());            
        if(cid == null)
            throw new ExceptionVendas("Cidade não encontrada!");        
        
        Bairro bai = BairroDao.getBairro(end.getEndBairro());            
        if(bai == null)
            throw new ExceptionVendas("Bairro não encontrado!");        
        
        return end;
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
