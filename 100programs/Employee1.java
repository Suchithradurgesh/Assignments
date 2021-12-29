import java.util.Scanner;
 class Employee{
    String name;
    int employeeid;
    String designation;
    public  Employee(String name,int employeeid,String designation){
        this.name=name;
        this.employeeid=employeeid;
        this.designation=designation;
    }
}
     public class Employee1{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Employee list[]=new Employee[n];
    for(int i=0;i<n;i++){
        System.out.println("enter employ id");
        int employeeid=sc.nextInt();
        System.out.println("enter employ name");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("enter employ designation");
        String designation=sc.nextLine();
        Employee e=new Employee(name,employeeid,designation);
        list[i]=e;
      }
      System.out.println("enter id to search");
      int search=sc.nextInt();
      for(Employee e:list){
          if(e.employeeid==search){
              System.out.println("match found");
              System.out.println("employee name:" +e.name);
              System.out.println("employee id:"+e.employeeid);
              System.out.println("employee designation:"+e.designation);

          }
      }
      sc.close();
    }
 }
 /*
 output:
 --------
 3
enter employ id
1
enter employ name
suchithra
enter employ designation
full stack developer
enter employ id
2
enter employ name
viritha
enter employ designation
donkey
enter employ id
3
enter employ name
shreya
enter employ designation
developer
enter id to search
2
match found
employee name:viritha
employee id:2
employee designation:donkey

*/
