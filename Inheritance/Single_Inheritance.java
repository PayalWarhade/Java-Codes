//Inheritance : sub class acquires all the properties of the parent class .
// Here Company1 is the parent class and employee is sub class.
//by using the object of sub class we can also call the parent class .

class company1
{
    String cname;
    int regno;
    void input (String cnm , int rgn)
{
    cname = cnm;
    regno = rgn;
}
    void output()
    {
        System.out.println("Company name :"+cname+"\n Reg.no :"+regno);
    } 
}
 class employee extends company1
 {
 String ename;
 int salary;
 void getdata(String enm , int sal)
 {
 ename =enm ;
 salary = sal;
 }
 void putdata()
 {
     System.out.println("Employee name :"+ename+"\n Salary"+salary);
 }
 }
               
public class Single_Inheritance {
    public static void main(String[] args) 
    {
      employee e1 = new employee( );
        e1.input("TCS", 123);
        e1.getdata("PRIYA", 10000);
        e1.output();
        e1.putdata();
    }
}
