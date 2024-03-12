public class Main {
    public static void main(String[] args) {
        Book store = new Book();
        store.printAllEmp();
        System.out.println("Фонд отплаты труда: " + store.calculateAllSal());
        System.out.println("Сотрудник с минимальной зарплатой: " + store.calculateMinEmp());
        System.out.println("Сотрудник с максимальной зарплатой: " + store.calculateMaxEmp());
        System.out.println("Средняя зарплата офиса: " + store.calculateMediumSal());
        store.printFullName();
    }
}