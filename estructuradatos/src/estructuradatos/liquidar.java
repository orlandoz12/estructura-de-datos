/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package estructuradatos;

import static estructuradatos.parqueadero.h;
import static estructuradatos.parqueadero.m;
import static estructuradatos.parqueadero.s;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class liquidar extends javax.swing.JPanel {

    /**
     * Creates new form liquidar
     */
    public liquidar() {
        initComponents();
    }
String comparador;
int tamaño=-1;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        texplacaliq = new javax.swing.JLabel();
        txtplacaliq = new javax.swing.JTextField();
        texnvehiculo = new javax.swing.JLabel();
        txtnvehiculoliq = new javax.swing.JTextField();
        texhingresoliq = new javax.swing.JLabel();
        txthingresoliq = new javax.swing.JTextField();
        texvminutoliq = new javax.swing.JLabel();
        texhsalidaliq = new javax.swing.JLabel();
        txthsalidaliq = new javax.swing.JTextField();
        txtvminutoliq = new javax.swing.JTextField();
        textpagarliq = new javax.swing.JLabel();
        txttpagarliq = new javax.swing.JTextField();
        btconfirmarliq = new javax.swing.JButton();
        btbuscarliq = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setBorder(new javax.swing.border.MatteBorder(null));

        texplacaliq.setText("PLACA");

        texnvehiculo.setText("N.VEHICULO");

        texhingresoliq.setText("HORA INGRESO");

        texvminutoliq.setText("VALOR MINUTO");

        texhsalidaliq.setText("HORA SALIDA");

        txtvminutoliq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvminutoliqActionPerformed(evt);
            }
        });

        textpagarliq.setText("TOTAL PAGAR");

        btconfirmarliq.setText("CONFIRMAR");
        btconfirmarliq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconfirmarliqActionPerformed(evt);
            }
        });

        btbuscarliq.setText("BUSCAR");
        btbuscarliq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarliqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texplacaliq)
                    .addComponent(texhingresoliq)
                    .addComponent(txthingresoliq, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtplacaliq, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texvminutoliq)
                    .addComponent(txtvminutoliq, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btbuscarliq)))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btconfirmarliq)
                    .addComponent(texnvehiculo)
                    .addComponent(txtnvehiculoliq, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texhsalidaliq)
                    .addComponent(txthsalidaliq, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttpagarliq, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textpagarliq))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texplacaliq)
                    .addComponent(texnvehiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnvehiculoliq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtplacaliq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texhsalidaliq)
                    .addComponent(texhingresoliq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txthingresoliq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthsalidaliq, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texvminutoliq)
                    .addComponent(textpagarliq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttpagarliq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvminutoliq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconfirmarliq)
                    .addComponent(btbuscarliq))
                .addContainerGap(238, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtvminutoliqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvminutoliqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvminutoliqActionPerformed

    private void btconfirmarliqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmarliqActionPerformed
txtnvehiculoliq.setText("");
txthingresoliq.setText("");
txthsalidaliq.setText("");
txtplacaliq.setText("");
txtvminutoliq.setText("");
txttpagarliq.setText("");
parqueadero.carro.get(tamaño).setestado("fuera");
 parqueadero.btpingresar.setEnabled(true);
         parqueadero.btpinventario.setEnabled(true);
         parqueadero.btpliquidar.setEnabled(true);
         parqueadero.btpsalir.setEnabled(true);
         parqueadero.liquidar2.setVisible(false);
    }//GEN-LAST:event_btconfirmarliqActionPerformed

    private void btbuscarliqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarliqActionPerformed
      comparador=txtplacaliq.getText();
      for(int i=0;i<parqueadero.nvehiculo;i++)
      {
          String placa=parqueadero.carro.get(i).getplaca();
          //datos obj=new datos();
          //obj=parqueadero.carro.get(i);
          if(comparador.equals(placa)){
              tamaño=i;
            }
          
      }
      if(tamaño==-1){  
          JOptionPane.showMessageDialog(this, "placa no aparese en el inventario");
              txtplacaliq.setText("");
          }else{
       if(parqueadero.carro.get(tamaño).getestado().equals("dentro")){
                  txtnvehiculoliq.setText(""+parqueadero.carro.get(tamaño).getnvehiculo());
      txthingresoliq.setText(""+parqueadero.carro.get(tamaño).gethingresop());
      parqueadero.carro.get(tamaño).sethsalida((h*60*60)+m*60+s);
      parqueadero.carro.get(tamaño).sethsalidap(""+h+":"+m+":"+s);
      txthsalidaliq.setText(""+parqueadero.carro.get(tamaño).gethsalidap());
      if(parqueadero.carro.get(tamaño).gettipo().equals("bicicleta")){
          txtvminutoliq.setText("$20 cop minuto");
        parqueadero.carro.get(tamaño).setpagar(((parqueadero.carro.get(tamaño).gethsalida()-parqueadero.carro.get(tamaño).gethingreso())*20));
      }else { if(parqueadero.carro.get(tamaño).gettipo().equals("carro")){
          txtvminutoliq.setText("$60 cop minuto");
           parqueadero.carro.get(tamaño).setpagar((parqueadero.carro.get(tamaño).gethsalida()-parqueadero.carro.get(tamaño).gethingreso())*60);
      }else{
          txtvminutoliq.setText("$30 cop minuto");
           parqueadero.carro.get(tamaño).setpagar((parqueadero.carro.get(tamaño).gethsalida()-parqueadero.carro.get(tamaño).gethingreso())*30);
      } }
      txttpagarliq.setText(""+parqueadero.carro.get(tamaño).getpagar());   
              }else{
                  JOptionPane.showMessageDialog(this, "vehiculo ya salio");
                  txtplacaliq.setText("");
              }

           
      
      }
  
      
    }//GEN-LAST:event_btbuscarliqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscarliq;
    private javax.swing.JButton btconfirmarliq;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel texhingresoliq;
    private javax.swing.JLabel texhsalidaliq;
    private javax.swing.JLabel texnvehiculo;
    private javax.swing.JLabel texplacaliq;
    private javax.swing.JLabel textpagarliq;
    private javax.swing.JLabel texvminutoliq;
    private javax.swing.JTextField txthingresoliq;
    public static javax.swing.JTextField txthsalidaliq;
    private javax.swing.JTextField txtnvehiculoliq;
    private javax.swing.JTextField txtplacaliq;
    private javax.swing.JTextField txttpagarliq;
    private javax.swing.JTextField txtvminutoliq;
    // End of variables declaration//GEN-END:variables
}
