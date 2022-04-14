//Copy constructor 

class Number
{
    int a,b;
    public Number(int x,int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        System.out.println(" a = "+a+" b = "+b);
    }
    public Number(Number n)  // need to pass the object as parameter 
    {
        a=n.a;
        b=n.b;
    }
}

public class COPYCONSTRUCTOR {
    public static void main(String[] args) {
        Number n1 = new Number(10,20); // called parameterized constructor
        n1.display();
        Number n2=new Number(n1);  // calling copy constructor
        n2.display();
    }
    
}
