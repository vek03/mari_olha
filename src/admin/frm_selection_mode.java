package admin;

import conexao.Conexao;
import controle.frm_login;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor e Mariane
 * Mari Vek Histories
 */

public class frm_selection_mode extends javax.swing.JFrame {

    Conexao con_cliente;
    frm_login login;
    private int id;
    private String usuario;
    private String nome;
    
    /**
     * Creates new form selection_mode
     */
    public frm_selection_mode(int realId, String realUser, String realNome) {
        initComponents();
        initVariables(realId, realUser, realNome);
        con_cliente = new Conexao();
        login = new frm_login();
        con_cliente.conecta();
        btnUsers.setBackground(Color.RED);
        btnLoc.setBackground(Color.RED);
        btnFilm.setBackground(Color.RED);
        logo();
        icone();
    }

    private void initVariables(int realId, String realUser, String realNome){
        id = realId;
        usuario = realUser;
        nome = realNome;
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
        title = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        btnUsers = new javax.swing.JButton();
        desc2 = new javax.swing.JLabel();
        btnLoc = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        film = new javax.swing.JLabel();
        btnFilm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Javaflix(admin - Modo de Seleção)");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Panel.setBackground(new java.awt.Color(0, 51, 51));

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Modo de Seleção");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        desc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        desc.setForeground(new java.awt.Color(255, 255, 255));
        desc.setText("Menu de Usuários");

        btnUsers.setBackground(new java.awt.Color(227, 4, 25));
        btnUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnUsers.setText("Gerenciador de Usuários");
        btnUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });

        desc2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        desc2.setForeground(new java.awt.Color(255, 255, 255));
        desc2.setText("Menu de Alocações");

        btnLoc.setBackground(new java.awt.Color(227, 4, 25));
        btnLoc.setForeground(new java.awt.Color(255, 255, 255));
        btnLoc.setText("Gerenciador de Alocações");
        btnLoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        btnReturn.setBackground(new java.awt.Color(227, 4, 25));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/resultset/door_in.png"))); // NOI18N
        btnReturn.setToolTipText("Sair da sua conta");
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(227, 4, 25));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Olá, ");
        lblWelcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        film.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        film.setForeground(new java.awt.Color(255, 255, 255));
        film.setText("Menu de Filmes");

        btnFilm.setBackground(new java.awt.Color(227, 4, 25));
        btnFilm.setForeground(new java.awt.Color(255, 255, 255));
        btnFilm.setText("Exibir Gerenciador de Filmes");
        btnFilm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(btnReturn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsers)
                            .addComponent(desc))
                        .addGap(34, 34, 34)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoc)
                            .addComponent(desc2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFilm)
                            .addComponent(film))
                        .addGap(21, 21, 21))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title)
                .addGap(1, 1, 1)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desc2)
                            .addComponent(desc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUsers)
                            .addComponent(btnLoc)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(film)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFilm)))
                .addGap(68, 68, 68)
                .addComponent(btnReturn)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    
    private void user(){
        try{
            lblWelcome.setText("Olá, " + nome + "!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível receber os dados do usuário... \n");
        }
    }
    
    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        try{
            frm_manage_users mostra = new frm_manage_users(id, usuario, nome);
            mostra.setVisible(true);
            dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"\n Não foi possível passar seus dados para a próxima tela! :\n ","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        frm_manage_loc mostra = new frm_manage_loc(id, usuario, nome);
        mostra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja sair da sua conta? ","Logout", JOptionPane.YES_NO_OPTION, 3);
            
        if (resposta == 0){
            frm_login mostra = new frm_login();
            mostra.setVisible(true);
            dispose();
        }
        else{
            
        }
    }//GEN-LAST:event_btnReturnActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        user();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        user();
    }//GEN-LAST:event_formWindowOpened

    private void btnFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmActionPerformed
        frm_manage_film mostra = new frm_manage_film(id, usuario, nome);
        mostra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFilmActionPerformed

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
            java.util.logging.Logger.getLogger(frm_selection_mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_selection_mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_selection_mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_selection_mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int a = 0;
                String b = "";
                String c = "";
                new frm_selection_mode(a, b, c).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnFilm;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnUsers;
    private javax.swing.JLabel desc;
    private javax.swing.JLabel desc2;
    private javax.swing.JLabel film;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
