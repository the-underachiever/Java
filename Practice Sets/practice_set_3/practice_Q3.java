import java.util.Scanner;
public class practice_Q3 {
    public static void main(String[] args) {
        // program to chage name in given template 
        // template : Dear <|name|>, thanks a lot.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String letter, name = sc.nextLine();
        letter = "Dear <|name|>, thanks a lot.";
        letter = letter.replace("<|name|>", name);
        System.out.println(letter);
    }
}
