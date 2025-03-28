import java.util.Scanner;       // import scanner 

public class prog3_input {
    public static void main(String[] args) {
        // Getting user input

        Scanner sc = new Scanner(System.in);    // set scanner
        // System.out.print("Enter num 1 : ");
        // int a = sc.nextInt();
        // System.out.print("Enter num 2 : ");
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println("The sum of the two numbers is : "+sum);

        // boolean boo = sc.hasNextInt();
        // System.out.println(boo);

        // String name = sc.next();         // reads everything until space is encountered
        // System.out.println(name);

        String name = sc.nextLine();         // reads everything until next line is encountered
        System.out.println(name);
    }
}
