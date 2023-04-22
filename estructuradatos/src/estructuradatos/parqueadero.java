
package estructuradatos;

import static estructuradatos.ingreso.txthingresoing;
import static estructuradatos.ingreso.txtnvehiculoing;
import java.util.Stack;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
public class parqueadero extends javax.swing.JFrame {
public static Stack<datos> carro=new Stack<datos>();
public static datos da;
Timer temporizador;
ActionListener al;
public static int h,m,s;
public static int nvehiculo=0;
    public parqueadero() {
        
        initComponents();{
        al=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              LocalDateTime locaDate=LocalDateTime.now();
              h=locaDate.getHour();
              m=locaDate.getMinute();
              s=locaDate.getSecond();
              txthoraparq.setText(""+h+":"+m+":"+s);
              
            }
            
        };
        temporizador=new Timer(1000,al);
        temporizador.start();
    }
        setSize(800,450);
        ingreso2.setVisible(false);
        inventario2.setVisible(false);
        liquidar2.setVisible(false);
      
   
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btpingresar = new javax.swing.JButton();
        btpliquidar = new javax.swing.JButton();
        btpinventario = new javax.swing.JButton();
        btpsalir = new javax.swing.JButton();
        liquidar2 = new estructuradatos.liquidar();
        ingreso2 = new estructuradatos.ingreso();
        inventario2 = new estructuradatos.inventario();
        texhorapar = new javax.swing.JLabel();
        txthoraparq = new javax.swing.JTextField();
        prueva = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btpingresar.setText("INGRESAR");
        btpingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpingresarActionPerformed(evt);
            }
        });

        btpliquidar.setText("LIQUIDAR");
        btpliquidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpliquidarActionPerformed(evt);
            }
        });

        btpinventario.setText("INVENTARIO");
        btpinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpinventarioActionPerformed(evt);
            }
        });

        btpsalir.setText("SALIR");
        btpsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpsalirActionPerformed(evt);
            }
        });

        liquidar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ingreso2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        inventario2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        texhorapar.setText("HORA:");

        txthoraparq.setEditable(false);
        txthoraparq.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texhorapar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txthoraparq, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1393, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btpinventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btpingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btpliquidar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btpsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(prueva, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(liquidar2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inventario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texhorapar)
                    .addComponent(txthoraparq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inventario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btpingresar)
                            .addComponent(btpliquidar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btpinventario)
                            .addComponent(btpsalir))
                        .addGap(30, 30, 30)
                        .addComponent(prueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(liquidar2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(294, Short.MAX_VALUE))
        );

        txthoraparq.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btpliquidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpliquidarActionPerformed
        setSize(800,450);
        ingreso2.setVisible(false);
        inventario2.setVisible(false);
        liquidar2.setVisible(true);
         btpingresar.setEnabled(false);
        btpliquidar.setEnabled(false);
        btpsalir.setEnabled(false);
        btpinventario.setEnabled(false);
        da.sethsalida((h*60*60)+m*60+s);
        da.sethsalidap(""+h+":"+m+":"+s);
       
       
    }//GEN-LAST:event_btpliquidarActionPerformed

    private void btpingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpingresarActionPerformed
       setSize(800,450);
       da =new datos();
       liquidar2.setVisible(false);
        inventario2.setVisible(false);
        ingreso2.setVisible(true);
        nvehiculo=nvehiculo+1;
        da.setnvehiculo(nvehiculo);
        txtnvehiculoing.setText(""+nvehiculo);
        da.sethingreso((h*60*60)+m*60+s);
        da.sethingresop(""+h+":"+m+":"+s);
        txthingresoing.setText(""+h+":"+m+":"+s);
        btpingresar.setEnabled(false);
        btpliquidar.setEnabled(false);
        btpsalir.setEnabled(false);
        btpinventario.setEnabled(false);
        
    }//GEN-LAST:event_btpingresarActionPerformed

    private void btpinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpinventarioActionPerformed
       setSize(1000,450);
        liquidar2.setVisible(false);
        inventario2.setVisible(true);
        ingreso2.setVisible(false);
         btpingresar.setEnabled(false);
        btpliquidar.setEnabled(false);
        btpsalir.setEnabled(false);
        btpinventario.setEnabled(false);
    }//GEN-LAST:event_btpinventarioActionPerformed

    private void btpsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpsalirActionPerformed
      System.exit(0);
    }//GEN-LAST:event_btpsalirActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btpingresar;
    public static javax.swing.JButton btpinventario;
    public static javax.swing.JButton btpliquidar;
    public static javax.swing.JButton btpsalir;
    public static estructuradatos.ingreso ingreso2;
    public static estructuradatos.inventario inventario2;
    public static estructuradatos.liquidar liquidar2;
    public static javax.swing.JTextField prueva;
    private javax.swing.JLabel texhorapar;
    public static javax.swing.JTextField txthoraparq;
    // End of variables declaration//GEN-END:variables

    private Timer Timer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
