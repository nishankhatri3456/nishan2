package mypackage;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class selectivesort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements in array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // sort logic
        for (int i = 0; i < a.length; i++)
        {
            int min = i;
            int temp = 0;
            {
                for (int j = i + 1; j < a.length; j++)
                {
                    if (a[j] < a[min])
                    {

                        min = j;

                    }

                }
                temp = a[min];
                a[min]=a[i];
                a[i]=temp;


            }
        }
        System.out.println("Soted list is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}



