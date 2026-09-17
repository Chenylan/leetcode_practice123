package sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        if(arr==null || arr.length<2){
            return ;
        }

        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
