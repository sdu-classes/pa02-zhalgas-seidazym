public class Shape {
    private String color;
    private boolean filled;

//----------Constructor-------------
    public Shape(){
        this("red" , true);
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

//----------Getter------------------
    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }

//----------Setter-----------------
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
//----------ToString---------------
    @Override
    public String toString(){
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }
}
