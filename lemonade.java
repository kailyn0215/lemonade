import java.util.Scanner;

public class lemonade 
{
    
    public static void main(String[] args)
    {
        int days;
        int count;

        System.out.print("How many days would you like to play? ");
        Scanner day = new Scanner(System.in);
        days = day.nextInt();
        count = 1;
        materials start = new materials();
        start.shopping(20);
        count = count++;
        
    }   
}
