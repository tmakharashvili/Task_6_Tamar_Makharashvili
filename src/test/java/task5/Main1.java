package task5;

public class Main1 {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 3000);
        Manager manager = new Manager("Mary", 5000, "tech");

        employee.displayDetails();
        manager.displayDetails();
    }
}
