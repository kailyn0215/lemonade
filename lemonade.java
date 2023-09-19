public class lemonade 
{
    public int days;
    public int count;
    public static void main(String[] args)
    {
        System.out.println("How many days would you like to play?");
        Scanner day = new Scanner(System.in);
        days = day.nextInt();
        count = 1;
        materials start = new materials();
        while (count == 1)
            {
                start.shopping(20);
            }
        
        
    }   
}
