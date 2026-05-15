package mypackage;
import java.util.Scanner;

public class insertion
{
    static void sort(int [] arr)
    {   int temp,j;
       for(int i = 1;i<arr.length;i++)
       {
           temp=arr[i];
           j=i;
           while(j>0 && arr[j-1]>temp)
           {
               arr[j]=arr[j-1];
               j=j-1;
           }
           arr[j]=temp;

       }
    }

    static void print(int[] arr)
    {
        System.out.println("Sortted array are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the element of the array:");
        for(int i =0;i<n;i++)
        {
         arr[i]=sc.nextInt();

        }
        sort(arr);
        print(arr);
    }


}
