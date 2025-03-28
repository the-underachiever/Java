import java.util.Scanner;
public class prog4_Operators {
    public static void main(String[] args) {
        // *** Chapter 2 : Operators and Expressions ***

        /* Arithematic :    +   -   *   /   %   ++  --
                            % when performed on two floats gives decimal output eg. 4.8 % 1.1 ----> 0.4
        Assignment :     =   +=  -=  so on...    
        Comparison :     <   >   <=  >=  [True,False]
        Logical :        &&  ||  !       [True,False]
        Bitwise :        &   |           [Gives Output by performing logical 'AND', 'OR' operations]

        */


        // *** Associativity of Operators ***

        /*

        Precedence               Associativity
        1. () [] . ->               L -> R         .(Dot) -> (Arrow) these two are member of structure
        2. ! ++ --                  R -> L
        3.  * /                     L -> R
        4.  + -                     L -> R
        5.  << >>                   L -> R         left shit(<<) and right shift (>>)
        6. Comparison Operators      L -> R
        

        brackets '()' stands above all
         */


        // *** DataTypes ***

        /*
          # decimal + integer = decimal #   eg. long + double = double
          int + int = int
          float + double = double
         */


         // *** Increment & Decrement Operators ****
        
         int i = 56;
         int m = i++; // first i is stored in m them value of i is incremented
         int j = 68;
         int k = ++j; // first j is incremented then stored in k
         float s = 8.9f;
         System.out.println(++s);
         System.out.println(s++);
         System.out.println(s);

         char x = 'f';
         System.out.println(++x);
    }
}
