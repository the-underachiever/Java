public class RecursionQ6 {
    public static boolean isSorted(int arr[], int i){
        if (i == arr.length - 1) {
            return true;
        }
        else if (arr[i]> arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4};
        System.out.println(isSorted(array, 0));
    }
}
