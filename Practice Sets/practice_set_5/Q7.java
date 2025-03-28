import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0;
        System.out.print("Enter number : ");
        num = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            sum = (num*i) + sum;
        }
        System.out.println("Addition of first 10 number divisible by "+num+ " is \""+sum+"\"");
    }
}
