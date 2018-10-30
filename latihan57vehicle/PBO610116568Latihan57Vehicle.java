/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568.latihan57vehicle;

/*
 * NAMA 	: Muh.Fairuz Hadi Day
 * KELAS	: PBO6
 * NIM		: 10116568
 * Description :  VEHICLE
 */
public class PBO610116568Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bicycle = new Bicycle();
        System.out.println("Bicycle");
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println(
            "Brand\t\t: "+ bicycle.getMyBrand() +"\n"+
            "Model\t\t: "+ bicycle.getMyModel()+"\n"+
            "Jumlah Gear\t: "+ bicycle.getMyGearCount()+"\n"
        );
        
        System.out.println("");
        
        Skateboard skateboard = new Skateboard();
        System.out.println("Skateboard");
        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        skateboard.setMyBoardLength(54.5);
        
        System.out.println(
            "Brand\t\t: "+ skateboard.getMyBrand() +"\n"+
            "Model\t\t: "+ skateboard.getMyModel()+"\n"+
            "Panjang Board\t: "+ skateboard.getMyBoardLength()+"\n"
        );
    
    }
    
}
