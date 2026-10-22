public class Animal {
private String name;




    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }

    public Animal(String name){
        this.name = name;

    }

    void makeSound(){



    }





    public void showAnimalInfo(){
        System.out.println("----------------------------------------");
        System.out.println("Animal name is: " + name);
    }






}
