 /**
 * File : MKubus.java 15/03/2023
 * Penulis : Fauzan Ramadhan Putra (24060121140140)
 * Deskripsi : driver class untuk kubus
 */

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus {
  public static void main(String[] args){
    Kubus kubus = new Kubus(new BujurSangkar(4));
	
	System.out.println("\n");s

    double luasAlas = kubus.hitungLuasAlas();
    System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : " + luasAlas);
	
    double volumeKubus = kubus.hitungVolume();
    System.out.println("Volume Kubus dengan panjang sisi 4 satuan : " + volumeKubus);
	}
}