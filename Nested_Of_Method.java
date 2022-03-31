// nested of method : we have to call one method into the other so that we 
//dont need to call previous method separately .

import java.util.Scanner;


class Stud
{
    int rollno;
    String name;
    float per;
    void input()
    {
        Scanner sc = new Scanner((System.in));
         System.out.println("Enter Name ");
        name=sc.nextLine();
        System.out.println("Enter RollNo and Percentage Students ");
        rollno=sc.nextInt();
        per=sc.nextFloat();
       
    }
    void output()
            
    {
        input(); //nested of method 
        System.out.println("My Name is "+name);
        System.out.println("Roll No is "+rollno);
        System.out.println("Percentage is "+per);
    }
}


public class Nested_Of_Method {
    public static void main(String[] args) {
        Stud s = new Stud();
        s.output();
    }
    
}
    

