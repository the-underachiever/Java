public class Q6 {
    static int avg(int [] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (sum/arr.length);
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        float x = avg(array);
        System.out.println(x);
    }
}