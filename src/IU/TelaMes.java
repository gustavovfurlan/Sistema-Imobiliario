package IU;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public class TelaMes extends javax.swing.JDialog {

      private int mes, ano;
      
      /**
       * Creates new form TelaVendaMes
       */
      public TelaMes(java.awt.Frame parent, boolean modal) {
            super(parent, modal);
            initComponents();
      }

      public int getMes() {
            return mes;
      }

      public int getAno() {
            return ano;
      }

      
      
      /**
       * This method is called from within the constructor to initialize the
       * form. WARNING: Do NOT modify this code. The content of this method is
       * always regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jTextField1 = new javax.swing.JTextField();
            jTextField2 = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setResizable(false);

            jTextField1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField1ActionPerformed(evt);
                  }
            });

            jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel1.setText("Digite o mês e o ano a ser buscado");

            jLabel2.setText("Mês");

            jLabel3.setText("Ano");

            jButton1.setText("Buscar");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel1)
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel2)
                                          .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1))
                                          .addComponent(jLabel3))))
                        .addContainerGap(176, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel2)
                              .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jButton1))
                        .addContainerGap(223, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jTextField1ActionPerformed

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
            if(jTextField1.getText().equals("") || jTextField2.equals("")){
                  JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos corretamente");
            } else {
                  mes = Integer.parseInt(jTextField1.getText());
                  ano = Integer.parseInt(jTextField2.getText());
            }
            this.setVisible(false);
      }//GEN-LAST:event_jButton1ActionPerformed

    
      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton jButton1;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JTextField jTextField1;
      private javax.swing.JTextField jTextField2;
      // End of variables declaration//GEN-END:variables
}