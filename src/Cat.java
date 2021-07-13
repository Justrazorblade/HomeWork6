public class Cat extends Animal{
    static int catCounter;
    public Cat(float maxRunDistance, float maxSwimDistance){
        super(maxRunDistance, maxSwimDistance);
        catCounter++;
    }
    public static int getCatCounter (){
        return catCounter;
    }
    @Override
    public void animalSwim (float swimDistance){
        System.out.println("Дистанция " + swimDistance + " не преодолена");
        System.out.println("Коты не умеют плавать");
    }
}