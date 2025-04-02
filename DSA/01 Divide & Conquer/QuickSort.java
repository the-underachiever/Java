public class QuickSort {

    static void quickSort(int arr[], int si, int ei){
        if (si>=ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1); //for left sub-array
        quickSort(arr, pIdx+1, ei); //for right sub-array
    }
    static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1; //to make place for els smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j]<pivot) {
                //swap
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2,8,5,6,-8,0,55};
        System.out.print("given arrays is : ");
        printArr(arr);
        quickSort(arr, 0, 6);
        System.out.print("using Quick Sort we got : ");
        printArr(arr);
     }
}
