
package trabalhoredes;

import javax.swing.JOptionPane;
import conexaoBD.conexaoBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends javax.swing.JFrame {
    
     conexaoBD con = new conexaoBD();
     

    public Login() {
        initComponents();
        con.conexao();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        login_label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        usuario_label = new javax.swing.JLabel();
        senha_label = new javax.swing.JLabel();
        usuario_txt = new javax.swing.JTextField();
        senha_txt = new javax.swing.JPasswordField();
        entrar_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(78, 52, 46));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        login_label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        login_label.setForeground(new java.awt.Color(255, 255, 255));
        login_label.setText("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(login_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login_label)
                .addGap(23, 23, 23))
        );

        jPanel2.setBackground(new java.awt.Color(141, 110, 99));

        usuario_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usuario_label.setForeground(new java.awt.Color(255, 255, 255));
        usuario_label.setText("Usuário");

        senha_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        senha_label.setForeground(new java.awt.Color(255, 255, 255));
        senha_label.setText("Senha");

        usuario_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_txtActionPerformed(evt);
            }
        });

        entrar_button.setBackground(new java.awt.Color(0, 0, 0));
        entrar_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        entrar_button.setForeground(new java.awt.Color(255, 255, 255));
        entrar_button.setText("Entrar");
        entrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrar_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 113, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senha_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(usuario_label))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(senha_label))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(entrar_button)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(usuario_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senha_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(entrar_button)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuario_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_txtActionPerformed
     
    }//GEN-LAST:event_usuario_txtActionPerformed

    private void entrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrar_buttonActionPerformed
       
         try {
             con.executaSql("select * from cadastro where usuario ='" +usuario_txt.getText()+"'; ");
             con.rst.first();
             
                 if (con.rst.getString("senha").equals(senha_txt.getText())){
                 Menu tela = new Menu();
                 dispose();
                 tela.setVisible(true);
                 }else {
                 JOptionPane.showMessageDialog(rootPane,"Senha ou usuario invalidos" );
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane,"Senha ou usuario invalidos"+ex );
         }
        
    }//GEN-LAST:event_entrar_buttonActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login_label;
    private javax.swing.JLabel senha_label;
    private javax.swing.JPasswordField senha_txt;
    private javax.swing.JLabel usuario_label;
    private javax.swing.JTextField usuario_txt;
    // End of variables declaration//GEN-END:variables
}
