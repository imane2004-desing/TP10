package ma;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class NombresOpposes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("System.in"));
        int n = Integer.parseInt(br.readLine().trim());
        Set<Integer> nombres = new HashSet<>();
        String[] arr = br.readLine().split(" ");
        for (String s : arr) {
            nombres.add(Integer.parseInt(s));
        }
        int count = 0;
        for (int num : nombres) {
            if (num > 0 && nombres.contains(-num)) {
                count++;
            }
        }
        PrintWriter writer = new PrintWriter(new FileWriter("System.out"));
        writer.println(count);
        writer.close();

        br.close();
    }
}
