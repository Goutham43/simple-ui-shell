import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CustomToolBar extends JPanel implements ActionListener {
    private JButton gcpButton;
    private JButton azureBUtton;
    private CustomShellScript shellScript;
    private StringListener stringListener;

    public CustomToolBar() {
        gcpButton = new JButton("GCP");
        azureBUtton = new JButton("AZURE");
        shellScript = new CustomShellScript();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        gcpButton.addActionListener(this);
        azureBUtton.addActionListener(this);
        add(gcpButton);
        add(azureBUtton);
    }

    public void setStringListener(StringListener listener) {
        this.stringListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == gcpButton) {
            try {
                stringListener.textEmmitted(shellScript.runShell("GCP"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                stringListener.textEmmitted(shellScript.runShell("AZURE"));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
