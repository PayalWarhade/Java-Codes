    
import java.util.Scanner;
class digit
{
    public static void main(String[] args) 
    {
    int three_digit, sum;
   
        Scanner sc= new Scanner ((System.in));
        System.out.println("Enter the three digit no: ");
        three_digit = sc.nextInt();
        
        for(sum=0; three_digit!=0; three_digit=three_digit/10)
        {
            sum = sum + three_digit % 10;  
        }
        System.out.println("Sum of digits: "+sum);  
    }
}

