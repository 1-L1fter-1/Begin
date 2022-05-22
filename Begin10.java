package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin10 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number >>> ");
        int a = Integer.parseInt(is.readLine());
        System.out.print("Enter the second number >>> ");
        int b = Integer.parseInt(is.readLine());
        int summa;
        int difference;
        int multiply;
        int division;
        summa = a + b;
        difference = a - b;
        multiply = a * b;
        division = a / b;
        System.out.println(summa);
        System.out.println(difference);
        System.out.println(multiply);
        System.out.println(division);
    }
}
