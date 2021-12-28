import java.util.*;
public class InttoString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s=Integer.toString(t);
        if(t==Integer.parseInt(s)){
            System.out.println("good job");

        }
        else
        {
            System.out.println("wrong answer");
        }
        
       
    }
}
/*
100
good job
 
200
wrong answer
*/