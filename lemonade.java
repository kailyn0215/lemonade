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
        materials start = new materials(20, 1); //start with $20 on day 1
        factors factor = new factors();
        while(count <= days)
        {
            factor.temp();
            start.shopping();
            count++;
        }
    }   
}
