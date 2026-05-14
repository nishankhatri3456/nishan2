package mypackage;

import java.util.Scanner;
public class bubblesort {

    public static void main(String[] args){
        // for array
        System.out.println("Enter the size of array ");
        Scanner sc = new Scanner(System.in );
        int n = sc.nextInt();

        int [] a = new int[n];

        System.out.println("Enter the element in the array : ");
        for (int i = 0 ; i<a.length ; i++){
            a[i]=sc.nextInt();
        }

        //sorting
        for(int i = 0;i<a.length;i++){  // numbers of round
            int flag = 0;
            int temp= 0;
             for(int j=0 ; j <a.length - i-1 ;j++) // for elements
            {
                if(a[j]>a[j+1])
                {

                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag = 1;

                }
            }
            if(flag==0)
            {
                break;
            }

        }

        // to print the sorted list
        System.out.println("The soted list are:");
        for( int i = 0; i<a.length; i++)
        {

            System.out.println(a[i] + " ");
        }
    }
}
