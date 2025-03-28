package ma;

import java.io.*;
import java.util.*;

public class NombresOpposes {
    public static void main(String[] args) {
        try {
          
            BufferedReader lecteur = new BufferedReader(new FileReader("System.in"));
            PrintWriter ecrivain = new PrintWriter(new FileWriter("System.out"));
            

            int nombreEl = Integer.parseInt(lecteur.readLine());
            
         
            String ligneNombres = lecteur.readLine();
            String[] nombresTextes = ligneNombres.split(" ");
            
            
            Set<Integer> nombresUniques = new HashSet<>();
            for (String texte : nombresTextes) {
                nombresUniques.add(Integer.parseInt(texte));
            }
            
            
            int compt = 0;
            for (int nombre : nombresUniques) {
                if (nombre > 0 && nombresUniques.contains(-nombre)) {
                	compt++;
                }
            }
            
            
            ecrivain.println(compt);
            
        
            lecteur.close();
            ecrivain.close();
            
        } catch (Exception e) {
            System.out.println("Une erreur est survenue : " + e.getMessage());
        }
    }
}
