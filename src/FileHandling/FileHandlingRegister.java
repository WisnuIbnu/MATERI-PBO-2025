package FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileHandlingRegister {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final String FILENAME = "users.txt";

        System.out.println("=== Menu Registrasi ===");

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine().trim();

        File file = new File(FILENAME);
        boolean userExists = false;

        FileReader fr = null;
        BufferedReader br = null;


        if (file.exists()) {
            try {
                fr = new FileReader(file);
                br = new BufferedReader(fr);

                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(";");
                    if (parts.length > 0) {
                        String registeredUser = parts[0];
                        if (registeredUser.equalsIgnoreCase(username)) {
                            userExists = true;
                            break;
                        }
                    }
                }

            } catch (IOException e) {
                System.out.println("Terjadi kesalahan saat membaca file.");
                e.printStackTrace();
            } finally {
                try {
                    if (br != null) br.close();
                    if (fr != null) fr.close();
                } catch (IOException e) {
                    System.out.println("Gagal menutup file reader.");
                    e.printStackTrace();
                }
            }
        }


        if (userExists) {
            System.out.println("Username sudah terdaftar. Gunakan lainnya.");
        } else {
            FileWriter fw = null;
            try {
                fw = new FileWriter(FILENAME, true);
                fw.write(username + ";" + password + "\n");
                System.out.println("Registrasi berhasil. Data telah disimpan.");
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan saat menulis ke file.");
                e.printStackTrace();
            } finally {
                try {
                    if (fw != null) fw.close();
                } catch (IOException e) {
                    System.out.println("Gagal menutup file writer.");
                    e.printStackTrace();
                }
            }
        }

        scanner.close();
    }
}
