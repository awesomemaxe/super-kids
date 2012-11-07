/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superkidsapplication.panels;

import com.ece.superkids.questions.enums.QuestionLevel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import superkidsapplication.controllers.GameController;
import superkidsapplication.controllers.PanelController;
import superkidsapplication.controllers.QuestionController;
import superkidsapplication.controllers.TTSController;
import superkidsapplication.controllers.TutorialController;
import superkidsapplication.events.Session;

/**
 *
 * @author Heng & David C
 */
public class SubjectSelectionPanel extends javax.swing.JPanel {

    private PanelController controller;
    private TutorialController factory2;
    private QuestionLevel level;
    private boolean tutorial;
    private Session session;
    private GameController gController;

    /**
     * Creates new form SubjectSelectionPanel
     */
    public SubjectSelectionPanel(QuestionLevel level) {
        this.setName("SubjectSelection");
        controller = PanelController.getInstance();
        gController = GameController.getInstance();
        session = Session.aSession();
        this.level = level;
        initComponents();
        subject1.setText(level.getCategories().get(0).toString());
        subject2.setText(level.getCategories().get(1).toString());
        subject3.setText(level.getCategories().get(2).toString());
    }

    public SubjectSelectionPanel() {
        this.setName("TutorialSelection");
        tutorial = true;
        controller = PanelController.getInstance();
        factory2 = TutorialController.getInstance();
        this.level = level.LEVEL_1;
        initComponents();
        subject1.setText(level.getCategories().get(0).toString());
        subject2.setText(level.getCategories().get(1).toString());
        subject3.setText(level.getCategories().get(2).toString());
        //jLayeredPane1.setName("Tutorial Mode");
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
        title = new javax.swing.JLabel();
        subject1 = new javax.swing.JButton();
        subject2 = new javax.swing.JButton();
        subject3 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jLayeredPane1.setAlignmentX(0.0F);
        jLayeredPane1.setAlignmentY(0.0F);
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(800, 600));

        title.setFont(new java.awt.Font("Chalkduster", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 51));
        title.setText("Adventure island map");
        title.setBounds(170, 90, 520, 70);
        jLayeredPane1.add(title, javax.swing.JLayeredPane.DEFAULT_LAYER);

        subject1.setText("Shapes");
        subject1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subject1MouseEntered(evt);
            }
        });
        subject1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject1ActionPerformed(evt);
            }
        });
        subject1.setBounds(120, 200, 120, 120);
        jLayeredPane1.add(subject1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        subject2.setText("Colors");
        subject2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subject2MouseEntered(evt);
            }
        });
        subject2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject2ActionPerformed(evt);
            }
        });
        subject2.setBounds(530, 200, 120, 120);
        jLayeredPane1.add(subject2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        subject3.setText("Animals");
        subject3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subject3MouseEntered(evt);
            }
        });
        subject3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject3ActionPerformed(evt);
            }
        });
        subject3.setBounds(320, 200, 120, 120);
        jLayeredPane1.add(subject3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/subjectselectionbackground.png"))); // NOI18N
        background.setText("jLabel5");
        background.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(background, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void subject1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject1ActionPerformed
        // TODO add your handling code here:
        if (tutorial) {
            factory2.reset();
            TutorialPanel q = factory2.createTutorialPanel(level.getCategories().get(0).toString());
            controller.addPanel(q);
        } else {
            gController.newSubject(level, 0);
        }
    }//GEN-LAST:event_subject1ActionPerformed

    private void subject2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject2ActionPerformed
         // TODO add your handling code here:
        if (tutorial) {
            factory2.reset();
            TutorialPanel q = factory2.createTutorialPanel(level.getCategories().get(0).toString());
            controller.addPanel(q);
        } else {
            gController.newSubject(level, 1);
        }
    }//GEN-LAST:event_subject2ActionPerformed

    private void subject3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject3ActionPerformed
         // TODO add your handling code here:
        if (tutorial) {
            factory2.reset();
            TutorialPanel q = factory2.createTutorialPanel(level.getCategories().get(0).toString());
            controller.addPanel(q);
        } else {
            gController.newSubject(level, 2);
        }
    }//GEN-LAST:event_subject3ActionPerformed

    private void subject1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subject1MouseEntered
        // TODO add your handling code here:
        TTSController.TTS(subject1.getText());
    }//GEN-LAST:event_subject1MouseEntered

    private void subject3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subject3MouseEntered
        // TODO add your handling code here:
        TTSController.TTS(subject3.getText());
    }//GEN-LAST:event_subject3MouseEntered

    private void subject2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subject2MouseEntered
        // TODO add your handling code here:
        TTSController.TTS(subject2.getText());
    }//GEN-LAST:event_subject2MouseEntered
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton subject1;
    private javax.swing.JButton subject2;
    private javax.swing.JButton subject3;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
