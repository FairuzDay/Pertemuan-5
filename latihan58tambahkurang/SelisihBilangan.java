/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116568latihan58tambahkurang;

/**
 *
 * @author FairuzDay
 */
public class SelisihBilangan extends Bilangan{
     public SelisihBilangan(int x, int y) {
        super(x, y);
    }
    
    public void tampilSelisih(){
        System.out.println("Hasil selisih "+ getX() + " - " + getY() +" = " + (getX() - getY()));
    }
    
}
