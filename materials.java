import java.util.Scanner;

public class materials
{
    public double cupPrice = 0.03;
    public int numCups;
    public int numIce;
    public int numLemons;
    public int numSugar;
    //public double money;
    public void shopping(double money)
    {
        System.out.print("How many cups would you like to buy? ($0.03 each)\n\n");
        Scanner num = new Scanner(System.in);
        numCups = num.nextInt();
        System.out.print("How much ice would you like to buy? ($0.01 each)\n\n");
        numIce = num.nextInt();
        System.out.print("How many lemons would you like to buy? ($0.08 each)\n\n");
        numLemons = num.nextInt();
        System.out.print("How many cups of sugar would you like to buy? ($0.08 each)\n\n");
        numSugar = num.nextInt();
    } 
}

