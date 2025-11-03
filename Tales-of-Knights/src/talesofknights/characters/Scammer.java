/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talesofknights.characters;

// import game.interfaces.Aggression;
/**
 * A scammer who might attack the player
 * @author cobbina
 */
public class Scammer extends Villager implements Aggression{
    private final int maxHealth;
    private int currentHealth;
    private final int power;

    public Scammer(String name, int admiration, int power) {
        super(name, admiration);
        this.maxHealth = 50;
        this.currentHealth = maxHealth;
        this.power = power;
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks fiercely with power " + power + "!");
    }

    @Override
    public void takeDamage(int amount) {
        currentHealth -= amount;
        System.out.println(name + " takes " + amount + " damage. HP left: " + currentHealth);
        if (currentHealth <= 0) die();
    }

    @Override
    public void die() {
        System.out.println(name + " collapses and dies!");
    }

    public void giveUp() {
        System.out.println(name + " gives up and flees!");
    }
}
