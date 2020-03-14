public class insertionSort {
    public static void main(String[] args){

        int arr[] = { 6, 18, 2, 31, 1, 5, 100, 10};
        int n =arr.length;

        InsertionSort(arr,n);

        for(int i=0;i<n;i++){
            System.out.printf(arr[i] + " ");
        }


    }

    public static void InsertionSort(int arr[], int n){

        int i,j, temp;
        for(i=1; i<n;i++){
            temp=arr[i];
            j = i-1;

            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1] =temp;

        }


    }


}
