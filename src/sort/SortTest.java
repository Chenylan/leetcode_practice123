/**
 * 排序算法	最好时间复杂度	平均时间复杂度	最坏时间复杂度	空间复杂度	稳定性
 * 快速排序	O(n log n)	O(n log n)	O(n²)	O(log n) ~ O(n)	不稳定
 * 冒泡排序	O(n)	O(n²)	O(n²)	O(1)	稳定
 * 堆排序	O(n log n)	O(n log n)	O(n log n)	O(1)	不稳定
 * 归并排序	O(n log n)	O(n log n)	O(n log n)	O(n)	稳定
 */

package sort;

import java.util.Arrays;

import static sort.BubbleSort.bubbleSort;
import static sort.HeapSort.heapSort;
import static sort.MergeSort.mergeSort;
import static sort.QuickSort.quickSort;

public class SortTest {
    public static void main(String[] args) {
        int[] original = {5, 2, 9, 1, 5, 6, 0, -3};

        int[] arr1 = original.clone();
        quickSort(arr1);
        System.out.println("快速排序结果："+Arrays.toString(arr1));

        int[] arr2 = original.clone();
        mergeSort(arr2);
        System.out.println("归并排序结果："+Arrays.toString(arr2));


        int[] arr3 = original.clone();
        heapSort(arr3);
        System.out.println("堆排序结果："+Arrays.toString(arr3));


        int[] arr4 = original.clone();
        bubbleSort(arr4);
        System.out.println("堆排序结果："+Arrays.toString(arr4));
    }

}
