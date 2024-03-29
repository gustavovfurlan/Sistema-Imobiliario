package IU;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;



/**
 *
 * @author Gabriel, Gustavo, Igor
 */
public class TelaAluguel extends javax.swing.JDialog {
      private String nome, bandeira, codImovel, codCorretor, codCliente, numero, codAlug, tipoPag;
      private int diaDev, mesDev, anoDev, diaPag, mesPag, anoPag;
      private ArrayList<Integer> segs;

      public String getNome() {
            return nome;
      }

      public String getBandeira() {
            return bandeira;
      }

      public String getCodImovel() {
            return codImovel;
      }

      public String getCodCorretor() {
            return codCorretor;
      }

      public String getCodCliente() {
            return codCliente;
      }

      public String getNumero() {
            return numero;
      }
    
      public String getCodAlug(){
            return codAlug;
      }

      public int getDiaDev() {
            return diaDev;
      }

      public int getMesDev() {
            return mesDev;
      }

      public int getAnoDev() {
            return anoDev;
      }

      public int getDiaPag() {
            return diaPag;
      }

      public int getMesPag() {
            return mesPag;
      }

      public int getAnoPag() {
            return anoPag;
      }

      public ArrayList<Integer> getSegs() {
            return segs;
      }

      public String getTipoPag() {
            return tipoPag;
      }
      
