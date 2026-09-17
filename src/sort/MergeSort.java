package sort;

public class MergeSort {
    public static void mergeSort(int[] arr){
        if(arr==null || arr.length<2){
            return ;
        }
        int[] tmp=new int[arr.length];
        mergeSort(arr,tmp,0,arr.length-1);
    }

    public  static void mergeSort(int[] arr,int[] tmp,int left,int right){
        if(left>=right){
            return ;
        }
        int mid=left+(right-left)/2;
        mergeSort(arr,tmp,left,mid);
        mergeSort(arr,tmp,mid+1,right);
        merge(arr,tmp,left,right,mid);

    }

    public static void merge(int[] arr,int[] tmp,int left,int right,int mid){

        int k=left;
        int i=left;
        int j=mid+1;
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                tmp[k++]=arr[i++];
            }else{
                tmp[k++]=arr[j++];
            }
        }
        while(i<=mid){
        tmp[k++]=arr[i++];
        }
        while(j<=right){
            tmp[k++]=arr[j++];
        }
        for(int l=left;l<=right;l++) {
            arr[l] = tmp[l];
        }

    }
}
