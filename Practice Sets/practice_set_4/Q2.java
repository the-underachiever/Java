import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //
        
        System.out.print("enter annual income : ");
        float income = sc.nextFloat();
        float tax = 0;
        if(income < 2.5f){
            tax += 0;
        }
        else if(income > 2.5f && income <= 5.0f){
            tax += 0.05f * (income - 2.5f);
        }
        else if(income > 5.0f && income <= 10.0f){
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (income - 5.0f);
        }
        else if(income > 10.0f){
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (10.0f - 5.0f);
            tax += 0.3f * (income - 10.0f);
        }
        System.out.println("tax paid by employee is :"+tax);
    }
}
