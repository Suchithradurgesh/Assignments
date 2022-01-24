// example program for regex pattern using  wild card symbol and expand set


import java.util.regex.*;
import java.io.*;
public class Test2{
    public static void main(String args[]){
        final String REGEX_PATTERN ="foo.+bar";
        Pattern r=Pattern.compile(REGEX_PATTERN);
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\suchi\\Assignments\\Day13\\data2.txt"));
            String line;
            while((line=br.readLine()) != null){
                Matcher m=r.matcher(line);
                if(m.find())
                      System.out.println(line);
            }
            br.close();
        }
        
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
/*

output:
-------

foocbar
foorbar
fooobar
foowbar
foo2bar
foo@bar
foo333bar
foo@@@@@@bar
foouuubar
foottbar

*/