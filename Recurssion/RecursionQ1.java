public class RecursionQ1 {
    public static void rec(int n){
        System.out.print(n+" ");
        if (n>1) {
            rec(n - 1);
        }
    }
    public static void main(String[] args) {
        rec(10);
    }
}