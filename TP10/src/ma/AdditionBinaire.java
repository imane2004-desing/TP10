package ma;

import java.util.Scanner;

public class AdditionBinaire {
    public static String additionBinaire(String a, String b) {
        StringBuilder resultat = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int somme = carry;
            if (i >= 0) somme += a.charAt(i--) - '0';
            if (j >= 0) somme += b.charAt(j--) - '0';
            resultat.append(somme % 2);
            carry = somme / 2;
        }

        return resultat.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Pour ignorer le saut de ligne

        for (int i = 1; i <= N; i++) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            String resultat = additionBinaire(a, b);
            System.out.println(i + " " + resultat);
        }
    }
}