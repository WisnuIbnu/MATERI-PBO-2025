package Polymorphism;

public class User {
  protected String name; 
  
  public User(String name) { 
    this.name = name; 
  } 
    @Override 
    public String toString() { 
    return "Nama: " + name; 
  } 
}
