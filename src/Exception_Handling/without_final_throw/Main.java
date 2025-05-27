package Exception_Handling.without_final_throw;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("=== Contoh Penanganan Eksepsi Tanpa Blok Finally ===");
    System.out.print("Masukan angka pertama: ");
    int a = scanner.nextInt();
    System.out.print("Masukan angka kedua: ");
    int b = scanner.nextInt();

    try {
      int result = a/b;
      System.out.println("Hasil pembagian: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Terjadi kesalahan: " + e.getMessage());
    } finally{
      System.out.println("Kode Telah Selesai");
    }
  }
}
