import java.util.*;
public class AryanShah_Assignment2f
{    
 public static void main(String args[])
 {    
  int i,a=0,c=0;      
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number");
  int n = sc.nextInt();//it is the number to be checked    
  a=n/2;      
  if(n==0||n==1)
  {  
   System.out.println(n+" is not a prime number");      
  }
  else
  {  
   for(i=2;i<=a;i++)
   {      
    if(n%i==0)
    {      
     System.out.println(n+" is not a prime number");      
     c=1;      
     break;      
    }      
   }      
   if(c==0)  
   { 
       System.out.println(n+" is a prime number"); 
   }
  }//end of else  
}    
}   