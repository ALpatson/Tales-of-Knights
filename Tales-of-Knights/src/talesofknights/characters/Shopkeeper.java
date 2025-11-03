/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talesofknights.characters;

import java.util.Random;
/**
 * A villager who sells and buys items
 * @author cobbi
 */
public class Shopkeeper extends Villager {
    private int discount;
    private int buyPercentage;
    //private Item stock;

    public Shopkeeper(String name, int admiration) {
        super(name, admiration);
        generateStock();
    }

    private int calculateDiscount(int fame) {
        discount = fame > 50 ? 10 : 0;
        return discount;
    }

    private int calculateBuyPercentage() {
        buyPercentage = 80;
        return buyPercentage;
    }

    private void generateStock() {
        // Placeholder: would generate a random item
        // stock = null;
    }

    public void pourDrink() {
        System.out.println(name + " pours you a drink.");
    }

    public void pourRound() {
        System.out.println(name + " pours drinks for everyone!");
    }
}
