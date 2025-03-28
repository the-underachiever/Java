public class Q3 {
    static int sum_of_naturals(int x){
        if(x == 1){
            return 1;
        }
        return x + sum_of_naturals(x-1);
    }
    public static void main(String[] args) {
        int sum = sum_of_naturals(10);
        System.out.println(sum);
    }
}
