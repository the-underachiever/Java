import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter number : ");
        num = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(num*i);
        }
    }
}
