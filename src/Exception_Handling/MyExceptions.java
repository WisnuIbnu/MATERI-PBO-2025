package Exception_Handling;

class StorageFullException extends Exception {
    public StorageFullException(String message) {
        super(message);
    }
}

class ProductAccessException extends RuntimeException {
    public ProductAccessException(String message) {
        super(message);
    }
}