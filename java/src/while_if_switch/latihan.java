package while_if_switch;

import java.util.Scanner;

public class latihan {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int harga = 0, jumlah, gratis = 0;
        double discount = 0, totalBayar = 0;
        String kodeItem;
        System.out.print("Masukkan Kode Item Ice Cream : ");
        kodeItem = data.next();
        System.out.print("Jumlah Ice Cream : ");
        jumlah = data.nextInt();
        switch (kodeItem) {
            case "c": {
                if (jumlah <= 4) {
                    harga = 12000 * jumlah;
                    gratis = 1;
                    discount = harga * 0.1;
                } else if (5 <= jumlah && jumlah <= 8) {
                    harga = 12000 * jumlah;
                    gratis = 1;
                    discount = harga * 0.15;
                } else if (jumlah >= 9) {
                    harga = 12000 * jumlah;
                    gratis = 1;
                    discount = harga * 0.2;
                }
                totalBayar = harga - discount;
            }
            case "m": {
                harga = 11000 * jumlah;
                gratis = 2;
                if (jumlah <= 4) {
                    harga = 12000 * jumlah;
                    gratis = 1;
                    discount = harga * 0.09;
                } else if (5 <= jumlah && jumlah <= 8) {
                    harga = 12000 * jumlah;
                    gratis = 1;
                    discount = harga * 0.14;
                } else if (jumlah >= 9) {
                    harga = 12000 * jumlah;
                    gratis = 1;
                    discount = harga * 0.19;
                }
                totalBayar = harga - discount;
            }
            case "j": {
                harga = 10000 * jumlah;
                gratis = 3;
                if (jumlah <= 4) {
                    harga = 12000 * jumlah;
                    gratis = 1;
                    discount = harga * 0.08;
                } else if (5 <= jumlah && jumlah <= 8) {
                    harga = 12000 * jumlah;
                    gratis = 1;
                    discount = harga * 0.13;
                } else if (jumlah >= 9) {
                    harga = 12000 * jumlah;
                    gratis = 1;
                    discount = harga * 0.18;
                }
                totalBayar = harga - discount;

            }
        }
        System.out.println("harga yang harus dibayar = "+harga+" - "+discount+" = "+totalBayar);
        System.out.println("Jumlah Gratis = " + gratis);
    }
}
