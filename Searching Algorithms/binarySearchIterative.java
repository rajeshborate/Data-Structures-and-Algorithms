public class binarySearchIterative {
    public static void main(String[] args){

        int A[] = {10,20,30,40,50,60,70,80};
        int data = 10;
        int n = A.length;

        int low = 0;
        int high = n-1;
        int mid =0;

        while(low <= high) {
            mid = low + (high - low)/2;
            if (A[mid] == data) {
                System.out.println("element found at index " +(mid+1));
                break;
            }
            else if (data < A[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

    }




}
