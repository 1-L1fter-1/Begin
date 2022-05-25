package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin21 {
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
        System.out.print(" x3 >>> ");
        int x3 = Integer.parseInt(is.readLine());
        System.out.print(" y3 >>> ");
        int y3 = Integer.parseInt(is.readLine());
        int a;
        int b;
        int c;
        int p;
        int S;
        a = x3 - x1;
        b = y2 - y1;
        c = y2 - y3;
        p = (a + b + c) / 2;
        S = (int) Math.sqrt(p * (p - a) * (p - b) * (p -c));
        System.out.println(S);
    }
}
