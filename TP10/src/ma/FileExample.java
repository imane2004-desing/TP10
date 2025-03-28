package ma;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        // Écriture dans un fichier
        try (PrintWriter writer = new PrintWriter(new FileWriter("example.txt"))) {
            writer.println("Bonjour, monde!");
            writer.println("Ceci est un exemple.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Lecture d'un fichier
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
