
package com.mycompany.ejemploaddkeylistener;
import javax.swing.*;
import java.awt.event.*;
public class Ejemploaddkeylistener {

    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListener Example");
        JTextField textField = new JTextField();

        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {                
                char keyChar = e.getKeyChar();
                System.out.println("Tecla presionada: " + keyChar);
            }

            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                System.out.println("Tecla presionada (código): " + keyCode);
            }

            public void keyReleased(KeyEvent e) {
                char keyChar = e.getKeyChar();
                System.out.println("Tecla liberada: " + keyChar);
            }
        });

        frame.add(textField);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
