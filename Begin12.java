package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin12 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number >>> ");
        int a = Integer.parseInt(is.readLine());
        System.out.print("Enter the second number >>> ");
        int b = Integer.parseInt(is.readLine());
        int c;
        int perimeter;
        c = (int) Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        perimeter = a + b + c;
        System.out.println(c);
        System.out.println(perimeter);
    }
}
