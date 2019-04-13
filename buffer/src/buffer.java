import java.util.Scanner;




 class buffer {
 public static void main(String args[])

 {
 
int x,y,z;
System.out.println("enter three integers ");
Scanner in = new Scanner(System.in);
 
x = in.nextInt();
y =in.nextInt();
z = in.nextInt();
if(x>y&&x>z)
    System.out.println("x is large no"+x+"");
 else
    if(y>z&&y>x)
            System.out.println("y is large no"+y+"");
else
        if(z>x&&z>y)
     System.out.println("z is large no"+z+"");

else
              System.out.println("no. are same");
 
 }
    
    
}
