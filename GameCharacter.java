public class GameCharacter {
private int health;
private String nameHero;



int getHealth(){
    return health;
}

void setHealth(int health){
    this.health = health;
}

String getNameHero(){
    return nameHero;
}
void setNameHero(String nameHero){
    this.nameHero = nameHero;
}

  public GameCharacter(String nameHero, int health){
    this.nameHero = nameHero;
    this.health = health;

}

public void showInfo(){
    System.out.println("-------------------------");
    System.out.println("Name is: " + nameHero);
    System.out.println("Health is: " + health);
}
}
