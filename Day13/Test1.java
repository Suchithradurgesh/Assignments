import java.util.regex.*;
import java.io.*;
public class Test1{
    public static void main(String args[]){
        final String REGEX_PATTERN ="fooa*bar";
        Pattern r=Pattern.compile(REGEX_PATTERN);
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\suchi\\Assignments\\Day13\\data1.txt"));
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

foobar
fooaaaabar
fooaabar
fooaaaabar

*/