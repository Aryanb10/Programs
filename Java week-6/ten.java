//Aryan Bisht
//RA2311003011435
import bubblesort.BubbleSort;
import selectionsort.SelectionSort;
import java.util.Arrays;

public class ten {
    public static void main(String[] args) {
        int[] bubbleArray = {64, 34, 25, 12, 22, 11, 90};
        int[] selectionArray = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(bubbleArray);
        System.out.println("Bubble Sort result: " + Arrays.toString(bubbleArray));
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(selectionArray);
        System.out.println("Selection Sort result: " + Arrays.toString(selectionArray));
    }
}
