import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Random rand = new Random(a + b);

        int counter = 0;
        int sum = 0;

        while (counter < n) {
            sum += rand.nextInt(b - a + 1) + a;
            counter++;
        }
        System.out.println(sum);
    }
}