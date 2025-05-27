package Inheritance;

public class Buyer extends User {
  private String address;

  public Buyer(String name, String email, String address) {
      super(name, email);
      this.address = address;
  }

  @Override
  public String toString() {
      return super.toString() + ", Alamat: " + address;
  }
}

