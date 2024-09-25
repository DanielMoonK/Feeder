public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        f.simulateOneDay(12);
        Feeder g = new Feeder(1000);
        g.simulateOneDay(22);
        Feeder h = new Feeder(100);
        h.simulateOneDay(5);
        
        Feeder x = new Feeder(2400);
        System.out.println(x.simulateManyDays(10, 4);
        Feeder y = new Feeder(250);
        System.out.println(y.simulateManyDays(10, 5);
        Feeder z = new Feeder(0);
        System.out.println(z. simulateManyDays(5, 10);
    }
}
