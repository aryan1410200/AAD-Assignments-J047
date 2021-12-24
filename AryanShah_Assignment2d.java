import java.util.*;
public class AryanShah_Assignment2d
{  
 public static void main(String args[])
 {  
  Scanner sc = new Scanner(System.in);
 System.out.println("Enter a number");
  int n = sc.nextInt();
   int i,f=1; //It is the number to calculate factorial    
  for(i=1;i<=n;i++){    
      f=f*i;    
  }    
  System.out.println(f);    
 }  
}  