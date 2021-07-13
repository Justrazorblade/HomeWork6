public class Main {
    public static void main(String[] args){
        Cat cat = new Cat(200,0);
        Dog dog = new Dog(500, 10);
        Cat cat2 = new Cat(200, 0);
        Dog dog2 = new Dog(500, 10);

        cat.animalRun(300);
        cat.animalSwim(60);

        dog.animalRun(250);
        dog.animalSwim(6);


        cat2.animalRun(100);
        cat2.animalSwim(1);

        dog2.animalRun(600);
        dog2.animalSwim(15);

        System.out.println("Количество животных: " + Animal.getAnimalCounter());
        System.out.println("Количество собак: " + Dog.getDogCounter());
        System.out.println("Количество котов: " + Cat.getCatCounter());
    }
}
