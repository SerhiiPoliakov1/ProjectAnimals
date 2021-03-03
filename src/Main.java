public class Main {

    public static void main(String[] args) {
    Animal[] animals = { new Cat("fish","home"),
            new Dog("meat","yard"),
            new Horse("oats","field")};

    Veterinarian veterinarian =  new Veterinarian();
        for (Animal animal: animals) {
            System.out.println( animal.getType());
            veterinarian.treatAnimal(animal);
            System.out.println("______________________");
        }
    }
    }
