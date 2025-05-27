package Exception_Handling.with_final_throw.without_final;
import java.util.Scanner;

public class  Main {

    public static class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
            super(message);
        }
    }

    public static void checkPositive(int number) throws InvalidNumberException {
        if (number < 0) {
            throw new InvalidNumberException("Angka tidak boleh negatif: " + number);
        }
        System.out.println("Angka valid: " + number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka (harus positif): ");
        int angka = scanner.nextInt();

        try {
            checkPositive(angka);
        } catch (InvalidNumberException e) {
            System.out.println("Terjadi exception: " + e.getMessage());
        } finally {
            System.out.println("Proses selesai.");
        }
    }
}

