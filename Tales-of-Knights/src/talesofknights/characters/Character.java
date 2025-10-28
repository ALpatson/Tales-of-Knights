/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talesofknights.characters;

/**
 * 
 * Base class for all characters in the game.
 * @author cobbina
 */
public class Character {
    protected String name;
    
    public Character(){
        this.name = "Unnamed";
    }
    
    public Character(String name){
        this.name = name;
    }
    
    public void introduce(){
        System.out.println("Hi, my name is " + this.name);
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
