import java.util.Scanner;
public class Q6 {

    // factorial 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, facto = 1;
        System.out.print("Enter number : ");
        num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            facto *= i;
        }
        System.out.println("factorial of "+num+" is "+facto);
    }
}
