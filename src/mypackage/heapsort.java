package mypackage;

public class heapsort {



    public static void main(String[] args)
        {
            int[] arr = {22, 13, 17, 11, 10, 14, 12};

            heapsort hs = new heapsort();
            hs.sort(arr);

            // Print sorted array
            System.out.println("Sorted array:");
            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }

        void sort(int[] arr)
        {
            int leng = arr.length;

            // Build max heap
            for (int i = leng / 2 - 1; i >= 0; i--)
            {
                heapify(arr, leng, i);
            }

            // Extract elements from heap one by one
            for (int i = leng - 1; i > 0; i--)
            {
                // Move current root (largest) to end
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                // Heapify the reduced heap
                heapify(arr, i, 0);
            }
        }

        void heapify(int[] arr, int n, int i)
        {
            int largest = i;       // parent node index position
            int li = 2 * i + 1;   // left child node index position
            int ri = 2 * i + 2;   // right child node index position

            // If left child is larger than root
            if (li < n && arr[li] > arr[largest])
            {
                largest = li;
            }

            // If right child is larger than largest so far
            if (ri < n && arr[ri] > arr[largest])
            {
                largest = ri;
            }

            // If largest is not root, swap and continue heapifying
            if (largest != i)
            {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;

                // Recursively heapify the affected subtree
                heapify(arr, n, largest);
            }
        }
    }


