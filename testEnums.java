//Testing Enums
public class testEnums
{
    enum Names
    {
        JERRY("Lead Guitar")
        {
            public String sings()
            {
                return "plaintively";
            }
        },
        BOBBY("Rhythm Guitar")
        {
            public String sings()
            {
                return "hoarsely";
            }
        },
        PHIL("Bass");
        private String instrument;
        Names(String instrument)
        {
            this.instrument=instrument;
        }
        public String getInstrument()
        {
            return this.instrument;
        }
        public String sings()
        {
            return "occasionally";
        }
    }
    public static void main(String[] args)
    {
        for(Names n:Names.values())
        {
            System.out.println(n);
            System.out.println("Instrument: "+n.getInstrument());
            System.out.println("Sings "+n.sings());
        }
    }
}
            