import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int hiddenNumber = rnd.nextInt(100);
        int counter = 0;

        while (true) {
            System.out.print("Guess the number: ");
            int guessedNumber = sc.nextInt();
            counter++;

            if (guessedNumber < hiddenNumber) {
                System.out.println("More");
            } else if (guessedNumber > hiddenNumber) {
                System.out.println("Less");
            } else {
                System.out.println("You guessed using " + counter + " attempts");
                break;
            }
        }
    }
}