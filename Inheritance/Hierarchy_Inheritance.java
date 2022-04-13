//Hierarchy inheritance 
//parent class is inherted in two different classes 
//two different classses are having different objects to call them  
class Colg
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

 class Stud_1 extends Colg
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

class result extends Colg
{
String rname;

void getvalue(String rm)
{
rname=rm;
}
void putname()
{
    System.out.println("Result :"+rname);
}
}

public class Hierarchy_Inheritance  {
    public static void main(String[] args)
    {
    Stud_1 s1= new Stud_1();
    s1.input("Pallotti",1284);
    s1.getdata("Priya Mishra",31);
    s1.output();
    s1.putdata();
     
     result r1 = new result(); //parent class is also extended in this result
      r1.getvalue("Pass");     // but it is already printed in stud class so 
      r1.putname();               // no need to print again .
    
    }
}


