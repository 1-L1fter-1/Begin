package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin19 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" x1 >>> ");
        int x1 = Integer.parseInt(is.readLine());
        System.out.print(" y1 >>> ");
        int y1 = Integer.parseInt(is.readLine());
        System.out.print(" x2 >>> ");
        int x2 = Integer.parseInt(is.readLine());
        System.out.print(" y2 >>> ");
        int y2 = Integer.parseInt(is.readLine());
        int P;
        int S;
        int a;
        int b;
        a = y2 - y1;
        b = x2 -x1;
        P = (a + b) * 2;
        S = a * b;
        System.out.println(P);
        System.out.println(S);
    }
}
