package gestionfichiers;

import java.io.*;

public class SommePondereeTriangulaire {

    // Fonction pour calculer le n-ième nombre triangulaire
    public static int T(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) throws IOException {
        // Création d'un BufferedReader pour lire le fichier
        BufferedReader br = new BufferedReader(new FileReader("good.in"));
        
        // Lire le nombre de datasets
        int n = Integer.parseInt(br.readLine().trim());

        // Créer un PrintWriter pour écrire dans le fichier de sortie
        PrintWriter writer = new PrintWriter(new FileWriter("good.out"));
        
        // Pour chaque dataset
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            
            // Calcul de la somme pondérée
            int sum = 0;
            for (int k = 1; k <= num; k++) {
                sum += k * T(k + 1);
            }

            // Afficher le numéro du dataset et le résultat
            writer.println(i + " " + num + " " + sum);
        }

        // Fermer le BufferedReader et le PrintWriter
        br.close();
        writer.close();
    }
}
