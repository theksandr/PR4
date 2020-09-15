public class Human
{
    private String name;
    private int age;

    public static class Head
    {
        private String colour, pitch;

        public Head(String c, String p)
        {
            colour = c;
            pitch = p;
        }

        public void setColour(String colour)
        {
            this.colour = colour;
        }

        public void setPitch(String pitch)
        {
            this.pitch = pitch;
        }

        public String getColour()
        {
            return colour;
        }

        public String getPitch()
        {
            return pitch;
        }
    }

    public static class Leg
    {
        private int length, toes;
        public Leg(int l, int t)
        {
            length = l;
            toes = t;
        }

        public void setLength(int length)
        {
            this.length = length;
        }

        public void setToes(int toes)
        {
            this.toes = toes;
        }

        public int getLength()
        {
            return length;
        }

        public int getToes()
        {
            return toes;
        }
    }

    public static class Hand
    {
        private String skin;
        private int fingers;
        public Hand(String s, int f)
        {
            skin = s;
            fingers = f;
        }

        public void setSkin(String skin)
        {
            this.skin = skin;
        }

        public void setFingers(int fingers)
        {
            this.fingers = fingers;
        }

        public String getSkin()
        {
            return skin;
        }

        public int getFingers()
        {
            return fingers;
        }
    }

    public Human()
    {
       Head head = new Head("black", "medium");
       Leg leg = new Leg(120, 5);
       Hand hand = new Hand("white", 5);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}
