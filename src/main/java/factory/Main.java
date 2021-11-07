package factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = createAnimalByType("snake");
        Animal animal = animalFactory.createAnimal();

        animal.makeNoise();
    }

    static AnimalFactory createAnimalByType (String type){
        if (type.equalsIgnoreCase("cat")){
            return new CatAnimalFactory();
        }else if (type.equalsIgnoreCase("dog")){
            return new DogAnimalFactory();
        }else {
            throw new RuntimeException(type + " is unknown animal.");
        }
    }
}
