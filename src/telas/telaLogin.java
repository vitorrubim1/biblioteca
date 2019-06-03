package telas;

import javax.swing.JOptionPane;
import conexaoBD.bd;
import conexaobd.mostrarTabela;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class telaLogin extends javax.swing.JFrame {
    
    bd conexao = new bd();
    private String Pesquisa;
    
    public telaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoApagar = new javax.swing.JButton();
        botaoLogar = new javax.swing.JButton();
        painelSenha = new javax.swing.JPanel();
        senha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        painelTitulo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        painelNome = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        botaoApagar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        botaoApagar.setText("APAGAR");
        botaoApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApagarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoApagar);
        botaoApagar.setBounds(30, 310, 130, 50);

        botaoLogar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        botaoLogar.setText("LOGAR");
        botaoLogar.setBorder(null);
        botaoLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoLogar);
        botaoLogar.setBounds(520, 310, 130, 50);

        painelSenha.setBackground(new java.awt.Color(255, 113, 97));
        painelSenha.setLayout(null);

        senha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        senha.setForeground(new java.awt.Color(51, 51, 51));
        painelSenha.add(senha);
        senha.setBounds(90, 0, 530, 50);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SENHA:");
        painelSenha.add(jLabel2);
        jLabel2.setBounds(0, 0, 90, 50);

        getContentPane().add(painelSenha);
        painelSenha.setBounds(30, 240, 620, 50);

        painelTitulo.setBackground(new java.awt.Color(255, 113, 97));
        painelTitulo.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOGIN");
        painelTitulo.add(jLabel3);
        jLabel3.setBounds(290, 20, 80, 29);

        getContentPane().add(painelTitulo);
        painelTitulo.setBounds(0, 0, 710, 80);

        painelNome.setBackground(new java.awt.Color(255, 113, 97));
        painelNome.setLayout(null);

        nome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nome.setForeground(new java.awt.Color(51, 51, 51));
        nome.setAlignmentX(0.1F);
        nome.setBorder(null);
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        painelNome.add(nome);
        nome.setBounds(90, 0, 530, 50);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOME:");
        painelNome.add(jLabel1);
        jLabel1.setBounds(10, 0, 70, 50);

        getContentPane().add(painelNome);
        painelNome.setBounds(30, 160, 620, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgroundSplashEditada.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 700, 380);

        setSize(new java.awt.Dimension(703, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApagarActionPerformed
        nome.setText("");
        senha.setText("");
    }//GEN-LAST:event_botaoApagarActionPerformed

    private void botaoLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogarActionPerformed
        conexao.conecta();
        conexao.executaSQL("SELECT * FROM administradores where nome ="+nome.getText());
        try {
            conexao.rs.first();
            
            telaPainel painel = new telaPainel();
            painel.setVisible(true);
            dispose();
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Usuário ou Senha incorreto!");
        }
        
        
        
       
        
        
        
        
        
    }//GEN-LAST:event_botaoLogarActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

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
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton botaoApagar;
    private javax.swing.JButton botaoLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nome;
    private javax.swing.JPanel painelNome;
    private javax.swing.JPanel painelSenha;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
