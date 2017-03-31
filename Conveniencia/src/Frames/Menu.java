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
    
    private ClasseCliente        cla            = new ClasseCliente();
    private ClasseFuncionario    fun            = new ClasseFuncionario();
    private ClasseServicos       serv           = new ClasseServicos();
    private ClasseProduto        prod           = new ClasseProduto();
    private ActionFuncionario actFuncionario = new ActionFuncionario(this, fun);
    private ActionCliente     actCliente     = new ActionCliente(this, cla);
    private ActionProduto     actProduto     = new ActionProduto(this,prod);
    private ActionServicos    actServico     = new ActionServicos(this, serv);
    
    public Menu() {
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        funSalvar.addActionListener(actFuncionario);
        funExcluir.addActionListener(actFuncionario);
        funCancelar.addActionListener(actFuncionario);
        funNovo.addActionListener(actFuncionario);
        
        cliSalvar.addActionListener(actCliente);
        cliExcluir.addActionListener(actCliente);
        cliCancelar.addActionListener(actCliente);
        cliNovo.addActionListener(actCliente);
        
        proSalvar.addActionListener(actProduto);
        proExcluir.addActionListener(actProduto);
        proCancelar.addActionListener(actProduto);
        proNovo.addActionListener(actProduto);
        
        serSalvar.addActionListener(actServico);
        serExcluir.addActionListener(actServico);
        serCancelar.addActionListener(actServico);
        serNovo.addActionListener(actServico);
        
        jDesktopPane.setVisible(false);
        jInternalFrameClientes.setVisible(false);
        jInternalFrameFuncionario.setVisible(false);
        jInternalFrameProduto.setVisible(false);
        jInternalFrameServicos.setVisible(false);
        
        setIcon();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jPanelPrincipal = new javax.swing.JPanel();
        jDesktopPane = new javax.swing.JDesktopPane();
        jInternalFrameClientes = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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
        cliEstado = new javax.swing.JComboBox<>();
        cliNovo = new javax.swing.JButton();
        cliSalvar = new javax.swing.JButton();
        cliExcluir = new javax.swing.JButton();
        cliCancelar = new javax.swing.JButton();
        jInternalFrameProduto = new javax.swing.JInternalFrame();
        jLabel24 = new javax.swing.JLabel();
        proPreco = new javax.swing.JTextField();
        proFornecedor = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        proUnidade = new javax.swing.JTextField();
        proDescricao = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        proCodigo = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        proDataCadastro = new javax.swing.JTextField();
        proSalvar = new javax.swing.JButton();
        proExcluir = new javax.swing.JButton();
        proCancelar = new javax.swing.JButton();
        proNovo = new javax.swing.JButton();
        jInternalFrameFuncionario = new javax.swing.JInternalFrame();
        funCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        funEmail = new javax.swing.JTextField();
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
        funExcluir = new javax.swing.JButton();
        funCancelar = new javax.swing.JButton();
        funNovo = new javax.swing.JButton();
        jInternalFrameServicos = new javax.swing.JInternalFrame();
        jLabel25 = new javax.swing.JLabel();
        serData = new javax.swing.JTextField();
        serQuantidade = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        serFuncionario = new javax.swing.JTextField();
        serProduto = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        serSalvar = new javax.swing.JButton();
        serExcluir = new javax.swing.JButton();
        serCancelar = new javax.swing.JButton();
        serNovo = new javax.swing.JButton();
        serCliente = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
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

        jInternalFrameClientes.setClosable(true);
        jInternalFrameClientes.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameClientes.setIconifiable(true);
        jInternalFrameClientes.setTitle("Clientes");
        jInternalFrameClientes.setVisible(true);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("RG:");

        jLabel5.setText("Sexo:");

        jLabel6.setText("Telefone:");

        jLabel7.setText("Email:");

        jLabel8.setText("Placa:");

        jLabel9.setText("Cidade:");

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

        buttonGroupSexo.add(cliSexoMasculino);
        cliSexoMasculino.setText("Masculino");
        cliSexoMasculino.setEnabled(false);

        buttonGroupSexo.add(cliSexoFeminino);
        cliSexoFeminino.setText("Feminino");
        cliSexoFeminino.setEnabled(false);

        cliEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP ", "AM ", "BA ", "CE ", "DF ", "ES ", "GO ", "MA ", "MT ", "MS ", "MG ", "PA ", "PB ", "PR ", "PE ", "PI ", "RJ ", "RN", "RS", "RO", "RR ", "SC ", "SP ", "SE ", "TO" }));
        cliEstado.setAutoscrolls(true);
        cliEstado.setEnabled(false);
        cliEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliEstadoActionPerformed(evt);
            }
        });

        cliNovo.setText("Novo");

        cliSalvar.setText("Salvar");
        cliSalvar.setEnabled(false);

        cliExcluir.setText("Excluir");
        cliExcluir.setEnabled(false);

        cliCancelar.setText("Cancelar");
        cliCancelar.setEnabled(false);
        cliCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameClientesLayout = new javax.swing.GroupLayout(jInternalFrameClientes.getContentPane());
        jInternalFrameClientes.getContentPane().setLayout(jInternalFrameClientesLayout);
        jInternalFrameClientesLayout.setHorizontalGroup(
            jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameClientesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrameClientesLayout.createSequentialGroup()
                        .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cliCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cliNome)
                                .addGroup(jInternalFrameClientesLayout.createSequentialGroup()
                                    .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cliCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(cliTelefone))
                                    .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jInternalFrameClientesLayout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(jLabel8))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameClientesLayout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addComponent(jLabel4)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cliRg, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cliPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(cliEmail)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameClientesLayout.createSequentialGroup()
                                    .addComponent(cliCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cliEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(94, 94, 94))
                                .addComponent(cliEndereco))
                            .addGroup(jInternalFrameClientesLayout.createSequentialGroup()
                                .addComponent(cliSexoMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cliSexoFeminino))))
                    .addGroup(jInternalFrameClientesLayout.createSequentialGroup()
                        .addComponent(cliNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cliCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jInternalFrameClientesLayout.setVerticalGroup(
            jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameClientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cliCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cliNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cliCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cliRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cliSexoMasculino)
                    .addComponent(cliSexoFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cliTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cliPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cliEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cliCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cliEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cliEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jInternalFrameClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliSalvar)
                    .addComponent(cliExcluir)
                    .addComponent(cliCancelar)
                    .addComponent(cliNovo))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        jInternalFrameProduto.setClosable(true);
        jInternalFrameProduto.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameProduto.setIconifiable(true);
        jInternalFrameProduto.setTitle("Produtos");
        jInternalFrameProduto.setVisible(true);

        jLabel24.setText("Preço:");

        proPreco.setEnabled(false);

        proFornecedor.setEnabled(false);

        jLabel28.setText("Fornecedor:");

        jLabel29.setText("Unidade Medida:");

        proUnidade.setEnabled(false);

        proDescricao.setEnabled(false);

        jLabel30.setText("Descrição");

        jLabel31.setText("Código:");

        jLabel32.setText("Data Cadastro:");

        proDataCadastro.setEnabled(false);

        proSalvar.setText("Salvar");
        proSalvar.setEnabled(false);

        proExcluir.setText("Excluir");
        proExcluir.setEnabled(false);

        proCancelar.setText("Cancelar");
        proCancelar.setEnabled(false);

        proNovo.setText("Novo");

        javax.swing.GroupLayout jInternalFrameProdutoLayout = new javax.swing.GroupLayout(jInternalFrameProduto.getContentPane());
        jInternalFrameProduto.getContentPane().setLayout(jInternalFrameProdutoLayout);
        jInternalFrameProdutoLayout.setHorizontalGroup(
            jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameProdutoLayout.createSequentialGroup()
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameProdutoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel28)
                            .addComponent(jLabel24)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrameProdutoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(proNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jInternalFrameProdutoLayout.setVerticalGroup(
            jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameProdutoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(proCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(proDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(proUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(67, 67, 67)
                .addGroup(jInternalFrameProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proSalvar)
                    .addComponent(proExcluir)
                    .addComponent(proCancelar)
                    .addComponent(proNovo))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        jInternalFrameFuncionario.setClosable(true);
        jInternalFrameFuncionario.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameFuncionario.setIconifiable(true);
        jInternalFrameFuncionario.setTitle("Funcionários");
        jInternalFrameFuncionario.setVisible(true);

        funCidade.setEnabled(false);

        jLabel12.setText("Cidade:");

        jLabel13.setText("Email:");

        funEmail.setEnabled(false);

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

        buttonGroupSexo.add(funSexoFeminino);
        funSexoFeminino.setText("Feminino");
        funSexoFeminino.setEnabled(false);

        buttonGroupSexo.add(funSexoMasculino);
        funSexoMasculino.setText("Masculino");
        funSexoMasculino.setEnabled(false);

        jLabel17.setText("Sexo:");

        jLabel18.setText("Telefone:");

        jLabel19.setText("CPF:");

        funCpf.setEnabled(false);

        funNome.setEnabled(false);

        jLabel20.setText("Nome:");

        jLabel21.setText("Código:");

        jLabel15.setText("Data Admissão:");

        funDataAdm.setEnabled(false);

        jLabel22.setText("Estado:");

        funSalvar.setText("Salvar");
        funSalvar.setEnabled(false);

        funExcluir.setText("Excluir");
        funExcluir.setEnabled(false);

        funCancelar.setText("Cancelar");
        funCancelar.setEnabled(false);

        funNovo.setText("Novo");

        javax.swing.GroupLayout jInternalFrameFuncionarioLayout = new javax.swing.GroupLayout(jInternalFrameFuncionario.getContentPane());
        jInternalFrameFuncionario.getContentPane().setLayout(jInternalFrameFuncionarioLayout);
        jInternalFrameFuncionarioLayout.setHorizontalGroup(
            jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                        .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(funDataAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(funNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(funSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(funExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(funCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                        .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19)
                                .addComponent(jLabel13)
                                .addComponent(jLabel12)
                                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)))
                            .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel14)))
                        .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                                        .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                                                .addComponent(funSexoMasculino)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(funSexoFeminino))
                                            .addComponent(funTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(funEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                                        .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                                                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(funNome)
                                                    .addComponent(funCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel16)
                                                .addGap(18, 18, 18)
                                                .addComponent(funRg))
                                            .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(funCidade)
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(funEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                                                .addComponent(funCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(263, 263, 263)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jInternalFrameFuncionarioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(funEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jInternalFrameFuncionarioLayout.setVerticalGroup(
            jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameFuncionarioLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(funCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(funNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(funCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(funRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funSexoFeminino)
                    .addComponent(funSexoMasculino)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(11, 11, 11)
                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(funEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(14, 14, 14)
                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funDataAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(42, 42, 42)
                .addGroup(jInternalFrameFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funSalvar)
                    .addComponent(funExcluir)
                    .addComponent(funCancelar)
                    .addComponent(funNovo))
                .addContainerGap(220, Short.MAX_VALUE))
        );

        jInternalFrameServicos.setClosable(true);
        jInternalFrameServicos.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrameServicos.setIconifiable(true);
        jInternalFrameServicos.setTitle("Serviços");
        jInternalFrameServicos.setVisible(true);

        jLabel25.setText("Data:");

        serData.setEnabled(false);

        serQuantidade.setEnabled(false);

        jLabel33.setText("Quantidade:");

        jLabel34.setText("Funcionário:");

        serFuncionario.setEnabled(false);

        serProduto.setEnabled(false);

        jLabel35.setText("Produto");

        serSalvar.setText("Salvar");
        serSalvar.setEnabled(false);

        serExcluir.setText("Excluir");
        serExcluir.setEnabled(false);

        serCancelar.setText("Cancelar");
        serCancelar.setEnabled(false);

        serNovo.setText("Novo");

        serCliente.setEnabled(false);

        jLabel36.setText("Cliente:");

        javax.swing.GroupLayout jInternalFrameServicosLayout = new javax.swing.GroupLayout(jInternalFrameServicos.getContentPane());
        jInternalFrameServicos.getContentPane().setLayout(jInternalFrameServicosLayout);
        jInternalFrameServicosLayout.setHorizontalGroup(
            jInternalFrameServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameServicosLayout.createSequentialGroup()
                .addGroup(jInternalFrameServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameServicosLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jInternalFrameServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel33)
                            .addComponent(jLabel25)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrameServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(serFuncionario)
                            .addComponent(serProduto)
                            .addComponent(serCliente)
                            .addComponent(serQuantidade)
                            .addComponent(serData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrameServicosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(serNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameServicosLayout.setVerticalGroup(
            jInternalFrameServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameServicosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jInternalFrameServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(serCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(serProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(serFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrameServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(44, 44, 44)
                .addGroup(jInternalFrameServicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serExcluir)
                    .addComponent(serCancelar)
                    .addComponent(serNovo)
                    .addComponent(serSalvar))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jDesktopPane.setLayer(jInternalFrameClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jInternalFrameProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jInternalFrameFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jInternalFrameServicos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrameClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jInternalFrameFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jInternalFrameProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jInternalFrameServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jInternalFrameFuncionario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jInternalFrameClientes, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jInternalFrameServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalFrameProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(358, Short.MAX_VALUE))
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
        funcionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tiago\\Desktop\\Icones\\user_add.png")); // NOI18N
        funcionario.setText("Funcionário");
        funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioActionPerformed(evt);
            }
        });
        MenuCadastros.add(funcionario);
        MenuCadastros.add(jSeparator2);

        produto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        produto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tiago\\Desktop\\Icones\\tag_blue_add.png")); // NOI18N
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
        servicos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tiago\\Desktop\\Icones\\cart.png")); // NOI18N
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
        jInternalFrameProduto.setVisible(true);
    }//GEN-LAST:event_produtoActionPerformed

    private void servicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicosActionPerformed
        jDesktopPane.setVisible(true);
        jInternalFrameServicos.setVisible(true);
    }//GEN-LAST:event_servicosActionPerformed

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed
        
    }//GEN-LAST:event_ajudaActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        JOptionPane.showMessageDialog(null,"Software desenvolvido por:\nJoão Paulo Wessler\nSamuel Martins\nTiago dos Santos\nFoi"+
                " desenvolvido aplicando o \nconhecimento da matéria de Tópicos I, lecionada por Gilberto Vieira da Silva");
    }//GEN-LAST:event_sobreActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        jDesktopPane.setVisible(true);
        jInternalFrameClientes.setVisible(true);
    }//GEN-LAST:event_clienteActionPerformed

    private void cliRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliRgActionPerformed

    private void funRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funRgActionPerformed

    private void funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioActionPerformed
        jDesktopPane.setVisible(true);
        jInternalFrameFuncionario.setVisible(true);
    }//GEN-LAST:event_funcionarioActionPerformed

    private void cliCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliCodigoActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_cliCodigoActionPerformed

    private void cliEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliEstadoActionPerformed

    private void cliCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliCancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

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
    
    public void novoProduto(){
        
        proCodigo.setText("");
        proDescricao.setText("");
        proUnidade.setText("");
        proFornecedor.setText("");
        proPreco.setText("");
        proDataCadastro.setText("");
        
        proDescricao.setEnabled(true);
        proUnidade.setEnabled(true);
        proFornecedor.setEnabled(true);
        proPreco.setEnabled(true);
        proDataCadastro.setEnabled(true);
                
        proNovo.setEnabled(false);
        proSalvar.setEnabled(true);
        proCancelar.setEnabled(true);        
    }
    
    public void cancelarProduto(){
        
        proCodigo.setText("");
        proDescricao.setText("");
        proUnidade.setText("");
        proFornecedor.setText("");
        proPreco.setText("");
        proDataCadastro.setText("");
        
        proDescricao.setEnabled(false);
        proUnidade.setEnabled(false);
        proFornecedor.setEnabled(false);
        proPreco.setEnabled(false);
        proDataCadastro.setEnabled(false);
                
        proNovo.setEnabled(true);
        proSalvar.setEnabled(false);
        proCancelar.setEnabled(false); 
    }
    
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
    }
    
    public void cancelarServico(){
        
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
     private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("postojpg.jpg")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenu MenuServicos;
    private javax.swing.JMenu ajuda;
    private javax.swing.ButtonGroup buttonGroupSexo;
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
    private javax.swing.JMenuItem cliente;
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
    private javax.swing.JMenuItem funcionario;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JInternalFrame jInternalFrameClientes;
    private javax.swing.JInternalFrame jInternalFrameFuncionario;
    private javax.swing.JInternalFrame jInternalFrameProduto;
    private javax.swing.JInternalFrame jInternalFrameServicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuBar menuPrincial;
    private javax.swing.JButton proCancelar;
    private javax.swing.JTextField proCodigo;
    private javax.swing.JTextField proDataCadastro;
    private javax.swing.JTextField proDescricao;
    private javax.swing.JButton proExcluir;
    private javax.swing.JTextField proFornecedor;
    private javax.swing.JButton proNovo;
    private javax.swing.JTextField proPreco;
    private javax.swing.JButton proSalvar;
    private javax.swing.JTextField proUnidade;
    private javax.swing.JMenuItem produto;
    private javax.swing.JButton serCancelar;
    private javax.swing.JTextField serCliente;
    private javax.swing.JTextField serData;
    private javax.swing.JButton serExcluir;
    private javax.swing.JTextField serFuncionario;
    private javax.swing.JButton serNovo;
    private javax.swing.JTextField serProduto;
    private javax.swing.JTextField serQuantidade;
    private javax.swing.JButton serSalvar;
    private javax.swing.JMenuItem servicos;
    private javax.swing.JMenuItem sobre;
    // End of variables declaration//GEN-END:variables
}
