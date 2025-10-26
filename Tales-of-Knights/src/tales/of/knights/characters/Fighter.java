/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tales.of.knights.characters;

/**
 *
 * @author Emiva
 */
public class Fighter extends Character implements Agression {
    protected int maxHealth;
    public int currentHealth;
    protected int power;
    
    public Fighter(){
        super();
        this.maxHealth = 100;
        this.currentHealth = 100;
        this.power = 10;
    }
    
    public Fighter(String name, int maxHealth, int power){
        super(name);
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.power = power;
    }
    
    @Override
    public void attack(){
        System.out.println(this.name + " attacks");
    }
    
    @Override
    public void takeDamage(int damage){
        this.currentHealth = this.currentHealth - damage;
        System.out.println(this.name + " takes " + damage + " points of damage.");
    }
    
    @Override
    public void die(){
        System.out.println(this.name + " has died");
    }
}
