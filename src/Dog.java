public class Dog extends Animal{

    public Dog(String food, String location) {
        super(food, location);
    }
    final private String type = "DOG";

    public String getType() {
        return type;
    }

    @Override
    public void makeNoice() {
        System.out.println("Woof woof woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleep ....");
    }
}
