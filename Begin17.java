package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin17 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" a >>> ");
        int a = Integer.parseInt(is.readLine());
        System.out.print(" b >>> ");
        int b = Integer.parseInt(is.readLine());
        System.out.print(" c >>> ");
        int c = Integer.parseInt(is.readLine());
        int AC;
        int BC;
        int summa;
        // A < C < B
        AC = c - a ;
        BC = b - c ;
        summa = AC + BC;
        System.out.println(AC);
        System.out.println(BC);
        System.out.println(summa);

    }
}
