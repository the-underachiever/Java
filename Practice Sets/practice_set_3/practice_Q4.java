import java.util.Scanner;
public class practice_Q4 {
    public static void main(String[] args) {
        // program to detect double and triple spaces in string

        Scanner sc = new Scanner(System.in);
        System.out.print("enter text :");
        String text = sc.nextLine();
        System.out.println(text.indexOf("  "));
        System.out.println(text.indexOf("   "));
    }
}
