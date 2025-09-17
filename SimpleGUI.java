import javax.swing.*;  // For Swing components
import java.awt.*;     // For AWT layout
import java.awt.event.*; // For event handling

public class SimpleGUI {

    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("My First GUI");

        // Set size of the window
        frame.setSize(500, 700);

        // Set layout manager
        frame.setLayout(new FlowLayout());

        // Exit app when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton button = new JButton("Click Me!");

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show a popup dialog when button is clicked
                JOptionPane.showMessageDialog(frame, "Hello, World!");
            }
        });

        // Add button to the frame
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
