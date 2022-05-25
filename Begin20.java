package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin20 {
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
        int distance;
        distance = (int) Math.sqrt((Math.pow(x2,2) - Math.pow(x1,2)) + (Math.pow(y2,2) - Math.pow(y1,2)) );
        System.out.println(distance);
    }
}
