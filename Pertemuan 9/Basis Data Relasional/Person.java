/*
* Nama File    : Person.java
* Nama Pembuat : Fauzan Ramadhan Putra
* NIM          : 24060121140140
* Deskripsi    : File Kelas Person (Model)
* Tanggal      : 03 Juni 2023
*/

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}