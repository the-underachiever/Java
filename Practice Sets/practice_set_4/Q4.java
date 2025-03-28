import java.util.Scanner;
public class Q4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // check for leap year

    System.out.print("Enter the year : ");
    int year = sc.nextInt();
    if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
        System.out.println("It's leap year");
    }
    else{
        System.out.println("It's not leap year");
    }
   } 
}
