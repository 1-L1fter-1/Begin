package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin15 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number >>> ");
        double S = Integer.parseInt(is.readLine());
        double Pi = 3.14;
        double R;
        double D;
        double L;
        R = (int) Math.pow(S,2) / Pi ;
        L = 2 * Pi * R;
        D = L / Pi;
        System.out.println(L);

    }
}
