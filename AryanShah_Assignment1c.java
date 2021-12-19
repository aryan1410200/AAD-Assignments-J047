import java.io.*;
import java.util.*;
class AryanShah_Assignment1c
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long n,p,x,c=0,i,rev,sum=0;
        System.out.println("Enter a Number");
        n= in.nextLong();
        p=n;
        x=n;
        while(p>0)
        {
            p=p/10;
            c++;
        }
        if(c!=10)
        {
            System.out.println("Not an ISBN Number : "+n);
        }
        else
        {
            while(x>0)
            {
                rev=x%10;
                sum=sum+(rev*c);
                x=x/10;
                c--;
            }
            /*for(i=10;i>=1;i--)
            {
                rev=x%10;
                sum=sum+(rev*i);
                x=x/10;
            }*/
            if(sum%11==0)
            {
                System.out.println("Valid ISBN Number");
            }
            else
            {
                System.out.println(" Not a Valid ISBN Number");
            }
        }
    }
}