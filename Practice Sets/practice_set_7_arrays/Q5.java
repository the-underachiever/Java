public class Q5 {
    public static void main(String[] args) {
        int [] arr = {2,5,8,69,88};
        int [] rev = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[index] = arr[i];
            index += 1;
        }

        for (int i : rev) {
            System.out.print(i+" ");
        }
    }
}
