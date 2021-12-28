//program to perform the insertion sort..
import java.util.Scanner;
public class Insertion
{
    public static void printArray(int array[],int size)
    {
        for(int i=0;i<size;i++)
        System.out.print(array[i]+"  ");
    }
    public static void sort(int array[])
    {
        int n=array.length;
        for(int j=1; j<n; j++)
        {
            int i=j-1;
            int key=array[j];
            while((i>-1) && (array[i]>key))
            {
                array[i+1]=array[i];
                i--;
            }
            array[i+1]=key;
        }
        printArray(array,array.length);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i]=scan.nextInt();
        scan.close();
        sort(arr);
    }
}
/*
output
------
5
54 76 3 1 98
1  3  54  76  98  
*/

