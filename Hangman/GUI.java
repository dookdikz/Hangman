/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.text.PlainDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.AttributeSet;

/**
 *
 * @author IT-WORLD
 */
public class GUI extends javax.swing.JFrame {

    private static String[] word = {"human", "arrow", "apple", "mango", "devil", "angel", "tiger", "bunny", "water", "chair"};
    private static String[] hint = {"<html>1. Have 2 leg <br> 2. It clever</html>", "<html>1. Make from feather and wood <br>  2. Use with bow</html>", "<html>1. It is fruit <br>  2. Red color</html>", "<html>1. It is fruit <br>  2. Green color</html>", "<html>1. It bad <br>  2. Opposite the angle</html>", "<html>1. It good <br>  2. Opposite the devil</html>", "<html>1. It is animal <br>  2. It fast</html>", "<html>1. It is animal <br>  2.it cute</html>", "<html>1. It liquid <br>  2. for drink</html>", "<html>1. Make from wood <br>  2. For sit</html>"};
    private static JTextField[] listTxtBox = new JTextField[5];
    private static int nchar, rnum, num, k = 0, counts ,cDraw = 0,point = 10;
    static ArrayList<Integer> arylst = new ArrayList<>();
    private static boolean b = true;

    /**
     * Creates new form GUI
     */
    public GUI() {

        initComponents();
        num = randomize(word.length);
        listTxtBox[0] = char1;
        listTxtBox[1] = char2;
        listTxtBox[2] = char3;
        listTxtBox[3] = char4;
        listTxtBox[4] = char5;
        hintTxt.setText(hint[num]);
        Welcome wel = new Welcome();
        String g = wel.getNamess();
        playName.setText("The player is " + g);
        next.setVisible(false);
        char1.setDocument(new LengthRestrictedDocument(1));
        char2.setDocument(new LengthRestrictedDocument(1));
        char3.setDocument(new LengthRestrictedDocument(1));
        char4.setDocument(new LengthRestrictedDocument(1));
        char5.setDocument(new LengthRestrictedDocument(1));

        arylst.add(num);
        for (int i = 0; i < 2; i++) {
            nchar = randomize(5);
            listTxtBox[nchar].setText(String.valueOf(word[num].charAt(nchar)));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        char1 = new javax.swing.JTextField();
        char2 = new javax.swing.JTextField();
        char3 = new javax.swing.JTextField();
        char4 = new javax.swing.JTextField();
        btn = new javax.swing.JButton();
        char5 = new javax.swing.JTextField();
        anss = new javax.swing.JLabel();
        hintTxt = new javax.swing.JLabel();
        answer = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        playName = new javax.swing.JLabel();
        draw = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        char1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        char1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        char1.setName(""); // NOI18N
        char1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                char1ActionPerformed(evt);
            }
        });

        char2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        char2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        char3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        char3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        char4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        char4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn.setText("ENTER");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        char5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        char5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        anss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        hintTxt.setBackground(new java.awt.Color(204, 0, 0));
        hintTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hintTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        answer.setText("ANSWER");
        answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        next.setText("NEXT");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HINT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HANGMAN GAME");

        playName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        draw.setPreferredSize(new java.awt.Dimension(200, 300));
        draw.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                drawComponentHidden(evt);
            }
        });

        javax.swing.GroupLayout drawLayout = new javax.swing.GroupLayout(draw);
        draw.setLayout(drawLayout);
        drawLayout.setHorizontalGroup(
            drawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        drawLayout.setVerticalGroup(
            drawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playName, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(char1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(char2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(char3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(char4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(char5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hintTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(answer)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(anss, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(char1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(char2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(char3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(char4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(char5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hintTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anss, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(answer, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(draw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void char1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_char1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_char1ActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
         
        int countPos = 0;
        String a = "";
        cDraw++;
        Graphics2D d = (Graphics2D) draw.getGraphics();
        switch (cDraw) {
            case 1: {
                d.drawLine(25, 25, 25, 275);
                d.drawLine(25, 25, 125, 25);
                d.drawLine(125, 25, 125, 50);
                d.drawLine(125, 25, 125, 50);
                d.drawOval(100, 50, 50, 50);
                break;
            }
            case 2:
            {
                d.drawLine(125, 100, 125, 150);
                break;
            }
            case 3:{
            d.drawLine(125, 100, 90, 120);
                break;
            }
            case 4:{
            d.drawLine(125, 100, 160, 120);
            break;
            }
            case 5:{
            d.drawLine(125, 150, 90, 175);
            break;
            }
            case 6:{
            d.drawLine(125, 150, 160, 175);
            btn.setVisible(false);
            next.setVisible(true);
            point --;
            break;
            
            }
            default:
            {
                break;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (chkCorrect(i, j)) {

                    if (i == j) {

                        countPos++;
                        a += " " + word[num].charAt(j);
                        listTxtBox[i].setForeground(Color.GREEN);
                    }
                }
            }

            if (countPos == 5) {
                if (cDraw==6)
                {
                 point++;
                }
                repaint();
                next.setVisible(true);
                btn.setVisible(false);
                
            } else {

            }
    }//GEN-LAST:event_btnActionPerformed
    }
    private void answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerActionPerformed
        anss.setText(word[num]);
    }//GEN-LAST:event_answerActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        repaint();
        btn.setVisible(true);
        cDraw = 0;
        b = true;
        if (arylst.size() == 10) {
            b = false;
            this.setVisible(false);
            End e = new End();
            e.setVisible(true);
        }
        char1.setText("");
        char2.setText("");
        char3.setText("");
        char4.setText("");
        char5.setText("");
        anss.setText("");
        listTxtBox[0].setForeground(Color.BLACK);
        listTxtBox[1].setForeground(Color.BLACK);
        listTxtBox[2].setForeground(Color.BLACK);
        listTxtBox[3].setForeground(Color.BLACK);
        listTxtBox[4].setForeground(Color.BLACK);
        next.setVisible(false);

        while (b) {
            num = randomize(word.length);
            counts = 0;
            for (int l = 0; l < arylst.size(); l++) {
                if (num == arylst.get(l)) {
                    counts++;
                }

            }
            if (counts > 0) {
                b = true;
            } else {
                b = false;
            }
        }
        arylst.add(num);

        for (int i = 0; i < 2; i++) {
            nchar = randomize(5);
            listTxtBox[nchar].setText(String.valueOf(word[num].charAt(nchar)));
        }
        hintTxt.setText(hint[num]);


    }//GEN-LAST:event_nextActionPerformed

    private void drawComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_drawComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_drawComponentHidden

    /**
     * @param args the command line arguments
     */
    /* public static void main(String[] args) {
        
     num = randomize(word.length);
     arylst.add(num);

     //System.out.printf("%d  %c", num, word[num].charAt(0));
     java.awt.EventQueue.invokeLater(new Runnable() {
     @Override
     public void run() {
     new GUI().setVisible(true);
     for (int i = 0; i < 2; i++) {
     nchar = randomize(5);
     listTxtBox[nchar].setText(String.valueOf(word[num].charAt(nchar)));
     }
     }
     });
     }*/
    public int randomize(int len) {
        Random rand = new Random();

        return rand.nextInt(len);

    }
    public int getPoints()
    {
    return point;
    }

    public boolean chkCorrect(int m, int n) {
        return listTxtBox[m].getText().equals(String.valueOf(word[num].charAt(n)));
    }
    

    public final class LengthRestrictedDocument extends PlainDocument {

        private final int limit;

        public LengthRestrictedDocument(int limit) {
            this.limit = limit;
        }

        @Override
        public void insertString(int offs, String str, AttributeSet a)
                throws BadLocationException {
            if (str == null) {
                return;
            }

            if ((getLength() + str.length()) <= limit) {
                super.insertString(offs, str, a);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anss;
    private javax.swing.JButton answer;
    private javax.swing.JButton btn;
    private javax.swing.JTextField char1;
    private javax.swing.JTextField char2;
    private javax.swing.JTextField char3;
    private javax.swing.JTextField char4;
    private javax.swing.JTextField char5;
    private javax.swing.JPanel draw;
    private javax.swing.JLabel hintTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton next;
    private javax.swing.JLabel playName;
    // End of variables declaration//GEN-END:variables
}
