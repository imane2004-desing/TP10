package ma;

import java.util.Scanner;

public class SommePondereeTriangulaire {
    public static int sommeTriangulaire(int n) {
        return n * (n + 1) / 2; // T(n) = n * (n + 1) / 2
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            int n = scanner.nextInt();
            int sommePonderee = 0;

            for (int k = 1; k <= n; k++) {
                sommePonderee += k * sommeTriangulaire(k + 1);
            }

            System.out.println(i + " " + n + " " + sommePonderee);
        }
    }
}
