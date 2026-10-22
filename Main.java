import java.time.Year;
import java.util.concurrent.Callable;

class Main{
    public static void main(String[] args) {

            Cat cat1 = new Cat("Cat");
            Dog dog1 = new Dog("Dog");
            Cow cow1 = new Cow("Cow");

            cat1.showCatInfo();
            cat1.makeSound();

            dog1.showDogInfo();
            dog1.makeSound();

            cow1.showCowInfo();
            cow1.makeSound();
    }
}