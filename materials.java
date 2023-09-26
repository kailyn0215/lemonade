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
    public double mon;
    public int cou;

    public int perLemons = 0;
    public int perSugar = 0;
    public int perIce = 0;

    public materials(double money, int count)
    {
        mon = money;
        cou = count;
    }

    public void shopping()
    {
        if(cou == 1)
        System.out.println("Welcome to the materials shop! Today you start with $" + mon + ". Please use it wisely!");
        System.out.print("How many cups would you like to buy? ($0.03 each)\n");
        Scanner num = new Scanner(System.in);
        numCups = num.nextInt();
        System.out.print("How much ice would you like to buy? ($0.01 each)\n");
        numIce = num.nextInt();
        System.out.print("How many lemons would you like to buy? ($0.08 each)\n");
        numLemons = num.nextInt();
        System.out.print("How many cups of sugar would you like to buy? ($0.08 each)\n");
        numSugar = num.nextInt();
        mon = mon - ((priceCups * numCups) + (priceIce * numIce) + (priceLemons * numLemons) + (priceSugar * numSugar));
    } 

    public void mix()
    {
        System.out.println("Let's get started with making your perfect recipe!\nYou currently have " + numCups + " cups, " + numIce + " ice, " + numLemons + " lemons, and " + numSugar + " cups of sugar.");
        Scanner blend = new Scanner(System.in);

        do // lemons
        {
            System.out.print("How many lemons would you like to use per pitcher? (Current: " + perLemons + " lemon(s) per pitcher) ");
            perLemons = blend.nextInt();
        }
        while(perLemons > numLemons);

        do // sugar
        {
            System.out.print("How many cups of sugar would you like to use per pitcher? (Current: " + perSugar + " cup(s) of sugar per pitcher) ");
            perSugar = blend.nextInt();
        }
        while(perSugar > numSugar);

        do // ice
        {
            System.out.print("How many ice cubes would you like to use per glass? (Current: " + perIce + " cup(s) of sugar per pitcher) ");
            perIce = blend.nextInt();
        }
        while(perIce > numIce);
    }
}
