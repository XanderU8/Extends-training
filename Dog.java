public class Dog extends Animal{



    public Dog(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("Haw-Haw");
    }

    public void showDogInfo(){
        System.out.println("----------------------------");
        System.out.println("Animal type is: " + getName());

    }


}