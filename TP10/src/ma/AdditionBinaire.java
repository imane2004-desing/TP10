package ma;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class AdditionBinaire {
    public static void main(String[] args) throws FileNotFoundException {
       
        Scanner scanner = new Scanner(new File("bin.in"));
        PrintWriter output = new PrintWriter(new File("bin.out"));
        
        int N = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 1; i <= N; i++) {
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            
            BigInteger a = new BigInteger(numbers[0], 2);
            BigInteger b = new BigInteger(numbers[1], 2);
            BigInteger sum = a.add(b);
            
            output.println(i + " " + sum.toString(2));
        }
        
        output.flush();
        output.close();
        scanner.close();
    }
}
