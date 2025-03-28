public class prog13_Methods {

    // ***** Chapter 8 : Methods *****
    
    /*
        Mehtods are functions created inside of class in java 
        in this case logic named function is created inside public class
    */
    // static dtype function_name(args){}
    // if static keyword is not used you have to create objects of that method 
    static int logic(int x, int y){
        int z;
        if (x>y) {
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5,b=3,c,d;

        // method invocation using object creation 
        // to run commented part remove static keyword from  created function
        // prog_13Methods obj = new prog_13Methods();
        // c = obj.logic(a, b);
        // d = obj.logic(2, 3);
        // System.out.println("c ="c+" & d ="+d);
        c = logic(a,b);
        d = logic(2, 3);
        System.out.println("a = "+a+" & b = "+b);
        System.out.println("c = "+c+" & d = "+d);
    }
}
