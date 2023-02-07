public class Cat extends Mammal {
//------------Constructor---------
    public Cat(String name){
        super(name);
    }
//-----------Method------------
    public void greets(){
        System.out.println("Meow");
    }
//-----------ToString-----------
    @Override
    public String toString(){
        return "Cat[" + super.toString() + "]";
    }
}
