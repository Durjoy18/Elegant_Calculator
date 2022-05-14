package Assignment;

public class assignment {
    int roll;
    String name ;
    int phone;

    public assignment(int roll, String name, int phone) {
        this.roll = roll;
        this.name = name;
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
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
