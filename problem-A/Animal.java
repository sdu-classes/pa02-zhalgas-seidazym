public class Animal {
    private String name;

//-----------Constructor--------
    public Animal(String name){
        this.name = name;
    }
//------------ToString---------------
    @Override
    public String toString(){
        return "Animal[name=" + this.name + "]";
    }
}
