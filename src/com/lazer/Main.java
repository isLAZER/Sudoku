package com.lazer;

import javax.swing.UnsupportedLookAndFeelException;
import com.lazer.displayEngine.DisplayFrame;
import com.lazer.logicEngine.UnsolvedGrid;

public class Main {
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        // Importing preferred style.
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        // Displaying the frame.
        java.awt.EventQueue.invokeLater(() -> {
            new DisplayFrame(UnsolvedGrid.generate(0)).setVisible(true);
        });
    }

    // Indirect access to UnsolvedGrid method to DisplayFrame.
    public static int[] NewGame(int difficulty) {
        return UnsolvedGrid.generate(difficulty);
    }

}
