/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package estructuradatos;
import static estructuradatos.parqueadero.h;
import static estructuradatos.parqueadero.m;
import static estructuradatos.parqueadero.s;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class inventario extends javax.swing.JPanel {

    int filas=0;
    int columnas=7,tamaño2=0,tamaño4=0,tamañod=0,tpagar=0;
    Timer temporizadorinv,temporizadorinv2,temporizadorinv4,temporizadorinvd;
    ActionListener todo,dosruedas,cuatroruedas,dentro;
    DefaultTableModel modelo= new DefaultTableModel();
   String[] tilulos =new String[]{"placa","h.ingreso","tipo","estado","h.salida","pagar o pago","numero de vehiculo"};
  Stack<Integer> posiciones;
   Stack<Integer> posiciones4;
   Stack<Integer> posicionesd;
   
   
    public inventario() {
        initComponents();
       
       todo=new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tpagar=0;
             for(int j=0;j<filas;j++){
                 if(parqueadero.carro.get(j).getestado().equals("dentro")){
                     int tiempo=0;
                     modelo.setValueAt(""+h+":"+m+":"+s, j, 4);
                    tiempo =(((h*60*60)+(m*60)+s)-parqueadero.carro.get(j).gethingreso());
                    if(parqueadero.carro.get(j).gettipo().equals("bicicleta")){
                        modelo.setValueAt(tiempo*20, j, 5);
                        tpagar=tpagar+(tiempo*20);
                    }else{ if (parqueadero.carro.get(j).gettipo().equals("motocicleta")){
               modelo.setValueAt(tiempo*30, j, 5);
                tpagar=tpagar+(tiempo*30);
               }else{
               modelo.setValueAt(tiempo*60, j, 5);
                tpagar=tpagar+(tiempo*60);
               }
                 }
             } else{
               modelo.setValueAt(parqueadero.carro.get(j).gethsalidap(), j, 4);
               modelo.setValueAt(parqueadero.carro.get(j).getpagar(), j, 5);
               tpagar=tpagar+parqueadero.carro.get(j).getpagar();
               }         
            }
             totalpagarinv.setText(""+tpagar);
        }
       };
       dosruedas=new ActionListener(){
           @Override
         public void actionPerformed(ActionEvent e){
               tpagar=0;
           for(int j=0;j<tamaño2;j++){
              
                 if(parqueadero.carro.get(posiciones.get(j)).getestado().equals("dentro")){
                     int tiempo=0;
                    
                     modelo.setValueAt(""+h+":"+m+":"+s, j, 4);
                    tiempo =(((h*60*60)+(m*60)+s)-parqueadero.carro.get(posiciones.get(j)).gethingreso());
                    if(parqueadero.carro.get(posiciones.get(j)).gettipo().equals("bicicleta")){
                        modelo.setValueAt(tiempo*20, j, 5);
                         tpagar=tpagar+(tiempo*20);
                    }else{
                        modelo.setValueAt(tiempo*30, j, 5);
                         tpagar=tpagar+(tiempo*30);
                 }
             } else{
               modelo.setValueAt(parqueadero.carro.get(posiciones.get(j)).gethsalidap(), j, 4);
               modelo.setValueAt(parqueadero.carro.get(posiciones.get(j)).getpagar(), j, 5);
               tpagar=tpagar+parqueadero.carro.get(j).getpagar();
               }      
            } 
        totalpagarinv.setText(""+tpagar);
        }  
         
       };
       cuatroruedas=new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
             tpagar=0;
           for(int j=0;j<tamaño4;j++){
                 if(parqueadero.carro.get(posiciones4.get(j)).getestado().equals("dentro")){
                     int tiempo=0;
                     modelo.setValueAt(""+h+":"+m+":"+s, j, 4);
                    tiempo =(((h*60*60)+(m*60)+s)-parqueadero.carro.get(posiciones4.get(j)).gethingreso());
                        modelo.setValueAt(tiempo*60, j, 5);
                        tpagar=tpagar+(tiempo*60);
                 }
              else{
               modelo.setValueAt(parqueadero.carro.get(posiciones4.get(j)).gethsalidap(), j, 4);
               modelo.setValueAt(parqueadero.carro.get(posiciones4.get(j)).getpagar(), j, 5);
            tpagar=tpagar+parqueadero.carro.get(j).getpagar();
               }         
            } 
           totalpagarinv.setText(""+tpagar);
        }  
         
       };
       dentro=new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
             tpagar=0;
           for(int j=0;j<tamañod;j++){
                     int tiempo=0;
                     modelo.setValueAt(""+h+":"+m+":"+s, j, 4);
                    tiempo =(((h*60*60)+(m*60)+s)-parqueadero.carro.get(posicionesd.get(j)).gethingreso());
                     if(parqueadero.carro.get(posicionesd.get(j)).gettipo().equals("bicicleta")){
                        modelo.setValueAt(tiempo*20, j, 5);
                        tpagar=tpagar+(tiempo*20);
                    }else{
               if (parqueadero.carro.get(posicionesd.get(j)).gettipo().equals("motocicleta")){
               modelo.setValueAt(tiempo*30, j, 5);
               tpagar=tpagar+(tiempo*30);
               }else{
               modelo.setValueAt(tiempo*60, j, 5);
               tpagar=tpagar+(tiempo*60);
               }
                 }  
                 }  
             totalpagarinv.setText(""+tpagar);
            }  
       };
      
        
        temporizadorinv=new Timer(1000,todo);
        temporizadorinv2=new Timer(1000,dosruedas);
        temporizadorinv4=new Timer(1000,cuatroruedas);
        temporizadorinvd=new Timer(1000,dentro);
                
               }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoinventario = new javax.swing.ButtonGroup();
        bttodoinv = new javax.swing.JRadioButton();
        bt4ruedasinv = new javax.swing.JRadioButton();
        bt2ruedasinv = new javax.swing.JRadioButton();
        btdentroinv = new javax.swing.JRadioButton();
        btatrasinv = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        totalpagarinv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        grupoinventario.add(bttodoinv);
        bttodoinv.setText("TODO");
        bttodoinv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttodoinvActionPerformed(evt);
            }
        });

        grupoinventario.add(bt4ruedasinv);
        bt4ruedasinv.setText("4RUEDAS");
        bt4ruedasinv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt4ruedasinvMouseClicked(evt);
            }
        });

        grupoinventario.add(bt2ruedasinv);
        bt2ruedasinv.setText("2RUEDAS");
        bt2ruedasinv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt2ruedasinvMouseClicked(evt);
            }
        });

        grupoinventario.add(btdentroinv);
        btdentroinv.setText("DENTRO");
        btdentroinv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdentroinvActionPerformed(evt);
            }
        });

        btatrasinv.setText("ATRAS");
        btatrasinv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btatrasinvActionPerformed(evt);
            }
        });

        tabla.setModel(modelo);
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("total a pagar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttodoinv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt4ruedasinv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt2ruedasinv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btdentroinv)
                .addGap(30, 30, 30)
                .addComponent(btatrasinv)
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalpagarinv, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttodoinv)
                    .addComponent(bt4ruedasinv)
                    .addComponent(bt2ruedasinv)
                    .addComponent(btdentroinv)
                    .addComponent(btatrasinv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalpagarinv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttodoinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttodoinvActionPerformed
     tabla.setVisible(true);

        temporizadorinv2.stop();
        temporizadorinv4.stop();
        temporizadorinvd.stop();
                filas=parqueadero.carro.size();
                modelo.setColumnCount(columnas);
                 modelo.setRowCount(filas);
                 modelo.setColumnIdentifiers(tilulos);
                for(int i=0;i<filas;i++){
                    modelo.setValueAt(parqueadero.carro.get(i).getplaca(), i, 0);
                    modelo.setValueAt(parqueadero.carro.get(i).gethingresop(), i, 1);
                    modelo.setValueAt(parqueadero.carro.get(i).gettipo(), i, 2);
                    modelo.setValueAt(parqueadero.carro.get(i).getestado(), i, 3);
                     modelo.setValueAt(parqueadero.carro.get(i).getnvehiculo(), i, 6);
}
           temporizadorinv.start();
           
      
    
    }//GEN-LAST:event_bttodoinvActionPerformed

    private void btdentroinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdentroinvActionPerformed
      posicionesd=new Stack<Integer>();
       temporizadorinv.stop();
        temporizadorinv4.stop();
        temporizadorinv2.stop();
        filas=parqueadero.carro.size();
       for(int k=0;k<filas;k++){
                 if(parqueadero.carro.get(k).getestado().equals("dentro")){
                       posicionesd.push(k);
                 }         
            }
      modelo.setColumnCount(columnas);
         modelo.setColumnIdentifiers(tilulos);
          tamañod=posicionesd.size();
          modelo.setRowCount(tamañod);
          for(int l=0;l<tamañod;l++){
              modelo.setValueAt(parqueadero.carro.get(posicionesd.get(l)).getplaca(), l, 0);
                 modelo.setValueAt(parqueadero.carro.get(posicionesd.get(l)).gethingresop(), l, 1);
                    modelo.setValueAt(parqueadero.carro.get(posicionesd.get(l)).gettipo(), l, 2);
                       modelo.setValueAt(parqueadero.carro.get(posicionesd.get(l)).getestado(), l, 3);
                          modelo.setValueAt(parqueadero.carro.get(posicionesd.get(l)).getnvehiculo(), l, 6);
          }
         temporizadorinvd.start();
        
      
      
    }//GEN-LAST:event_btdentroinvActionPerformed

    private void btatrasinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btatrasinvActionPerformed
  temporizadorinv.stop();
        temporizadorinv2.stop();
        temporizadorinv4.stop();
        temporizadorinvd.stop();
          parqueadero.inventario2.setVisible(false);
           parqueadero.btpingresar.setEnabled(true);
         parqueadero.btpinventario.setEnabled(true);
         parqueadero.btpliquidar.setEnabled(true);
         parqueadero.btpsalir.setEnabled(true);
         totalpagarinv.setText(null);
         grupoinventario.clearSelection();
         tabla.setVisible(false);
    }//GEN-LAST:event_btatrasinvActionPerformed

    private void bt2ruedasinvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2ruedasinvMouseClicked
       posiciones=new Stack<Integer>();
        
        temporizadorinv.stop();
        temporizadorinv4.stop();
        temporizadorinvd.stop();
        filas=parqueadero.carro.size();
       for(int k=0;k<filas;k++){
                 if(parqueadero.carro.get(k).gettipo().equals("motocicleta") || parqueadero.carro.get(k).gettipo().equals("bicicleta")){
                       posiciones.push(k);
                 }         
            }
       modelo.setColumnCount(columnas); 
       modelo.setColumnIdentifiers(tilulos);
           tamaño2=posiciones.size();
          modelo.setRowCount(tamaño2);
          for(int l=0;l<tamaño2;l++){
              modelo.setValueAt(parqueadero.carro.get(posiciones.get(l)).getplaca(), l, 0);
                 modelo.setValueAt(parqueadero.carro.get(posiciones.get(l)).gethingresop(), l, 1);
                    modelo.setValueAt(parqueadero.carro.get(posiciones.get(l)).gettipo(), l, 2);
                       modelo.setValueAt(parqueadero.carro.get(posiciones.get(l)).getestado(), l, 3);
                          modelo.setValueAt(parqueadero.carro.get(posiciones.get(l)).getnvehiculo(), l, 6);
          }
          /*for(int i=0;i<columnas;i++){
              for(int j=0;j<tamaño2;j++){
                   modelo.setValueAt(0, tamaño2, columnas);
              }
             
          }*/
                 temporizadorinv2.start();
       
    }//GEN-LAST:event_bt2ruedasinvMouseClicked

    private void bt4ruedasinvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4ruedasinvMouseClicked
       posiciones4=new Stack<Integer>();
    tabla.setVisible(true);
     temporizadorinv.stop();
        temporizadorinv2.stop();
        temporizadorinvd.stop();
        filas=parqueadero.carro.size();
     for(int k=0;k<filas;k++){
                 if(parqueadero.carro.get(k).gettipo().equals("carro") ){
                       posiciones4.push(k);
                 }         
            }
      modelo.setColumnCount(columnas);
       modelo.setColumnIdentifiers(tilulos);
       tamaño4=posiciones4.size();
      modelo.setRowCount(tamaño4);
      for(int l=0;l<tamaño4;l++){
              modelo.setValueAt(parqueadero.carro.get(posiciones4.get(l)).getplaca(), l, 0);
                 modelo.setValueAt(parqueadero.carro.get(posiciones4.get(l)).gethingresop(), l, 1);
                    modelo.setValueAt(parqueadero.carro.get(posiciones4.get(l)).gettipo(), l, 2);
                       modelo.setValueAt(parqueadero.carro.get(posiciones4.get(l)).getestado(), l, 3);
                          modelo.setValueAt(parqueadero.carro.get(posiciones4.get(l)).getnvehiculo(), l, 6);
          }
     temporizadorinv4.start();
    }//GEN-LAST:event_bt4ruedasinvMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bt2ruedasinv;
    private javax.swing.JRadioButton bt4ruedasinv;
    private javax.swing.JButton btatrasinv;
    private javax.swing.JRadioButton btdentroinv;
    private javax.swing.JRadioButton bttodoinv;
    private javax.swing.ButtonGroup grupoinventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField totalpagarinv;
    // End of variables declaration//GEN-END:variables
}
