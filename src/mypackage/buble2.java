package mypackage;
import java.util.Scanner;
public class buble2 {
    static void bubblesort(int[] arr){

        for(int i=0;i<arr.length;i++)
        {
            int temp = 0;
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;

                }
            }
            if(flag==0)
            {
                break;
            }

        }
    }
    static void sortlist(int[] arr){
        System.out.println("Sotred list are:");
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);

        }
    }


    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

            bubblesort(arr);
            sortlist(arr);





    }

}
