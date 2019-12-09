import javax.swing.*;
import java.awt.*;

public class CustomTextPanel extends JPanel {
    private JTextArea textArea;

    public CustomTextPanel() {
        textArea = new JTextArea();
        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void appendText(String text) {
        textArea.append(text);
    }
}
