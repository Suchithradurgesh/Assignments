
//example program on regex pattern using white space character

import java.util.regex.*;
import java.io.*;
public class Test3{
    public static void main(String args[]){
        final String REGEX_PATTERN ="foo\s*bar";
        Pattern r=Pattern.compile(REGEX_PATTERN);
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\suchi\\Assignments\\Day13\\data3.txt"));
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
--------

foo  bar
foo bar
foobar
foo      bar

*/