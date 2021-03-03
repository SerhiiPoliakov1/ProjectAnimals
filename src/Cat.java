public class Cat extends Animal{
    public Cat(String food, String location) {
        super(food, location);
    }

    public String getType() {
        return type;
    }

    final private String type = "CAT";
    @Override
    public void makeNoice() {
        System.out.println("meow meow meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating..." + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleep...");
    }
}
