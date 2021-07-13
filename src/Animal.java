public class Animal {
    private float maxRunDistance;
    private float maxSwimDistance;
    static int animalCounter;

    public Animal  (float maxRunDistance, float maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCounter++;
    }
    public void animalSwim(float swimDistance){
        if (swimDistance > maxSwimDistance){
            System.out.println("Заданная дистанция плавания " + swimDistance + " больше максимальной дистанции " + maxSwimDistance + "\n");
        }
        else {
            System.out.println("Удачно проплыл дистаннцию " + swimDistance + "\n");
        }
    }
    public void animalRun(int runDistance){
        if (runDistance > maxRunDistance){
            System.out.println("Заданная дистанция бега " + runDistance + " больше максимальной дистанции " + maxRunDistance + "\n");
        }
        else {
            System.out.println("Удачно пробежал дистаннцию " + maxRunDistance + "\n");
        }

    }

    public static int getAnimalCounter() {
        return animalCounter;
    }
}