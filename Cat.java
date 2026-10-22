public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    @Override
        void makeSound(){
            System.out.println("Meow-Meow");
        }

    public void showCatInfo(){
        System.out.println("--------------------------------");
        System.out.println("Animal type is: " + getName());
    }

}


