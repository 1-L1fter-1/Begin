package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin13 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));

        //R1 > R2

        System.out.print("Enter a number >>> ");
        double R1 = Integer.parseInt(is.readLine());
        System.out.print("Enter the second number >>> ");
        double R2 = Integer.parseInt(is.readLine());
        double S1;
        double S2;
        double S3;
        double Pi = 3.14;
        S1 = Pi * (int) Math.pow(R1,2);
        S2 = Pi * (int) Math.pow(R2,2);
        S3 = S1 - S2;
        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);

    }
}
