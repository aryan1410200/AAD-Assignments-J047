import java.util.*;
public class AryanShah_Assignment2l   
{    
public static void main (String args[])   
{    
//Stores the count of punctuation marks    
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string");
String str = sc.nextLine();
int count = 0;    
for (int i = 0; i < str.length(); i++)   
{    
//Checks whether given character is punctuation mark    
if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   
{    
count++;    
}    
}    
System.out.println(count);    
}    
}    