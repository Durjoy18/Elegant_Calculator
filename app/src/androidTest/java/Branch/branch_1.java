package Branch;

public class branch_1 {
    String name , id ;
    float mark;
    int number_classes;
    double income;

    public branch_1(String name, String id, float mark, int number_classes, double income) {
        this.name = name;
        this.id = id;
        this.mark = mark;
        this.number_classes = number_classes;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setNumber_classes(int number_classes) {
        this.number_classes = number_classes;
    }

    public int getNumber_classes() {
        return number_classes;
    }



    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public float getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
}
