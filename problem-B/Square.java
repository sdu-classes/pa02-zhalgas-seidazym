public class Square extends Rectangle {
//------------Constructor----------
    public Square(){
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
//------------Getter------------
    public double getSide(){
        return super.getLength();
    }
//------------Setter--------
    public void setSide(double side){
        super.setLength(side); 
        super.setWidth(side);
    }
    @Override
    public void setWidth(double width){
        super.setWidth(width);
        super.setLength(width);
    }
    @Override
    public void setLength(double length){
        super.setWidth(length);
        super.setLength(length);
    }
//---------------ToString---------------
    @Override
    public String toString(){
        return "A Square with side=" + this.getSide() + ", which is a subclass of " + super.toString();
    }
}
