import java.util.*;
import java.util.stream.Stream;
public class ToArray {
    

    public static void main(String args[]){
        ArrayList<String> ar=new ArrayList<String>();
        ar.add("suchithra");
        ar.add("vasanth");
        ar.add("kavitha ");
        ar.add ("durgesh");  
        Stream<ArrayList<String>> list=Stream.of(ar);
        Object[] arr=list.toArray();
        System.out.println(Arrays.toString(arr));    
}
}
/*
output:
-------

[[suchithra, vasanth, kavitha , durgesh]]


*/
