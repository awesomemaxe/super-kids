/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superkidsapplication.panels;

import com.ece.superkids.*;
import com.ece.superkids.questions.entities.Question;
import com.ece.superkids.questions.enums.QuestionCategory;
import com.ece.superkids.questions.enums.QuestionLevel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import superkidsapplication.controllers.TutorialController;
import java.awt.BorderLayout;
/**
 *
 * @author FRANKs
 */
public class TutorialPanel extends javax.swing.JPanel {

    /**
     * Creates new form TutorialPanel
     */
    
    private VideoPlayerPanel videoplayerpanel=null;

    public TutorialPanel(String category) {
                    
        initComponents();
        jLabel1.setText(category);
        if (category.equals("SHAPES"))
        {
            videoplayerpanel=new VideoPlayerPanel("file:///../../../resources/videos/shapes.mp4");
        }
        if (category.equals("COLORS"))
        {
            videoplayerpanel=new VideoPlayerPanel("file:///../../../resources/videos/colors.mp4");
        }
        if (category.equals("ANIMALS"))
        {
            videoplayerpanel=new VideoPlayerPanel("file:///../../../resources/videos/animals.mp4");
        }
        //this.add(videoplayerpanel,BorderLayout.CENTER);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        jLabel1.setBounds(0, 90, 800, 60);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/QuestionScreen.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
