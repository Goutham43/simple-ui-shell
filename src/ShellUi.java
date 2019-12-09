import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class ShellUi {
    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        SwingUtilities.invokeAndWait(MainFrame::new);
    }
}
