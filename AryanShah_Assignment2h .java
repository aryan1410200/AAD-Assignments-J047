public class AryanShah_Assignment2h 
{  
    public static void main(String[] args) 
    {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        for (int i = 0; i < arr.length; i++) 
        {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  