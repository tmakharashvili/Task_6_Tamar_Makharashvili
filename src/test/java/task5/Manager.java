package task5;

public class Manager extends Employee{
    private String department;

    public Manager(String name, int salary, String department){
        super(name,salary);
        this.department = department;

        // აქ ვერ შევქმენი მეორე displayDetails მეთოდი

    }
}
