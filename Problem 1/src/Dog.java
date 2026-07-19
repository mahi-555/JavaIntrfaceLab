public class Dog extends Animal implements Swimmer {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Woof!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}