public class bubbleSort {
    public static void main(String[] args){

        int arr[] = {15, 6, 8, 10, 16, 2};
        int n=arr.length;

        BubbleSort(arr, n);

        for(int i=0;i<n;i++){
            System.out.printf(arr[i]+" ");
        }


    }

    public static void BubbleSort(int arr[], int n){
        int flag = 0, temp;

        for(int i=0;i<n-1;i++){
            flag=0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag ==0)
                break;
        }


    }
}
