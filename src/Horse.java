public class Horse extends Animal{
    public Horse(String food, String location) {
        super(food, location);
    }
    final private String type = "HORSE";

    public String getType() {
        return type;
    }

    @Override
    public void makeNoice() {
        System.out.println(" Igogogoggo");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating..." + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Horse is sleeping...");
    }
}
