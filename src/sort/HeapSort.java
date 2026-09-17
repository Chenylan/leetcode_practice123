package sort;

public class HeapSort {
    public static void heapSort(int[] arr){
        if(arr==null || arr.length<2){
            return ;
        }
        int n = arr.length;

        for(int i=n/2-1;i>=0;i--){
            heap(arr,n,i);
        }
        for(int i=n-1;i>0;i--){
            swap(arr,0,i);
            heap(arr,i,0);
        }
    }

    public static void heap(int[] arr,int n,int i){
        int max=i;
        int l=2*i+1;
        int r=2*i+2;

        if(l<n && arr[max]<arr[l]){
            max=l;
        }
        if(r<n && arr[max]<arr[r]){
            max=r;
        }
        if(max!=i){
            swap(arr,i,max);
            heap(arr,n,max);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
