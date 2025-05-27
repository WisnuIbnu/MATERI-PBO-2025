package Exception_Handling;

public class Fashion extends Product {

    private String size;
    
    public Fashion(String name, int price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ukuran: " + size;
    }
}

