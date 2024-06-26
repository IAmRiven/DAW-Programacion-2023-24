
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class DrawingPanel extends javax.swing.JFrame {
    private Point startPoint;
    private Point endPoint;
    ArrayList<Line> lines = new ArrayList<>();
    ArrayList<Comando> undo = new ArrayList<>();

    public void addLine(Point start, Point end) {
        lines.add(new Line(start, end));
        repaint();
    }

    public void removeLastLine() {
        if (!lines.isEmpty()) {
            lines.remove(lines.size() - 1);
            repaint();
        }
    }

    /**
     * Creates new form DrawingPanel
     */
    public DrawingPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonLeft = new javax.swing.JButton();
        jButtonUndo = new javax.swing.JButton();
        jButtonRight = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(820, 600));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }

            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 800, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 500, Short.MAX_VALUE));

        getContentPane().add(jPanel1);

        jButtonLeft.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonLeft.setText("<<");
        jButtonLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeftActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLeft);

        jButtonUndo.setBackground(new java.awt.Color(0, 153, 0));
        jButtonUndo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonUndo.setText("Undo");
        jButtonUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUndoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUndo);

        jButtonRight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonRight.setText(">>");
        jButtonRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRightActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRight);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUndoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonUndoActionPerformed
        ComandoUndo movimiento_atras = new ComandoUndo(lines, 10);
        if (!undo.isEmpty()) {
            movimiento_atras.undo();
            undo.remove(undo.size() - 1);

        } else {
            removeLastLine();
        }
        repaint();
    }// GEN-LAST:event_jButtonUndoActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel1MousePressed
        startPoint = evt.getPoint();
        startPoint.y = startPoint.y + 35;
        startPoint.x = startPoint.x + 10;
    }// GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel1MouseReleased
        endPoint = evt.getPoint();
        endPoint.y = endPoint.y + 35;
        endPoint.x = endPoint.x + 10;
        lines.add(new Line(startPoint, endPoint));
        repaint();

    }// GEN-LAST:event_jPanel1MouseReleased

    private void jButtonRightActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRightActionPerformed
        ComandoUndo movimiento = new ComandoUndo(lines, 10);
        movimiento.excute();
        undo.add(movimiento);
        repaint();
    }// GEN-LAST:event_jButtonRightActionPerformed

    private void jButtonLeftActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonLeftActionPerformed
        for (Line line : lines) {
            line.mover(-10);
            undo.add(line);
        }
        repaint();
    }// GEN-LAST:event_jButtonLeftActionPerformed

    /**
     * @param args the command line arguments
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(4));
        g2.setColor(Color.red);
        for (Line line : lines) {
            g2.drawLine(line.getStart().x, line.getStart().y, line.getEnd().x, line.getEnd().y);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DrawingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrawingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrawingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrawingPanel.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrawingPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLeft;
    private javax.swing.JButton jButtonRight;
    private javax.swing.JButton jButtonUndo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
