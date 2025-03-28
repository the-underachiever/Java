public class RecursionQ2 {
    public static void rec(int n){
        if (n>1) {
            rec(n - 1);
        }
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        rec(10);
    }
}