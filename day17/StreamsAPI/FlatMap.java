import java.util.*;

import java.util.stream.Stream;
public class FlatMap {
    

    public static void main(String args[]){
        ArrayList<String> ar=new ArrayList<String>();
        ar.add("suchithra is a good girl ");
        ar.add("vasanth is studying btech ");
        ar.add("kavitha is a housewife ");
        ar.add ("durgesh is working ");
        //Stream<String> temp=ar.stream();
        ar.stream().flatMap(e->Stream.of(e)).forEach(System.out::print);
}
}
/* 
output:
--------
suchithra is a good girl vasanth is studying btech kavitha is a housewife durgesh is working 
*/
