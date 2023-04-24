import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scrie un program care cere de la user un numar de ghicit, daca acesta este "13" afiseaza "Ai ghicit ", daca este mai mare de "13" afiseaza
        // mai putin iar daca este mai mic decat "13" afiseaza mai  mult.

        // Update1: transforma numarul 13 intr-un numar aleatoriu

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int hiddenNumber = rnd.nextInt(100);

        while (true) {
            System.out.println("Introduceti un numar");
            int guessedNumber = sc.nextInt();

            if (guessedNumber < hiddenNumber) {
                System.out.println("Mai mult");
            } else if (guessedNumber > hiddenNumber) {
                System.out.println("Mai putin");
            } else {
                System.out.println("Ai ghicit");
                break;
            }
        }
    }
}