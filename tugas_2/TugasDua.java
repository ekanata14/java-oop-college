
import java.util.Random;
import java.util.Scanner;

public class TugasDua {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean mainLagi = true;

        System.out.println("-------------------------------");
        System.out.println("=== Selamat datang di Game Tebak Angka ===");
        System.out.println("-------------------------------");

        while (mainLagi) {
            int angkaBenar = rand.nextInt(10) + 1;
            int kesempatan = 3;
            boolean menang = false;

            System.out.println("\nTebak angka dari 1 sampai 10. Kamu punya 3 kali kesempatan.");
            System.out.println("-------------------------------");

            for (int i = 1; i <= kesempatan; i++) {
                System.out.print("Tebakan ke-" + i + ": ");
                int tebakan = input.nextInt();

                if (tebakan == angkaBenar) {
                    System.out.println("Selamat! Tebakan kamu benar.");
                    System.out.println("-------------------------------");
                    menang = true;
                    break;
                } else {
                    System.out.println("Tebakan salah.");
                    System.out.println("-------------------------------");
                }
            }

            if (!menang) {
                System.out.println("Maaf, kamu kalah. Angka yang benar adalah: " + angkaBenar);
                System.out.println("-------------------------------");
            }

            System.out.print("Ingin bermain lagi? (y/n): ");
            String jawaban = input.next();
            System.out.println("-------------------------------");

            if (!jawaban.equalsIgnoreCase("y")) {
                mainLagi = false;
                System.out.println("Terima kasih sudah bermain!");
            }
        }

        input.close();
    }
}
