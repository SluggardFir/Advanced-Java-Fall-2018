/******************************************************
* MainForm.java
* Jason Nelson
******************************************************
* This class runs the program.
******************************************************
* September 10, 2018
*******************************************************/

package nelson_advjproject2;

import java.awt.Color;
import java.lang.reflect.Field;

public class MainForm extends javax.swing.JFrame 
{
    Car car = null;
    String make,
           model,
           strColor;
    Color color;
    int speed;
    
    public MainForm() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jColorChooser1 = new javax.swing.JColorChooser();
        btnSubmit = new javax.swing.JButton();
        btnIncSpeed = new javax.swing.JButton();
        btnDecSpeed = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtMake = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnNewCar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblCarInfo = new javax.swing.JLabel();
        cboColor = new javax.swing.JComboBox<>();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnIncSpeed.setText("INCREASE SPEED");
        btnIncSpeed.setEnabled(false);
        btnIncSpeed.setMaximumSize(new java.awt.Dimension(123, 25));
        btnIncSpeed.setMinimumSize(new java.awt.Dimension(123, 25));
        btnIncSpeed.setPreferredSize(new java.awt.Dimension(123, 25));
        btnIncSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncSpeedActionPerformed(evt);
            }
        });

        btnDecSpeed.setText("DECREASE SPEED");
        btnDecSpeed.setEnabled(false);
        btnDecSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecSpeedActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setText("Vehicle Make");

        jLabel2.setText("Vehicle Model");

        jLabel3.setText("Vehicle Color");

        btnNewCar.setText("NEW VEHICLE");
        btnNewCar.setEnabled(false);
        btnNewCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCarActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter a vehicle MAKE, MODEL, and COLOR.");

        lblCarInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCarInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblCarInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RED", "BLUE", "GREEN", "WHITE", "BLACK", "GRAY", "PURPLE", "PINK", "YELLOW" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(291, 291, 291))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel1)
                                    .addGap(74, 74, 74)
                                    .addComponent(jLabel2)
                                    .addGap(69, 69, 69)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addGap(54, 54, 54)
                                    .addComponent(btnIncSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(btnSubmit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNewCar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(btnExit)
                                    .addGap(59, 59, 59)
                                    .addComponent(btnDecSpeed))))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblCarInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(52, 52, 52))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addGap(216, 216, 216)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addComponent(lblCarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(btnIncSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnExit)
                    .addComponent(btnNewCar)
                    .addComponent(btnDecSpeed))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/******************************************************
* btnSubmitActionPerformed
* Jason Nelson
******************************************************
* This method gets the user inputs and displays a sentence showing
* the make, model, color, and initial speed of the vehicle. It also enables
* disables other parts of the GUI.
* Method Inputs:
* make - string
* model - string
* strColor - string
* Return value:
* none
******************************************************
* September 10, 2018
******************************************************/
        
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        make = txtMake.getText();
        model = txtModel.getText();
        strColor = cboColor.getSelectedItem().toString();
        
        try 
        {
            Field field = Class.forName("java.awt.Color").getField("yellow");
            color = (Color)field.get(null);
        } 
        catch (Exception e) 
        {
            color = null;
        }
        
        if(make != null)
        {
            if(model != null)
            {
                if(color != null)
                {
                    car = new Car(make, model, color);
                }
                else
                {                 
                                        
                }
            }
            else
            {
                 
            }
        }
        else
        {
            car.setMake(make);
            car.setModel(model);
            car.setColor(color);
        }
        
        lblCarInfo.setText("The " + car.getColor().toString() + " " + car.getMake() + " " + car.getModel() + " is traveling at " + car.getSpeed() + " MPH.");
        btnSubmit.setEnabled(false);
        btnNewCar.setEnabled(true);
        txtMake.disable();
        txtModel.disable();
        cboColor.disable();
        btnIncSpeed.setEnabled(true);
        btnDecSpeed.setEnabled(true);           
    }//GEN-LAST:event_btnSubmitActionPerformed

/******************************************************
* btnNewCarActionPerformed
* Jason Nelson
******************************************************
* This method resets the GUI to the initial starting condition.
* Method Inputs:
* none
* Return value:
* none
******************************************************
* September 10, 2018
******************************************************/     
    
    private void btnNewCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCarActionPerformed
        lblCarInfo.setText("");
        btnSubmit.setEnabled(true);
        btnNewCar.setEnabled(false);
        txtMake.enable();
        txtMake.setText("");
        txtModel.enable();
        txtModel.setText("");
        cboColor.enable();
        btnIncSpeed.setEnabled(false);
        btnDecSpeed.setEnabled(false);
    }//GEN-LAST:event_btnNewCarActionPerformed

/******************************************************
* btnExitActionPerformed
* Jason Nelson
******************************************************
* This method exits the program.
* Method Inputs:
* none
* Return value:
* none
******************************************************
* September 10, 2018
******************************************************/
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

/******************************************************
* btnIncSpeedActionPerformed
* Jason Nelson
******************************************************
* This method increases the speed of the car by 5 and displays 
* the new speed in the sentence.
* Method Inputs:
* none
* Return value:
* none
******************************************************
* September 10, 2018
******************************************************/
    
    private void btnIncSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncSpeedActionPerformed
        car.accelerate();
        lblCarInfo.setText("The " + car.getColor() + " " + car.getMake() + " " + car.getModel() + " is traveling at " + car.getSpeed() + " MPH.");
    }//GEN-LAST:event_btnIncSpeedActionPerformed

/******************************************************
* btnDecSpeedActionPerformed
* Jason Nelson
******************************************************
* This method decreases the speed of the car by 5 and displays 
* the new speed in the sentence.
* Method Inputs:
* none
* Return value:
* none
******************************************************
* September 10, 2018
******************************************************/
    
    private void btnDecSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecSpeedActionPerformed
        car.brake();
        lblCarInfo.setText("The " + car.getColor() + " " + car.getMake() + " " + car.getModel() + " is traveling at " + car.getSpeed() + " MPH.");
    }//GEN-LAST:event_btnDecSpeedActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecSpeed;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIncSpeed;
    private javax.swing.JButton btnNewCar;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cboColor;
    private javax.swing.JButton jButton2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCarInfo;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtModel;
    // End of variables declaration//GEN-END:variables
}


/******************************************************
* Method Name
* Method Author (i.e. Your name)
******************************************************
* Purpose of the Method (Why did you write this Method?)
* Method Inputs:
* List all the method parameters with their expected value ranges
* Return value:
* If this is a function list the return data type and the expected range of 
* values to be returned.
******************************************************
* Date
******************************************************/