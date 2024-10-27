package task4;

public class Rectangle extends Shape{
    private int length;
    private int width;

    //martkutxedis konstruqtori
    public Rectangle(int length, int width){
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    public Rectangle(int side){
        this(side,side);
    }
    public void area(){
        int area = length*width;
        System.out.println(area);
    }
}
