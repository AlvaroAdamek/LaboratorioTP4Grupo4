
package Vistas;

import colegioData.MateriaData;
import javax.swing.JOptionPane;
import laboratoriotp4grupo4.Materia;


public class FormularioMateria extends javax.swing.JFrame {
private MateriaData materiaD;
    
            
    public FormularioMateria() {
        initComponents();
       desactivarCampos();
        materiaD =new MateriaData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jfNuevo = new javax.swing.JButton();
        jfGuardar = new javax.swing.JButton();
        jfSalir = new javax.swing.JButton();
        jTMateria = new javax.swing.JTextField();
        jSAno = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de materias");

        jLabel2.setText("Codigo de materia :");

        jLabel3.setText("Nombre de la Materia :");

        jLabel4.setText("Año al que pertenece:");

        jTCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTCodigoFocusLost(evt);
            }
        });
        jTCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCodigoActionPerformed(evt);
            }
        });

        jfNuevo.setText("Nuevo");
        jfNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfNuevoActionPerformed(evt);
            }
        });

        jfGuardar.setText("Guardar");
        jfGuardar.setEnabled(false);
        jfGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfGuardarActionPerformed(evt);
            }
        });

        jfSalir.setText("Salir");
        jfSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfSalirActionPerformed(evt);
            }
        });

        jTMateria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTMateriaFocusLost(evt);
            }
        });
        jTMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMateriaActionPerformed(evt);
            }
        });

        jSAno.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(48, 48, 48)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jfSalir)
                        .addGap(101, 101, 101)
                        .addComponent(jfNuevo)
                        .addGap(27, 27, 27)
                        .addComponent(jfGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfNuevo)
                    .addComponent(jfSalir)
                    .addComponent(jfGuardar))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCodigoActionPerformed

    private void jfSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfSalirActionPerformed

    private void jfNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfNuevoActionPerformed
        limpiarCampos();
        activarCampos();
        jfGuardar.setEnabled(true);
        
    }//GEN-LAST:event_jfNuevoActionPerformed

    private void jfGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfGuardarActionPerformed
       Materia m= new Materia();
          if (jTMateria.getText().length()==0){
             JOptionPane.showMessageDialog(this,"Debe ingresar un nombre de la materia");
            jTMateria.requestFocus();
    } else{                                  
      try {      
       m.setIdMateria(Integer.parseInt(jTCodigo.getText()));
       m.setAno((Integer)jSAno.getValue());
       m.setNombre(jTMateria.getText());
        materiaD.guardarMateria(m);
      }
      catch(Exception e){
              
              JOptionPane.showMessageDialog(this,"ERROR - No ha llenado correctamente los campos");
              
              }
      
      limpiarCampos();
   
          }
       
    }//GEN-LAST:event_jfGuardarActionPerformed
    public void limpiarCampos(){
    jTCodigo.setText("");
    jSAno.setValue(1);
    jTMateria.setText("");
    desactivarCampos();
    jfGuardar.setEnabled(false);
}


    private void jTMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMateriaActionPerformed

    private void jTCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTCodigoFocusLost
        String value="[0-9]*";
      
        if (!jTCodigo.getText().matches(value)){
          
            JOptionPane.showMessageDialog(this,"ERROR - Solo números");
            jTCodigo.requestFocus();
    }//GEN-LAST:event_jTCodigoFocusLost
    }
    
    private void jTMateriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTMateriaFocusLost

    }//GEN-LAST:event_jTMateriaFocusLost

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
            java.util.logging.Logger.getLogger(FormularioMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioMateria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioMateria().setVisible(true);
            }
        });
    }
    
    private void activarCampos() {
        
        jTCodigo.setEnabled(true);
        jSAno.setEnabled(true);
        jTMateria.setEnabled(true);
    
    }
    
     
    private void desactivarCampos() {
    
        jTCodigo.setEnabled(false);
        jTMateria.setEnabled(false);
        jSAno.setEnabled(false);
        
        
    } 
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner jSAno;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTMateria;
    private javax.swing.JButton jfGuardar;
    private javax.swing.JButton jfNuevo;
    private javax.swing.JButton jfSalir;
    // End of variables declaration//GEN-END:variables
}
