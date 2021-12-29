import java.util.Scanner;
public class Frequency{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        int i,count=0;
        for(i=0;i<str.length();i++){
           if(ch == str.charAt(i)){
            count++;
            
          }
        }
        if(count>0){
            System.out.println("count is"+count);
        }

        else{
            System.out.println("the given character is not there in given string");
        }   
}
}
/*output:
---------
suchithra
c
count is1
 
suchithra
e
the given character is not there in given string

*/