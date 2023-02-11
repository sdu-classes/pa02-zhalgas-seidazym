public class Rectangle extends Shape {
    private double width;
    private double length;
//-----------Constructor---------------
    public Rectangle(){
        this(1.0, 1.0);
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
//------------Getter---------------
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return this.width * 2 + this.length * 2;
    }
//----------Setter----------------
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
//--------ToString---------------
    @Override
    public String toString(){
        return "A Rectangle with width=" + this.width + " and length=" + this.length + ", which is a subclass of " + super.toString();
    }
}
