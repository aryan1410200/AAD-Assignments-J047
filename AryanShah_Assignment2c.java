import java.util.*;
public class AryanShah_Assignment2c  
{  
public static void main(String args[])   
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int number = sc.nextInt();  
for (int i=1; i<=number; i++)   
{  
//logic to check if the number is even or not  
//if i%2 is equal to zero, the number is even  
if (i%2==0)   
{  
System.out.print(i + " ");  
}  
}  
}  
}  