/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568latihan53rabit;

/**
 *
 * @author FairuzDay
 */
public class Rabbit extends Animal{
    private String color, name;       
    
    public Rabbit(boolean vegetarian, String eats, int noOfLegs, String color, String name) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
}
