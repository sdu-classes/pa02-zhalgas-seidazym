public class All{
  public static void main(String[] args) {
        Animal animal = new Animal("Monkey");
        System.out.println(animal);

        Mammal mammal = new Mammal("Whale");
        System.out.println(mammal);

        Dog dog = new Dog("Dog");
        dog.greets();
        dog.greets(dog);
        System.out.println(dog);

        Cat cat = new Cat("cat");
        cat.greets();
        System.out.println(cat);
    }
}


class Animal {
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


class Mammal extends Animal {
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


class Dog extends Mammal {
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

class Cat extends Mammal {
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
