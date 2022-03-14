import java.util.*;



    public class MinMax {
        public static void main(String args[]){
            ArrayList<Integer> ar=new ArrayList<Integer>();
            ar.add(75673);
            ar.add(75);
            int temp=ar.stream().min((val1,val2)->(val1.compareTo(val2))).get();
            System.out.println("the minimum value is "+temp);
            //for maximum
            int temp1=ar.stream().max((val1,val2)->(val1.compareTo(val2))).get();
            System.out.println("the maximum value is"+temp1);

        }
    }
    /*
    output:
    -------

    the minimum value is 75
    the maximum value is75673
*/

