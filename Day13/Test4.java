//example program to print regex using the character class


import java.util.regex.*;
import java.io.*;
public class Test4{
    public static void main(String args[]){
        final String REGEX_PATTERN ="foo[a-cl-np-t]bar";
        Pattern r=Pattern.compile(REGEX_PATTERN);
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\suchi\\Assignments\\Day13\\data4.txt"));
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

fooabar
foolbar
foopbar
fooqbar
foorbar
foosbar
footbar
foobbar
foocbar
foombar
foonbar

*/
