import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, a;
        System.out.print("Enter upto  natural you want to print : ");
        num = sc.nextInt();
        a = 0;
        do {
            a++;
            System.out.println(a);
        } while (a<num);
    }
}
