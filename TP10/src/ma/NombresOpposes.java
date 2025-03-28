package ma;

import java.util.*;

public class NombresOpposes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Set<Integer> ensemble = new HashSet<>();
        
        // Lire les éléments du tableau
        for (int i = 0; i < N; i++) {
            int element = scanner.nextInt();
            ensemble.add(element);
        }

        int compteur = 0;

        // Vérifier les entiers positifs dont l'opposé est aussi dans le tableau
        for (int element : ensemble) {
            if (element > 0 && ensemble.contains(-element)) {
                compteur++;
            }
        }

        System.out.println(compteur);
    }
}