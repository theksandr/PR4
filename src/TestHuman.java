public class TestHuman
{
    public static void main(String[] args)
    {
        Human.Head head = new Human.Head("black", "medium");
        Human.Leg leg = new Human.Leg(120, 5);
        Human.Hand hand = new Human.Hand("white", 5);
        Human hum = new Human();
        System.out.println("hair colour "+head.getColour()+", voice pitch "+head.getPitch());
        System.out.println("leg length "+leg.getLength()+", toes count "+leg.getToes());
        System.out.println("skin colour "+hand.getSkin()+", finger count "+hand.getFingers());
        
    }
}
