//Nama : Jelistina yolenta zai
//Nima : 145314101
package while_if_switch;

import java.util.Scanner;

public class latihan2 {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int panjang, bUdang, ulang = 1, jumlahUdang1 = 0, jumlahUdang2 = 0, jumlahUdang3 = 0, jumlahUdang4 = 0;
        String kualitas1 = null,kualitas2 = null,kualitas3 = null,kualitas4 = null;;
        System.out.print("Banyak udang :");
        bUdang = data.nextInt();
        while (ulang <= bUdang) {
            ++ulang;
            System.out.println("udang " + ulang);
            System.out.print("Panjang :");
            panjang = data.nextInt();
            if (panjang < 10) {
                kualitas1 = "Kecil";
                jumlahUdang1++;
            } else if (panjang >= 10 && panjang < 15) {
                kualitas2 = "Sedang";
                jumlahUdang2++;
            } else if (panjang >= 15 && panjang < 25) {
                kualitas3= "Besar";
                jumlahUdang3++;
            } else if (panjang >= 25) {
                kualitas4 = "Super";
                jumlahUdang4++;
            }

        }
            System.out.println("jumlah udang dengan kualitas " + kualitas1 + " ada " + jumlahUdang1 + " ekor");
            System.out.println("jumlah udang dengan kualitas " + kualitas2 + " ada " + jumlahUdang2 + " ekor");
            System.out.println("jumlah udang dengan kualitas " + kualitas3+ " ada " + jumlahUdang3 + " ekor");
            System.out.println("jumlah udang dengan kualitas " + kualitas4 + " ada " + jumlahUdang4 + " ekor");
    }
}
