public class Car {
    private String model;
    private int year;
    private double price;

//პირველი კონსტრუქტორი (Task2)
    public Car (String model, int year, double price){
        if (year < 2000 || year > 2024){
            System.out.println("year should be between 2000 and 2024");
            return;
        }
        if (price<0){
            System.out.println("price can not be negative");
            return;
        }
        this.model = model;
        this.year = year;
        this.price = price;
    }
   // Task2 მეორე კონსტრუქტორი
    public Car(String model){
        this(model, 2015,15000);
    }


    public String toString(){
        return "Car[Model:" + model + ", Year:"+year+",Price: $"+price+"]";
    }
    public static void main(String[] args) {
        Car car1 = new Car("BMW X1", 2015, 11000);
        Car car2 = new Car("Porsche Macan", 2017, -18000);
        Car car3 = new Car("Corvette", 2025, 50000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
