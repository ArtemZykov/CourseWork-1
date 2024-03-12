import java.util.Objects;

public class Employee {
    private String FullName;
    private double salary;
    private int otdel;
    private int id;
    private static int idCount = 1; // для подсчета ID

    public Employee (String FullName, int otdel, double salary) {
        //this.name = name;
        //this.surname = surname;
        //this.midname = midname;
        this.FullName = FullName;
        this.salary = salary;
        this.otdel = otdel;
        this.id = idCount++;
    }
    public String getFullNameName() {
        return FullName;
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

    public static int getIdCount() {
        return idCount;
    }
    //}
    //public String getSurname() {
        //return surname;
    //}
    //public String getMidname() {
        //return midname;
    //}

    //public doble getSalary() {
      //  return salary;
    //}
    //public int getOtdel() {
      //  return otdel;
    //}
    //public int getId() {
      //  return id;
    //}
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public String toString() {
        return " " +
                "Сотрудник: " + FullName + " " +
                //", surname='" + surname + '\'' +
                //", midname='" + midname + '\'' +
                ", департамент: " + otdel +
                ", зарплата: " + salary +
                ", таб.номер: " + id ;
    }
    public String printFullName() {
        return " " +  "Сотрудник: " + FullName ;
               // ", surname='" + surname + '\'' +
                //", midname='" + midname + '\'' +

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && otdel == employee.otdel && id == employee.id && Objects.equals(FullName, employee.FullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FullName, salary, otdel, id);
    }
}


