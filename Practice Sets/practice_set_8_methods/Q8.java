public class Q8 {
    static void pattern(int x){
        if (x>0) {
            pattern(x-1);
            for (int i = 0; i < x; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
