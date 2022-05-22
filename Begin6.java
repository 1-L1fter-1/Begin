package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin6 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number a >>> ");
        int a = Integer.parseInt(is.readLine());
        System.out.print("Enter the second number  b >>> ");
        int b = Integer.parseInt(is.readLine());
        System.out.print("enter number 3 c >>> ");
        int c = Integer.parseInt(is.readLine());
        int volume;
        int square;
        volume = a * b * c;
        square = 2 * (a * b + b * c + a * c);
        System.out.println(volume);
        System.out.println(square);
    }
}
