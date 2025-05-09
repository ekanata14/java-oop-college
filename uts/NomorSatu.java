import java.util.Scanner;

public class NomorSatu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("SISTEM PAJAK");
        System.out.println("====================================");

        System.out.print("Masukkan Harga barang: ");
        int harga = input.nextInt();
        System.out.println("====================================");

        int hargaPajak = harga * 11 / 100;
        int hargaSetelahPajak = harga + hargaPajak;

        System.out.println("Harga setelah pajak: " + hargaSetelahPajak);
        System.out.println("====================================");

    }

}
