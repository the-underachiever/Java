public class Q1 {
    public static void main(String[] args) {
        int n = 5, count = 1;
        for(int num = 2; count <= n; num++){
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                count += 1;
                System.out.println(num);
            }
        }
    }
}
