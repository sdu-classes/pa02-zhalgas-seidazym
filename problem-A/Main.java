public class Main {
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
