import java.util.*;
public class Search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int count=0;
        System.out.println("enter value to search");
           int search=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
           arr[i]=sc.nextInt(); 
            System.out.print(arr[i]+" ");
            if(arr[i]==search){
                count++;
            }
        }
        System.out.println();
        if(count==0){
            System.out.println("the element is not found in the array");
        }
        else{
            System.out.println("The no of  occurances of the element "+search+" is:" +count);
        }
          
    sc.close();
    }
    
}
/*
output:
--------

3
enter value to search
12
12 12 32
12 12 32 
The no of  occurances of the element12 is:2


*/
