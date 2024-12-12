import java.util.Scanner;

public class Nomor1 {


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */

        System.out.println("~~~ program hitung luas segitiga ~~~ ");

        System.out.print("Masukan nilai alas: ");
        int alas = input.nextInt();
        
        System.out.print("Masukan nilai tinggi: ");
        int tinggi = input.nextInt();

        double luas = Luassegitiga(alas, tinggi);
        System.out.println("Luas segitiga: " + luas);

        fizzBuzz(N);

        input.close();

        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length);
    }
    
    public static double Luassegitiga (int alas, int tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static void fizzBuzz(int N) {
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    
}
}
