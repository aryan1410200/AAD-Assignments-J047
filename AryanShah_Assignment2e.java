import java.util.*;
public class AryanShah_Assignment2e
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int row = sc.nextInt();
        for(int i=0; i<=row; i++)   
        {   
            for(int j=1; j<=i; j++)   
            {   
               System.out.print(j);   
            }   
            System.out.println();   
        }
    }
}