package com.ece.superkids.ui;

import com.ece.superkids.ui.frames.MainFrame;
import java.awt.Image;
import java.awt.Toolkit;

/**
 * This class <code>SuperKids</code>
 * starts the game/application
 * 
 * @author david
 */
public class SuperKids {

    /**
     * main method
     * @param args 
     */
    public static void main(String [] args) {
        setLookAndFeel();
         //set icon
        setIcon();
         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame mFrame = new MainFrame();
                mFrame.setVisible(true);
            }
        });
    }
    
    /**
     * set the icon of the application
     */
    private static void setIcon() {
        String osName = System.getProperty("os.name");
        java.net.URL url = ClassLoader.getSystemResource("characters/Boy.png");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(url);
        if (osName.contains("OS X")) {
            com.apple.eawt.Application.getApplication().setDockIconImage(img);
        }
    }

    /**
     * set the look and feel
     */
    private static void setLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
