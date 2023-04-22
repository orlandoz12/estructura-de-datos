
package estructuradatos;

import javax.swing.JOptionPane;



/**
 *
 * @author asus
 */
public class ingreso extends javax.swing.JPanel {

    
    public ingreso() {
        
        initComponents();
         
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgtvehiculoing = new javax.swing.ButtonGroup();
        texplacaing = new javax.swing.JLabel();
        txtplacaing = new javax.swing.JTextField();
        btbiciletasing = new javax.swing.JRadioButton();
        textvehiculoing = new javax.swing.JLabel();
        btmotociletasing = new javax.swing.JRadioButton();
        btcarrosing = new javax.swing.JRadioButton();
        texhingresoing = new javax.swing.JLabel();
        txthingresoing = new javax.swing.JTextField();
        texvminutoing = new javax.swing.JLabel();
        txtvminutoing = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtnvehiculoing = new javax.swing.JTextField();
        btregistraring = new javax.swing.JButton();

        setBorder(new javax.swing.border.MatteBorder(null));

        texplacaing.setText("PLACA");

        btgtvehiculoing.add(btbiciletasing);
        btbiciletasing.setText("BICICLETAS O CICLOMOTORES");
        btbiciletasing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbiciletasingActionPerformed(evt);
            }
        });

        textvehiculoing.setText("TIPO DE VEHICULO");

        btgtvehiculoing.add(btmotociletasing);
        btmotociletasing.setText("MOTOCICLETAS");
        btmotociletasing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmotociletasingActionPerformed(evt);
            }
        });

        btgtvehiculoing.add(btcarrosing);
        btcarrosing.setText("CARROS");
        btcarrosing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcarrosingActionPerformed(evt);
            }
        });

        texhingresoing.setText("HORA INGRESO");

        texvminutoing.setText("VALOR MINUTO");

        jLabel1.setText("N. DE VEHICULO");

        btregistraring.setText("REGISTRAR");
        btregistraring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregistraringActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btcarrosing)
                            .addComponent(texvminutoing))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtnvehiculoing, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(btregistraring)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btmotociletasing)
                                .addComponent(textvehiculoing)
                                .addComponent(btbiciletasing)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtplacaing, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(110, 110, 110)
                                    .addComponent(txthingresoing))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(texplacaing)
                                    .addGap(174, 174, 174)
                                    .addComponent(texhingresoing)))
                            .addComponent(txtvminutoing, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texplacaing)
                    .addComponent(texhingresoing))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtplacaing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthingresoing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textvehiculoing)
                .addGap(2, 2, 2)
                .addComponent(btbiciletasing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btmotociletasing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcarrosing)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texvminutoing)
                    .addComponent(txtnvehiculoing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtvminutoing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btregistraring)
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btregistraringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregistraringActionPerformed
     if(txtplacaing.getText().isEmpty() || (btbiciletasing.isSelected()==false && btmotociletasing.isSelected()==false && btcarrosing.isSelected()==false) ){
          JOptionPane.showMessageDialog(this, "favor de no dejar campós vacios");
     }else{
         parqueadero.da.setplaca(txtplacaing.getText());
         if(btbiciletasing.isSelected()){
             parqueadero.da.settipo("bicicleta");    
         }else if(btmotociletasing.isSelected()){
             parqueadero.da.settipo("motocicleta"); 
         }else{
             parqueadero.da.settipo("carro");
         }
             
             
         parqueadero.da.setestado("dentro");
         parqueadero.btpingresar.setEnabled(true);
         parqueadero.btpinventario.setEnabled(true);
         parqueadero.btpliquidar.setEnabled(true);
         parqueadero.btpsalir.setEnabled(true);
        
         txtplacaing.setText("");
         txtvminutoing.setText("");
         btgtvehiculoing.clearSelection();
         parqueadero.carro.push(parqueadero.da);
         parqueadero.ingreso2.setVisible(false);
      
     }
    }//GEN-LAST:event_btregistraringActionPerformed

    private void btbiciletasingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbiciletasingActionPerformed
       txtvminutoing.setText("$20 cop minuto");
    }//GEN-LAST:event_btbiciletasingActionPerformed

    private void btmotociletasingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmotociletasingActionPerformed
       txtvminutoing.setText("$30 cop minuto");
    }//GEN-LAST:event_btmotociletasingActionPerformed

    private void btcarrosingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcarrosingActionPerformed
       txtvminutoing.setText("$60 cop minuto");
    }//GEN-LAST:event_btcarrosingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btbiciletasing;
    private javax.swing.JRadioButton btcarrosing;
    private javax.swing.ButtonGroup btgtvehiculoing;
    private javax.swing.JRadioButton btmotociletasing;
    private javax.swing.JButton btregistraring;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel texhingresoing;
    private javax.swing.JLabel texplacaing;
    private javax.swing.JLabel textvehiculoing;
    private javax.swing.JLabel texvminutoing;
    public static javax.swing.JTextField txthingresoing;
    public static javax.swing.JTextField txtnvehiculoing;
    private javax.swing.JTextField txtplacaing;
    private javax.swing.JTextField txtvminutoing;
    // End of variables declaration//GEN-END:variables
}
