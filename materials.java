import java.util.Scanner;

public class materials
{
    public double priceCups = 0.03;
    public double priceIce = 0.01;
    public double priceLemons = 0.08;
    public double priceSugar = 0.08;
    public int numCups;
    public int numIce;
    public int numLemons;
    public int numSugar;
    //public double money;
    public void shopping(double money)
    {
        System.out.println("Welcome to the materials shop! Today you start with $" + money + ". Please use it wisely!");
        System.out.print("How many cups would you like to buy? ($0.03 each)\n\n");
        Scanner num = new Scanner(System.in);
        numCups = num.nextInt();
        System.out.print("How much ice would you like to buy? ($0.01 each)\n\n");
        numIce = num.nextInt();
        System.out.print("How many lemons would you like to buy? ($0.08 each)\n\n");
        numLemons = num.nextInt();
        System.out.print("How many cups of sugar would you like to buy? ($0.08 each)\n\n");
        numSugar = num.nextInt();
        money = money - ((priceCups * numCups) + (priceIce * numIce) + (priceLemons * numLemons) + (priceSugar * numSugar));
    } 
}