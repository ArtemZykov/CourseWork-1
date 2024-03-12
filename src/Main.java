public class Main {
    public static void main(String[] args) {
        Book employee = new Book();
        employee.printAllEmp();
        System.out.println("Фонд отплаты труда: " + employee.calculateAllSal());
        System.out.println("Сотрудник с минимальной зарплатой: " + employee.calculateMinEmp());
        System.out.println("Сотрудник с максимальной зарплатой: " + employee.calculateMaxEmp());
        System.out.println("Средняя зарплата офиса: " + employee.calculateMediumSal());
        employee.printFullName();
        System.out.println(employee.hashCode());
        System.out.println(employee.equals(5));

    }
}