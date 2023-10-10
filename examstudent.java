/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moc;

/**
 *
 * @author intel
 */
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class examstudent extends javax.swing.JFrame {

    /**
     * Creates new form examstudent
     */
    public String questionId="1";
    public String answer;
    public int  min=0;
    public int sec=0;
    public int marks=0;
    public int RollNo=0;
    Timer time;
    
    Connection con;
    Statement st;
    ResultSet rst;
    PreparedStatement ps;
    
    public void answerCheck()
    {
        String studentAnswer="";
        if(jRadioButton1.isSelected())
        {
            studentAnswer=jRadioButton1.getText();
        }
        else if(jRadioButton2.isSelected())
        {
            studentAnswer=jRadioButton2.getText();
        }
         else if(jRadioButton3.isSelected())
        {
            studentAnswer=jRadioButton3.getText();
        }
        else
         {
             studentAnswer=jRadioButton4.getText();
         }
           
        
        if(studentAnswer.equals(answer))
        {
            marks=marks+1;
            String marks1=String.valueOf(marks);  
        }
        //question number 
        int questionId1=Integer.parseInt(questionId);
        questionId1=questionId1+1;
        questionId=String.valueOf(questionId1);
        
        //clear radioButton
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        
        
        if(questionId.equals("10"))
        {
            jButton1.setVisible(false);
        }
    }
    
    public void question()
    {
         try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost/mocktest","root","");
            st=con.createStatement(); 
            ResultSet rst1=st.executeQuery("select * from question where id='"+questionId+"'");
            while(rst1.next())
            {
                jLabel17.setText(rst1.getString(1));
                jLabel18.setText(rst1.getString(2));
                jRadioButton1.setText(rst1.getString(3));
                jRadioButton2.setText(rst1.getString(4));
                jRadioButton3.setText(rst1.getString(5));
                jRadioButton4.setText(rst1.getString(6));
               answer=rst1.getString(7);
            }
            
        }catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void submit()
    {
        
        answerCheck();
        try
        {
             con=DriverManager.getConnection("jdbc:mysql://localhost/mocktest","root","");
             st=con.createStatement();
             st.executeUpdate("update studentdetails set Marks='"+marks+"' where RollNo='"+RollNo+"'");
             String marks1=String.valueOf(marks);
             setVisible(false);
             new sucessfullysubmited(marks1).setVisible(true);
             //JOptionPane.showMessageDialog(null, marks1);
        }catch(Exception ex){
                     JOptionPane.showMessageDialog(this, ex);
        }
    }
    
    public examstudent() {
        initComponents();

    }
    
    
    
    public examstudent(String RollNo) {
        initComponents();
       
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        jLabel4.setText(dFormat.format(date));
        
        
        //first question and student details
        
        
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost/mocktest","root","");
            st=con.createStatement();
            
  
            
            ResultSet rst1=st.executeQuery("select * from question where id='"+questionId+"'");
              st=null;
            while(rst1.next())
            {
              
                jLabel17.setText(rst1.getString(1));
                jLabel18.setText(rst1.getString(2));
                jRadioButton1.setText(rst1.getString(3));
                jRadioButton2.setText(rst1.getString(4));
                jRadioButton3.setText(rst1.getString(5));
                jRadioButton4.setText(rst1.getString(6));
                answer=rst1.getString(7);
                
            }
            
        }catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex);
        }
        
        //time program
        setlocationRelativeTo(this);
          time = new Timer(1000,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ex) {
               
                jLabel9.setText(String.valueOf(sec));
                jLabel8.setText(String.valueOf(min));
                if(sec==59)
                {
                    sec=0;
                    min++;
                    if(min==10)
                    {
                       time.stop();
                       answerCheck();
                       submit();
                    }
                    
                }
                sec++;
            }
        }){
                    
                };
          time.start();
          
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\college project\\icons8-student-64.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 56)); // NOI18N
        jLabel2.setText("welcome");

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel5.setText("Total Time:");

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel6.setText("60 Min");

        jLabel7.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel7.setText("Time Taken");

        jLabel8.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 0));
        jLabel8.setText("00");

        jLabel9.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 255, 0));
        jLabel9.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(jLabel3)
                .addGap(62, 62, 62)
                .addComponent(jLabel4)
                .addGap(184, 184, 184)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap(885, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2111, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel14.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel14.setText("Total Question:");

        jLabel15.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel15.setText("10");

        jLabel16.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel16.setText("Question Number:");

        jLabel17.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel17.setText("00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)))
                    .addComponent(jLabel16)
                    .addComponent(jLabel14))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addContainerGap(388, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, 400, 640));

        jLabel18.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel18.setText("Question Demo");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 1020, 120));

        jRadioButton1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, -1));

        jButton1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 248, 65));

        jButton2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("D:\\college project\\icons8-save-64.png")); // NOI18N
        jButton2.setText("submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 570, 200, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        answerCheck();
        question();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(this, "Do You Really Want To Submit","select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            answerCheck();
            submit();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected())
        {
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
          if(jRadioButton2.isSelected())
        {
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
            
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
          if(jRadioButton3.isSelected())
        {
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
            
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
          if(jRadioButton4.isSelected())
        {
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton1.setSelected(false);
            
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(examstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(examstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(examstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(examstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new examstudent().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables

    private void setlocationRelativeTo(examstudent aThis) {
        
    }
}
