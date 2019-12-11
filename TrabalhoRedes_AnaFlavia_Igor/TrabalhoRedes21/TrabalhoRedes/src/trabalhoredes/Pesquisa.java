
package trabalhoredes;

import conexaoBD.controle_usuario;
import conexaoBD.conexaoBD;
import cadastro.cadastro;
import javax.swing.JOptionPane;


public class Pesquisa extends javax.swing.JFrame {

    cadastro cad = new cadastro();
    conexaoBD conex = new conexaoBD();
    controle_usuario control = new controle_usuario();
    
    public Pesquisa() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        config_label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nome_pesquisa = new javax.swing.JLabel();
        nome_pesquisa_txt = new javax.swing.JTextField();
        pesquisa_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        resultado_nome = new javax.swing.JLabel();
        usuario_resultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_nome_resultado = new javax.swing.JTextField();
        txt_usuario_resultado = new javax.swing.JTextField();
        txt_senha_resultado = new javax.swing.JTextField();
        excluir_button = new javax.swing.JButton();
        codigo_label = new javax.swing.JLabel();
        cod_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(78, 52, 46));

        config_label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        config_label.setForeground(new java.awt.Color(255, 255, 255));
        config_label.setText("Pesquisa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(config_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(config_label)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(80, 60, 60));

        nome_pesquisa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nome_pesquisa.setForeground(new java.awt.Color(255, 255, 255));
        nome_pesquisa.setText("Nome:");

        pesquisa_button.setBackground(new java.awt.Color(0, 0, 0));
        pesquisa_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pesquisa_button.setForeground(new java.awt.Color(255, 255, 255));
        pesquisa_button.setText("Pesquisar");
        pesquisa_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisa_buttonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(141, 110, 99));
        jPanel3.setEnabled(false);

        resultado_nome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        resultado_nome.setForeground(new java.awt.Color(255, 255, 255));
        resultado_nome.setText("Nome:");

        usuario_resultado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usuario_resultado.setForeground(new java.awt.Color(255, 255, 255));
        usuario_resultado.setText("Usuário:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha:");

        excluir_button.setBackground(new java.awt.Color(0, 0, 0));
        excluir_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        excluir_button.setForeground(new java.awt.Color(255, 255, 255));
        excluir_button.setText("Excluir");
        excluir_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir_buttonActionPerformed(evt);
            }
        });

        codigo_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        codigo_label.setForeground(new java.awt.Color(255, 255, 255));
        codigo_label.setText("Código:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excluir_button, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(resultado_nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nome_resultado))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(usuario_resultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_usuario_resultado))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_senha_resultado)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(codigo_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cod_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(229, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultado_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nome_resultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario_resultado)
                    .addComponent(txt_usuario_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_senha_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigo_label)
                    .addComponent(cod_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(excluir_button)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nome_pesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(nome_pesquisa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(pesquisa_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_pesquisa)
                    .addComponent(nome_pesquisa_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisa_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisa_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisa_buttonActionPerformed
        cad.setPesquisa(nome_pesquisa_txt.getText()); 
        cadastro model = control.buscausuario(cad);
        txt_nome_resultado.setText(model.getNome());
        txt_usuario_resultado.setText(model.getUsuario());
        txt_senha_resultado.setText(model.getSenha());
        cod_txt.setText(String.valueOf(model.getCodigo()));
        
    }//GEN-LAST:event_pesquisa_buttonActionPerformed

    private void excluir_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir_buttonActionPerformed
       int resposta = 0; 
       resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
       if (resposta == JOptionPane.YES_OPTION) {
           cad.setCodigo(Integer.parseInt(cod_txt.getText()));
           control.Excluir(cad);
           cod_txt.setText("");
           txt_nome_resultado.setText("");
           txt_usuario_resultado.setText("");
           txt_senha_resultado.setText("");
           dispose();
           
       }
    }//GEN-LAST:event_excluir_buttonActionPerformed

  
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cod_txt;
    private javax.swing.JLabel codigo_label;
    private javax.swing.JLabel config_label;
    private javax.swing.JButton excluir_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nome_pesquisa;
    private javax.swing.JTextField nome_pesquisa_txt;
    private javax.swing.JButton pesquisa_button;
    private javax.swing.JLabel resultado_nome;
    private javax.swing.JTextField txt_nome_resultado;
    private javax.swing.JTextField txt_senha_resultado;
    private javax.swing.JTextField txt_usuario_resultado;
    private javax.swing.JLabel usuario_resultado;
    // End of variables declaration//GEN-END:variables
}
