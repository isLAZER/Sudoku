package com.lazer.displayEngine;

import com.lazer.Main;
import com.lazer.logicEngine.SudokuGridAssessor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class DisplayFrame extends javax.swing.JFrame {

    public DisplayFrame(int[] grid) {
        unsolvedGrid = Arrays.copyOf(grid, 81);
        unsolvedGrid1 = Arrays.copyOf(grid, 81);
        try {
            initComponents();
        } catch (IOException ex) {
        }
    }

    private void initComponents() throws IOException {

        // Variable declaration.
        buttonGroup = new javax.swing.ButtonGroup();
        GButton = new GridButton[81];
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        selectedNumber = '1';
        difficulty = 0;
        status = true;
        // End of Variable declaration.

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku");
        setIconImage(new ImageIcon(ImageIO.read(Main.class.getResourceAsStream("/com/lazer/displayEngine/resources/SudokuIcon.png"))).getImage());
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(634, 859));
        setMinimumSize(new java.awt.Dimension(634, 859));
        setSize(new java.awt.Dimension(634, 859));
        getContentPane().setLayout(null);
        setFocusable(true);
        setLocationRelativeTo(null);
        setResizable(false);

        setGrid();

        Timer();
        
        jButton1.setFont(Mojangles(20)); 
        jButton1.setText("EXIT");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton1);
        jButton1.setBounds(143, 731, 130, 35);
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved();
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked();
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered();
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited();
            }
        });
        jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton1ActionPerformed();
        });

        jButton2.setFont(Mojangles(20)); 
        jButton2.setText("RESET");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton2);
        jButton2.setBounds(352, 731, 130, 35);
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved();
            }
        });
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked();
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered();
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited();
            }
        });
        jButton2.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton2ActionPerformed();
        });

        jButton3.setFont(Mojangles(20)); 
        jButton3.setText("EASY");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton3);
        jButton3.setBounds(143, 770, 130, 35);
        jButton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton3MouseMoved();
            }
        });
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked();
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered();
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited();
            }
        });
        jButton3.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton3ActionPerformed();
        });
        
        jButton4.setFont(Mojangles(20)); 
        jButton4.setText("NEW GAME");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton4);
        jButton4.setBounds(352, 770, 130, 35);
        jButton4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton4MouseMoved();
            }
        });
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked();
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered();
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited();
            }
        });
        jButton4.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton4ActionPerformed();
        });
        
        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/sGrid.png"))); 
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(84, 185, 456, 456);

        jLabel4.setFont(Mojangles(20)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html><font color='white'>STATUS: </font><font color='black'>NEW GAME STARTED</font></html>");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(114, 660, 400, 30);

        jLabel5.setFont(Mojangles(20)); 
        jLabel5.setForeground(new java.awt.Color(255, 255, 255, 250));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TIME");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(193, 683, 240, 30);

        jLabel2.setFont(Mojangles(100)); 
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("1");
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(272, 697, 80, 148);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/background.png"))); 
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 620, 822);

        // Add KeyListener to the frame.
        addKeyListener((KeyListener) new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (keyChar >= '1' && keyChar <= '9') {
                    jLabel2.setText(String.valueOf(keyChar));
                    selectedNumber = keyChar;
                } else if (keyChar == 'r') {
                    reset();
                } else if (keyChar == 'x') {
                    System.exit(0);
                } else if (keyChar == 'm') {
                    jButton3ActionPerformed();
                } else if (keyChar == 'n') {
                    jButton4ActionPerformed();
                } else {
                    e.consume(); // Ignore any other key.
                }
            }
        });
        // End of the Keylistner.

        addMouseWheelListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseWheelMoved (java.awt.event.MouseWheelEvent evt) {
                int direction = evt.getWheelRotation();
                buffer++;
                if (buffer > 1) {
                    // Handle scrolling based on direction and amount
                    if (direction > 0) {
                        if (selectedNumber < '9') {
                            selectedNumber += 1;
                            jLabel2.setText(String.valueOf(selectedNumber));
                        }
                        // Perform action for scrolling down
                    } else {
                        if (selectedNumber > '1') {
                            selectedNumber -= 1;
                            jLabel2.setText(String.valueOf(selectedNumber));
                        }
                        // Perform action for scrolling up
                    }
                    buffer = 0;
                }
            }
        });

        pack();
    }

    // jButton1 Events
    private void jButton1ActionPerformed() {
        System.exit(0);
    }
    private void jButton1MouseEntered() {
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }
    private void jButton1MouseExited() {
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }
    private void jButton1MouseClicked() {
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255)));
    }
    private void jButton1MouseMoved() {
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }
    // End of jButton1 Events

    // jButton2 Events
    private void jButton2ActionPerformed() {
        reset();
        jLabel4.setText("<html><font color='white'>STATUS: </font><font color='grey'>ONGOING</font></html>");
    }
    private void jButton2MouseEntered() {
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }
    private void jButton2MouseExited() {
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }
    private void jButton2MouseClicked() {
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255)));
    }
    private void jButton2MouseMoved() {
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }
    // End of jButton2 Events
    
    // jButton3 Events
    private void jButton3ActionPerformed() {
        if ("1".equals(jButton3.getName())){
            jButton3.setName("2");
            jButton3.setText("HARD");
            difficulty = 2;
        } else if ("2".equals(jButton3.getName())){
            jButton3.setName("0");
            jButton3.setText("EASY");
            difficulty = 0;
        } else{
            jButton3.setName("1");
            jButton3.setText("NORMAL");
            difficulty = 1;
        }
    }
    private void jButton3MouseEntered() {
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }
    private void jButton3MouseExited() {
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }
    private void jButton3MouseClicked() {
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255)));
    }
    private void jButton3MouseMoved() {
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }
    // End of jButton3 Events

    // jButton4 Events
    private void jButton4ActionPerformed() {
        unsolvedGrid1 = com.lazer.Main.NewGame(difficulty);
        jLabel4.setText("<html><font color='white'>STATUS: </font><font color='black'>NEW GAME STARTED</font></html>");
        status = true;
        secs = 0;
        mins = 0;
        hour = 0;
        jLabel5.setText("TIME - 00:00");
        reset();
    }
    private void jButton4MouseEntered() {
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }
    private void jButton4MouseExited() {
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }
    private void jButton4MouseClicked() {
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255)));
    }
    private void jButton4MouseMoved() {
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }
    // End of jButton4 Events
    
    // Function to send unsolvedGrid to GridButtion
    public static char setCell(int index) {
        unsolvedGrid[index] = selectedNumber-48; // Because int conversion of char '1' is 49.
        return selectedNumber;
    }

    // Supplying difficulty level to Main.
    public static int getDifficulty() {
        return difficulty;
    }

    // Custom Font Accessor.
    public static Font Mojangles(float fontSize) {
        try {
            // Load the font file from the Sudoku/src/com/lazer/displayEngine/resources directory.
            InputStream fontFile = Main.class.getResourceAsStream("/com/lazer/displayEngine/resources/Mojangles.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
            // Register the font with the GraphicsEnvironment.
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            // Derive a bold version of the font with the specified size.
            return font.deriveFont(Font.BOLD, fontSize);
        } catch (IOException | FontFormatException e) {
            // If there is an exception, return a default font as a fallback.
            return new Font("Serif", Font.BOLD, (int) fontSize);
        }
    }
    
    public void reset() {
        // Removing the buttons from the grid.
        for (int i = 0; i < 81; i++) {
            buttonGroup.remove(GButton[i]);
            getContentPane().remove(GButton[i]);
        }
        // Removing and readding components in the order to maintain hierarchy.
        getContentPane().remove(jLabel1);
        getContentPane().remove(jLabel3);
        GButton = new GridButton[81];
        unsolvedGrid = Arrays.copyOf(unsolvedGrid1, 81);
        setGrid();
        getContentPane().add(jLabel1);
        getContentPane().add(jLabel3);
        // Revalidate and repaint after removing components.
        getContentPane().revalidate();
        getContentPane().repaint();
        // Request focus on the frame to ensure it can receive key events.
        requestFocusInWindow();
        pack();
    }

    public void setGrid() {
        // Grid Button Declaration.
        // Temporary variables for calculating coordinates.
        x = 94;
        y = 195;
        n = 1;
        m = 1;
        o = 1;
        for (int i = 0; i < 81; i++){
            // Standard Properties required for the Buttons.
            GButton[i] = new GridButton(Integer.toString(i), Integer.toString(unsolvedGrid[i]), x, y);
            // Logic to find coordinates.
            x += 48;
            if (n == 3){
                n = 0;
                x += 6;
            }
            if (m == 9){
                m = 0;
                y += 48;
                x = 94;
                if (o == 3){
                    o = 0;
                    y += 6;
                }
                o++;
            }
            n++;
            m++;
            // Additional Button Properties.
            buttonGroup.add(GButton[i]);
            getContentPane().add(GButton[i]);
            // Revalidate and repaint after adding components
            getContentPane().revalidate();
            getContentPane().repaint();
        }
        // End of Grid Button Declaration
        x = 94;
        y = 195;
        n = 1;
        m = 1;
        o = 1;
    }

    // Supply access to GridButton of error checking method since variables are easily accessible in this Class.
    public static int CheckForErrors(int index) {
        if (!new SudokuGridAssessor().GridChecker(unsolvedGrid)) {
            jLabel4.setText("<html><font color='white'>STATUS: </font><font color='red'>ERROR DETECTED</font></html>");
        } else {
            jLabel4.setText("<html><font color='white'>STATUS: </font><font color='6C3082'>ONGOING</font></html>");
            for (int i = 0; i < 81; i++) {
                if (unsolvedGrid[i] == 0) {
                    return 0;
                }
            }
            jLabel4.setText("<html><font color='white'>STATUS: </font><font color='483D8B'>SOLVED</font></html>");
            status = false;
        }
        return 1;
    }

    public static void Timer() {
        // Thread that runs timer in background.
        new Thread(() -> {
            String time;
            // Loop is required for increment in timer.
            while (true) {
                if (status) {
                    try {
                        // 1 second delay in the thread.
                        Thread.sleep(1000);
                        // Timer display logic.
                        secs++;
                        if (secs > 59) {
                            secs = 0;
                            mins++;
                            if (mins > 59) {
                                mins = 0;
                                hour++;
                            }
                        }
                        if (hour == 0) {
                            time = String.format("%02d:%02d", mins, secs);
                        } else {
                            time = String.format("%02d:%02d:%02d", hour, mins, secs);
                        }
                        jLabel5.setText("TIME - "+time);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    // Variables declaration
    private javax.swing.ButtonGroup buttonGroup;
    private static GridButton[] GButton; // Grid Buttons
    private javax.swing.JButton jButton1; // Exit Button
    private javax.swing.JButton jButton2; // Reset Button
    private javax.swing.JButton jButton3; // Difficulty Button
    private javax.swing.JButton jButton4; // New Game Button
    private javax.swing.JLabel jLabel1; // Grid
    private javax.swing.JLabel jLabel2; // Selected Number
    private javax.swing.JLabel jLabel3; // Background
    private static javax.swing.JLabel jLabel4; // Status Label
    private static javax.swing.JLabel jLabel5; // Timer Label
    public static int[] unsolvedGrid; // Modifiable Grid
    private static int[] unsolvedGrid1; // Reference Grid
    private static char selectedNumber; // Sets the number on Grid Buttons
    private static int difficulty; 
    private static boolean status; // Timer stopper
    private static int secs, mins, hour; // Timer controllers
    private static int buffer; // Buffer variable for mouse wheel movement 
    // End of variables declaration
    // Temporary variables
    int x, y, n, m, o;
}