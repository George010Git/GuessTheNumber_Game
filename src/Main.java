import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scrie un program care cere de la user un numar de ghicit, daca acesta este "13" afiseaza "Ai ghicit ", daca este mai mare de "13" afiseaza
        // mai putin iar daca este mai mic decat "13" afiseaza mai  mult.

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Introduceti un numar");
            int numar = sc.nextInt();

            if (numar < 13) {
                System.out.println("Mai mult");
            }
            else if (numar > 13) {
                System.out.println("Mai putin");
            }
            else {
                System.out.println("Ai ghicit");
                break;
            }
        }

    }
}