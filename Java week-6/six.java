//Aryan Bisht
//RA2311003011435
interface Sortable {
    void sort(int[] array);
}
class BubbleSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
class SelectionSort implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}

public class six {
    public static void main(String[] args) {
        int[] arrayToSort = {64, 25, 12, 22, 11};

        Sortable bubbleSort = new BubbleSort();
        int[] bubbleSortArray = arrayToSort.clone();
        bubbleSort.sort(bubbleSortArray);
        System.out.println("Sorted array using Bubble Sort:");
        printArray(bubbleSortArray);

        Sortable selectionSort = new SelectionSort();
        int[] selectionSortArray = arrayToSort.clone(); 
        selectionSort.sort(selectionSortArray);
        System.out.println("Sorted array using Selection Sort:");
        printArray(selectionSortArray);
    }
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
