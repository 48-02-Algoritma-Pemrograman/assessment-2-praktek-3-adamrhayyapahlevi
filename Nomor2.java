import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {

    public static double hitungTotalPaket(int pilihanHamper, int pilihanPacking) {
        int hargaHamper = 0;
        switch (pilihanHamper) {
            case 1:
                hargaHamper = 150000;
                break;
            case 2:
                hargaHamper = 175000;
                break;
            case 3:
                hargaHamper = 200000;
                break;
        }

        int hargaPacking = 0;
        switch (pilihanPacking) {
            case 1:
                hargaPacking = 50000;
            case 2:
                hargaPacking = 75000;
                break;
            case 3:
                hargaPacking = 125000;
                break;
        }

        return hargaHamper + hargaPacking;
    }

    // Funnction menghitung total bayar setelah pajak 10%
    public static double hitungTotalBayar(ArrayList<Double> daftarPembelian) {
        double total = 0;
        for (double harga : daftarPembelian) {
            total += harga;
        }
        double pajak = total * 0.10;
        return total + pajak;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> daftarPembelian = new ArrayList<>();
        boolean inputLagi = true;

        while (inputLagi) {
            System.out.print("Masukan pilihan hampers [1/2/3]: ");
            int Hampers = scanner.nextInt();

            System.out.print("Masukan pilihan packing [1/2/3]: ");
            int Packing = scanner.nextInt();

            
            double totalPaket = hitungTotalPaket(Hampers, Packing);
            daftarPembelian.add(totalPaket);  

            
            System.out.print("Input lagi (Y/N)?: ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("N")) {
                inputLagi = false;
            }
        }

        double totalBayar = hitungTotalBayar(daftarPembelian);

        System.out.println("Total hamper yang dipesan = " + daftarPembelian.size());
        System.out.println("Total yang harus dibayar = " + totalBayar);

        System.out.println(Nomor2.class.getDeclaredMethods().length);
    }
}
