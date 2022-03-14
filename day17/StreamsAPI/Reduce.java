import java.util.*;
    public class Reduce {
        public static void main(String args[]){
            ArrayList<Integer> ar=new ArrayList<Integer>();
            ar.add(7);
            ar.add(75);
            ar.add(34);
            ar.add(5453);
            ar.add(756);
            int n=ar.stream().reduce(0,(a,e)->a+e);
            System.out.println(n);
        }
    }
    /*
    output:
    -------

    6325

    */

