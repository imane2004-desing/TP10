package ma;

import java.io.*;

public class SommePondereeTriangulaire {
    public static int T(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("good.in"));
        int n = Integer.parseInt(br.readLine().trim());
        PrintWriter writer = new PrintWriter(new FileWriter("good.out"));
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            int sum = 0;
            for (int k = 1; k <= num; k++) {
                sum += k * T(k + 1);
            }
            writer.println(i + " " + num + " " + sum);
        }
        br.close();
        writer.close();
    }
}
