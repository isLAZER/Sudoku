package com.lazer.displayEngine;

import javax.swing.*;

public class GridButton extends JToggleButton{

    public GridButton(String name, String text, int x, int y){

        // Standard Properties of Button.
        super();
        // Distuingishing between pre filled and interactable buttons.
        if (!"0".equals(text)){
            setText(text);
            setEnabled(false);
            setForeground(new java.awt.Color(0, 0, 0));
        } else {
            setForeground(new java.awt.Color(10, 120, 255));
            addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 39, 61, 128), 4));
                }
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    setBorder(null);
                }
                @Override
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(101, 119, 203, 192), 4));
                    if (SwingUtilities.isRightMouseButton(evt)) {
                        setText("");
                        DisplayFrame.unsolvedGrid[Integer.parseInt(name)] = 0;
                        DisplayFrame.CheckForErrors(Integer.parseInt(name));
                    }
                }
                @Override
                public void mouseMoved(java.awt.event.MouseEvent evt) {
                    setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(21, 39, 61, 128), 4));
                }
            });
            addActionListener((java.awt.event.ActionEvent evt) -> {
                setText(DisplayFrame.setCell(Integer.parseInt(name))+"");
                DisplayFrame.CheckForErrors(Integer.parseInt(name));
            });
        }
        setFont(DisplayFrame.Mojangles(26));
        setAlignmentY(0.0F);
        setBorder(null);
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusable(false);
        setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        setName(name);
        setBounds(x, y, 40, 40);
        
    }
    
}
