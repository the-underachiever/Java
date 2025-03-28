public class Q6 {
    public static void main(String[] args) {
        int [] arr = {2,5,8,100,69,88,1542};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
