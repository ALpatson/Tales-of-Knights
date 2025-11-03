/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talesofknights.characters;

import java.util.Random;
/**
 * A villager who gambles with the hero.
 * @author cobbi
 */
public class Gambler extends Villager{
    private final int skill ;
    private int chanceToWin;
    private int bet;

    public Gambler(String name, int admiration, int skill) {
        super(name, admiration);
        this.skill = skill;
    }

    public void gamble(int playerBet) {
        Random rand = new Random();
        chanceToWin = rand.nextInt(100);
        if (chanceToWin > 50) {
            System.out.println(name + " wins the bet!");
        } else {
            System.out.println(name + " loses and grumbles.");
        }
    }
}
