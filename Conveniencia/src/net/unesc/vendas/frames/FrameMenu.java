package net.unesc.vendas.frames;

import java.awt.Dimension;
import net.unesc.vendas.internalframes.FrameProduto;
import net.unesc.vendas.internalframes.FrameVendas;
import net.unesc.vendas.internalframes.FrameListarCliente;
import net.unesc.vendas.internalframes.FrameListarFuncionario;
import net.unesc.vendas.internalframes.FrameListarProduto;
import net.unesc.vendas.internalframes.FrameListarVendas;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.unesc.vendas.internalframes.FrameBairro;
import net.unesc.vendas.internalframes.FrameCidade;
import net.unesc.vendas.internalframes.FrameCondicao;
import net.unesc.vendas.internalframes.FrameEmpresa;
import net.unesc.vendas.internalframes.FrameEndereco;
import net.unesc.vendas.internalframes.FrameEstado;
import net.unesc.vendas.internalframes.FrameMedida;
import net.unesc.vendas.internalframes.FramePais;
import net.unesc.vendas.internalframes.FrameUnidade;
import net.unesc.vendas.internalframes.FrameUsuario;

public class FrameMenu extends javax.swing.JFrame {

    FrameProduto           fPro    = null;
    /*FrameCliente           fCli    = null;
    FrameVendedor          fFun    = null;*/
    FrameUsuario           fUsu    = null;
    FrameVendas            fVen    = null;
    FramePais              fPai    = null;
    FrameEstado            fEst    = null;
    FrameCidade            fCid    = null;
    FrameBairro            fBai    = null;
    FrameEndereco          fEnd    = null;
    FrameCondicao          fCon    = null;
    FrameMedida            fMed    = null;
    FrameEmpresa           fEmp    = null;
    FrameUnidade           fUni    = null;
    
    FrameListarProduto     flisPro = null;
    FrameListarCliente     flisCli = null;
    FrameListarFuncionario flisFun = null;
    FrameListarVendas      flisVen = null;
  
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
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

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

        jMenu1.setText("Endereçamento");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("País");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Estado");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Cidade");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Bairro");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Endereço");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        MenuCadastros.add(jMenu1);

        jMenu2.setText("Estabelecimentos");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Empresa");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Unidade");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        MenuCadastros.add(jMenu2);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Condição Pagamento");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        MenuCadastros.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Unidade Medida");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        MenuCadastros.add(jMenuItem7);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Usuários");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        MenuCadastros.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Produto");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        MenuCadastros.add(jMenuItem11);

        menuPrincial.add(MenuCadastros);

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
    
    public void Janela(JInternalFrame frame){
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (fPai == null || fPai.isClosed()){
            fPai = new FramePais();
            CentralizaJInternalFrame(fPai);
            jDesktopPane.add(fPai);
            fPai.setVisible(true);
        } else {
            jDesktopPane.moveToFront(fPai);
        }        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (fEst == null || fEst.isClosed()){
            fEst = new FrameEstado();
            CentralizaJInternalFrame(fEst);
            jDesktopPane.add(fEst);
            fEst.setVisible(true);
        } else {
            jDesktopPane.moveToFront(fEst);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (fCid == null || fCid.isClosed()){
            fCid = new FrameCidade();
            CentralizaJInternalFrame(fCid);
            jDesktopPane.add(fCid);
            fCid.setVisible(true);
        } else {
            jDesktopPane.moveToFront(fCid);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if (fBai == null || fBai.isClosed()){
            fBai = new FrameBairro();
            CentralizaJInternalFrame(fBai);
            jDesktopPane.add(fBai);
            fBai.setVisible(true);
        } else {
            jDesktopPane.moveToFront(fBai);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        if (fEnd == null || fEnd.isClosed()){
            fEnd = new FrameEndereco();
            CentralizaJInternalFrame(fEnd);
            jDesktopPane.add(fEnd);
            fEnd.setVisible(true);
        } else {
            jDesktopPane.moveToFront(fEnd);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if (fCon == null || fCon.isClosed()){
            fCon = new FrameCondicao();
            CentralizaJInternalFrame(fCon);
            jDesktopPane.add(fCon);
            fCon.setVisible(true);
        } else {
            jDesktopPane.moveToFront(fCon);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if (fMed == null || fMed.isClosed()){
            fMed = new FrameMedida();
            CentralizaJInternalFrame(fMed);
            jDesktopPane.add(fMed);
            fMed.setVisible(true);
        } else {
            jDesktopPane.moveToFront(fMed);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        if (fEmp == null || fEmp.isClosed()){
            fEmp = new FrameEmpresa();
            CentralizaJInternalFrame(fEmp);
            jDesktopPane.add(fEmp);
            fEmp.setVisible(true);
        } else {
            jDesktopPane.moveToFront(fEmp);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        if (fUni == null || fUni.isClosed()){
            fUni = new FrameUnidade();
            CentralizaJInternalFrame(fUni);
            jDesktopPane.add(fUni);
            fUni.setVisible(true);
        } else {
            jDesktopPane.moveToFront(fUni);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        if (fUsu == null || fUsu.isClosed()){
            fUsu = new FrameUsuario();
            CentralizaJInternalFrame(fUsu);
            jDesktopPane.add(fUsu);
            fUsu.setVisible(true);
        } else {
            jDesktopPane.moveToFront(fUsu);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        if (fPro == null || fPro.isClosed()){
            fPro = new FrameProduto();
            CentralizaJInternalFrame(fPro);
            jDesktopPane.add(fPro);
            fPro.setVisible(true);
        } else {
            jDesktopPane.moveToFront(fPro);
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
            }
        });
    }
    
    public void CentralizaJInternalFrame(JInternalFrame frame) {
        Dimension desktopSize = jDesktopPane.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 2);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JMenuBar menuPrincial;
    // End of variables declaration//GEN-END:variables
}
