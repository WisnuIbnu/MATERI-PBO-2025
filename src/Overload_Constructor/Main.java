package Overload_Constructor;

public class Main {
  public static void main(String[] args) {

    Product barang1 = new Product();
    barang1.diplayInfo();

    System.out.println("\n========= PRODUCT 2 =========");
    Product barang2 = new Product("NVIDIA GeForce RTX 5070");
    barang2.diplayInfo();
  }
}


