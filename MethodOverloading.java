class shape 
{
    void area (int l , int b)
    {
     System.out.println("Area of Rectangle 0: "+ l*b);
    }
    
    void area (float r)
    {
     System.out.println("Area of Square :"+ 3.14f*r*r);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        {
            shape s= new shape ();
            s.area(5.5f);
            s.area(10,12);
        }
    }
   
}
