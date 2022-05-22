package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin4 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number >>> ");
        double d = Integer.parseInt(is.readLine());
        double Pi = 3.14;
        double length;
        length = Pi * d;
        System.out.println(length);

    }
}
