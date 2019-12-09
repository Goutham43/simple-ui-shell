import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private CustomToolBar toolBar;
    private CustomTextPanel textPanel;

    public MainFrame() {
        super("Shell-UI-runner");
        setLayout(new BorderLayout());
        textPanel = new CustomTextPanel();
        toolBar = new CustomToolBar();
        add(textPanel, BorderLayout.CENTER);
        add(toolBar, BorderLayout.NORTH);
        toolBar.setStringListener(text -> textPanel.appendText(text));
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
