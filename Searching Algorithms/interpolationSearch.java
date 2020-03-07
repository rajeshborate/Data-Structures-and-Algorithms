public class interpolationSearch {
    public static void main(String[] args){

        int A[]={10, 20, 30, 40, 50, 60, 70, 80, 90};
        int n=A.length;
        int data = 20;
        int result = InterpolationSearch(A, data);

        System.out.println("Element found at index "+result);

    }

    public static int InterpolationSearch(int A[], int data){

        int low = 0, mid=0, high = A.length-1;

        while(low<=high){

            mid = low + (((data - A[low]) * (high - low)/(A[high] - A[low])));

            if(data == A[mid])
                return mid+1;
            else if(data < A[mid])
                high = mid -1;
            else
                low = mid+1;

        }
        return -1;


    }
}
