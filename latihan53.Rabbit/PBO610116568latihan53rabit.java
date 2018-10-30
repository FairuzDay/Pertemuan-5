/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568latihan53rabit;

/*
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568 
 * Description : Program Rabbit
 */
public class PBO610116568latihan53rabit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                               
        Rabbit rabbit = new Rabbit(true, "grass", 4, "white", "Peter");
        System.out.println(
            "Hello, His name is " + rabbit.getName() + "\n"+
            rabbit.getName() + " is Vegetarian? " + rabbit.isVegetarian() + "\n"+
            rabbit.getName() + " eats " + rabbit.getEats()+ "\n"+
            rabbit.getName() + " has " + rabbit.getNoOfLegs()+ " Legs." + "\n"+
            rabbit.getName() + " color is " + rabbit.getColor()
        );
    }
    
}
