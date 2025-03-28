package gestionfichiers;

import java.io.*;

public class AdditionBinaire {

    public static void main(String[] args) throws IOException {
        // Création d'un BufferedReader pour lire le fichier
        BufferedReader br = new BufferedReader(new FileReader("bin.in"));
        
        // Lire le nombre de problèmes à traiter
        int n = Integer.parseInt(br.readLine().trim());

        // Créer un PrintWriter pour écrire dans le fichier de sortie
        PrintWriter writer = new PrintWriter(new FileWriter("bin.out"));
        
        // Pour chaque problème d'addition
        for (int i = 1; i <= n; i++) {
            String[] line = br.readLine().split(" ");
            String bin1 = line[0];
            String bin2 = line[1];

            // Additionner les deux nombres binaires
            int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
            String result = Integer.toBinaryString(sum);

            // Afficher le numéro du problème et le résultat binaire
            writer.println(i + " " + result);
        }

        // Fermer le BufferedReader et le PrintWriter
        br.close();
        writer.close();
    }
}
