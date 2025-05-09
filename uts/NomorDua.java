
import java.util.Scanner;

public class NomorDua {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("PROMO TOKO ONLINE");
        System.out.println("====================================");

        System.out.print("Total Belanja: ");
        int totalBelanja = input.nextInt();

        System.out.print("Ongkos Kirim: ");
        int ongkosKirim = input.nextInt();

        if (totalBelanja > 50000) {
            int diskon = totalBelanja * 10 / 100;
            int diskonMax = 20000;
            if (diskon > diskonMax) {
                diskon = diskonMax;
            }
            totalBelanja = totalBelanja - diskon;
        }

        int totalBayar = totalBelanja + ongkosKirim;

        System.out.println("Bayar: " + totalBayar);
        System.out.println("====================================");

    }

}
