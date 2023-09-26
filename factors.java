public class factors
{
    private double tempurature;
    public int cust;

    public void popularity()
    {

    }

    public void temp()
    {
        tempurature = 100 * java.lang.Math.random();
        System.out.print("Today it is ");
        System.out.printf("%.2f", tempurature);
        System.out.println("° F.");
    }
}
