

package trabalhoredes;

public class Menu extends javax.swing.JFrame {

   
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu_label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        arquivos_cliente_button = new javax.swing.JButton();
        sair_menu_button = new javax.swing.JButton();
        pesquisa_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(78, 52, 46));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        menu_label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        menu_label.setForeground(new java.awt.Color(255, 255, 255));
        menu_label.setText("Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(menu_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(menu_label)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(141, 110, 99));

        arquivos_cliente_button.setBackground(new java.awt.Color(0, 0, 0));
        arquivos_cliente_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        arquivos_cliente_button.setForeground(new java.awt.Color(255, 255, 255));
        arquivos_cliente_button.setText("Mostrar arquivos do cliente");
        arquivos_cliente_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivos_cliente_buttonActionPerformed(evt);
            }
        });

        sair_menu_button.setBackground(new java.awt.Color(0, 0, 0));
        sair_menu_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sair_menu_button.setForeground(new java.awt.Color(255, 255, 255));
        sair_menu_button.setText("Sair");
        sair_menu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_menu_buttonActionPerformed(evt);
            }
        });

        pesquisa_button.setBackground(new java.awt.Color(0, 0, 0));
        pesquisa_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pesquisa_button.setForeground(new java.awt.Color(255, 255, 255));
        pesquisa_button.setText("Pesquisar usúario");
        pesquisa_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisa_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arquivos_cliente_button, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(pesquisa_button, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(sair_menu_button, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(106, 106, 106)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(pesquisa_button)
                .addGap(37, 37, 37)
                .addComponent(arquivos_cliente_button)
                .addGap(27, 27, 27)
                .addComponent(sair_menu_button)
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void sair_menu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_menu_buttonActionPerformed
new Principal().setVisible(true);        
    }//GEN-LAST:event_sair_menu_buttonActionPerformed

    private void arquivos_cliente_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivos_cliente_buttonActionPerformed
new ArqCliente().setVisible(true);        
    }//GEN-LAST:event_arquivos_cliente_buttonActionPerformed

    private void pesquisa_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisa_buttonActionPerformed
new Pesquisa().setVisible(true);        
    }//GEN-LAST:event_pesquisa_buttonActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arquivos_cliente_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel menu_label;
    private javax.swing.JButton pesquisa_button;
    private javax.swing.JButton sair_menu_button;
    // End of variables declaration//GEN-END:variables

}
