import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,i, sum = 0;
        System.out.print("How many even numbers to add : ");
        n = sc.nextInt();
        i = 0;
        while (i<=(n*2)) {
            if (i%2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("addition of first "+n+" even numbers is "+sum);
    }
}