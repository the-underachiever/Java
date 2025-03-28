import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 1,c=0,num,i = 0;
        System.out.print("Enter upto  which number fibo series you want : ");
        num = sc.nextInt();
        System.out.println(a+"\n"+b);
        while (i < num) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }

    }
}
