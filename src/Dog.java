public class Dog extends Animal{
    static int dogCounter;
    public Dog(float maxRunDistance, float maxSwimDistance){
        super(maxRunDistance, maxSwimDistance);
        dogCounter++;
    }
    public static int getDogCounter() {
        return dogCounter;
    }
}
