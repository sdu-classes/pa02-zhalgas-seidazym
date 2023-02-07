public class Circle extends Shape {
    private double radius;

//-------Constructor----------
    public Circle(){
        this(1.0);
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
//-------Getter---------------
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getPerimeter(){
        return 2 * this.radius * Math.PI;
    }
//-------Setter--------------
    public void setRadius(double radius){
        this.radius = radius;
    }
//-------ToString---------
    @Override
    public String toString(){
        return "Circle[" + super.toString() + ",radius=" + this.radius + "]";
    }
}
