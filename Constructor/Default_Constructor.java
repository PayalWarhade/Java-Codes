// Constructor 
// constructor name is same as the class name .
// no return type , so does not return anything .
//*invoke automatically when we create the object of the same class .

class company            //Class name 
{
    String name ;
    int Regno;

public company()         //No retun type needed //constructor name=class name 
{
    name = "TCS";
    Regno = 109;
}
void output ()           // method name
{
 System.out.println("Name="+name);
 System.out.println("RegNo="+Regno);
}
}
public class Default_Constructor {
    public static void main(String[] args) 
    {
        company c= new company();               // object creation
        c.output();                             // object for output method 
    }                                 //input method is public, ivoke itself 
   
}

    

