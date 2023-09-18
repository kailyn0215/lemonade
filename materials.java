import java.util.Scanner;

public class materials
{
    public double cupPrice = 0.03;
    public int cups;
    public void shopping(String yes)
    {
        System.out.print("How many cups would you like to buy? ($0.03 Each)\n\n");
        Scanner num = new Scanner(System.in);
        cups = num.nextInt();
        System.out.print("How much ice would you like to buy?\n- 25 for $0.90\n- 50 for $1.70\n- 100 for $2.76\n\n");
    } 
}

