import java.util.Scanner;
public class practice_Q1 {

    public static void main(String[] args) {
        // program to convert string  to lowercase

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text : ");
        String x = sc.nextLine();
        x = x.toLowerCase();
        System.out.println(x);
    }
}