package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin1 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number >>>");
        int a = Integer.parseInt(is.readLine());
        int P ;
        P= 4 * a;
        System.out.println(P);

    }
}
