package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin8 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number >>> ");
        int a = Integer.parseInt(is.readLine());
        System.out.print("Enter the second number >>> ");
        int b = Integer.parseInt(is.readLine());
        int average;
        average = (a + b)/2;
        System.out.println(average);
    }
}
