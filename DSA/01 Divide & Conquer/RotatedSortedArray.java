public class RotatedSortedArray {
    
    static int findElt(int arr[], int t, int si, int ei){
        if (si>ei) {
            return -1;
        }

        int mid = (ei+si)/2;
        //case FOUND
        if (arr[mid]==t) {
            return mid;
        }
        //case 1: On Line 1
        if (arr[si]<= arr[mid]) {
            //case a: left
            if (arr[si]<= t && t <= arr[mid]) {
                return findElt(arr, t, si, mid);            
            }
            //case b: right
            else{
                return findElt(arr, t, mid+1, ei);
            }
        }
        //case 2: On Line 2
        else{
            //case c: right
            if (t<=arr[ei]) {
                return findElt(arr, t, mid+1, ei);
            }
            //case d: left
            else{
                return findElt(arr, t, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,7,88,90,800,-6,-3,0,2};
        int tarIdx = findElt(arr, -3, 0, arr.length-1);
        System.out.println("Element found at index : "+tarIdx);
    }
}
