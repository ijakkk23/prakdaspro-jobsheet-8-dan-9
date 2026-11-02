import java.util.Scanner;

public class Tugas3NoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
            sc.close();
            return;
        }
        int totalBarangSeluruhToko = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = -1;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("\n--- Toko " + i + " ---");
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                int barang;
                do {
                    System.out.print("  Jumlah barang pelanggan " + j + ": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("  Jumlah barang tidak boleh negatif!");
                    }
                } while (barang < 0);

                totalBarangToko += barang;
            }
            System.out.println("Toko " + i + " -> pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);
            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
        }
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}