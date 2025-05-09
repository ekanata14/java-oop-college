
import java.util.Scanner;

public class NomorTiga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("PEMINJAMAN LAPTOP");
        System.out.println("====================================");

        int hargaSewaPerHari = 100000;
        int hargaSewa = 0;
        int denda = 0;

        System.out.print("Lama Pinjam (hari): ");
        int lamaPinjam = input.nextInt();

        System.out.print("Dikembalikan dalam (hari): ");
        int hariPengembalian = input.nextInt();
        System.out.println("====================================");

        hargaSewa = hariPengembalian * hargaSewaPerHari;
        System.out.println("Harga sewa = " + hariPengembalian + " * " + hargaSewaPerHari + " = " + hargaSewa);

        if (hariPengembalian > lamaPinjam) {
            int hargaDenda = 2000;
            int selisihHari = hariPengembalian - lamaPinjam;
            denda = selisihHari * hargaDenda;

            System.out.println("Denda = " + selisihHari + " * " + hargaDenda + " = " + denda);
        } else {
            System.out.println("Tidak ada denda");
        }

        int totalBiaya = hargaSewa + denda;
        System.out.println("====================================");
        System.out.println("Total biaya = " + totalBiaya);

    }

}
