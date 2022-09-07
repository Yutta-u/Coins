import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int a = 0;
        int b = 0;

        for (int i = 0; i < x; i++) {
            if (scan.nextInt() == 0) {
                a++;
            } else {
                b++;
            }
        }
        System.out.println(Math.min(a, b));
    }
}