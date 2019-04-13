import java.util.Scanner;
public class anu1 {
    
    public static void main(String args[])
            
    {  int a,b,c;
            System.out.println("enter three numbers");
            Scanner nu =new Scanner(System.in);
                    a = nu.nextInt();
                   b = nu.nextInt();
                    c = nu.nextInt();
                    
             if(a>=b && a>=c)
             { System.out.println("first no. is largest");}
    else
                 if(b>=a && b>=c)
            { System.out.println("second no. is largest");}
                 else 
                 
                     if(c>=a && c>=b)
                     {System.out.println("third no. is largest");} 
                 
                 
    else
                     {System.out.println("error");}
}
}