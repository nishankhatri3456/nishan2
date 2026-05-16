package mypackage;
import java.util.Scanner;

public class mergesort
{





        // Keeps splitting the array until single elements, then merges back in sorted order
        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }

        // Picks the smaller element from both halves and places it in the correct position
        private static void merge(int[] arr, int left, int mid, int right) {

            int leftSize  = mid - left + 1;
            int rightSize = right - mid;

            int[] leftArray  = new int[leftSize];
            int[] rightArray = new int[rightSize];

            for (int i = 0; i < leftSize; i++)  leftArray[i]  = arr[left + i];
            for (int j = 0; j < rightSize; j++) rightArray[j] = arr[mid + 1 + j];

            int i = 0, j = 0, k = left;

            while (i < leftSize && j < rightSize) {
                if (leftArray[i] <= rightArray[j]) arr[k++] = leftArray[i++];
                else                               arr[k++] = rightArray[j++];
            }

            while (i < leftSize)  arr[k++] = leftArray[i++];
            while (j < rightSize) arr[k++] = rightArray[j++];
        }

        private static void printArray(int[] arr) {
            System.out.print("{ ");
            for (int x : arr) System.out.print(x + " ");
            System.out.println("}");
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("How many elements: ");
            int size = scanner.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                System.out.print("  Element " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            scanner.close();

            System.out.print("\nOriginal → "); printArray(arr);

            mergeSort(arr, 0, arr.length - 1);

            System.out.print("Sorted   → "); printArray(arr);
        }

}





