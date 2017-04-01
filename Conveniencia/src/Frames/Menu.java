package Frames;

import Actions.ActionCliente;
import Actions.ActionFuncionario;
import Actions.ActionLogin;
import Actions.ActionProduto;
import Actions.ActionServicos;
import Classes.ClasseCliente;
import Classes.ClasseFuncionario;
import Classes.ClasseProduto;
import Classes.ClasseServicos;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
        jDesktopPane.setVisible(true);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);        
        //setIcon();
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jPanelPrincipal = new javax.swing.JPanel();
        jDesktopPane = new javax.swing.JDesktopPane();
        menuPrincial = new javax.swing.JMenuBar();
        MenuCadastros = new javax.swing.JMenu();
        cliente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        funcionario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        produto = new javax.swing.JMenuItem();
        MenuServicos = new javax.swing.JMenu();
        servicos = new javax.swing.JMenuItem();
        ajuda = new javax.swing.JMenu();
        sobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jDesktopPane.setBackground(new java.awt.Color(240, 240, 240));
        jDesktopPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2194, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane)
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane)
                .addContainerGap())
        );

        menuPrincial.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                menuPrincialComponentResized(evt);
            }
        });

        MenuCadastros.setText("Cadastros");

        cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/2.png"))); // NOI18N
        cliente.setText("Cliente");
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        MenuCadastros.add(cliente);
        MenuCadastros.add(jSeparator1);

        funcionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/user_add.png"))); // NOI18N
        funcionario.setText("Funcionário");
        funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioActionPerformed(evt);
            }
        });
        MenuCadastros.add(funcionario);
        MenuCadastros.add(jSeparator2);

        produto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/tag_blue_add.png"))); // NOI18N
        produto.setText("Produto");
        produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoActionPerformed(evt);
            }
        });
        MenuCadastros.add(produto);

        menuPrincial.add(MenuCadastros);

        MenuServicos.setText("Serviços");

        servicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        servicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/cart.png"))); // NOI18N
        servicos.setText("Serviços");
        servicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicosActionPerformed(evt);
            }
        });
        MenuServicos.add(servicos);

        menuPrincial.add(MenuServicos);

        ajuda.setText("Ajuda");
        ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaActionPerformed(evt);
            }
        });

        sobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/help.png"))); // NOI18N
        sobre.setText("Sobre");
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        ajuda.add(sobre);

        menuPrincial.add(ajuda);

        setJMenuBar(menuPrincial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuPrincialComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_menuPrincialComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPrincialComponentResized

    private void produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoActionPerformed
        jDesktopPane.setVisible(true);
        FrameProduto fpro = new FrameProduto();
        fpro.setVisible(true);        
    }//GEN-LAST:event_produtoActionPerformed

    private void servicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicosActionPerformed
        jDesktopPane.setVisible(true);
        FrameServico fser = new FrameServico();
        fser.setVisible(true);        
    }//GEN-LAST:event_servicosActionPerformed

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed
        
    }//GEN-LAST:event_ajudaActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        JOptionPane.showMessageDialog(null,"Software desenvolvido por:\nJoão Paulo Wessler\nSamuel Martins\nTiago dos Santos\nFoi"+
                " desenvolvido aplicando o \nconhecimento da matéria de Tópicos I.\nLecionada por Gilberto Vieira da Silva");
    }//GEN-LAST:event_sobreActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        jDesktopPane.setVisible(true);
        FrameCliente fcli = new FrameCliente();
        fcli.setVisible(true); 
    }//GEN-LAST:event_clienteActionPerformed

    private void funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioActionPerformed
        FrameFuncionario fraFun = new FrameFuncionario();
        jDesktopPane.add(fraFun);
        fraFun.setVisible(true);
         
    }//GEN-LAST:event_funcionarioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
/*   
    
    
    
    
    public void novoServico(){
        
        serCliente.setText("");
        serProduto.setText("");
        serFuncionario.setText("");
        serQuantidade.setText("");
        serData.setText("");
        
        serCliente.setEnabled(true);
        serProduto.setEnabled(true);
        serFuncionario.setEnabled(true);
        serQuantidade.setEnabled(true);
        serData.setEnabled(true);
                
        serNovo.setEnabled(false);
        serSalvar.setEnabled(true);
        serCancelar.setEnabled(true);        
    }*/
    
    /*public void cancelarServico(){
        
        serCliente.setText("");
        serProduto.setText("");
        serFuncionario.setText("");
        serQuantidade.setText("");
        serData.setText("");
        
        serCliente.setEnabled(false);
        serProduto.setEnabled(false);
        serFuncionario.setEnabled(false);
        serQuantidade.setEnabled(false);
        serData.setEnabled(false);
                
        serNovo.setEnabled(true);
        serSalvar.setEnabled(false);
        serCancelar.setEnabled(false);
    }
     /*private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("postojpg.jpg")));
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenu MenuServicos;
    private javax.swing.JMenu ajuda;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JMenuItem funcionario;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuBar menuPrincial;
    private javax.swing.JMenuItem produto;
    private javax.swing.JMenuItem servicos;
    private javax.swing.JMenuItem sobre;
    // End of variables declaration//GEN-END:variables
}
