package sort;

public class QuickSort {
    public static void quickSort(int [] arr){
        if(arr==null || arr.length<2){
            return ;
        }

        quickSort(arr,0,arr.length-1);

    }

    public static void quickSort(int[] arr, int left, int right){
        if(left>=right){
            return ;
        }
        int pivot=partition(arr,left,right);
        quickSort(arr,left,pivot-1);
        quickSort(arr,pivot+1,right);
    }

    public static int partition(int[] arr, int left, int right){
        int pivot=arr[right];
        int i =left;
        for(int j=left;j<right;j++){
            if(arr[j]<pivot){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,right);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
