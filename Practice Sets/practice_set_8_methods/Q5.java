public class Q5 {
    static int fibo(int x){
        if (x == 1) {
            return 0;
        }
        else if (x == 2) {
            return 1;
        }
        else{
            return fibo(x-1) + fibo(x-2);
        }
        
    }
    public static void main(String[] args) {
        int x = fibo(6);
        System.out.println(x);
    }
}