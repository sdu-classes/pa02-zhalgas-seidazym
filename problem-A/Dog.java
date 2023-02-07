public class Dog extends Mammal {
 //------------Constructor---------
     public Dog(String name){
            super(name);
        }
//-----------Method------------
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog dog){
        System.out.println("Woooof");
    }
//-----------ToString-----------
    @Override
    public String toString(){
        return "Dog[" + super.toString() + "]";
    }
}
    
