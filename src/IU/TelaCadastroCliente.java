package IU;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public class TelaCadastroCliente extends javax.swing.JDialog {
      
      private int diaNasc, mesNasc, anoNasc, diaCad, mesCad, anoCad;
      private String cod, nome, cpf, rg, cep, endereco, telefone, email;

      public int getDiaNasc() {
            return diaNasc;
      }

      public int getMesNasc() {
            return mesNasc;
      }

      public int getAnoNasc() {
            return anoNasc;
      }

      public int getDiaCad() {
            return diaCad;
      }

      public int getMesCad() {
            return mesCad;
      }

      public int getAnoCad() {
            return anoCad;
      }

      public String getCod() {
            return cod;
      }

      public String getNome() {
            return nome;
      }

      public String getCpf() {
            return cpf;
      }

      public String getRg() {
            return rg;
      }

      public String getCep() {
            return cep;
      }

      public String getEndereco() {
            return endereco;
      }

      public String getTelefone() {
            return telefone;
      }

      public String getEmail() {
            return email;
      }
      
      
      /**
       * Creates new form TelaCadastroCliente
       */
      public TelaCadastroCliente(java.awt.Frame parent, boolean modal) {
            super(parent, modal);
            initComponents();
      }

      /**
       * This method is called from within the constructor to initialize the
       * form. WARNING: Do NOT modify this code. The content of this method is
       * always regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanelTitulo = new javax.swing.JPanel();
            jLabelTitulo = new javax.swing.JLabel();
            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jFormattedTextFieldCod = new javax.swing.JFormattedTextField();
            jLabel2 = new javax.swing.JLabel();
            jTextFieldNome = new javax.swing.JTextField();
            jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
            jLabel4 = new javax.swing.JLabel();
            SimpleDateFormat model = new SimpleDateFormat("dd.MM.yy");
            jSpinnerDataNasc = new javax.swing.JSpinner(new SpinnerDateModel());
            jSpinnerDataNasc.setEditor(new JSpinner.DateEditor(jSpinnerDataNasc, model.toPattern()));
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            jTextAreaEndereco = new javax.swing.JTextArea();
            jLabel7 = new javax.swing.JLabel();
            jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
            jLabel8 = new javax.swing.JLabel();
            jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
            jLabel9 = new javax.swing.JLabel();
            jTextFieldEmail = new javax.swing.JTextField();
            SimpleDateFormat model1 = new SimpleDateFormat("dd.MM.yy");
            jSpinnerDataCad = new javax.swing.JSpinner(new SpinnerDateModel());
            jSpinnerDataCad.setEditor(new JSpinner.DateEditor(jSpinnerDataNasc, model1.toPattern()));
            jLabel10 = new javax.swing.JLabel();
            jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
            jLabel3 = new javax.swing.JLabel();
            jButtonCadastrar = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
            setResizable(false);

            jLabelTitulo.setFont(jLabelTitulo.getFont().deriveFont((float)30));
            jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabelTitulo.setText("Cadastro de Cliente");

            javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
            jPanelTitulo.setLayout(jPanelTituloLayout);
            jPanelTituloLayout.setHorizontalGroup(
                  jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            jPanelTituloLayout.setVerticalGroup(
                  jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );

            jLabel1.setText("Código do Cliente");

            jFormattedTextFieldCod.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

            jLabel2.setText("Nome");

            jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextFieldNomeActionPerformed(evt);
                  }
            });

            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

            jLabel4.setText("CPF");

            jSpinnerDataNasc.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1669669959618L), new java.util.Date(-1577912400000L), new java.util.Date(1669669959618L), java.util.Calendar.DAY_OF_MONTH));

            jLabel5.setText("Data de Nascimento");

            jLabel6.setText("Endereço");

            jTextAreaEndereco.setColumns(20);
            jTextAreaEndereco.setLineWrap(true);
            jTextAreaEndereco.setRows(1);
            jScrollPane1.setViewportView(jTextAreaEndereco);

            jLabel7.setText("CEP");

            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

            jLabel8.setText("Telefone");

            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

            jLabel9.setText("E-mail");

            jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextFieldEmailActionPerformed(evt);
                  }
            });

            jSpinnerDataCad.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1669669959618L), new java.util.Date(-1577912400000L), new java.util.Date(1669669959618L), java.util.Calendar.DAY_OF_MONTH));

            jLabel10.setText("Data de Cadastro");

            jFormattedTextFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

            jLabel3.setText("RG");

            jButtonCadastrar.setText("Cadastrar");
            jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButtonCadastrarActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(104, 104, 104))
                                          .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                  .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                  .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGap(18, 18, 18)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                  .addComponent(jSpinnerDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                  .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                                            .addGap(18, 18, 18)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                  .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                  .addComponent(jSpinnerDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                                      .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                  .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                                  .addComponent(jFormattedTextFieldCod))
                                                            .addGap(18, 18, 18)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                  .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                  .addComponent(jTextFieldNome))))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                      .addComponent(jLabel8)
                                                      .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                      .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGap(42, 42, 42))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(196, 460, Short.MAX_VALUE))))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(6, 6, 6)
                                                .addComponent(jFormattedTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(6, 6, 6)
                                                .addComponent(jSpinnerDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addComponent(jLabel5)
                                          .addComponent(jSpinnerDataNasc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
            // TODO add your handling code here:
            
           cod = jFormattedTextFieldCod.getText();
           nome = jTextFieldNome.getText();
           cpf = jFormattedTextFieldCPF.getText();
           rg = jFormattedTextFieldRG.getText();
           cep = jFormattedTextFieldCEP.getText();
           endereco =  jTextAreaEndereco.getText();
           telefone = jFormattedTextFieldTelefone.getText();
           email = jTextFieldEmail.getText();
            
           LocalDate dataNasc = ((Date) jSpinnerDataNasc.getValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           diaNasc = dataNasc.getDayOfMonth();
           mesNasc = dataNasc.getMonthValue();
           anoNasc = dataNasc.getYear();
           LocalDate dataCad = ((Date) jSpinnerDataCad.getValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           diaCad = dataCad.getDayOfMonth();
           mesCad = dataCad.getMonthValue();
           anoCad = dataCad.getYear();
            
            boolean preenchidos = false;
            if(!cod.equals("") && !nome.equals("") && !cpf.equals("") && !rg.equals("") && !cep.equals("") &&
                !endereco.equals("") && !telefone.equals("") && !email.equals("") &&
                !(diaNasc == 0) && !(mesNasc == 0) && !(anoNasc == 0)){
                  if(!(diaCad == 0) && !(mesCad == 0) && !(anoCad == 0)) preenchidos = true;
            }
            if(preenchidos){
                  this.setVisible(false);
            } else {
                  JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos corretamente");
            }
      }//GEN-LAST:event_jButtonCadastrarActionPerformed

      private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jTextFieldEmailActionPerformed

      private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jTextFieldNomeActionPerformed


      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton jButtonCadastrar;
      private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
      private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
      private javax.swing.JFormattedTextField jFormattedTextFieldCod;
      private javax.swing.JFormattedTextField jFormattedTextFieldRG;
      private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JLabel jLabelTitulo;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanelTitulo;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JSpinner jSpinnerDataCad;
      private javax.swing.JSpinner jSpinnerDataNasc;
      private javax.swing.JTextArea jTextAreaEndereco;
      private javax.swing.JTextField jTextFieldEmail;
      private javax.swing.JTextField jTextFieldNome;
      // End of variables declaration//GEN-END:variables
}