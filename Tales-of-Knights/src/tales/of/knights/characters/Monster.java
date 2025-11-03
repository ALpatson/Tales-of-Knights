/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tales.of.knights.characters;

/**
 *
 * @author Emiva
 */
public class Monster extends Fighter {
    private int moneyDropped;
    private int challenge;
    
    public Monster(){
        super();
        this.moneyDropped = 10;
        this.challenge = 1;
    }
    
    public Monster(String name, int maxHealth, int power, int challenge){
        super(name, maxHealth, power);
        this.challenge = challenge;
        this.moneyDropped = calculateMoneyDropped();
    }
    
    private int calculateMoneyDropped(){
        return this.challenge * 24;
    }
}
