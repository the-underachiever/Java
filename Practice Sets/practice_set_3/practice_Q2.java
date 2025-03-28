import java.util.Scanner;
public class practice_Q2 {
    public static void main(String[] args) {
        // program to replace space with underscore

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text : ");
        String x = sc.nextLine();
        x = x.replace(" ", "_");
        System.out.println(x);
    }
}
