import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pass : more than 33% in all subjects and overall more than 40%

        System.out.println("Enter percentages of maths, physics and computer in order : ");
        float maths, physics, computer;
        maths = sc.nextFloat();
        physics = sc.nextFloat();
        computer = sc.nextFloat();

        float avg = (maths+physics+computer)/3.0f;
        if (avg > 40 && maths > 33 && physics > 33 && computer > 33) {
            System.out.println("Congratulations! You're passed");
        }
        else{
            System.out.println("You're failed, try hard");
        }
    }    
}
