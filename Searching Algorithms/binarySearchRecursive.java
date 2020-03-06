public class binarySearchRecursive {
    public static void main(String[] args){
        int A[] = {10, 20, 30, 40, 50, 60, 70, 80,90};
        int n = A.length;
        int data = 40;

        int low = 0;
        int high = n-1;
        int result = BinarySearch(A, low, high, data);

        System.out.println(result+1);



    }
    public static int BinarySearch(int A[], int low, int high, int data){
        int mid = low +(high -low)/2;
        if(low>high)
            return -1;
        if(A[mid] == data)
            return mid;
        else if(A[mid] < data)
            return BinarySearch(A, mid+1, high, data);
        else
            return BinarySearch(A, low, mid-1, data);



    }
}
