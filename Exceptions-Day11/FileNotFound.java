 //PROGRAM USING THROWS KEYWORD---->FILENOTFOUNDEXCEPTION
 
 import java.io.*;
 public class FileNotFound{
     public static void method() throws FileNotFoundException{
    FileReader file=new FileReader("C:\\javaprograms\\abc.txt");
     BufferedReader fileinput =new BufferedReader(file);
    throw new FileNotFoundException();
    }

    public static void main(String args[]){
        try {
            method();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        finally{
        System.out.println("finally block got executed");
        }
    }
 }
 /*
 output:
 --------


 java.io.FileNotFoundException: C:\javaprograms\abc.txt (The system cannot find the file specified)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
        at java.base/java.io.FileReader.<init>(FileReader.java:60)
        at FileNotFound.method(FileNotFound.java:4)
        at FileNotFound.main(FileNotFound.java:11)
finally block got executed

*/
