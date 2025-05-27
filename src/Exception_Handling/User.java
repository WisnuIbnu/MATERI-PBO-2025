package Exception_Handling;

public abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public abstract String getRoleDescription();
    public abstract String toString();
}

