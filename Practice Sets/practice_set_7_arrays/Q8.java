public class Q8 {
    public static void main(String[] args) {
        int [] arr = {2,5,8,100};
        int i = 0;
        boolean isSorted = true;
        while (i<arr.length - 1) {
            if (arr[i]< arr[(i+1)]) {
               isSorted = true; 
            }
            else{
                isSorted = false;
                System.out.println("array is not sorted");
                break;
            }
            i += 1;
        }
        if (isSorted) {
            System.out.println("array is sorted");
        }
    }
}
