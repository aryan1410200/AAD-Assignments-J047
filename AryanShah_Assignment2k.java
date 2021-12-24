import java.util.*;
public class AryanShah_Assignment2k 
{    
    public static void main(String[] args) 
    {    
            
        //Counter variable to store the count of vowels and consonant    
        int vc = 0, cc = 0;    
            
        //Taking input for string    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
            
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) 
        {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
            {    
                //Increments the vowel counter    
                vc++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
            {      
                //Increments the consonant counter    
                cc++;    
            }    
        }    
        System.out.println("Number of vowels: " + vc);    
        System.out.println("Number of consonants: " + cc);    
    }    
}   