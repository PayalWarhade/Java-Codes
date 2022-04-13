//Multiple Inheritance 
//Here parent class is College then stud is sub class which inhert the properties
  // of college and the result(sub derived class) is also the sub class which inherit 
  // the properties of sub class .
//so the object should be created for the result class 
class college 
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
        System.out.println("College name :"+cname+"\n Reg.no :"+regno);
    } 
}
 class stud extends college
 {
 String sname;
 int rollno;
 void getdata(String snm , int rn)
 {
 sname =snm ;
 rollno = rn;
 }
 void putdata()
 {
     System.out.println("Student name :"+sname+"\n Roll no."+rollno);
 }
 }
class Result extends stud 
{
String rname;

void getvalue(String rm)
{
rname=rm;
}
void putname()
{
    System.out.println("Result name is "+rname);
}
}
public class Multiple_Inheritance {
    public static void main(String[] args) 
    {
      Result r1 = new Result();
        r1.input("Pallotti",1284);
        r1.getdata("PRIYA",30);
        r1.output();
        r1.putdata();
        r1.getvalue("Pass");
        r1.putname();
    
    }
}

