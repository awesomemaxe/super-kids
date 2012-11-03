/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superkidsapplication.panels;

import java.awt.Color;

/**
 *
 * @author baris
 */
public class ParentalControlPanel extends javax.swing.JPanel {

    /**
     * Creates new form ParentalControlPanel
     */
    public ParentalControlPanel() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        userButton = new javax.swing.JButton();
        editQbutton = new javax.swing.JButton();
        addQbutton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        backgroundLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(800, 600));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(800, 600));
        jLayeredPane1.setSize(new java.awt.Dimension(800, 600));

        userButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        userButton.setForeground(new java.awt.Color(255, 255, 255));
        userButton.setText("Add/Delete Child");
        userButton.setBorderPainted(false);
        userButton.setContentAreaFilled(false);
        userButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userButtonMouseEntered(evt);
            }
        });
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });
        userButton.setBounds(63, 290, 260, 29);
        jLayeredPane1.add(userButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        editQbutton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        editQbutton.setForeground(new java.awt.Color(255, 255, 255));
        editQbutton.setText("Edit Questions");
        editQbutton.setBorderPainted(false);
        editQbutton.setContentAreaFilled(false);
        editQbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editQbuttonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editQbuttonMouseEntered(evt);
            }
        });
        editQbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editQbuttonActionPerformed(evt);
            }
        });
        editQbutton.setBounds(90, 390, 200, 29);
        jLayeredPane1.add(editQbutton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        addQbutton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        addQbutton.setForeground(new java.awt.Color(255, 255, 255));
        addQbutton.setText("Add a New Question");
        addQbutton.setBorderPainted(false);
        addQbutton.setContentAreaFilled(false);
        addQbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addQbuttonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addQbuttonMouseEntered(evt);
            }
        });
        addQbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQbuttonActionPerformed(evt);
            }
        });
        addQbutton.setBounds(80, 340, 230, 29);
        jLayeredPane1.add(addQbutton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        resetButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset Game");
        resetButton.setBorderPainted(false);
        resetButton.setContentAreaFilled(false);
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetButtonMouseEntered(evt);
            }
        });
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        resetButton.setBounds(110, 430, 170, 50);
        jLayeredPane1.add(resetButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane2.setPreferredSize(new java.awt.Dimension(330, 370));
        jLayeredPane2.setRequestFocusEnabled(false);
        jLayeredPane2.setBounds(390, 160, 370, 370);
        jLayeredPane1.add(jLayeredPane2, javax.swing.JLayeredPane.PALETTE_LAYER);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/parentalpanelbackground.png"))); // NOI18N
        backgroundLabel.setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        backgroundLabel.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(backgroundLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtonActionPerformed
        // TODO add your handling code here:
        jLayeredPane2.removeAll();
        jLayeredPane2.repaint();
        UserControlPanel uPanel = new UserControlPanel();
        jLayeredPane2.add(uPanel);
    }//GEN-LAST:event_userButtonActionPerformed

    private void userButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseEntered
        // TODO add your handling code here:
        userButton.setForeground(Color.yellow);
    }//GEN-LAST:event_userButtonMouseEntered

    private void userButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseExited
        // TODO add your handling code here:
        userButton.setForeground(Color.white);
    }//GEN-LAST:event_userButtonMouseExited

    private void editQbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editQbuttonMouseEntered
        // TODO add your handling code here:
        editQbutton.setForeground(Color.yellow);
    }//GEN-LAST:event_editQbuttonMouseEntered

    private void editQbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editQbuttonMouseExited
        // TODO add your handling code here:
        editQbutton.setForeground(Color.white);
    }//GEN-LAST:event_editQbuttonMouseExited

    private void resetButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseEntered
        // TODO add your handling code here:
        resetButton.setForeground(Color.yellow);
    }//GEN-LAST:event_resetButtonMouseEntered

    private void resetButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseExited
        // TODO add your handling code here:
        resetButton.setForeground(Color.white);
    }//GEN-LAST:event_resetButtonMouseExited

    private void editQbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editQbuttonActionPerformed
        // TODO add your handling code here:
        jLayeredPane2.removeAll();
        jLayeredPane2.repaint();
        EditQuestionsPanel editPanel = new EditQuestionsPanel();
        jLayeredPane2.add(editPanel);
    }//GEN-LAST:event_editQbuttonActionPerformed

    private void addQbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addQbuttonMouseExited
        // TODO add your handling code here:
        addQbutton.setForeground(Color.white);
    }//GEN-LAST:event_addQbuttonMouseExited

    private void addQbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addQbuttonMouseEntered
        // TODO add your handling code here:
        addQbutton.setForeground(Color.yellow);
    }//GEN-LAST:event_addQbuttonMouseEntered

    private void addQbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQbuttonActionPerformed
        // TODO add your handling code here:
        jLayeredPane2.removeAll();
        jLayeredPane2.repaint();
        AddQuestionPanel aPanel = new AddQuestionPanel();
        jLayeredPane2.add(aPanel);
    }//GEN-LAST:event_addQbuttonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        jLayeredPane2.removeAll();
        jLayeredPane2.repaint();
        ResetGamePanel rPanel = new ResetGamePanel();
        jLayeredPane2.add(rPanel);
    }//GEN-LAST:event_resetButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addQbutton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton editQbutton;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton userButton;
    // End of variables declaration//GEN-END:variables
}
