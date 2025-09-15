import java.util.Scanner;

public class angkaRahasia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaRahasia = 13;
        int tebakan;

        System.out.println("Coba tebak angka rahasia antara 1 sampai 20 ");

        do {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();

            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu rendah! Coba lagi.");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu tinggi! Coba lagi.");
            }
        } while (tebakan != angkaRahasia);

        System.out.println("Selamat! Anda berhasil menebak angka rahasia: " + angkaRahasia);
        input.close();
    }
}
