import java.util.Scanner;

public class practice_Q4 {
    public static void main(String[] args) {
        
        /* to implement code for this expression :
                [(v^2)-(u^2)] / 2*a*s        
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Terminal velocity(v), Initial Velocity(u), Acceleration(a) & Displacement(s) : ");
        float v,u,a,s,result;
        v = sc.nextFloat();
        u = sc.nextFloat();
        a = sc.nextFloat();
        s = sc.nextFloat();
        result = ((v*v)-(u*u)) / (2*a*s);
        System.out.println(result);
    }
}
