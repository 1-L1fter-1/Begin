package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin2 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number >>> ");
        int a = Integer.parseInt(is.readLine());
        int square;
        square = (int) Math.pow(a,3);
        System.out.println(square);
    }
}
