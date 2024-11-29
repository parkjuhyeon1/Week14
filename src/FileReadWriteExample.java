import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("symbol1.png");
             FileWriter fw = new FileWriter("symbol2.png")) {

            int data;
            while ((data = fr.read()) != -1) {
                fw.write(data);
            }
            System.out.println("Text file copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}