import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // type of url based on extensions 

        System.out.print("Enter url : ");
        String url = sc.nextLine();

        if (url.endsWith(".com")) {
            System.out.println("It's commercial website");
        }
        else if(url.endsWith(".org")){
            System.out.println("It's organization website");
        }
        else if(url.endsWith(".gov")){
            System.out.println("It's goverment website");
        }
        else if(url.endsWith(".in")){
            System.out.println("It's Indian website");
        }
        else{
            System.out.println("website type unknown");
        }
    }
}
