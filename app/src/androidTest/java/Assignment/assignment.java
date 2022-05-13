package Assignment;

public class assignment {
    int roll;
    String name ;
    assignment (String s , int r )
    {
        this.roll = r;
        this.name = s;
    }

    public int getRoll() {
        return roll;
    }
    public void setRoll ( int roll)
    {
        this.roll = roll;
    }
    public void setName ( String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
