//Single Inheritance : sub class inherits the properties of the parent class 

class College
{
    String name;
    int regno;
    void input(String nm, int rn)
    {
        name=nm;
        regno=rn;
    }
    void output()
    {
        System.out.println("College Name is "+name+" Regno is "+regno);
    }
}

class Student1 extends College
{
    String sname;
    int rollno;
    void getdata(String snm, int rn)
    {
        sname=snm;
        rollno=rn;
    }
    void putdata()
    {
        System.out.println("Student Name is "+sname+" Roll No is "+rollno);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.input("VNIIT", 222);
        s1.getdata("Payal", 101);
        s1.output();
        s1.putdata();
    }
    
}
