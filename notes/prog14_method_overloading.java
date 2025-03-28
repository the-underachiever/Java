public class prog14_method_overloading {

    static void foo(){
        System.out.println("Achyut");
    }

    static void foo(int a){                    // if we change return type with same num of parameters it can cause error
        System.out.println("Achyut "+a);       // that's why num of parameters have to be different 
    }

    static void change(int x){
        x = 78;
    }

    static void ar(int [] arr){
        arr[0] = 69;
    }
    public static void main(String[] args) {
        foo();
        foo(5);

        int a = 40;
        System.out.println(a);
        change(a);
        System.out.println(a);

        int [] marks = {22,55,6,44,88};
        System.out.println(marks[0]);
        ar(marks);
        System.out.println(marks[0]);   // showed 69 bcz array is passed with reference.

    }
}