      /**
       * Creates new form TelaCadastroCliente
       */
      public TelaAluguel(java.awt.Frame parent, boolean modal) {
            super(parent, modal);
            segs = new ArrayList();
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

            buttonGroupPag = new javax.swing.ButtonGroup();
            jPanelTitulo = new javax.swing.JPanel();
            jLabelTitulo = new javax.swing.JLabel();
            jFormattedTextFieldCodImovel = new javax.swing.JFormattedTextField();
            jLabel2 = new javax.swing.JLabel();
            jFormattedTextFieldCodCliente = new javax.swing.JFormattedTextField();
            jLabel3 = new javax.swing.JLabel();
            jFormattedTextFieldCodCorretor = new javax.swing.JFormattedTextField();
            jLabel4 = new javax.swing.JLabel();
            jLabel1 = new javax.swing.JLabel();
            jTextFieldNome = new javax.swing.JTextField();
            jTextFieldBandeira = new javax.swing.JTextField();
            jLabel5 = new javax.swing.JLabel();
            jFormattedTextFieldNumero = new javax.swing.JFormattedTextField();
            jLabel6 = new javax.swing.JLabel();
            jButtonRegistrar = new javax.swing.JButton();
            jLabel7 = new javax.swing.JLabel();
            jFormattedTextFieldCodAlug = new javax.swing.JFormattedTextField();
            jRadioButtonCartao = new javax.swing.JRadioButton();
            jRadioButtonDinheiro = new javax.swing.JRadioButton();
            jButtonAddSeg = new javax.swing.JButton();
            jLabel8 = new javax.swing.JLabel();
            jFormattedTextFieldCodSeg = new javax.swing.JFormattedTextField();
            SimpleDateFormat model = new SimpleDateFormat("dd.MM.yy");
            jSpinnerDataDev = new javax.swing.JSpinner(new SpinnerDateModel());
            jSpinnerDataDev.setEditor(new JSpinner.DateEditor(jSpinnerDataDev, model.toPattern()));
            jLabel9 = new javax.swing.JLabel();
            jLabel10 = new javax.swing.JLabel();
            SimpleDateFormat model1 = new SimpleDateFormat("dd.MM.yy");
            jSpinnerDataPag = new javax.swing.JSpinner(new SpinnerDateModel());
            jSpinnerDataPag.setEditor(new JSpinner.DateEditor(jSpinnerDataPag, model1.toPattern()));

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
            setResizable(false);

            jLabelTitulo.setFont(jLabelTitulo.getFont().deriveFont((float)30));
            jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabelTitulo.setText("Contratar Aluguel");

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

            jFormattedTextFieldCodImovel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
            jFormattedTextFieldCodImovel.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jFormattedTextFieldCodImovelActionPerformed(evt);
                  }
            });

            jLabel2.setText("Código Imóvel");

            jFormattedTextFieldCodCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
            jFormattedTextFieldCodCliente.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jFormattedTextFieldCodClienteActionPerformed(evt);
                  }
            });

            jLabel3.setText("Código Cliente");

            jFormattedTextFieldCodCorretor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
            jFormattedTextFieldCodCorretor.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jFormattedTextFieldCodCorretorActionPerformed(evt);
                  }
            });

            jLabel4.setText("Código Corretor");

            jLabel1.setText("Nome no Cartão (se utilizado)");

            jLabel5.setText("Bandeira do Cartão (se utilizado)");

            jFormattedTextFieldNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
            jFormattedTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jFormattedTextFieldNumeroActionPerformed(evt);
                  }
            });

            jLabel6.setText("Número do Cartão (se utilizado)");

            jButtonRegistrar.setText("Registrar");
            jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButtonRegistrarActionPerformed(evt);
                  }
            });

            jLabel7.setText("Código do Aluguel");

            jFormattedTextFieldCodAlug.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
            jFormattedTextFieldCodAlug.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jFormattedTextFieldCodAlugActionPerformed(evt);
                  }
            });

            buttonGroupPag.add(jRadioButtonCartao);
            jRadioButtonCartao.setText("Cartão");
            jRadioButtonCartao.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jRadioButtonCartaoActionPerformed(evt);
                  }
            });

            buttonGroupPag.add(jRadioButtonDinheiro);
            jRadioButtonDinheiro.setText("Dinheiro");
            jRadioButtonDinheiro.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jRadioButtonDinheiroActionPerformed(evt);
                  }
            });

            jButtonAddSeg.setText("Adicionar");
            jButtonAddSeg.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButtonAddSegActionPerformed(evt);
                  }
            });

            jLabel8.setText("Código Seguro");

            jFormattedTextFieldCodSeg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
            jFormattedTextFieldCodSeg.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jFormattedTextFieldCodSegActionPerformed(evt);
                  }
            });

            jSpinnerDataDev.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1669669959618L), new java.util.Date(-1577912400000L), new java.util.Date(1669669959618L), java.util.Calendar.DAY_OF_MONTH));

            jLabel9.setText("Data de Devolução");

            jLabel10.setText("Data de Pagamento");

            jSpinnerDataPag.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1669669959618L), new java.util.Date(-1577912400000L), new java.util.Date(1669669959618L), java.util.Calendar.DAY_OF_MONTH));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(139, 139, 139)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                      .addGap(296, 296, 296)
                                                      .addComponent(jFormattedTextFieldCodCliente))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                  .addComponent(jFormattedTextFieldCodAlug, javax.swing.GroupLayout.Alignment.LEADING)
                                                                  .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                  .addComponent(jFormattedTextFieldCodImovel, javax.swing.GroupLayout.Alignment.LEADING)
                                                                  .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(33, 33, 33))
                                                                  .addGroup(layout.createSequentialGroup()
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                              .addComponent(jFormattedTextFieldCodCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                    .addComponent(jSpinnerDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGap(18, 18, 18)))
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                  .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                  .addComponent(jSpinnerDataPag, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                      .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                  .addComponent(jLabel5)
                                                                  .addComponent(jTextFieldBandeira, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                                                  .addComponent(jTextFieldNome))
                                                            .addGap(12, 12, 12)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                  .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                                                  .addComponent(jFormattedTextFieldNumero))))))
                                    .addContainerGap(32, Short.MAX_VALUE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButtonCartao)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButtonDinheiro))
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                .addComponent(jFormattedTextFieldCodSeg, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButtonAddSeg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(0, 0, Short.MAX_VALUE))))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel2)
                                          .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jFormattedTextFieldCodImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jFormattedTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jFormattedTextFieldCodCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel7)
                                          .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jFormattedTextFieldCodAlug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jSpinnerDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSpinnerDataPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jRadioButtonCartao)
                              .addComponent(jRadioButtonDinheiro))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jFormattedTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCodSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddSeg)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(9, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void jFormattedTextFieldCodImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCodImovelActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jFormattedTextFieldCodImovelActionPerformed

      private void jFormattedTextFieldCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCodClienteActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jFormattedTextFieldCodClienteActionPerformed

      private void jFormattedTextFieldCodCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCodCorretorActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jFormattedTextFieldCodCorretorActionPerformed

      private void jFormattedTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldNumeroActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jFormattedTextFieldNumeroActionPerformed

      private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
            // TODO add your handling code here:
            codAlug = jFormattedTextFieldCodAlug.getText();
            numero =  jFormattedTextFieldNumero.getText();
            codImovel = jFormattedTextFieldCodImovel.getText();
            codCliente = jFormattedTextFieldCodCliente.getText();
            codCorretor = jFormattedTextFieldCodCorretor.getText();
            nome = jTextFieldNome.getText();
            bandeira = jTextFieldBandeira.getText();
            
           if(jRadioButtonCartao.isSelected()){
                 tipoPag = "Cartão";
           } else if(jRadioButtonDinheiro.isSelected()){
                 tipoPag = "Dinheiro";
           }
            
            LocalDate dataDev = ((Date) jSpinnerDataDev.getValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           diaDev = dataDev.getDayOfMonth();
           mesDev = dataDev.getMonthValue();
           anoDev = dataDev.getYear();
           LocalDate dataPag = ((Date) jSpinnerDataPag.getValue()).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           diaPag = dataPag.getDayOfMonth();
           mesPag = dataPag.getMonthValue();
           anoPag = dataPag.getYear();
            
            boolean preenchidos = false;
            if(!codAlug.equals("") && !numero.equals("") && !codImovel.equals("") && !codCliente.equals("") && !codCorretor.equals("") && !nome.equals("") && !bandeira.equals("")) preenchidos = true;
            if(jRadioButtonCartao.isSelected() || jRadioButtonDinheiro.isSelected()){
                  preenchidos = true;
            } else {
                  preenchidos = false;
            }
            if(preenchidos){
                  this.setVisible(false);
            } else {
                  JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos corretamente");
            }
      }//GEN-LAST:event_jButtonRegistrarActionPerformed

      private void jFormattedTextFieldCodAlugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCodAlugActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jFormattedTextFieldCodAlugActionPerformed

      private void jFormattedTextFieldCodSegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCodSegActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jFormattedTextFieldCodSegActionPerformed

      private void jButtonAddSegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddSegActionPerformed
            // TODO add your handling code here:
            if(!jFormattedTextFieldCodSeg.getText().equals("")){
                  segs.add(Integer.parseInt(jFormattedTextFieldCodSeg.getText()));
            }
            jFormattedTextFieldCodSeg.setText("");
      }//GEN-LAST:event_jButtonAddSegActionPerformed

      private void jRadioButtonCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCartaoActionPerformed
            // TODO add your handling code here:
            jTextFieldBandeira.setEditable(true);
            jTextFieldNome.setEditable(true);
            jFormattedTextFieldNumero.setEditable(true);
      }//GEN-LAST:event_jRadioButtonCartaoActionPerformed

      private void jRadioButtonDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDinheiroActionPerformed
            // TODO add your handling code here:
            jTextFieldBandeira.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldNumero.setText("");
            jTextFieldBandeira.setEditable(false);
            jTextFieldNome.setEditable(false);
            jFormattedTextFieldNumero.setEditable(false);
      }//GEN-LAST:event_jRadioButtonDinheiroActionPerformed


      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.ButtonGroup buttonGroupPag;
      private javax.swing.JButton jButtonAddSeg;
      private javax.swing.JButton jButtonRegistrar;
      private javax.swing.JFormattedTextField jFormattedTextFieldCodAlug;
      private javax.swing.JFormattedTextField jFormattedTextFieldCodCliente;
      private javax.swing.JFormattedTextField jFormattedTextFieldCodCorretor;
      private javax.swing.JFormattedTextField jFormattedTextFieldCodImovel;
      private javax.swing.JFormattedTextField jFormattedTextFieldCodSeg;
      private javax.swing.JFormattedTextField jFormattedTextFieldNumero;
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
      private javax.swing.JPanel jPanelTitulo;
      private javax.swing.JRadioButton jRadioButtonCartao;
      private javax.swing.JRadioButton jRadioButtonDinheiro;
      private javax.swing.JSpinner jSpinnerDataDev;
      private javax.swing.JSpinner jSpinnerDataPag;
      private javax.swing.JTextField jTextFieldBandeira;
      private javax.swing.JTextField jTextFieldNome;
      // End of variables declaration//GEN-END:variables
}
