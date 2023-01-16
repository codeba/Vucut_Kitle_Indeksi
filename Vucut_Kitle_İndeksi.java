package patika;

import java.util.Scanner;

public class Vucut_Kitle_İndeksi {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner scan=new Scanner(System.in);
        System.out.println("Boyunuzu (metre cinsinden) giriniz:");
        boy=scan.nextDouble();
        System.out.println("Kilonuzu giriniz:");
        kilo=scan.nextDouble();

        indeks=(kilo/boy)*boy;

        System.out.println("Vücüt kitle indeksiniz:"+indeks);

    }
}
