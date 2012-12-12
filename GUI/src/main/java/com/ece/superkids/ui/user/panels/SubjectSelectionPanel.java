/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ece.superkids.ui.user.panels;

import com.ece.superkids.questions.enums.QuestionLevel;
import com.ece.superkids.ui.controllers.GameController;
import com.ece.superkids.ui.controllers.MusicController;
import com.ece.superkids.ui.controllers.PanelController;
import com.ece.superkids.ui.controllers.TTSController;
import com.ece.superkids.ui.events.Session;

/**
 * Creates new form <code>SubjectSelectionPanel</code>
 * User chooses which level of difficulty they want to play
 * Each level has different categories.
 * @author Heng & David C
 */
public class SubjectSelectionPanel extends javax.swing.JPanel {

    private PanelController controller;
    private QuestionLevel level;
    private Session session;
    private boolean tutorial_flag = false;
    private GameController gController;
    private Process videoProcess;
    
    String OS = System.getProperty("os.name").toLowerCase();


    /**
     * Creates new form SubjectSelectionPanel
     * User chooses which level of difficulty they want to play
     * Each level has different categories.
     * 
     * @param level , Levels that are available to play
     * @param tutorial , Flag to indicate whether in learning mode or question mode
     */
    public SubjectSelectionPanel(QuestionLevel level, boolean tutorial) {
        controller = PanelController.getInstance();
        if (tutorial){
            tutorial_flag = true;
            MusicController.getInstance().stopMusic();
        }
        else{
            gController = GameController.getInstance();
            session = Session.aSession();
        }
        this.level = level;
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
        System.out.println(getClass().getClassLoader().getResource("videos/shapes.mp4")); 
        if (tutorial_flag) {
            if (OS.contains("win")) {
                try {
                    if (level == QuestionLevel.LEVEL_1){
                    Runtime.getRuntime().exec("C:/Program Files/Windows Media Player/wmplayer.exe /fullscreen /play /close " + getClass().getClassLoader().getResource("videos/shapes.mp4"));
                    }
                    else if (level == QuestionLevel.LEVEL_2){
                    Runtime.getRuntime().exec("C:/Program Files/Windows Media Player/wmplayer.exe /fullscreen /play /close " + getClass().getClassLoader().getResource("videos/food.mp4"));                        
                    }
                    else if (level == QuestionLevel.LEVEL_3){
                    Runtime.getRuntime().exec("C:/Program Files/Windows Media Player/wmplayer.exe /fullscreen /play /close " + getClass().getClassLoader().getResource("videos/stationary.mp4")); 
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }       
            }
            else if (OS.contains("mac")){
                try {
                        if(videoProcess!=null)
                        {
//                            System.out.println("before create"+videoProcess.toString());
//                            videoProcess.destroy();
//                            System.out.println("after destroy"+videoProcess.toString());
                            Runtime.getRuntime().exec(new String[] {"killall", "-9", "\"QuickTime Player\""});
                        }
                    videoProcess = Runtime.getRuntime().exec(new String[] {"defaults", "write",
                            "com.apple.QuickTimePlayerX",
                            "MGPlayMovieOnOpen", "1"});
                    if (level == QuestionLevel.LEVEL_1){
                        Runtime.getRuntime().exec(new String[] {"open", getClass().getClassLoader().getResource("videos/shapes.mp4").toString()});
                    }
                    else if (level == QuestionLevel.LEVEL_2){
                        Runtime.getRuntime().exec(new String[] {"open", getClass().getClassLoader().getResource("videos/food.mp4").toString()});
                    }
                    else if (level == QuestionLevel.LEVEL_3){
                        Runtime.getRuntime().exec(new String[] {"open", getClass().getClassLoader().getResource("videos/stationary.mp4").toString()});
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
        } else {
            gController.newSubject(level, 0);
        }
    }//GEN-LAST:event_subject1ActionPerformed

    private void subject2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject2ActionPerformed
         // TODO add your handling code here:
        if (tutorial_flag) {
            if (OS.indexOf("win")>=0) {
                try {
                    if (level == QuestionLevel.LEVEL_1){
                    Runtime.getRuntime().exec("C:/Program Files/Windows Media Player/wmplayer.exe /fullscreen /play /close " + getClass().getClassLoader().getResource("videos/animals.mp4"));
                    }
                    else if (level == QuestionLevel.LEVEL_2){
                    Runtime.getRuntime().exec("C:/Program Files/Windows Media Player/wmplayer.exe /fullscreen /play /close " + getClass().getClassLoader().getResource("videos/planets.mp4"));                        
                    }
                    else if (level == QuestionLevel.LEVEL_3){
                    Runtime.getRuntime().exec("C:/Program Files/Windows Media Player/wmplayer.exe /fullscreen /play /close " + getClass().getClassLoader().getResource("videos/bodyparts.mp4"));                    
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }       
            }
            else if (OS.contains("mac")){
                try {
                        if(videoProcess!=null)
                        {
//                            System.out.println("before create"+videoProcess.toString());
//                            videoProcess.destroy();
//                            System.out.println("after destroy"+videoProcess.toString());
                            Runtime.getRuntime().exec(new String[] {"killall", "-9", "\"QuickTime Player\""});

                        }
                    Runtime.getRuntime().exec(new String[] {"defaults", "write", "com.apple.QuickTimePlayerX", "MGPlayMovieOnOpen", "1"});
                    if (level == QuestionLevel.LEVEL_1){
                        videoProcess = Runtime.getRuntime().exec(new String[] {"open", getClass().getClassLoader().getResource("videos/colors.mp4").toString()});
                    }
                    else if (level == QuestionLevel.LEVEL_2){
                        videoProcess = Runtime.getRuntime().exec(new String[] {"open", getClass().getClassLoader().getResource("videos/geography.mp4").toString()});   
                    }
                    else if (level == QuestionLevel.LEVEL_3){
                        videoProcess = Runtime.getRuntime().exec(new String[] {"open", getClass().getClassLoader().getResource("videos/instruments.mp4").toString()});
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } 
        else {
            gController.newSubject(level, 1);
        }
    }//GEN-LAST:event_subject2ActionPerformed

    private void subject3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject3ActionPerformed
         // TODO add your handling code here:
        if (tutorial_flag) {
            if (OS.contains("win")) {
                try {
                    if (level == QuestionLevel.LEVEL_1){
                    Runtime.getRuntime().exec("C:/Program Files/Windows Media Player/wmplayer.exe /fullscreen /play /close " + getClass().getClassLoader().getResource("videos/colors.mp4"));
                    }
                    else if (level == QuestionLevel.LEVEL_2){
                    Runtime.getRuntime().exec("C:/Program Files/Windows Media Player/wmplayer.exe /fullscreen /play /close " + getClass().getClassLoader().getResource("videos/geography.mp4"));                        
                    }
                    else if (level == QuestionLevel.LEVEL_3){
                    Runtime.getRuntime().exec("C:/Program Files/Windows Media Player/wmplayer.exe /fullscreen /play /close " + getClass().getClassLoader().getResource("videos/instruments.mp4"));                    
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }       
            }
            else if (OS.contains("mac")){
                try {
                        if(videoProcess!=null)
                        {
//                            System.out.println("before create"+videoProcess.toString());
//                            videoProcess.destroy();
//                            System.out.println("after destroy"+videoProcess.toString());
                            Runtime.getRuntime().exec(new String[] {"killall", "-9", "\"QuickTime Player\""});

                        }
                    Runtime.getRuntime().exec(new String[] {"defaults", "write", "com.apple.QuickTimePlayerX", "MGPlayMovieOnOpen", "1"});
                    if (level == QuestionLevel.LEVEL_1){
                        videoProcess = Runtime.getRuntime().exec(new String[] {"open", getClass().getClassLoader().getResource("videos/animals.mp4").toString()});
                    }
                    else if (level == QuestionLevel.LEVEL_2){
                        videoProcess = Runtime.getRuntime().exec(new String[] {"open", getClass().getClassLoader().getResource("videos/planets.mp4").toString()});  
                    }
                    else if (level == QuestionLevel.LEVEL_3){
                        if(videoProcess!=null)
                        videoProcess = Runtime.getRuntime().exec(new String[] {"open", getClass().getClassLoader().getResource("videos/bodyparts.mp4").toString()});
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
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
