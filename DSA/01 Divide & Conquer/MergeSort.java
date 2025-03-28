public class MergeSort{
    static void Mergesort(int arr[], int si, int ei){
        if (si >= ei) {
            return;
        }
        int mid = (ei + si)/2;
        Mergesort(arr, si, mid);        // left sub-array
        Mergesort(arr, mid+1, ei);      // right sub-array
        merge(arr, si, ei, mid);
    }

    static void merge(int arr[], int si, int ei, int mid){
        int temp[] = new int[ei - si + 1];
        int i = si;  // for right subarray traversal
        int j = mid + 1; // for left subarray traversal
        int k = 0; // for temp array travesal
        while (i <= mid && j <= ei) {
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){              // to complete left subarray into main array
            temp[k] = arr[i];
            k++; i++;
        }

        while(j<=ei){               // to complete right subarray into main array
            temp[k] = arr[j];
            k++; j++;
        }

        for (k=0, i=si; k < temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }

    static void printArr(int arr[]){
        for (int i= 0; i< arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,2,3,8,7,5};
        Mergesort(arr, 0, arr.length-1);
        printArr(arr);
    }    
}