package navadhara;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Registrationform extends javax.swing.JFrame {
      String connectionURL="jdbc:derby:ayu";
  
    Connection connection=null;
    PreparedStatement preparedstatement=null;
    Statement st=null;
    ResultSet rs,rs1;
    public Registrationform() {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCLOSE = new javax.swing.JLabel();
        jLabelMIN = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonREGISTER = new javax.swing.JButton();
        jLabelregister = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("REGISTRATION FORM");

        jLabelCLOSE.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelCLOSE.setForeground(new java.awt.Color(240, 240, 240));
        jLabelCLOSE.setText("X");
        jLabelCLOSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCLOSEMouseClicked(evt);
            }
        });

        jLabelMIN.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelMIN.setForeground(new java.awt.Color(240, 240, 240));
        jLabelMIN.setText("    -");
        jLabelMIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMINMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("USERNAME:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("PASSWORD:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButtonREGISTER.setBackground(new java.awt.Color(102, 102, 102));
        jButtonREGISTER.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonREGISTER.setForeground(new java.awt.Color(240, 240, 240));
        jButtonREGISTER.setText("REGISTER");
        jButtonREGISTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonREGISTERMouseClicked(evt);
            }
        });
        jButtonREGISTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonREGISTERActionPerformed(evt);
            }
        });

        jLabelregister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelregister.setForeground(new java.awt.Color(240, 240, 240));
        jLabelregister.setText(" click here to login");
        jLabelregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelregisterMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\register-now.gif")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jButtonREGISTER)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(jPasswordField1))
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelregister, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addComponent(jButtonREGISTER)
                        .addGap(38, 38, 38)
                        .addComponent(jLabelregister))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(jLabelMIN)
                .addGap(18, 18, 18)
                .addComponent(jLabelCLOSE)
                .addGap(46, 46, 46))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMIN)
                    .addComponent(jLabelCLOSE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCLOSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCLOSEMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCLOSEMouseClicked

    private void jLabelMINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMINMouseClicked
      this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMINMouseClicked

    private void jButtonREGISTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonREGISTERMouseClicked
 
    }//GEN-LAST:event_jButtonREGISTERMouseClicked

    private void jLabelregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelregisterMouseClicked
      LOGIN lgf=new LOGIN();
       lgf.setVisible(true);
       lgf.pack();
       lgf.setLocationRelativeTo(null);
       lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.dispose();
    }//GEN-LAST:event_jLabelregisterMouseClicked

    private void jButtonREGISTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREGISTERActionPerformed
      try
      {
      Class. forName("org.apache.derby.jdbc.ClientDriver").newInstance();
      String value1=jTextField1.getText();
      String value2=jPasswordField1.getText();
      String sql2="select username from login";
      String sql="insert into login values(?,?)";
      connection=DriverManager.getConnection(connectionURL,"ayu","ayu");
      st=connection.createStatement();
      rs1=st.executeQuery(sql2);
      if(value1.isEmpty()|| value2.isEmpty())
      {
          JOptionPane.showMessageDialog(null,"You cannot leave username/password blank");
          
      }
      else
      {
          while(rs1.next())
          {
              if(rs1.getString("username").matches(value1))
              {
                  JOptionPane.showMessageDialog(null,"The username you have entered is already existing,kindly enter another one.");
                          break;
              }
      else
      {
          preparedstatement=connection.prepareStatement(sql);
          preparedstatement.setString(1,value1);
          preparedstatement.setString(2,value2);
          preparedstatement.executeUpdate();
          JOptionPane.showMessageDialog(null,"The data has been successsfully saved to database.");
          break;
      }
          } 
      }
      }
        catch(SQLIntegrityConstraintViolationException e1)
   {
       JOptionPane.showMessageDialog(null,"The username you have entered is already existing in database.");
              
   }
      catch(SQLException se)
      {
          se.printStackTrace();
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
    

          
    }//GEN-LAST:event_jButtonREGISTERActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    public static void main(String args[]) {
//JFrame frame = new namevalidate();
//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//frame.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrationform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonREGISTER;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCLOSE;
    private javax.swing.JLabel jLabelMIN;
    private javax.swing.JLabel jLabelregister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
