public class Employee {
    private String name;
    private String surname;
    private String midname;
    private double salary;
    private int otdel;
    private int id;
    private static int idCount = 1; // для подсчета ID

    public Employee(String name, String surname, String midname, int otdel, double salary) {
        this.name = name;
        this.surname = surname;
        this.midname = midname;
        this.salary = salary;
        this.otdel = otdel;
        this.id = idCount++;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getMidname() {
        return midname;
    }
    public double getSalary() {
        return salary;
    }
    public int getOtdel() {
        return otdel;
    }
    public int getId() {
        return id;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", midname='" + midname + '\'' +
                ", otdel=" + otdel +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
    public String printFullName() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", midname='" + midname + '\'' +
                '}';
    }

}
