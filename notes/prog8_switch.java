import java.util.Scanner;
public class prog8_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        // Switch case is used when we have to choose from many numbers of alternatives
        
        switch (age) {
            case 18:
                System.out.println("you are going to become adult");
                break;
            case 23:
                System.out.println("Enjoy your job");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life");
                break;
        }

        // enhanced switch
        switch (age) {
            case 18 -> {
                System.out.println("you are going to become adult");
                System.out.println("you are going to become adult");
                System.out.println("you are going to become adult");
            }
            case 23 -> System.out.println("Enjoy your job");
            case 60 -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy your life");
        }
    }    
}
