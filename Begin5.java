package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin5 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number >>> ");
        int a = Integer.parseInt(is.readLine());
        int volume;
        volume = (int) Math.pow(a,3);
        int square;
        square =  6 * (int) Math.pow(a,2);
        System.out.println( volume );
        System.out.println( square );
    }
}
