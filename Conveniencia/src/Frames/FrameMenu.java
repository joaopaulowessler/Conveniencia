package Frames;

import InternalFrames.FrameProduto;
import InternalFrames.FrameCliente;
import InternalFrames.FrameVendas;
import InternalFrames.FrameFuncionario;
import InternalFrames.FrameListarCliente;
import InternalFrames.FrameListarFuncionário;
import InternalFrames.FrameListarProduto;
import InternalFrames.FrameListarVendas;
import Log.Log;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrameMenu extends javax.swing.JFrame {

    Log log = new Log();

    public FrameMenu() {
        initComponents();
        jDesktopPane.setVisible(true);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jPanelPrincipal = new javax.swing.JPanel();
        jDesktopPane = new javax.swing.JDesktopPane();
        menuPrincial = new javax.swing.JMenuBar();
        MenuCadastros = new javax.swing.JMenu();
        cadClientes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        cadFuncionarios = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        cadProdutos = new javax.swing.JMenuItem();
        MenuListar = new javax.swing.JMenu();
        listarClientes = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        listarFuncionarios = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        listarProdutos = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        listarVendas = new javax.swing.JMenuItem();
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

        cadClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        cadClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/cliente.png"))); // NOI18N
        cadClientes.setText("Clientes");
        cadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadClientesActionPerformed(evt);
            }
        });
        MenuCadastros.add(cadClientes);
        MenuCadastros.add(jSeparator1);

        cadFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        cadFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/funcionário.png"))); // NOI18N
        cadFuncionarios.setText("Funcionários");
        cadFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFuncionariosActionPerformed(evt);
            }
        });
        MenuCadastros.add(cadFuncionarios);
        MenuCadastros.add(jSeparator2);

        cadProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        cadProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/produto.png"))); // NOI18N
        cadProdutos.setText("Produtos");
        cadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadProdutosActionPerformed(evt);
            }
        });
        MenuCadastros.add(cadProdutos);

        menuPrincial.add(MenuCadastros);

        MenuListar.setText("Listar");

        listarClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        listarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/cliente.png"))); // NOI18N
        listarClientes.setText("Clientes");
        listarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarClientesActionPerformed(evt);
            }
        });
        MenuListar.add(listarClientes);
        MenuListar.add(jSeparator3);

        listarFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        listarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/funcionário.png"))); // NOI18N
        listarFuncionarios.setText("Funcionários");
        listarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarFuncionariosActionPerformed(evt);
            }
        });
        MenuListar.add(listarFuncionarios);
        MenuListar.add(jSeparator4);

        listarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        listarProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/produto.png"))); // NOI18N
        listarProdutos.setText("Produtos");
        listarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProdutosActionPerformed(evt);
            }
        });
        MenuListar.add(listarProdutos);
        MenuListar.add(jSeparator5);

        listarVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        listarVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/vendas.png"))); // NOI18N
        listarVendas.setText("Vendas");
        listarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarVendasActionPerformed(evt);
            }
        });
        MenuListar.add(listarVendas);

        menuPrincial.add(MenuListar);

        MenuServicos.setText("Vendas");

        servicos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        servicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/vendas.png"))); // NOI18N
        servicos.setText("Vendas");
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
        sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Icones/ajuda.png"))); // NOI18N
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

    }//GEN-LAST:event_menuPrincialComponentResized

    private void cadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadProdutosActionPerformed
        FrameProduto fpro = new FrameProduto();
        jDesktopPane.add(fpro);
        fpro.setVisible(true);

        try {
            log.escrever("Acessou Produto", "log.txt");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_cadProdutosActionPerformed

    private void servicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicosActionPerformed
        FrameVendas fvend = new FrameVendas();
        jDesktopPane.add(fvend);
        fvend.setVisible(true);

        try {
            log.escrever("Acessou Vendas", "log.txt");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_servicosActionPerformed

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed

    }//GEN-LAST:event_ajudaActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        JOptionPane.showMessageDialog(null, "Software desenvolvido por:\nJoão Paulo Wessler\nSamuel Martins\nTiago dos Santos\n"
                + " Desenvolvido aplicando o conhecimento da matéria de Tópicos I, lecionada por Gilberto Vieira da Silva");
    }//GEN-LAST:event_sobreActionPerformed

    private void cadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadClientesActionPerformed
        FrameCliente fcli = new FrameCliente();
        jDesktopPane.add(fcli);
        fcli.setVisible(true);

        try {
            log.escrever("Acessou Clientes", "log.txt");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_cadClientesActionPerformed

    private void cadFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFuncionariosActionPerformed
        FrameFuncionario fFun = new FrameFuncionario();
        jDesktopPane.add(fFun);
        fFun.setVisible(true);

        try {
            log.escrever("Acessou Funcionários", "log.txt");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_cadFuncionariosActionPerformed

    private void listarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarClientesActionPerformed
        FrameListarCliente lcli = new FrameListarCliente();
        jDesktopPane.add(lcli);
        lcli.setVisible(true);
        try {
            lcli.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrameMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            log.escrever("Acessou Listar Clientes", "log.txt");
        } catch (IOException ex) {
        }

    }//GEN-LAST:event_listarClientesActionPerformed

    private void listarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarFuncionariosActionPerformed
        FrameListarFuncionário lfun = new FrameListarFuncionário();
        jDesktopPane.add(lfun);
        lfun.setVisible(true);
        try {
            lfun.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrameMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            log.escrever("Acessou Listar Funcionário", "log.txt");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_listarFuncionariosActionPerformed

    private void listarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProdutosActionPerformed
        FrameListarProduto lprod = new FrameListarProduto();
        jDesktopPane.add(lprod);
        lprod.setVisible(true);
        try {
            lprod.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrameMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            log.escrever("Acessou Listar Produto", "log.txt");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_listarProdutosActionPerformed

    private void listarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarVendasActionPerformed
        FrameListarVendas lvendas = new FrameListarVendas();
        jDesktopPane.add(lvendas);
        lvendas.setVisible(true);
        try {
            lvendas.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrameMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            log.escrever("Acessou Listar Vendas", "log.txt");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_listarVendasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenu MenuListar;
    private javax.swing.JMenu MenuServicos;
    private javax.swing.JMenu ajuda;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JMenuItem cadClientes;
    private javax.swing.JMenuItem cadFuncionarios;
    private javax.swing.JMenuItem cadProdutos;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenuItem listarClientes;
    private javax.swing.JMenuItem listarFuncionarios;
    private javax.swing.JMenuItem listarProdutos;
    private javax.swing.JMenuItem listarVendas;
    private javax.swing.JMenuBar menuPrincial;
    private javax.swing.JMenuItem servicos;
    private javax.swing.JMenuItem sobre;
    // End of variables declaration//GEN-END:variables
}
