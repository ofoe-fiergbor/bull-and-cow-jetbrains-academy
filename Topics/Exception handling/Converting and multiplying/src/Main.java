import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        boolean check = true;

        ArrayList<String> arrayString = new ArrayList<>();

        while (check) {
            String input = scanner.nextLine();
            if (!"0".equals(input)) {
                arrayString.add(input);
            } else {
                check = false;

            }
        }

        for (String i: arrayString) {
            try {
                int intValueOfString = Integer.parseInt(i) * 10;
                System.out.println(intValueOfString);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + i);
            }
        }
    }
}
