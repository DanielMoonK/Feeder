public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        //System.out.println(f.getCurrentFood());
        //int random = (int) ((Math.random() * 40) + 10);
        //System.out.println(random);
        f.simulateOneDay(10);
    }
}