import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomShellScript {
    public String runShell(String text) throws IOException {
        Process process = Runtime.getRuntime().exec("echo " + text + "\n");
        try {
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line=reader.readLine())!=null) {
                output.append(line).append("\n");
            }
            return output.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
