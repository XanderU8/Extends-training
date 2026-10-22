public class Warior extends GameCharacter {

    private int armorField;
    private int damageAmount;


    int getArmorField(){
        return armorField;
    }
    void setArmorField (int armorField){
        this.armorField = armorField;
    }

    int getDamageAmount(){
        return damageAmount;
    }
    void setDamageAmount(int damageAmount){
         this.damageAmount = damageAmount;
    }


    public Warior(String nameHero, int health, int armorField, int damageAmount){
        super(nameHero,health);
        this.armorField = armorField;
        this.damageAmount = damageAmount;
    }



    public void Attack(){
        System.out.println("----------------------------------------------------");
        System.out.println("Name hero is: " + getNameHero() + "\nHealth is: " + getHealth());
        System.out.println("The armor quality is: " + armorField);
        System.out.println("Damage amount is: " + damageAmount);


    }



    }

