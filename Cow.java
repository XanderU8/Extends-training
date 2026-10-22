public class Cow extends Animal {



    public Cow(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("Muuu");
    }

    public void showCowInfo(){
        System.out.println("------------------------------------");
        System.out.println("Animal type is: " + getName());
    }



}
