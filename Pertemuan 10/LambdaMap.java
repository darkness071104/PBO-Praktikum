/*
* Nama File    : LambdaMap.java
* Nama Pembuat : Fauzan Ramadhan Putra
* NIM          : 24060121140140
* Deskripsi    : Implementasi lamda pada map, digunakan sebagai parameter pada method
* Tanggal      : 06 Juni 2023
*/
import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121120021", "Resma");
        mahasiswaMap.put("24060121120022", "Adi");
        mahasiswaMap.put("24060121120023", "Nugroho");
        // lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println(nim + " : " + nama);
        });
    }
}
