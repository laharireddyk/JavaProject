import java.util.Scanner;
public class Datatypes {
	public static void main(String[] args)
	{
int a,b,c;
Scanner sc= new Scanner(System.in);
System.out.println("Enter int numbers");
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
System.out.println("sum of int numbers is" +c);
boolean z;
System.out.println("Enter boolean");
z=sc.nextBoolean();
if(z==true)
	System.out.println("true");
else
	System.out.println("false");
float num;
System.out.println("Enter float number");
num=sc.nextFloat();
System.out.println("float" +num);

	}
}
