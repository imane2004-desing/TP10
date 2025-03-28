package ma;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class NombresOpposes {

    public static void main(String[] args) throws IOException {
        // Création d'un BufferedReader pour lire le fichier
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        
        // Lire la taille du tableau
        int n = Integer.parseInt(br.readLine().trim());

        // Créer un ensemble pour stocker les entiers du tableau
        Set<Integer> nombres = new HashSet<>();
        
        // Lire la deuxième ligne contenant les entiers
        String[] arr = br.readLine().split(" ");
        
        // Ajouter les entiers dans l'ensemble
        for (String s : arr) {
            nombres.add(Integer.parseInt(s));
        }

        // Compter les entiers distincts positifs ayant leur opposé dans le tableau
        int count = 0;
        for (int num : nombres) {
            if (num > 0 && nombres.contains(-num)) {
                count++;
            }
        }

        // Afficher le résultat dans un fichier
        PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
        writer.println(count);
        writer.close();

        br.close();
    }
}
