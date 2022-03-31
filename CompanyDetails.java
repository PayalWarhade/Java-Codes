// Constructor 
//

class Main 
{
    String name ;
    int Regno;

Main(String n, int rn)
{
    name = n;
    Regno = rn;
}
void output ()
{
 System.out.println("Name="+name);
 System.out.println("RegNo="+Regno);
}
}
public class CompanyDetails {
    public static void main(String[] args) {
        Main c= new Main("TCS",101);
        c.output();
    }
   
}
