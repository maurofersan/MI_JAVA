/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mauro.pagoapp.view;

import javax.swing.JOptionPane;
import pe.mauro.pagoapp.dto.PagoDto;
import pe.mauro.pagoapp.service.PagoService;

/**
 *
 * @author Alumno
 */
public class PagoView extends javax.swing.JFrame {

    /**
     * Creates new form PagoView
     */
    public PagoView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHoraDia = new javax.swing.JLabel();
        lblDias = new javax.swing.JLabel();
        lblPagoHora = new javax.swing.JLabel();
        txtHorasDia = new javax.swing.JTextField();
        txtDias = new javax.swing.JTextField();
        txtPagoHora = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHoraDia.setText("Horas por dia:");

        lblDias.setText("Dias Trabajados:");

        lblPagoHora.setText("Pago por Hora:");

        txtHorasDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasDiaActionPerformed(evt);
            }
        });

        txtDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasActionPerformed(evt);
            }
        });

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHoraDia)
                    .addComponent(lblDias)
                    .addComponent(lblPagoHora))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDias, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(txtHorasDia)
                    .addComponent(txtPagoHora))
                .addGap(90, 90, 90)
                .addComponent(btnProcesar)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraDia)
                    .addComponent(txtHorasDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDias)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcesar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPagoHora)
                    .addComponent(txtPagoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHorasDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorasDiaActionPerformed

    private void txtDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        
        PagoDto dto = new PagoDto();
        dto.setHorasDia(Integer.parseInt(txtHorasDia.getText()));
        dto.setDias(Integer.parseInt(txtDias.getText()));
        dto.setPagoHora(Integer.parseInt(txtPagoHora.getText()));
        
        PagoService service = new PagoService();
        service.procesar(dto);
        
        String repo = "";
        repo += "Ingresos: " + dto.getIngresos() +  "\n";
        repo += "Renta: " + dto.getRenta() +  "\n";
        repo += "Neto: " + dto.getNeto() +  "\n";
        JOptionPane.showMessageDialog(rootPane, repo);
        
    }//GEN-LAST:event_btnProcesarActionPerformed

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
            java.util.logging.Logger.getLogger(PagoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblHoraDia;
    private javax.swing.JLabel lblPagoHora;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtHorasDia;
    private javax.swing.JTextField txtPagoHora;
    // End of variables declaration//GEN-END:variables
}
