import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args) {
        // Marks to percentage calculator 
        Scanner sc = new Scanner(System.in);
        int MaxMarks, English, Mathematics, History, Geography, Science, TotalMarks;
        float Percentage;
        System.out.println("Enter maximum marks in a subject : ");
        MaxMarks = sc.nextInt();
        System.out.println("Enter marks for each subject in given order (English, Mathematics, History, Geography, Science) :");
        English = sc.nextInt();
        Mathematics = sc.nextInt();
        History = sc.nextInt();
        Geography = sc.nextInt();
        Science = sc.nextInt();
        TotalMarks = (English + Mathematics + History + Geography + Science);
        Percentage = (TotalMarks/(MaxMarks*5.0F))*100.0F;
        System.out.println("Percentage is : "+Percentage);

    }
}