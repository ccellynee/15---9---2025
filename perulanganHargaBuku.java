import java.util.Scanner;

public class perulanganHargaBuku {
    public class TotalHargaBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalHarga = 0;
        double hargaBuku;

        System.out.println("Masukkan harga buku satu per satu");
        System.out.println("Ketik 0 untuk mengakhiri input");

        while (true) {
            System.out.print("Harga buku: Rp ");
            hargaBuku = input.nextDouble();

            //perulangan akan berhenti jika harga buku di input angka 0
            if (hargaBuku == 0) {
                break; 
            }

            totalHarga += hargaBuku;
        }

        System.out.println("Total harga semua buku: Rp " + totalHarga);
       
    }
}

}
