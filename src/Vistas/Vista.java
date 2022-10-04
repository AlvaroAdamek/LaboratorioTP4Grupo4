
package Vistas;




public class Vista extends javax.swing.JFrame {
    

    
    public Vista() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        btCerrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opFMAteria = new javax.swing.JMenuItem();
        opFAlumno = new javax.swing.JMenuItem();
        opFInscripción = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TP 4");

        escritorio.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("TRABAJO PRACTICO N°4");

        btCerrar.setText("Cerrar");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btCerrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCerrar)
                .addContainerGap())
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(btCerrar)
                .addContainerGap())
        );

        jButton1.setText("jButton1");

        jMenu1.setText("Menu");

        opFMAteria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        opFMAteria.setText("Formulario Materia");
        opFMAteria.setActionCommand("FormularioMateria");
        opFMAteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFMAteriaActionPerformed(evt);
            }
        });
        jMenu1.add(opFMAteria);

        opFAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        opFAlumno.setText("Formulario Alumno");
        opFAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(opFAlumno);

        opFInscripción.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        opFInscripción.setText("Formulario Inscripción");
        opFInscripción.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFInscripciónActionPerformed(evt);
            }
        });
        jMenu1.add(opFInscripción);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opFMAteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFMAteriaActionPerformed
     FormularioMateria ma = new FormularioMateria();
        escritorio.add(ma);
        ma.show();
    }//GEN-LAST:event_opFMAteriaActionPerformed

    private void opFAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFAlumnoActionPerformed
       FormularioAlumno al= new FormularioAlumno();
        escritorio.add(al);
        al.show();
    }//GEN-LAST:event_opFAlumnoActionPerformed

    private void opFInscripciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFInscripciónActionPerformed
      FormularioInscripcion in=new FormularioInscripcion();
        escritorio.add(in);
        in.show();
    }//GEN-LAST:event_opFInscripciónActionPerformed

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btCerrarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCerrar;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem opFAlumno;
    private javax.swing.JMenuItem opFInscripción;
    private javax.swing.JMenuItem opFMAteria;
    // End of variables declaration//GEN-END:variables
}
