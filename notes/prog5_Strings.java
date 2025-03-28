import java.util.Scanner;
public class prog5_Strings {
    public static void main(String[] args) {
        
        // *** Chapter 3 : Strings ***

        /*
           String is a class in java
           Strings are immutable (cannot be changed)
         */

        Scanner sc = new Scanner(System.in);
        String name = "Achyut Shinde";                // sc.next(); [catches only upto white spaces]
        System.out.println("The name is : " + name);

        int age = 21;
        float cgpa = 8.73f;
        System.out.printf("My age is %d, and my cgpa is %3.2f.", age,cgpa); //%3.2 = 3 spaces and upto 2 decimals   
        // %d (int), %f (float), %d (double), %s (strings)
        // System.out.printf() = System.out.format()





        //  String Methods

        /*
         str.length();                           prints number of characters in str
         str.toLowerCase();
         str.toUpperCase();
         str.trim();                             removes unnecessary spaces (before & after text) and prints the str
         str.substring(start, end);              prints string within provided range (dosen't print ending indexed character)
                                                 you can provide start index only if you want further string to be printed as it is
         str.replace('old_char', 'new_char');    replace specific character in string
         str.startsWith("xyz");                  to check if given string starts with specified string or character    boolean results
         str.endsWith();                         to check if given string ends with specified string or character    boolean results
         str.charAt(index);                      returns character at specified index
         str.indexOf("char / string, i");        returns the first occurance of specified char or string, i = starting from which index
                                                 returns -1 when didn't found given string
         (*)str.lastIndexOf("string, i");        returns last index of given string, i = starting from which index (Indexing while searching is from last character in this case)
                                                 returns -1 when didn't found given string
         str.equals("string");                   returns true or false on basis of specified strings match
         str.equalsIgnoreCase("string");         ignores case and checks for condition
         
         */

        System.out.println("\n"+name.length());

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());

        String trimString = "   Jake is a Noob     ";
        System.out.println(trimString.trim());

        System.out.println(trimString.substring(3,7));

        System.out.println(trimString.replace('J', 'C'));
        System.out.println(trimString.replace('o', 'i'));   // case sensitive (will not change if you put 'O' here)
        System.out.println(trimString.replace("Jake", "Sinu"));

        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("x"));

        System.out.println(name.charAt(0));

        System.out.println(name.indexOf("h"));
        System.out.println(name.indexOf("h", 3));
        System.out.println(name.indexOf("hi"));

        System.out.println(name.lastIndexOf("hi"));
        System.out.println(name.lastIndexOf("h", 5));

        System.out.println(name.equals("Achyut"));
        System.out.println(name.equalsIgnoreCase("achyut shinde"));
    }
}
