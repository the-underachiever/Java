public class Q7 {
    public static void main(String[] args) {
        int [] arr = {2,5,8,10,0,69,88};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}