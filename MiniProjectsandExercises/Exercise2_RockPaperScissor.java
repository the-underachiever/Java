import java.util.Scanner;
import java.util.Random;
public class Exercise2_RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int i = 0;
        while (i < 5) {
            int rand_int = rnd.nextInt(3);
            System.out.print("Press 0 for Rock, 1 for Paper & 2 for Scissors : ");
            int usr_input = sc.nextInt();
            if (rand_int == 0 && usr_input == 1) {
                System.out.println("You win");
            }
            else if (rand_int == 0 && usr_input == 2) {
                System.out.println("You lost");
            }
            else if (rand_int == 1 && usr_input == 0) {
                System.out.println("You lost");
            }
            else if (rand_int == 1 && usr_input == 2) {
                System.out.println("You win");
            }
            else if (rand_int == 2 && usr_input == 1) {
                System.out.println("You lost");
            }
            else if (rand_int == 2 && usr_input == 0) {
                System.out.println("You win");
            }
            else if (rand_int == 2 && usr_input == 2) {
                System.out.println("Tie");
            }
            else if (rand_int == 1 && usr_input == 1) {
                System.out.println("Tie");
            }
            else if (rand_int == 0 && usr_input == 0) {
                System.out.println("Tie");
            }
            else {
                System.out.println("Enter numbers between 0 to 2 only NOOB.");
            }
            i += 1;
        }
    }
}
