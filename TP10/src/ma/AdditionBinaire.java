package gestionfichiers;

import java.io.*;

public class AdditionBinaire {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("bin.in"));
        int n = Integer.parseInt(br.readLine().trim());
        PrintWriter writer = new PrintWriter(new FileWriter("bin.out"));
        for (int i = 1; i <= n; i++) {
            String[] line = br.readLine().split(" ");
            String bin1 = line[0];
            String bin2 = line[1];
            int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
            String result = Integer.toBinaryString(sum);
            writer.println(i + " " + result);
        }
        br.close();
        writer.close();
    }
}
