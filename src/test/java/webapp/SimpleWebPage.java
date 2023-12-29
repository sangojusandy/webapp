package webapp;

import javax.swing.*;
import java.awt.*;

public class SimpleWebPage {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple Web Page");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JEditorPane editorPane = new JEditorPane();
            editorPane.setEditable(false);
            editorPane.setContentType("text/html");
            editorPane.setText("<html><body><h1>Hello, this is a simple web page!</h1></body></html>");

            JScrollPane scrollPane = new JScrollPane(editorPane);
            frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }
}
