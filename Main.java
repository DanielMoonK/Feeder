public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        //System.out.println(f.getCurrentFood());
        //int random = (int) ((Math.random() * 40) + 10);
        //System.out.println(random);
        System.out.print(f.simulateManyDays(10, 4));
        System.out.println(" run days.");
    }
}