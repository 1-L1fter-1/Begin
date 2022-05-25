package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin14 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number >>> ");
        double L = Integer.parseInt(is.readLine());
        double R;
        double S;
        double Pi = 3.14;
        R = 2 * Pi * L;
        S = Pi * (int) Math.pow(R,2);
        System.out.println(S);

    }
}
