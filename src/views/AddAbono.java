/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package views;

import ctrl.CtrlAbono;
import ctrl.CtrlCliente;
import entidades.Abono;
import entidades.Cliente;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author wasp
 */
public class AddAbono extends javax.swing.JFrame {
    
    //se instancian los ctrl y views
    CtrlAbono ctrlAbono= new CtrlAbono();
    CtrlCliente ctrlCliente = new CtrlCliente();
    public Clientes c;
    
    
    public AddAbono(Clientes c) {
        this.c=c;
        initComponents();
        txtIDCliente.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }
    
    
    @SuppressWarnings("unchecked")
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/icono.png"));
        
        
        return retValue;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        fechaAbono = new com.toedter.calendar.JDateChooser();
        btnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtIDCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Light", 0, 24)); // NOI18N
        jLabel1.setText("Agregar Abono");

        jLabel2.setText("Monto: $");

        jLabel3.setText("Fecha:");

        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnGuardar.setText("Agregar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(fechaAbono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIDCliente))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(txtIDCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(fechaAbono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        this.setEnabled(false);
        try{
            StringBuilder mensaje=new StringBuilder();
            
            Abono ab= new Abono();
            
            if(txtMonto.getText().isEmpty() || txtMonto.getText()==null){
                mensaje.append("Debe ingresar el monto del abono");
            }
            else if(!isNumeric(txtMonto.getText())) {
                mensaje.append("El monto debe contener sólo números \n");
                
            }
            else{
                ab.setMontoAbono(Integer.parseInt(txtMonto.getText()));
            }
            
            if(mensaje.length()!=0){
                JOptionPane.showMessageDialog (null, mensaje, "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                // busca cliente segun id
                Cliente cli= ctrlCliente.findByID(txtIDCliente.getText());
                
                ab.setCliente(cli);
                ab.setFechaAbono(fechaAbono.getDate());
                
                //setea total abono cliente
                cli.setTotalabonoCliente(cli.getTotalabonoCliente()+Integer.parseInt(txtMonto.getText()));
                
                //calcula saldo para registrar
                Integer saldo= cli.getTotalcomprasCliente()-cli.getTotalabonoCliente();
                ab.setSaldoAbono(saldo);
                
                //agrega abono
                ctrlAbono.agregarAbono(ab);
                
                //actualiza total abono cliente
                ctrlCliente.actualizarCliente(cli);
                
                JOptionPane.showMessageDialog (null, "El abono se ha registrado exitosamente", "Aviso", JOptionPane.DEFAULT_OPTION);
                
                txtMonto.setText("");
                
                // actualiza ultimo abono pantalla Cliente
                SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
                c.fechaUAbono.setText(sdf.format(ab.getFechaAbono()));
                c.montoUAbono.setText("$"+String.valueOf(ab.getMontoAbono()));
                
                c.txtSaldo.setText(saldo.toString());
                
                
                this.dispose();
                
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog (null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setEnabled(false);
        this.dispose();
        this.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume(); // ignorar el evento de teclado
        }
    }//GEN-LAST:event_txtMontoKeyTyped
    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser fechaAbono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel txtIDCliente;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
