package thousandtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Begin7 {
    public static void main(String[] args) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number a >>> ");
        double R = Integer.parseInt(is.readLine());
        double circle;
        double square;
        double Pi = 3.14;
        circle = 2 * Pi * R;
        square = Pi * (int) Math.pow(R,2);
        System.out.println(circle);
        System.out.println(square);

    }
}
