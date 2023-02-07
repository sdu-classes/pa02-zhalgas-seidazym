public class Mammal extends Animal {
//-----------Constructor--------------
    public Mammal(String name){
        super(name);
    }
//-----------------ToString------------------
    @Override
    public String toString(){
        return "Mammal[" + super.toString() + "]";
    }
}
