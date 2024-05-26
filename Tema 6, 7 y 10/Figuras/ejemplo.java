package Figuras;

import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

public class ejemplo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, UnsupportedLookAndFeelException {
        JFrame ventana = new JFrame("MI PRIMERA VENTANA");
        ventana.setSize(400, 500);
        ventana.setVisible(true);
        
        // javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        // LookAndFeelInfo info[] = UIManager.getInstalledLookAndFeels();
        // for (LookAndFeelInfo lookAndFeelInfo : info) {
        // System.out.println(lookAndFeelInfo.getClassName());
        // }
    }
}
