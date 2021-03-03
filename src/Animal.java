public abstract class  Animal {

    private String food;
    private String location;


    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public abstract String getType();
    public abstract void makeNoice();
    public abstract void eat();
    public abstract void sleep();

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
