import java.util.*;
public class Count {
    public static void main(String args[]){
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(12);
        ar.add(645);
        ar.add(6564);
        ar.add(76);
        ar.add(98);
        long count=ar.stream().count();
        System.out.println("The count is "+count);
    }
}
/*
output:
--------
The count is 5
*/
