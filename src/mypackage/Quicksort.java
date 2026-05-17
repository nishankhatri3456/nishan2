package mypackage;

import java.util.Scanner;

public class Quicksort {


    static int[] takeinput(Scanner sc) {
        System.out.println("Enter the size of the array:");

        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    static int partition (int [] arr , int low ,int high )
        {
            int pivot = arr[(low+high)/2];
            while(low<= high)
            {
                while(arr[low] < pivot) low++;
                while(arr[high]>pivot)high--;

                if(low<= high){
                    //swap
                    int tem = arr[low];
                    arr[low]= arr[high];
                    arr[high]= tem;
                    low ++;
                    high --;


                }

            }
            return low ;
        }

        static void quicksort(int [] arr,int low,int high ){
        if (low>= high)return;

        int pi = partition(arr,low,high); // getting split point

            quicksort(arr ,low,pi-1);
            quicksort(arr , pi,high);

        }

        static void print(int [] arr)
        {
            System.out.println("The sorted elements are :");
            for (int i =0 ; i< arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }
        }


    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int [] arr = takeinput(sc);


        quicksort(arr,0,arr.length-1);
        print(arr);

    }
}

