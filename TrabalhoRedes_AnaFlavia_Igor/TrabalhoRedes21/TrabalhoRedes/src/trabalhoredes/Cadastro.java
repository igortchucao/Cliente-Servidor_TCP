
package trabalhoredes;

import cadastro.cadastro;
import conexaoBD.conexaoBD;
import conexaoBD.controle_usuario;


public class Cadastro extends javax.swing.JFrame {

  cadastro cad = new cadastro();
  controle_usuario control = new controle_usuario();
  conexaoBD conex = new conexaoBD();
    public Cadastro() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cadastro_label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nome_label = new javax.swing.JLabel();
        nome_txt = new javax.swing.JTextField();
        usuario_label_cadastro = new javax.swing.JLabel();
        usuario_txt_cadastro = new javax.swing.JTextField();
        senha_label_cadastro = new javax.swing.JLabel();
        confirmar_senha = new javax.swing.JLabel();
        confirmar_cadastro = new javax.swing.JButton();
        senha_txt_cadastro = new javax.swing.JTextField();
        confirm_senha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(78, 52, 46));

        cadastro_label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        cadastro_label.setForeground(new java.awt.Color(255, 255, 255));
        cadastro_label.setText("Cadastre-se");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(cadastro_label, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastro_label)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(141, 110, 99));

        nome_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nome_label.setForeground(new java.awt.Color(255, 255, 255));
        nome_label.setText("Nome");

        usuario_label_cadastro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usuario_label_cadastro.setForeground(new java.awt.Color(255, 255, 255));
        usuario_label_cadastro.setText("Usuário");

        senha_label_cadastro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        senha_label_cadastro.setForeground(new java.awt.Color(255, 255, 255));
        senha_label_cadastro.setText("Senha");

        confirmar_senha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        confirmar_senha.setForeground(new java.awt.Color(255, 255, 255));
        confirmar_senha.setText("Confirme sua senha");

        confirmar_cadastro.setBackground(new java.awt.Color(0, 0, 0));
        confirmar_cadastro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        confirmar_cadastro.setForeground(new java.awt.Color(255, 255, 255));
        confirmar_cadastro.setText("Confirmar");
        confirmar_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar_cadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(nome_label))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(usuario_label_cadastro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario_txt_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senha_txt_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirm_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(senha_label_cadastro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(confirmar_cadastro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(confirmar_senha)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nome_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuario_label_cadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario_txt_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senha_label_cadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senha_txt_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmar_senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirm_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(confirmar_cadastro)
                .addContainerGap(39, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmar_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar_cadastroActionPerformed
        cad.setNome(nome_txt.getText());
        cad.setUsuario(usuario_txt_cadastro.getText());
        cad.setSenha(senha_txt_cadastro.getText());
        control.Salvar(cad);
            
           nome_txt.setText("");
           usuario_txt_cadastro.setText("");
           senha_txt_cadastro.setText("");
           dispose();
;        new Login().setVisible(true);       
    }//GEN-LAST:event_confirmar_cadastroActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastro_label;
    private javax.swing.JTextField confirm_senha;
    private javax.swing.JButton confirmar_cadastro;
    private javax.swing.JLabel confirmar_senha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nome_label;
    private javax.swing.JTextField nome_txt;
    private javax.swing.JLabel senha_label_cadastro;
    private javax.swing.JTextField senha_txt_cadastro;
    private javax.swing.JLabel usuario_label_cadastro;
    private javax.swing.JTextField usuario_txt_cadastro;
    // End of variables declaration//GEN-END:variables
}
