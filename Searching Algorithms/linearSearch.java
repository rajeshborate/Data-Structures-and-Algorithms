public class linearSearch {
    // function LinearSearch for searching element in array
    // it returns index if the element is found
    // it returns -1 if the element is not found
    public static int LinearSearch(int arr[], int searchElement){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==searchElement)
                return i;
        }

        return -1;
    }


    public static void main(String[] args){

        int arr[]={10,20,30,40,50,60,70,80,90}; //array of elements
        int searchElement=80;  //element to be searched in given array
        int result=LinearSearch(arr,searchElement);
        if(result==-1)
            System.out.println("Element is not present");
        else
            System.out.println("Element is present at index " +result);

    }

}
