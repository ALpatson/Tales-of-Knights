/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talesofknights.characters;

/**
 * Represents a villager NPC with admiration toward the hero.
 * @author cobbina
 */
public class Villager extends Character{
    protected int admiration;

    public Villager(String name, int admiration) {
        super(name);
        this.admiration = admiration;
    }

    protected int calculateAdmiration(int fame) {
        admiration += fame / 10;
        return admiration;
    }

    protected String speak() {
        if (admiration > 50) return "You're a legend!";
        else return "Greetings, traveler!";
    }

    public int getAdmiration() { return admiration; }
}
