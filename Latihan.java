import java.util.Scanner;

public class Latihan 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); //M
        System.out.println("Masukan nama Anda :");
        String nama = scanner.nextLine(); //M
        System.out.println("Masukkan sebuah kalimat:"); //Meminta input ke pengguna
        String kalimat = scanner.nextLine().toLowerCase(); // Ubah ke huruf kecil untuk memudahkan pengecekan

        int jumlahVokal = 0; //Variabel untuk menghitung jumlah vokal

        for (char huruf : kalimat.toCharArray()) // Menghitung jumlah vokal menggunakan if-else
        {
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') 
            {
                jumlahVokal++;
            }
        }

        System.out.println("Jumlah huruf vokal dalam kalimat: " + jumlahVokal); // Menampilkan jumlah vokal

        switch (jumlahVokal % 2) // Menentukan ganjil atau genap menggunakan switch-case
        {
            case 0:
                System.out.println("Jumlah vokal genap!");
                break;
            case 1:
                System.out.println("Jumlah vokal ganjil!");
                break;
        }

        System.out.println("Kalimat dalam urutan terbalik:"); // Menampilkan setiap karakter dalam string secara terbalik menggunakan foreach
        char[] karakterArray = kalimat.toCharArray();
        int panjang = karakterArray.length; // Membalikkan array karakter secara manual
        char[] reversedArray = new char[panjang];
        for (int i = 0; i < panjang; i++) {
            reversedArray[i] = karakterArray[panjang - 1 - i];
        }
        
        for (char karakter : reversedArray) // Menggunakan foreach untuk menampilkan karakter yang sudah dibalik
        {
            System.out.print(karakter);
        }
        System.out.println(); // Baris baru setelah selesai

        scanner.close();
    }
}