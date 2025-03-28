public class prog7_Conditionals_1 {
    public static void main(String[] args) {
        // *** Chapter 4 : Conditionals ***
        /*          Part 1 : If-Else
            Relational operators
            ( ==, <, >, >=, <=, != )

            Logical Operators : used to provide logic for program
            (&&, ||, !)
        */
        int age = 17;
        if (age > 18) {     // if you've to check if age is 18 use '==' operator bcz '=' will not work
            System.out.println("You're eligible");
        }
        else{
            System.out.println("Go watch pogo.");
        }

        boolean x = false;
        boolean y = true;
        boolean z = false;
        if (x || y && z) {      // && have higher precedence than ||
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
        System.out.println("Not(x) : " + !x);

    }
    
}
