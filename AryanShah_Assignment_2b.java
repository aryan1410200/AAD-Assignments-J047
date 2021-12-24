import java.util.*;
public class Aryan  
{  
public static void main(String[] args)   
{  
Scanner sc = new Scanner(System.in);
int i;
int n = sc.nextInt(); 
int sum = 0;  
//executes until the condition returns true  
for(i = 1; i <= n; ++i)  
{  
//adding the value of i into sum variable  
sum = sum + i;  
}  
//prints the sum   
System.out.println(sum);  
}  
} 