import java.util.*;
public class AryanShah_Assignment2j    
{    
    public static void main(String[] args) 
    {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String string = sc.nextLine();
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) 
        {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println(count);    
    }    
}     