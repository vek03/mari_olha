package user;

//aqui importamos a classe de conexão para manipular o banco
import conexao.Conexao;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Victor e Mariane
 * Mari Vek Histories
 */

public class frm_view_loc extends javax.swing.JFrame {

    //aqui declaramos a classe de conexão como con_cliente, para utilizá-la ao longo do código
    
    Conexao con_cliente;
    
    private int id;
    private String usuario;
    private String nome;
    private String nasc;
    
    /**
     * Creates new form frmTela
     */
    //método construtor que irá iniciar os componentes, conectar ao banco e trazer as informações
    //da tabela no primeiro registro
    public frm_view_loc(int realId, String realUser, String realNome, String realNasc) {
        initComponents();
        initVariables(realId,realUser, realNome, realNasc);
        con_cliente = new Conexao(); // inicialização do objeto
        con_cliente.conecta(); // chama o método que conecta
        con_cliente.executaSQL("select * from locacao where id_usuario like '" + realId + "%'");
        preencherTabela();
        posicionarRegistro();
        tblClientes.setAutoCreateRowSorter(true);// ativa a classificação ordenada da tabela
        reload();
        logo();
        icone();
    }

    frm_view_loc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void initVariables(int realId, String realUser, String realNome, String realNasc){
        id = realId;
        usuario = realUser;
        nome = realNome;
        nasc = realNasc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        btnPrimeiroRegistro = new javax.swing.JButton();
        btnVoltarUmRegistro = new javax.swing.JButton();
        btnAvancarUmRegistro = new javax.swing.JButton();
        btnUltimoRegistro = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        lblPesquisa = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        lblFilme = new javax.swing.JLabel();
        txtDevol = new javax.swing.JFormattedTextField();
        lblDevol = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtFilme = new javax.swing.JTextField();
        btnReload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Javaflix(Minhas Locações)");
        setBackground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Meus Filmes Alugados");

        btnPrimeiroRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset/resultset_first.png"))); // NOI18N
        btnPrimeiroRegistro.setToolTipText("Primeiro registro");
        btnPrimeiroRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrimeiroRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroRegistroActionPerformed(evt);
            }
        });

        btnVoltarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset/resultset_previous.png"))); // NOI18N
        btnVoltarUmRegistro.setToolTipText("Registro anterior");
        btnVoltarUmRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarUmRegistroActionPerformed(evt);
            }
        });

        btnAvancarUmRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset/resultset_next.png"))); // NOI18N
        btnAvancarUmRegistro.setToolTipText("Próximo registro");
        btnAvancarUmRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAvancarUmRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarUmRegistroActionPerformed(evt);
            }
        });

        btnUltimoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset/resultset_last.png"))); // NOI18N
        btnUltimoRegistro.setToolTipText("Úlitmo registro");
        btnUltimoRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUltimoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoRegistroActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset/door_in.png"))); // NOI18N
        btnExit.setToolTipText("Retornar para o Catalogo");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_Venda", "Usuário", "Filme", "Data", "Devolução", "Total(R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.setToolTipText("Registros das Locações");
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        tblClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblClientesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        txtPesquisa.setToolTipText("Insira o nome do filme");
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        lblPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        lblPesquisa.setText("Pesquisa por nome do Filme:");

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("ID_Venda:");

        txtCod.setEditable(false);
        txtCod.setText(" ");
        txtCod.setToolTipText("Código/Id");

        lblFilme.setForeground(new java.awt.Color(255, 255, 255));
        lblFilme.setText("Filme:");

        txtDevol.setEditable(false);
        try {
            txtDevol.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDevol.setToolTipText("Insira a data de devolução do filme");

        lblDevol.setForeground(new java.awt.Color(255, 255, 255));
        lblDevol.setText("Devolução:");

        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total(R$):");

        txtTotal.setEditable(false);
        txtTotal.setToolTipText("Insira o total da compra");

        txtFilme.setEditable(false);
        txtFilme.setToolTipText("Insira o filme alugado");

        btnReload.setToolTipText("Recarregar tabela");
        btnReload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(title)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPrimeiroRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltarUmRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAvancarUmRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUltimoRegistro)
                        .addGap(150, 150, 150)
                        .addComponent(btnReload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblId)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDevol)
                                    .addComponent(lblFilme)
                                    .addComponent(lblTotal))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDevol, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 145, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFilme)
                    .addComponent(txtFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDevol)
                    .addComponent(txtDevol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPrimeiroRegistro)
                        .addComponent(btnVoltarUmRegistro)
                        .addComponent(btnAvancarUmRegistro)
                        .addComponent(btnUltimoRegistro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisa)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        //toda vez que um caracter novo for inserido na barra de pesquisa, ela irá atualizar a busca para o item mais próximo ou identico na tabela
        //SELECT

        //buscando um registro com os caracteres selecionados pelo nome
        try {
            String pesquisa = "select * from locacao where filme like '" + txtPesquisa.getText() + "%' and id_usuario = " + id + "";
            con_cliente.executaSQL(pesquisa);

            if(con_cliente.resultset.first()){
                preencherTabela();
                posicionarRegistro();
            }
            else{
                JOptionPane.showMessageDialog(null, "\n Não existe dados com este parâmetro!!", "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Os dados digitados não foram localizados!! :\n ", "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        //botão que irá retornar a tela de login
        frm_catalogo mostra = new frm_catalogo(id, usuario, nome, nasc);
        mostra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnUltimoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoRegistroActionPerformed
        // este botão irá selecionar o último registro da tabela presente no banco
        //SELECT

        try {
            con_cliente.executaSQL("select * from locacao where id_usuario like '" + id + "%'");
            con_cliente.resultset.last();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no último registro: ");
        }
    }//GEN-LAST:event_btnUltimoRegistroActionPerformed

    private void btnAvancarUmRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarUmRegistroActionPerformed
        //este botão irá selecionar o registro seguinte em relação ao selecionado
        //contém tratamento para que ele não tente selecionar um registro inexistente após o último
        //SELECT

        try {
            //se o registro selecionado não for o último, ele irá passar para o próximo registro
            //senão, ele irá para o último registro
            if(con_cliente.resultset.isLast() == false){
                con_cliente.resultset.next(); 
            }else{
                con_cliente.executaSQL("select * from locacao where id_usuario like '" + id + "%'");
                con_cliente.resultset.last();
            }
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no próximo registro: ");
        }
    }//GEN-LAST:event_btnAvancarUmRegistroActionPerformed

    private void btnVoltarUmRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarUmRegistroActionPerformed
        //este botão irá selecionar o registro anterior em relação ao atual
        //contém tratamento para que ele não busque um registro inexistente ao tentar voltar...
        //um registro partindo do primeiro
        //SELECT

        try {
            //se o registro selecionado não for o primeiro, ele irá voltar para o registro anterior
            //senão, ele irá para o primeiro registro
            if(con_cliente.resultset.isFirst() == false){
                con_cliente.resultset.previous();
            }else{
                con_cliente.executaSQL("select * from locacao where id_usuario like '" + id + "%'");
                con_cliente.resultset.first();
            }
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no registro anterior: ");
        }
    }//GEN-LAST:event_btnVoltarUmRegistroActionPerformed

    private void btnPrimeiroRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroRegistroActionPerformed
        //este botão irá selecionar o primeiro registro da tabela presente no banco
        //SELECT

        try {
            con_cliente.executaSQL("select * from locacao where id_usuario like '" + id + "%'");
            con_cliente.resultset.first();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registro: ");
        }
    }//GEN-LAST:event_btnPrimeiroRegistroActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        //ao clicar em um registro da tabela, o programa irá trazer as informações do registro...
        //para manipulação no cadastro
        //SELECT
        
        //vendo qual registro foi selecionado
        int linha_selecionada = tblClientes.getSelectedRow();
        int id_selecionado = Integer.parseInt(tblClientes.getValueAt(linha_selecionada, 0).toString());

        con_cliente.executaSQL("select * from locacao where id = '" + id_selecionado + "%'");
        posicionarRegistro();   
    }//GEN-LAST:event_tblClientesMouseClicked

    private void tblClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientesKeyPressed
        //ao clicar em um registro da tabela, o programa irá trazer as informações do registro...
        //para manipulação no cadastro
        //SELECT
        
        //vendo qual registro foi selecionado
        int linha_selecionada = tblClientes.getSelectedRow();
        int id_selecionado = Integer.parseInt(tblClientes.getValueAt(linha_selecionada, 0).toString());

        con_cliente.executaSQL("select * from locacao where id = '" + id_selecionado + "%'");
        posicionarRegistro();   
    }//GEN-LAST:event_tblClientesKeyPressed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        con_cliente.executaSQL("select * from locacao where id_usuario like '" + id + "%'");
        preencherTabela();
        posicionarRegistro();
    }//GEN-LAST:event_btnReloadActionPerformed

    private void logo(){
        //método que traz a imagem na raiz do projeto
        //método getClass e getResourse são para puxar a imagem no arquivo .jar 
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icones/javaflix.png"));
        //método que redimensiona a imagem
        Image scaleImage = imageIcon.getImage().getScaledInstance(100, 50,Image.SCALE_DEFAULT);
        //método que traz a imagem dimensionada
        ImageIcon img = new ImageIcon(scaleImage);
        
        logo.setIcon(img);
    }
    
    private void reload(){
        //método que traz a imagem na raiz do projeto
        //método getClass e getResourse são para puxar a imagem no arquivo .jar 
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icones/resultset/reload.png"));
        //método que redimensiona a imagem
        Image scaleImage = imageIcon.getImage().getScaledInstance(17, 17,Image.SCALE_DEFAULT);
        //método que traz a imagem dimensionada
        ImageIcon img = new ImageIcon(scaleImage);
        
        btnReload.setIcon(img);
    }
    
    private void icone(){
        //método que traz a imagem na raiz do projeto
        //método getClass e getResourse são para puxar a imagem no arquivo .jar 
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icones/icon.png"));
        //método que redimensiona a imagem
        Image scaleImage = imageIcon.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        //método que traz a imagem dimensionada
        ImageIcon img = new ImageIcon(scaleImage);
        
        this.setIconImage(img.getImage());
    }
        
    
    //método que irá preencher a tabela com os registros presentes no banco na abertura do programa
    private void preencherTabela(){
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(4);
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(30);
        tblClientes.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblClientes.getColumnModel().getColumn(3).setPreferredWidth(20);
        tblClientes.getColumnModel().getColumn(4).setPreferredWidth(20);
        tblClientes.getColumnModel().getColumn(5).setPreferredWidth(20);
        
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("id"),con_cliente.resultset.getString("usuario"),con_cliente.resultset.getString("filme"),con_cliente.resultset.getString("data_locacao"), con_cliente.resultset.getString("data_devolucao"), con_cliente.resultset.getString("total")

                });
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //método que irá posicionar as informações do cadastro no primeiro registro
    private void posicionarRegistro(){
        try {
            con_cliente.resultset.first();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Não foi possível posicionar no primeiro registro:","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //método que irá mostrar os dados do registro selecionado nos campos de cadastro
    private void mostrar_Dados(){
        try {
            txtCod.setText(con_cliente.resultset.getString("id"));
            txtFilme.setText(con_cliente.resultset.getString("filme"));
            txtDevol.setText(con_cliente.resultset.getString("data_devolucao"));
            txtTotal.setText(con_cliente.resultset.getString("total"));
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"Não localizou dados: ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //MÉTODO PRINCIPAL
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_view_loc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_view_loc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_view_loc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_view_loc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int a = 0;
                String b = "";
                String c = "";
                String d = "";
                new frm_view_loc(a, b, c, d).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnAvancarUmRegistro;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPrimeiroRegistro;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnUltimoRegistro;
    private javax.swing.JButton btnVoltarUmRegistro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDevol;
    private javax.swing.JLabel lblFilme;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tblClientes;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtCod;
    private javax.swing.JFormattedTextField txtDevol;
    private javax.swing.JTextField txtFilme;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
