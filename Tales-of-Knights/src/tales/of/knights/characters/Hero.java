/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tales.of.knights.characters;

/**
 *
 * @author Emiva
 */
public class Hero extends Fighter{
    public String title;
    public int fame;
    public int money;
    private int currentWeapon;
    private int currentArmor;
    private String[] itemBag;
    
    public void buy(int price, String item){
        boolean isFull = isBagFull();
        if(this.money < price){
            System.out.println("You can't afford that now");
        } else if(isFull){
            System.out.println("Your bag is full right now");
        }
        else{
            this.money = this.money - price;
            System.out.println("You bought " + item );
        }
    }
    
    public Hero(){
        super();
        this.title = "Brave";
        this.fame = 0;
        this.money = 20;
        this.currentWeapon = 15;
        this.currentArmor = 10;
        this.itemBag = new String[8];
    }
    
    public Hero(String name, int maxHealth, int power, String title, int fame, int money, int currentWeapon, int currentArmor){
        super(name, maxHealth, power);
        this.title = title;
        this.fame = fame;
        this.money = money;
        this.currentWeapon = currentWeapon;
        this.currentArmor = currentArmor;
        this.itemBag = new String[8];
    }
    
    @Override
    public void attack(){
        System.out.println("You deal " + (this.power + this.currentWeapon) + " points of damage");
    }
    
    @Override
    public void takeDamage(int damage){
        if (damage < this.currentArmor){
            System.out.println("You take no damage");
        }else{
            int totalDamage = damage - currentArmor; 
            this.currentHealth = this.currentHealth - totalDamage;
            System.out.println("You take " + totalDamage + " points of damage");
        }
        
    }
    
    @Override
    public void die(){
        System.out.println("You have died");
    }
    
    public void equipWeapon(int newWeapon){
        this.currentWeapon = newWeapon;
        System.out.println("You equip the " + newWeapon);
    }
    
    public void equipArmor(int newArmor){
        this.currentArmor = newArmor;
        System.out.println("You equip the " + newArmor);
    }
    
    public void sell(int value, String item){
        this.money = this.money + value;
    }
    
    public void sleep(){
        this.currentHealth = this.maxHealth;
        System.out.println("You get a peaceful rest, HP restablished");
    }
    
    public void escape(){
        System.out.println("You run away");
    }
    
    private boolean isBagFull(){
        for(String item : this.itemBag){
            if(item == null){
                return true;
            }
        }
        return false;
    }
}
