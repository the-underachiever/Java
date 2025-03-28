import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] sum = {0.5f, 0.7f, 5.2f, 9.9f, 5.5f};
        System.out.println("enter num :");
        float search = sc.nextFloat();
        boolean found = true;
        for (int i = 0; i < sum.length; i++) {
            found = true;
            if (search == sum[i]) {
                found = true;
                break;
            }
            else{
                found = false;
            }
        }
        if (found) {
            System.out.println("num found");
        }
        else{
            System.out.println("num not found");
        }
    }
}
