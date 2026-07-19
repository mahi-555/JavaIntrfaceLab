public class Bird extends Animal implements Flyer {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Tweet!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
}