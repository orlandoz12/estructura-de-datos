
package estructuradatos;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static java.lang.Integer.parseInt;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class eps extends javax.swing.JFrame {
    Timer temporizador,temporizador2;
    ActionListener al,bl;
Queue nomb = new LinkedList<>();
Queue emb = new LinkedList<>();
Queue anciniños = new LinkedList<>();
Queue limimo = new LinkedList<>();
     int turnopen=0,turno=0,turnot=0;
     int  emba=0,anciniño=0,limimos=0,nombe=0;
    int j=0,t=10; 
    int i=10;
    public eps() {
        initComponents();
         al = new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e){
                txttiempturno.setText(""+i);
                turnopen=turnot-j;
                txtturnpend.setText(""+turnopen);
                i--; 
                if(i==0){
                    i=t;
                }
                boolean vacia=nomb.isEmpty();
                boolean vaciaan=anciniños.isEmpty();
                  boolean vaciaem=emb.isEmpty();
                  boolean vaciali=limimo.isEmpty();
                if(vacia && vaciaan && vaciaem && vaciali){
                    txttiempturno.setText(""+0);
                   txtturnpend.setText(""+0);
                   temporizador.stop();
                }
             }  
    };
         bl = new ActionListener(){
             public void actionPerformed(ActionEvent e){
                  temporizador.start();
                  boolean vaciaan=anciniños.isEmpty();
                  boolean vaciaem=emb.isEmpty();
                  boolean vaciali=limimo.isEmpty();
                  boolean vacia=nomb.isEmpty();
                  if(vaciaan!=true){
                      txtnombreproy.setText((String) anciniños.remove());
                  }else{
                  if(vaciaem!=true){
                      txtnombreproy.setText((String) emb.remove());
                  }else{
                  if(vaciali!=true){
                      txtnombreproy.setText((String) limimo.remove());
                  }else{
                      txtnombreproy.setText((String) nomb.remove());
                      }}}
                 txtturno.setText(""+(j+1));
                 if(vacia && vaciaan && vaciaem && vaciali){
                     txtturno.setText(""+0); 
                     temporizador2.stop(); 
                 }
                 j++; }          
         };
        temporizador = new Timer(1000,al); 
        temporizador2 = new Timer(t*1000,bl);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        txtnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        afilicacion = new javax.swing.JComboBox<>();
        btembarazada = new javax.swing.JRadioButton();
        btlimitacion = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtturno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttiempturno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtturnpend = new javax.swing.JTextField();
        btasignar = new javax.swing.JButton();
        txtnombreproy = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btextend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("NOMBRE");

        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("APELLIDO");

        afilicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POS", "PC" }));
        afilicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afilicacionActionPerformed(evt);
            }
        });

        grupo1.add(btembarazada);
        btembarazada.setText("EMBARAZADA");
        btembarazada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btembarazadaActionPerformed(evt);
            }
        });

        grupo1.add(btlimitacion);
        btlimitacion.setText("LIMITACION MOTRIZ");
        btlimitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimitacionActionPerformed(evt);
            }
        });

        jLabel3.setText("CONDICION ESPECIAL");

        jLabel4.setText("AFILIACION");

        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtedadKeyTyped(evt);
            }
        });

        jLabel5.setText("EDAD");

        jLabel6.setText("TURNO");

        jLabel7.setText("TIEMPO PROXIMO TURNO");

        jLabel8.setText("TURNOS PENDIENTES");

        btasignar.setText("ASIGNAR TURNO");
        btasignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btasignarActionPerformed(evt);
            }
        });

        jLabel9.setText("PACIENTE");

        btextend.setText("ESTENDER TIEMPO");
        btextend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btextendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtturno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtnombreproy, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel7)
                    .addComponent(txttiempturno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtturnpend, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btextend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btasignar)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtedad)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(afilicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtnombre)
                                .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btembarazada)
                                .addGap(18, 18, 18)
                                .addComponent(btlimitacion)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombreproy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttiempturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtturnpend, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(afilicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(btextend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btembarazada)
                    .addComponent(btlimitacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btasignar)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void afilicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afilicacionActionPerformed

    }//GEN-LAST:event_afilicacionActionPerformed

    private void btasignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btasignarActionPerformed
       if(txtnombre.getText().isEmpty() || txtapellidos.getText().isEmpty() || txtedad.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "favor de no dejar campós vacios");
       }else{
        if(parseInt(txtedad.getText())<12 || parseInt(txtedad.getText())>59){
          anciniños.add(txtnombre.getText()+" "+txtapellidos.getText());
          turnot=turnot+1;
          
       }else if(btembarazada.isSelected()){
           emb.add(txtnombre.getText()+" "+txtapellidos.getText());
           turnot=turnot+1;
           
       }else if(btlimitacion.isSelected()){
           limimo.add(txtnombre.getText()+" "+txtapellidos.getText());
           turnot=turnot+1;
           
       }else{
           nomb.add(txtnombre.getText()+" "+txtapellidos.getText());
           turnot=turnot+1; 
          
       }
       
        temporizador2.start();
        txtnombre.setText("");
        txtapellidos.setText("");
        txtedad.setText("");
        grupo1.clearSelection();
       
    }//GEN-LAST:event_btasignarActionPerformed
    }
    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
       char c=evt.getKeyChar();
   if(c<'a' || c>'z')evt.consume();
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyTyped
      char c=evt.getKeyChar();
   if(c<'a' || c>'z')evt.consume();
    }//GEN-LAST:event_txtapellidosKeyTyped

    private void txtedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtedadKeyTyped
        char c=evt.getKeyChar();
   if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtedadKeyTyped

    private void btextendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btextendActionPerformed
     i=t;
      temporizador.stop(); 
      temporizador2.stop();
      temporizador.start(); 
      temporizador2.start();
    }//GEN-LAST:event_btextendActionPerformed

    private void btlimitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btlimitacionActionPerformed

    private void btembarazadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btembarazadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btembarazadaActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new eps().setVisible(true);
              
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> afilicacion;
    private javax.swing.JButton btasignar;
    private javax.swing.JRadioButton btembarazada;
    private javax.swing.JButton btextend;
    private javax.swing.JRadioButton btlimitacion;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombreproy;
    private javax.swing.JTextField txttiempturno;
    private javax.swing.JTextField txtturno;
    private javax.swing.JTextField txtturnpend;
    // End of variables declaration//GEN-END:variables
}
