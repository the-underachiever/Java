import java.util.Scanner;
public class Q3 {

    // star pattern 4-3-2-1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter number of stars : ");
        num = sc.nextInt();
        for (int i = num; i > 0 ; i--) {
            for(int j = i;j > 0; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
