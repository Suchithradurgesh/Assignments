import java.util.Scanner;
 class Replace {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();    
        String result="suchithra";
        System.out.println(str.replace(result,"shreya"));
        System.out.println(str.replace("good","bad"));
        String replaceall=str.replaceAll("a","@");
        System.out.println(replaceall);
        sc.close();
    }    
}
//output:
//------
//suchithra is a good girl
//shreya is a good girl
//suchithra is a bad girl
