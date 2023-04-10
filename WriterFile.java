import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
    public static void Writer(Toy winToy) {
        try (FileWriter writer = new FileWriter("Prize.txt", true)) {
            String text = winToy.toString();
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
