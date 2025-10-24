/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tales.of.knights.characters;

/**
 *
 * @author Emiva
 */
public class Character {
    public String name;
    
    public Character(){
        this.name = "Bob";
    }
    
    public Character(String name){
        this.name = name;
    }
    
    public void introduce(){
        System.out.println("Hi, my name is" + this.name);
    }
}
