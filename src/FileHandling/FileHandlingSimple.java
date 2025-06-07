package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingSimple {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final String FILENAME = "data.txt";

        System.out.println("=== Menu File Handling ===");
        System.out.println("1. Membuka file");
        System.out.println("2. Menulis ke file");
        System.out.println("3. Membaca file");
        System.out.print("Pilih menu (1-3): ");
        String pilihan = scanner.nextLine();

        switch (pilihan) {
            case "1":
                File file = new File(FILENAME);
                if (file.exists()) {
                    System.out.println("File ditemukan: " + FILENAME);
                } else {
                    System.out.println("File belum ada, silakan buat dahulu.");
                }
                break;

            case "2":
                try {
                    System.out.print("Masukkan teks yang akan ditulis: ");
                    String input = scanner.nextLine();

                    FileWriter fw = new FileWriter(FILENAME, true);
                    fw.write(input + "\n");
                    fw.close();

                    System.out.println("Data berhasil ditulis ke file.");
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan saat menulis ke file.");
                    e.printStackTrace();
                }
                break;

            case "3":
                try {
                    File fileRead = new File(FILENAME);
                    if (!fileRead.exists()) {
                        System.out.println("File tidak ditemukan.");
                        break;
                    }

                    FileReader fr = new FileReader(fileRead);
                    BufferedReader br = new BufferedReader(fr);

                    System.out.println("\nIsi file:");
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }

                    br.close();
                    fr.close();
                } catch (IOException e) {
                    System.out.println("Terjadi kesalahan saat membaca file.");
                    e.printStackTrace();
                }
                break;

            default:
                System.out.println("Pilihan tidak valid. Silakan pilih 1-3.");
        }

        scanner.close();
    }
}
