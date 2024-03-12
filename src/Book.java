public class Book {
    private Employee[] employeesCorp = new Employee[10];

    public Book() {
        employeesCorp[0] = new Employee("Артем", "Сергеевич", " Артемьев", 1, 200000);
        employeesCorp[1] = new Employee("Бобр", "Арутутян", "Бобрико", 2, 190000);
        employeesCorp[2] = new Employee("Владимир", "Владимирович", "Нетот", 3, 180000);
        employeesCorp[3] = new Employee("Геннадий", "Геннадьевич", "Геннадьев", 4, 170555);
        employeesCorp[4] = new Employee("Дмитрий", "Дмитриевич", " Демонов", 5, 159999);
        employeesCorp[5] = new Employee("Егор", "Егорович", "Егорьев", 1, 123000);
        employeesCorp[6] = new Employee("Жора", "Жорикович", "Жоркин", 2, 112298);
        employeesCorp[7] = new Employee("Зебрв", "Зебрович", "Зебрин", 3, 110123);
        employeesCorp[8] = new Employee("Игорь", "Игоревич", "Игоркин", 4, 105093);
        employeesCorp[9] = new Employee("Клим", "Климович", "Клименко", 5, 101234);
    }

    public void printAllEmp() {
        for (Employee employee : employeesCorp) {
            System.out.println(employee);
        }
    }

    public double calculateAllSal() {
        double salaries = 0;
        for (Employee employee : employeesCorp) {
            salaries += employee.getSalary();
        }
        return salaries;
    }
    public Employee calculateMinEmp() {
        Employee calculateMinEmp = employeesCorp[0];
        for (Employee employee : employeesCorp) {
            if (employee.getSalary() < calculateMinEmp.getSalary()) {
                calculateMinEmp = employee;
            }
        }
        return calculateMinEmp;
    }

    public Employee calculateMaxEmp() {
        Employee calculateMaxEmp = employeesCorp[0];
        for (Employee employee : employeesCorp) {
            if (employee.getSalary() > calculateMaxEmp.getSalary()) {
                calculateMaxEmp = employee;
            }
        }
        return calculateMaxEmp;
    }
    public double calculateMediumSal() {
        double allSal = calculateAllSal();
        return  allSal / employeesCorp.length;
    }
    public void  printFullName() {
        for (Employee employee : employeesCorp) {
            System.out.println(employee.printFullName());
        }
    }







}
