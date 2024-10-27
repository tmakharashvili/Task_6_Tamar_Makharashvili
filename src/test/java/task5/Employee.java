package task5;

public class Employee {
    protected String name;
    protected int salary;

    public void displayDetails() {
        System.out.println(name);
        System.out.println(salary);
    }

        public Employee (String name, int salary){
        this.name = name;
        this.salary = salary;
    }
}
