/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pantallas7;

/**
 *
 * @author nadir
 */
public class pantallas7 extends javax.swing.JFrame {

    /**
     * Creates new form pantallas7
     */
    public pantallas7() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPrecioBase = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        etiTotal = new javax.swing.JLabel();
        etiPrecioInstalacion = new javax.swing.JLabel();
        etiPrecioFormacion = new javax.swing.JLabel();
        etiPrecioAlimentacionBD = new javax.swing.JLabel();
        tbtnInstalacion = new javax.swing.JToggleButton();
        tbtnFormacion = new javax.swing.JToggleButton();
        tbtnAlimentacionBD = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Precio base");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        etiTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiPrecioInstalacion.setText("40");

        etiPrecioFormacion.setText("200");

        etiPrecioAlimentacionBD.setText("200");

        tbtnInstalacion.setText("Instalacion");

        tbtnFormacion.setText("Formacion");

        tbtnAlimentacionBD.setText("Alimentacion BD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtPrecioBase)
                    .addComponent(etiTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtnInstalacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtnFormacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtnAlimentacionBD, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiPrecioInstalacion)
                    .addComponent(etiPrecioFormacion)
                    .addComponent(etiPrecioAlimentacionBD))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiPrecioInstalacion)
                    .addComponent(tbtnInstalacion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiPrecioFormacion)
                    .addComponent(tbtnFormacion))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiPrecioAlimentacionBD)
                    .addComponent(tbtnAlimentacionBD))
                .addGap(29, 29, 29)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double precio_base;
double precio_instal; //precio instalación
double precio_for; //precio formacion
double precio_ali; //precio alimentacion
        
//Recojo datos desde la ventana:
        
precio_base = Double.parseDouble(txtPrecioBase.getText());
precio_instal = Double.parseDouble(etiPrecioInstalacion.getText());
precio_for = Double.parseDouble(etiPrecioFormacion.getText());
precio_ali = Double.parseDouble(etiPrecioAlimentacionBD.getText());
        
//Ahora que tengo los datos, puedo hacer cálculos.
        
//Al precio base se le van añadiendo precio de extras
//según estén o no activados los JToggleButtons
        
double precio_total;
        
precio_total = precio_base;
        
if (tbtnInstalacion.isSelected()) { //Si se seleccionó instalación
   precio_total = precio_total+precio_instal;
}
        
if (tbtnFormacion.isSelected()) { //Si se seleccionó formación
   precio_total = precio_total+precio_for;            
}
        
if (tbtnAlimentacionBD.isSelected()) { //Si se seleccionó Alimentación BD
   precio_total = precio_total+precio_ali;
}
        
                
//Finalmente pongo el resultado en la etiqueta
etiTotal.setText(precio_total+" €");

    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel etiPrecioAlimentacionBD;
    private javax.swing.JLabel etiPrecioFormacion;
    private javax.swing.JLabel etiPrecioInstalacion;
    private javax.swing.JLabel etiTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton tbtnAlimentacionBD;
    private javax.swing.JToggleButton tbtnFormacion;
    private javax.swing.JToggleButton tbtnInstalacion;
    private javax.swing.JTextField txtPrecioBase;
    // End of variables declaration//GEN-END:variables
}
