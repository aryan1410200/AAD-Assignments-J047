import java.util.*;
class AryanShah_Assignment_2
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int r = 0;
        while(n != 0)
        {
            int re = n % 10;  
            r = r * 10 + re;  
            n = n/10; 
        }
        System.out.println(r);
    }
}