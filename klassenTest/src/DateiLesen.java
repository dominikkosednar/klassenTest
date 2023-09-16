import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DateiLesen {

    private String pfadName;
    private String inhalt;

    public DateiLesen() {
        this.pfadName = ".\\src\\Main.java";
    }

    public DateiLesen(String pfadName) {
        this.pfadName = pfadName;
    }

    public String getInhalt() {
        dateilesen();
        return inhalt;
    }

    public void setPfadName(String pfadName) {
        this.pfadName = pfadName;
    }

    private void dateilesen(){
        try {
            this.inhalt = Files.readString(Path.of(this.pfadName));
        } catch (IOException e) {
            System.out.println("Fehler");
        }
    }
}